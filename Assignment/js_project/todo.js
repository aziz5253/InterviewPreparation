let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

// ✅ Display tasks
function displayTasks() {
  let list = document.getElementById("taskList");
  list.innerHTML = "";

  tasks.forEach((task, index) => {
    let li = document.createElement("li");

    li.innerHTML = `
      <span onclick="toggleComplete(${index})"
        style="cursor:pointer; text-decoration:${task.completed ? 'line-through' : 'none'}">
        ${task.text}
      </span>

      <button onclick="deleteTask(${index})">Delete</button>
    `;

    list.appendChild(li);
  });
}

// ✅ Add task
function addTask() {
  let input = document.getElementById("taskInput");
  let text = input.value.trim();

  if (text === "") return;

  tasks.push({ text: text, completed: false });

  localStorage.setItem("tasks", JSON.stringify(tasks));
  input.value = "";

  displayTasks();
}

// ✅ Delete
function deleteTask(index) {
  tasks.splice(index, 1);
  localStorage.setItem("tasks", JSON.stringify(tasks));
  displayTasks();
}

// ✅ Mark complete
function toggleComplete(index) {
  tasks[index].completed = !tasks[index].completed;
  localStorage.setItem("tasks", JSON.stringify(tasks));
  displayTasks();
}

// Initial load
displayTasks();