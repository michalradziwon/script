var gulp = require("gulp");
var babel = require("gulp-babel");
var rename = require("gulp-rename");

gulp.task("default", function () {
  return gulp.src("src/ConvertFieldsToGetters.es6.js")
    .pipe(babel())
    .pipe(rename("ConvertFieldsToGetters.es5.js"))
    .pipe(gulp.dest("dist"));
});