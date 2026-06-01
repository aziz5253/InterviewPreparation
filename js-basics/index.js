   //This is my first javascript code
    console.log('Hello World');
    let nameDet = 'John Doe';
    console.log(nameDet);
    //Cannot be reserved keywords
    //Should be meaningful
    //Cannot start with a number
    //Cannot contain space or hyphen
    //Are case sensitive
    const interestRate = 0.3;
    console.log(interestRate);
    let name='John';//String literal
    let age=30;//Number literal
    let isApproved=true;//Boolean literal
    let firstName = undefined;//Undefined
    let lastName = null;//Null
    //Objects
    let person={
        name:'John',
        age:30
    };
    console.log(person);
    //Dot Notation
    person.name='Mary';
    //Bracket Notation
    let selection='name';
    person[selection]='Raju';
    console.log(person.name);

    //Arrays
    let selectedColors=['red','blue'];
    selectedColors[2]='green';
    selectedColors[3]=1;
    console.log(selectedColors);
    console.log(selectedColors.length);
    console.log(selectedColors[0]);

    //Functions

    //Performing a task
    function greet(name,lastName){
        console.log('Hello '+name+' '+lastName);
    }
    
    //Calculating a value
    function square(number){
        return number*number;
    }

    greet('John','Doe');
    greet('Marry','Jane');
   
    let number=square(2);
    console.log(number);

    //Operators

    let x=10;
    let y=3;

    console.log(x+y);
    console.log(x-y);
    console.log(x*y);
    console.log(x/y);
    console.log(x%y);
    console.log(x**y);

    //Increment (++)
    //console.log(++x);
     //console.log(x++);
     console.log(--x);
     console.log(x--);

     //Assignement Operator
     let a=10;
     a=a+5;
     a+=5;

     a=a*3;
     a *= 3;

     //Comparison Operator

     let z=1;

     //Relational Operator
     console.log(z>0);
     console.log(z>=0);
     console.log(z<1);
     console.log(z<=1);

     //Equality
     console.log(z===1);
     console.log(z !==1);

     //Strict Equality Operator
     console.log(1===1);
     console.log('1'===1);

     //Lose Equality Operator
     console.log(1==1);
     console.log('1'== 1);

     //Ternary Operator
     //If A customer has more than 100 point,
     //they are gold customer
     //they are silver customer

     let points=110;
     let type = points > 100 ? 'gold' : 'silver';
     console.log("Type===="+type);

     //Logical AND (&&)
     //Return true if both operands are true

     console.log(false && true);

     let highIncome=true;
     let goodCreditScore=true;
     let eligibleForLoan=highIncome && goodCreditScore;
     console.log(eligibleForLoan);

     //Logical OR
     //Return true IF one of the Operands a=is True
    let highIncome1=false;
     let goodCreditScore1=false;
     let eligibleForLoan1=highIncome1 && goodCreditScore1;
     console.log(eligibleForLoan1);

     //Not Operator
     let applicanRefused=!eligibleForLoan1;
     console.log(applicanRefused);

     //Logical Operator with Non Boolean

     //Falsy
     //undefined
     //null
     //0
     //false
     //''
     //NAN

     //Anything that is falsy that is truthy

     let userColor="red";
     let defaultColor="blue";
     let currentColor= userColor || defaultColor;
     console.log(currentColor);

     //Bitwise Operator

     //1=000000001
     //2=000000010

     //3=0000000011 Bitwise Or result
     //0=00000000 Bitwise And result

     //Read Write Exceute
     //00000100 -Read
     //00000110- Read And Write
     //00000111 -Read and Write and Exceute

     //00000010- Write
     //00000001-Execute


    console.log(1|2);
    console.log(1&2);

    const readPermission=4;
    const writePermission=2;
    const executePermission=1;

    let myPermission=0;
    myPermission=myPermission|readPermission|writePermission;
    console.log(myPermission);
    //Bitwise Or Operator you can add permission

    let message=(myPermission & readPermission) ? 'yes' : 'no';
    console.log(message);
    //Bitwise And Operator you can checked permission

    let t=(2+3)*4;
    console.log(t);

    //Swapping Variable
    let i='red';
    let j='blue';

    let k=i;
    i=j;
    j=k;

    console.log(i);
    console.log(j);






    

