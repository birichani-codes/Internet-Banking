// auth.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8080/internet-banking';

  constructor(private http: HttpClient) { }

  login(credentials: any) {
    return this.http.post(`${this.apiUrl}/login`, credentials);
  }
}
