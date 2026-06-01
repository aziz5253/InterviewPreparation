//Hour
//If hour is between 6am to 12pm : Good Morning
//If it is between 12pm to 6pm: Good Afternoon
//Otherwise : Good Evening
let hour=10;
if(hour>=6 && hour<12){
    console.log('Good Morning!!!');
}
else if(hour>=12 && hour<18)
{
    console.log('Good Afternoon !!!');
}
else
    console.log('Good Evening');     
//Switch case

let role='guest';

switch(role){
    case 'guest':
        console.log('Guest User');
        break;
    case 'moderator':
        console.log('Moderator User');
        break;
    default:
        console.log('Unknown User');
}
//Loops

for(let i=1;i<=5;i++){
    console.log('Hello World',i);
}
for(let i=1;i<=5;i++){
    if(i%2!=0) console.log(i);
}
for(let i=5;i>=1;i--){
    if(i%2!=0) console.log(i);
}
//While Loop
console.log('While loop Demo');

let i=0;
while(i<=5)
{
if(i%2!=0) console.log(i);
i++;
}

// Do While Loop
console.log('Do While loop Demo');
let j=9;
do{
   if(j%2!=0) console.log(j);
j++; 
}while(j<=5);

// Infinite Loops
console.log('Infinite loops');

let k=0;
while(k<5)
{
 console.log(k);
 k++;
}
/*while(true)
{

}
let z=0;
do{

}while(z<5);

for(let i=0;i<10;)
{

}*/

//For In Loops
console.log('For In loops');

const person={
    name:'Mosh',
    age:30
}
//For in Loop
for(let key in person)
{
    console.log(key,person[key]);
}
const colors=['red','green','blue'];
//for -of loop ELement items in Array
for(let color of colors)
{
    console.log(color);
}

//break
let p=0;
while(p<=10)
{

     console.log(p);
     p++;
     
}
//Function
let number=max(6,6);
console.log(number);
function max(a,b)
{
   return (a>b) ? a:b;
}
let isLandscape=isLandScape(15,20);
console.log(isLandscape);
function isLandScape(width,height)
{
    return (width>height) ? true:false;
}