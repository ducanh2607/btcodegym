import {Component, OnInit} from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'
import {CustomValidators} from "../CustomValidators";


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{

 user = new FormGroup({
   email: new FormControl('',Validators.compose([Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')])),
   password: new FormControl('', Validators.compose([Validators.required, Validators.minLength(6)])),
   confirm: new FormControl(''),
   country: new FormControl('', Validators.required),
   age: new FormControl('', Validators.compose([Validators.required, Validators.min(18)])),
   gender: new FormControl('',Validators.required),
   phone: new FormControl('',Validators.compose([Validators.required, Validators.pattern('/^\\+84\\d{9,10}$/')])),
 }, [CustomValidators.MatchValidator('password', 'confirm')])
  save(){
    console.log(this.user.value)
  }
  get passwordMatchError() {
    return (
      this.user.getError('mismatch') &&
      this.user.get('confirm')?.touched
    );
  }
  get email(): FormControl{
    return this.user.get('email') as FormControl;
  }



  constructor() {
  }

  ngOnInit(): void {
  }

}
