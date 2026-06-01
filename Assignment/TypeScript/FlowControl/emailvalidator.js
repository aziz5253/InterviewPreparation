"use strict";
var email = "testtest.com";
var atPosition = email.indexOf('@');
var dotPosition = email.indexOf('.');
if (atPosition == -1 || dotPosition == -1) {
    console.log(`Invalid Email id ${email}`);
}
else {
    console.log('Email is Valid');
}
