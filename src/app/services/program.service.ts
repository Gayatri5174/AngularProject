import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProgramService {

  private apiUrl = 'http://localhost:8080/api/programs';  // Replace with your Spring Boot backend URL

  constructor(private http: HttpClient) { }

  getPrograms(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}
