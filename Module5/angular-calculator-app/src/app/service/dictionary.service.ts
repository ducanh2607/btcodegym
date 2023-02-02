import { Injectable } from '@angular/core';
import {IWord} from "../model/iword";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {

  constructor() { }
  words: IWord[]= [{
    word: 'book',
    mean: 'sach'
  },{
    word: 'apple',
    mean: 'tao'
  },{
    word: 'pen',
    mean: 'but'
  },{
    word: 'notebook',
    mean: 'vo'
  }]
  getAll(){
    return this.words
  }



}
