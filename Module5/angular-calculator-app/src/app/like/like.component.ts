import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-like',
  templateUrl: './like.component.html',
  styleUrls: ['./like.component.css']
})
export class LikeComponent implements OnInit{
  ngOnInit(): void {
  }

like = 0;
  constructor() {
  }
  likeThis(){
    this.like ++;
  }
}
