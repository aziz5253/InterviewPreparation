var email:string="testtest.com";
var atPosition:number=email.indexOf('@');
var dotPosition:number=email.indexOf('.');

if(atPosition == -1 || dotPosition == -1){
    console.log(`Invalid Email id ${email}`);
}
else{
    console.log('Email is Valid');
}