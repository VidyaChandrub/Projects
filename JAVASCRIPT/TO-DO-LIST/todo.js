const addBtn = document.querySelector("#add-btn");
const newTaskInput = document.querySelector("#wrapper input");
const taskContainer = document.querySelector("#tasks");
const error1 = document.getElementById("error");
const countValue = document.querySelector(".count-value");

let taskCount = 0;

let displayCount = (taskCount) => {
    countValue.innerHTML = taskCount;
}

let addTask = () =>{
    let taskName = newTaskInput.value.trim();
    error1.style.display = " ";
    if(!taskName){
        setTimeout(() => {
            error1.style.value = "block";
        }, 2000);
        return;
    }

    const task = `<div class="task">
    <input type="checkbox" class="task-check"/>
    <span class="taskname">${taskName}</span>
    <button class="edit">
    <i class="fa-solid fa-pen-to-square"></i>
    </button>
    <button class="delete">
    <i class="fa fa-trash" aria-hidden="true"></i>
    </button>
    </div>`;

    taskContainer.insertAdjacentHTML("beforeend", task);

    const deleteButtons = document.querySelectorAll(".delete");
    deleteButtons.forEach(button => {
        button.onclick = () =>{
            button.parentNode.remove();
            taskCount -= 1;
            displayCount(taskCount);
        }
    })

    const editButtons = document.querySelectorAll(".edit");
    editButtons.forEach((editBtn) => {
        editBtn.onclick = (e) => {
            let targetElement = e.target;
            if(!(e.target.className == "edit")){
                targetElement= e.target.parentElement;
            }
            newTaskInput.value = targetElement.previousElementSibling?.innerText;
            targetElement.parentNode.remove();
            taskCount -= 1;
            displayCount(taskCount);
        
        }
    })

    const taskscheck = document.querySelectorAll(".task-check");
    taskscheck.forEach((checkBox) => {
        checkBox.onchange = () => {
            checkBox.nextElementSibling.classList.toggle("completed");
            if(checkBox.checked){
                taskCount -= 1;
            } else {
                taskCount += 1;
            }
            displayCount(taskCount);
        }
    })
     taskCount += 1;
     displayCount(taskCount);
    newTaskInput.value = "";
}

addBtn.addEventListener("click", addTask);

window.onload = () => {
    taskCount = 0;
    displayCount(taskCount);
    newTaskInput.value = "";
}