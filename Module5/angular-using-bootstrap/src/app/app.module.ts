import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import {FormsModule} from "@angular/forms";
import { PetComponent } from './pet/pet.component';
import { FontSizeEditorComponent } from './font-size-editor/font-size-editor.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    PetComponent,
    FontSizeEditorComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
