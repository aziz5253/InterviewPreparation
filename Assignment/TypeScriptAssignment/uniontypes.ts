
function getType(value: string | number): string {
  return typeof value;
}

// Example
console.log(getType("Hello")); // string
console.log(getType(123));     // number
