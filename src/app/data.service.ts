import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  private apiUrl = 'http://localhost:8080/api/programs';  

  constructor(private http: HttpClient) { }

  // Method to fetch program details
  getPrograms(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}
