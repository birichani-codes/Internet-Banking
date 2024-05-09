import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  formData = {
    username: '',
    password: ''
  };

  constructor(private authService: AuthService, private router: Router) {}

  login() {
    this.authService.login(this.formData).subscribe(() => {
      // Redirect to the dashboard or other protected route upon successful login
      this.router.navigateByUrl('/dashboard');
    }, (error) => {
      // Handle login error (display error message, reset form, etc.)
      console.error('Login failed:', error);
    });
  }
}
