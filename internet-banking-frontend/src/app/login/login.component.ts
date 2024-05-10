
import { Component } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  credentials = {
    username: '',
    password: ''
  };

  constructor(private authService: AuthService) { }

  login() {
    this.authService.login(this.credentials).subscribe(
      response => {

        console.log('Login successful', response);
      },
      error => {

        console.error('Login error', error);
      }
    );
  }
}
