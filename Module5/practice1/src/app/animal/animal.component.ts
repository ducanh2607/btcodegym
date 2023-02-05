import {Component, OnInit} from '@angular/core';
import {Animal} from "../model/animal";
import {AnimalService} from "../service/animal.service";
import {Species} from "../model/species";
import {getNumber} from "@angular/fire/remote-config";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-animal',
  templateUrl: './animal.component.html',
  styleUrls: ['./animal.component.css']
})
export class AnimalComponent implements OnInit{
  animals: Animal[] = []
  name: String = ''

  spe!: Species

  species: Species[]=[]

  constructor(private animalService: AnimalService) {
  }

  ngOnInit(): void {

    this.animalService.findAllAnimal().subscribe((data) => {
      this.animals = data
    })
    this.animalService.findAllSpecies().subscribe((data)=>{
      this.species = data
    })

  }
  delete(id: number){
    if (confirm("Are you want to delete this animal?")){
      this.animalService.delete(id).subscribe(()=> {
        this.ngOnInit()
      })
    }
  }
  search(){
    if (this.name != ''){this.animalService.search(this.name).subscribe((data)=>{
      this.animals = data})}else{
      this.ngOnInit()
    }
  }
  sort(){
    this.animalService.sort().subscribe( (data)=>{
      this.animals = data
    })
  }


  filter(){
    this.animalService.filter(this.spe.id).subscribe((data) =>{
      this.animals = data
    })
  }
}
