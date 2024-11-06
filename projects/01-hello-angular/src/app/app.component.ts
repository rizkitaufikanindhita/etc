import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  template: `
    <h1>If you are reading this...</h1>
    <p>Things have worked out well! 🎉</p>
    <h1>Hello from Rizki</h1>
    <h2>List Favorite Movies</h2>
    <ol>
      <li *ngFor="let item of listMovie">
    {{item}}</li>
    </ol>
    <h2>
      Welcome Back {{userName}}
    </h2>
  `,
  styles: `ol{
    list-style-type: upper-roman
    }`,
})
export class AppComponent {
  userName: String = 'Rizki Taufik'
  listMovie = ['Inception','Shutter Island','The Wolf of Wall Street']
}
