import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Task } from './task.model';
import { CommonModule } from '@angular/common';
import { TasksService } from './tasks.service';

@Component({
  selector: 'app-task',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './task.component.html',
  styleUrl: './task.component.css'
})
export class TaskComponent {
   @Input({required:true}) task! : Task
   @Output() complete = new EventEmitter<string>(); 

   constructor(private tasksService : TasksService){}

   onCompleteTask() {
      this.tasksService.removeTask(this.task.id)
   }
}
