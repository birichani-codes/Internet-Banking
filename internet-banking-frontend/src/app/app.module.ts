import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';  // Ensure you have HttpClientModule for API requests
import { AppRoutingModule } from './app-routing.module'; // Make sure you have this file setup

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component'; // Adjust or add path if you have these components
import { SignupComponent } from './signup/signup.component';
import { NavbarComponent } from './navbar/navbar.component'; // Adjust or add path if you have these components

import { AuthService } from './services/auth.service'; // Adjust or add path if you have this service

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    AuthService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
