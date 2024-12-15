import { Component, EventEmitter, Input, Output } from '@angular/core';
import { DUMMY_TASKS } from '../dummy/dummy-tasks';
import { TaskComponent } from "./task.component";
import { NewTaskComponent } from '../new-task/new-task.component';
import { Task } from './task.model';


@Component({
  selector: 'app-tasks',
  standalone: true,
  imports: [TaskComponent, NewTaskComponent],
  templateUrl: './tasks.component.html',
  styleUrl: './tasks.component.css'
})
export class TasksComponent {
  @Input() selectedUser : any
  tasks = DUMMY_TASKS
  isAddingTask: boolean = false;

  get selectedUserTasks() {
    return this.tasks.filter((task) => task.userId === this.selectedUser.id);
  }

  onCompleteTask(id: string) {
    this.tasks = this.tasks.filter((task) => task.id !== id);
  }

  onStartAddTask() {
    this.isAddingTask = true;  
  }

  onCancelAddTask() {
    this.isAddingTask = false
  }
}
