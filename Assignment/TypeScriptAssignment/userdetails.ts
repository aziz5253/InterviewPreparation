
// User interface
interface User {
  id: number;
  name: string;
  email: string;
  isAdmin: boolean;
}

// Function to display user details
function displayUser(user: User): void {
  console.log(`ID: ${user.id}`);
  console.log(`Name: ${user.name}`);
  console.log(`Email: ${user.email}`);
  console.log(`Admin: ${user.isAdmin ? "Yes" : "No"}`);
}

// Example
const user1: User = {
  id: 1,
  name: "Shabbir",
  email: "shabbir@example.com",
  isAdmin: true
};

displayUser(user1);
