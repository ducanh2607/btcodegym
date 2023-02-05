import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Species} from "../model/species";
import {Animal} from "../model/animal";
import {environment} from "../../environments/environment";

const apiUrl = environment.apiUrl
@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  constructor(private httpClient: HttpClient) { }
  findAllSpecies(): Observable<Species[]> {
    return this.httpClient.get<Species[]>(`${apiUrl}/species`)
  }
  findAllAnimal(): Observable<Animal[]>{
    return this.httpClient.get<Animal[]>(`${apiUrl}/animal`)
  }
  findSpecies(id: number): Observable<Species>{
    return this.httpClient.get<Species>(`${apiUrl}/species/${id}`)
  }
  findAnimal(id: number): Observable<Animal>{
    return this.httpClient.get<Animal>(`${apiUrl}/animal/${id}`)
  }
  save(animal: Animal): Observable<any>{
    return this.httpClient.post<Animal>(`${apiUrl}/animal/create`, animal)
  }
  delete(id: number):Observable<any>{
    return this.httpClient.delete<any>(`${apiUrl}/animal/${id}`)
  }
  search(name: String): Observable<Animal[]> {
    return this.httpClient.get<Animal[]>(`${apiUrl}/animal/search/${name}`)
  }
  sort(): Observable<Animal[]>{
    return this.httpClient.get<Animal[]>(`${apiUrl}/animal/sort`)
  }
  filter(id: number): Observable<Animal[]>{
    return this.httpClient.get<Animal[]>(`${apiUrl}/animal/filter/${id}`)
  }
}
