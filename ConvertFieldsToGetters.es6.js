/*
 How to run in nodejs with babel ES5 to ES6 compiler:
 $ npm install --global babel assert
 $ babel --version
 4.3.0
 $ node --version
 v0.12.0

 $ babel ConvertFieldsToGetters.es6.js  > ConvertFieldsToGetters.es5.js
 $ node ConvertFieldsToGetters.es5.js

 */


var lookForAssignment = function (line) {
  try {
    var parsedURL = /^\s*([\w]+)\.([\w]+) = ([^;]+).*$/.exec(line);
    var [, variable, field, value] = parsedURL;
    return {variable: variable, field: field, value: value};
  } catch (e) {
  }
}

var lookForFieldDefinition = function (line) {
  try {
    var parsedURL = /\s*public\s+([\w\<\>]+)\s*(\w+)[\s;].*/.exec(line);
    var [, ttype, name] = parsedURL;
    return {type: ttype, name:name};
  } catch (e) {
    console.log(e);
  }
}


var tests = function () {
  var assert = require('assert');
  function testEq(act, exp) {
    assert(JSON.stringify(exp) === JSON.stringify(act), "\nExp   : " + JSON.stringify(exp) + "\n" + "Actual: "+ JSON.stringify(act))
  };
  testEq(lookForFieldDefinition("public Date                              myDateField;"),
    {type: "Date", name:"myDateField"});
  testEq(lookForFieldDefinition("public List<TypeOne>      myList         = new ArrayList<TypeOne>();"),
    {type: "List<TypeOne>", name:"myList"});
  testEq(lookForFieldDefinition("    public double                            doubleField;"),
    {type: "double", name:"doubleField"});

  testEq(lookForAssignment("    myVar.fieldOne = newValueProvider.getX();"),
    {variable: "myVar", field: "fieldOne", value: "newValueProvider.getX()"});

};
tests();