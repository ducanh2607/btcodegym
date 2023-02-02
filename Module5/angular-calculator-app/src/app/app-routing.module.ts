import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {YoutubePlaylistComponent} from "./youtube-playlist/youtube-playlist.component";
import {YoutubePlayerComponent} from "./youtube-player/youtube-player.component";
import {ProductListComponent} from "./product-list/product-list.component";
import {ProductCreateComponent} from "./product-create/product-create.component";
import {DictionaryPageComponent} from "./dictionary-page/dictionary-page.component";
import {DictionaryDetailComponent} from "./dictionary-detail/dictionary-detail.component";
import {ProductEditComponent} from "./product-edit/product-edit.component";
import {ProductDeleteComponent} from "./product-delete/product-delete.component";

const routes: Routes = [{
  path: 'youtube',
  component: YoutubePlaylistComponent,
  children: [{
    path: ':id',
    component: YoutubePlayerComponent
  }],



},
  {
    path: 'product/list',
    component: ProductListComponent
  },
  {
    path: 'product/create',
    component: ProductCreateComponent
  },
  {
    path: 'product/edit/:id',
    component: ProductEditComponent
  }, {
    path: 'product/delete/:id',
    component: ProductDeleteComponent
  },{
  path:'dictionary/page',
    component: DictionaryPageComponent,
  },{
  path: 'dictionary/page/word/:word',
    component: DictionaryDetailComponent
  }];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
