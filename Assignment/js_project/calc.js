
function calculate(operation) {
  let a = parseFloat(document.getElementById("num1").value);
  let b = parseFloat(document.getElementById("num2").value);

  if (isNaN(a) || isNaN(b)) {
    alert("Enter valid numbers");
    return;
  }

  let result;

  switch (operation) {
    case '+':
      result = a + b;
      break;
    case '-':
      result = a - b;
      break;
    case '*':
      result = a * b;
      break;
    case '/':
      if (b === 0) {
        alert("Cannot divide by zero");
        return;
      }
      result = a / b;
      break;
  }

  document.getElementById("result").innerText = "Result: " + result;
}
