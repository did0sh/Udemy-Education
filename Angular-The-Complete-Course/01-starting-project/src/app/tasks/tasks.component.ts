import { Component, EventEmitter, Input, Output } from '@angular/core';
import { TaskComponent } from "./task.component";
import { NewTaskComponent } from '../new-task/new-task.component';
import { TasksService } from './tasks.service';


@Component({
  selector: 'app-tasks',
  standalone: true,
  imports: [TaskComponent, NewTaskComponent],
  templateUrl: './tasks.component.html',
  styleUrl: './tasks.component.css'
})
export class TasksComponent {
  @Input() selectedUser : any
  isAddingTask: boolean = false;

  constructor(private tasksService: TasksService){}

  get selectedUserTasks() {
    return this.tasksService.getUserTasks(this.selectedUser.id)
  }

  onStartAddTask() {
    this.isAddingTask = true;  
  }

  onCloseAddTask() {
    this.isAddingTask = false
  }
}
