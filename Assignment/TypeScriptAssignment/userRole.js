"use strict";
var UserRole;
(function (UserRole) {
    UserRole[UserRole["Admin"] = 0] = "Admin";
    UserRole[UserRole["Editor"] = 1] = "Editor";
    UserRole[UserRole["Viewer"] = 2] = "Viewer";
})(UserRole || (UserRole = {}));
function getPermissions(role) {
    switch (role) {
        case UserRole.Admin:
            return ["read", "write", "delete"];
        case UserRole.Editor:
            return ["read", "write"];
        case UserRole.Viewer:
            return ["read"];
        default:
            return [];
    }
}
// Example
console.log(getPermissions(UserRole.Admin));
