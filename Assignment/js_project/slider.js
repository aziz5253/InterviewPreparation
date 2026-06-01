let i=0,imgs=['camera.jpg','Laptop.jpg','calculator.jpg','mobile.jpg'];
setInterval(()=>{img.src=imgs[i++%imgs.length]},3000);