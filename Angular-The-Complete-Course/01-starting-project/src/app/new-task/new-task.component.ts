import { Component, EventEmitter, Input, Output } from '@angular/core';
import { User } from '../user/user.model';
import { FormsModule } from '@angular/forms';
import { TasksService } from '../tasks/tasks.service';

@Component({
  selector: 'app-new-task',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './new-task.component.html',
  styleUrl: './new-task.component.css'
})
export class NewTaskComponent {
  @Output() close = new EventEmitter<void>();
  @Input({required:true}) user!: User;

  constructor(private tasksService: TasksService){}

  enteredTitle = '';
  enteredSummary = '';
  enteredDate = '';

  closeTaskModal() {
    this.close.emit()
  }

  addTask() {
    this.tasksService.createTask(
      {
      title: this.enteredTitle, 
      summary: this.enteredSummary, 
      date: this.enteredDate
      }, 
    this.user.id)
    this.closeTaskModal();
  }
}
