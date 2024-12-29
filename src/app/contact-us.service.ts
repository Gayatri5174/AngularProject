import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContactUsService {

  private apiUrl = 'http://localhost:8080/api/contact'; // Your Spring Boot API URL

  constructor(private http: HttpClient) { }

  getContactInfo(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}
