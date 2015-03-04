#!/bin/sh
gulp
node dist/ConvertFieldsToGetters.es5.js > dist/out
