/*
 How to run in nodejs with babel ES5 to ES6 compiler:
 $ npm install --global babel assert
 $ babel --version
 4.3.0
 $ node --version
 v0.12.0

 $ babel ConvertFieldsToGetters.es6.js  > ConvertFieldsToGetters.es5.js && node ConvertFieldsToGetters.es5.js

 */

var convertFieldAssignmentToGetterMocking = function (line) {
  var res = lookForAssignment(line);
  if (res) {
    return `when(${res.variable}.${mapFieldNameToGetter(res.field, null)}()).thenReturn(${res.value});`;
  } else {
    return line;
  }
}

var lookForAssignment = function (line) {
  try {
    var parsedURL = /^\s*([\w]+)\.([\w]+) = ([^;]+).*$/.exec(line);
    var [, variable, field, value] = parsedURL;
    return {variable: variable, field: field, value: value};
  } catch (e) {
  }
}

var convertToGetterIfPossible = function (line) {
  var res = lookForFieldDefinition(line);
  if (res) {
    return `public ${res.type} ${mapFieldNameToGetter(res.name, res.type)}(){
  return TODO;
}`;
  } else {
    return line;
  }
}

var mapFieldNameToGetter = function (field, typee) {
  if (typee && typee.toLowerCase == "boolean") return "is" + field[0].toUpperCase() + field.substring(1);
  else return "get" + field[0].toUpperCase() + field.substring(1);
};


var lookForFieldDefinition = function (line) {
  try {
    var parsedURL = /\s*public\s+([\w\<\>]+)\s*(\w+)[\s;].*/.exec(line);
    var [, ttype, name] = parsedURL;
    return {type: ttype, name: name};
  } catch (e) {
  }
}

var runTests = function () {
  var assert = require('assert');

  function testEq(act, exp) {
    assert(JSON.stringify(exp) === JSON.stringify(act), "\nExp   : " + JSON.stringify(exp) + "\n" + "Actual: " + JSON.stringify(act))
  };
  testEq(lookForFieldDefinition("public Date                              myDateField;"),
    {type: "Date", name: "myDateField"});
  testEq(lookForFieldDefinition("public List<TypeOne>      myList         = new ArrayList<TypeOne>();"),
    {type: "List<TypeOne>", name: "myList"});
  testEq(lookForFieldDefinition("    public double                            doubleField;"),
    {type: "double", name: "doubleField"});
  testEq(convertToGetterIfPossible(`@Documentation("Doc 123.")`),
    `@Documentation("Doc 123.")`);
  testEq(convertToGetterIfPossible(`    public double                            doubleField;`),
    `public double getDoubleField(){
  return TODO;
}`);
  testEq(lookForAssignment("    myVar.fieldOne = newValueProvider.getX();"),
    {variable: "myVar", field: "fieldOne", value: "newValueProvider.getX()"});
  testEq(convertFieldAssignmentToGetterMocking("    myVar.fieldOne = newValueProvider.getX();"),
    "when(myVar.getFieldOne()).thenReturn(newValueProvider.getX());");

};
runTests();

const input = `
`;


// Convert Getters:
input.split("\n").map(line => convertToGetterIfPossible(line)).forEach(line =>console.log(line))
// Convert assignment to mocks:
//input.split("\n").map(line =>convertFieldAssignmentToGetterMocking(line)).forEach(line=>console.log(line))