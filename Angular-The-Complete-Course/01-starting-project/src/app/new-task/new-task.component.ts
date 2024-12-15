import { Component, EventEmitter, Input, Output } from '@angular/core';
import { User } from '../user/user.model';
import { Task } from '../tasks/task.model';

@Component({
  selector: 'app-new-task',
  standalone: true,
  imports: [],
  templateUrl: './new-task.component.html',
  styleUrl: './new-task.component.css'
})
export class NewTaskComponent {
  @Output() cancelAddTask = new EventEmitter<void>(); 

  closeTaskModal() {
    this.cancelAddTask.emit()
  }
}
