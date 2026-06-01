
function validateForm() {
  let name = document.getElementById("name").value.trim();
  let email = document.getElementById("email").value.trim();
  let password = document.getElementById("password").value;

  // ✅ Empty check
  if (name === "" || email === "" || password === "") {
    alert("All fields are required");
    return false;
  }

  // ✅ Email validation
  let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
  if (!email.match(emailPattern)) {
    alert("Enter valid email");
    return false;
  }

  // ✅ Password strength
  if (password.length < 6) {
    alert("Password must be at least 6 characters");
    return false;
  }

  alert("Form submitted successfully ✅");
  return true;
}
