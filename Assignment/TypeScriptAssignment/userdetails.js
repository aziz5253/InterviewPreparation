"use strict";
// Function to display user details
function displayUser(user) {
    console.log(`ID: ${user.id}`);
    console.log(`Name: ${user.name}`);
    console.log(`Email: ${user.email}`);
    console.log(`Admin: ${user.isAdmin ? "Yes" : "No"}`);
}
// Example
const user1 = {
    id: 1,
    name: "Shabbir",
    email: "shabbir@example.com",
    isAdmin: true
};
displayUser(user1);
