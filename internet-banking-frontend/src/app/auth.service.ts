import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8080'; // Your backend API URL

  constructor(private http: HttpClient) {}

  login(formData: { username: string, password: string }): Observable<any> {
    // API endpoint for logging in (adjust according to your backend setup)
    return this.http.post(`${this.apiUrl}/api/login`, formData);
  }

  // You can add other authentication related methods here
}
