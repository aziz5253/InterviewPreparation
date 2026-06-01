
enum UserRole {
  Admin,
  Editor,
  Viewer
}

function getPermissions(role: UserRole): string[] {
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
