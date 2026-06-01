"use strict";
var data = prompt("Enter a number");
if (data != null) {
    var n = parseInt(data);
    console.log(n);
    var i = 0;
    while (i <= n) {
        if (i % 5 == 0)
            continue;
        console.log(i);
        i++;
    }
    /*console.log("By For Loop");
    for(var i=0;i<=n;i++){
      if(i%5==0) continue;
       console.log(i);
  
    }*/
}
else {
    console.log("Invalid Number");
}
