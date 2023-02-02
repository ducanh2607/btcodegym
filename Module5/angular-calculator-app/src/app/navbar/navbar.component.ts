import {Component, EventEmitter, Input, Output} from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {


  @Input() item?: string
  @Output() newItemEvent = new EventEmitter<string>();
  addNewItem(value: string){
    this.newItemEvent.emit(value);
  }

}
