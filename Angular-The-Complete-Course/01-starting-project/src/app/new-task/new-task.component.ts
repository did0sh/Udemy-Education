import { Component, EventEmitter, Input, Output } from '@angular/core';
import { User } from '../user/user.model';
import { Task } from '../tasks/task.model';
import { FormsModule } from '@angular/forms';
import { DUMMY_TASKS } from '../dummy/dummy-tasks';

@Component({
  selector: 'app-new-task',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './new-task.component.html',
  styleUrl: './new-task.component.css'
})
export class NewTaskComponent {
  @Output() cancelAddTask = new EventEmitter<void>();
  @Input({required:true}) user!: User;

  titleInput = '';
  summaryInput = '';
  dueDateInput = '';

  closeTaskModal() {
    this.cancelAddTask.emit()
  }

  createTask() {
    DUMMY_TASKS.unshift({
      id: new Date().getTime().toString(),
      userId: this.user.id,
      title: this.titleInput,
      summary: this.summaryInput,
      dueDate: this.dueDateInput
    })
    this.closeTaskModal();
  }
}
