import {Component, OnInit} from '@angular/core';
import { FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  login = new FormGroup({
    email: new FormControl('', Validators.required),
    password: new FormControl('', Validators.compose([Validators.required, Validators.min(6)]))
  })
  get email(): FormControl{
    return this.login.get('email') as FormControl;
  }
  get password(): FormControl{
    return this.login.get('password') as FormControl;
  }

  save() {
    console.log(this.login.value)
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
