import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PixogramHeadderComponent } from './pixogram-headder/pixogram-headder.component';
import { MediaListComponent } from './media/media-list/media-list.component';
import { MediaAddComponent } from './media/media-add/media-add.component';
import { MediaUpdateComponent } from './media/media-update/media-update.component';


@NgModule({
  declarations: [
    AppComponent,
    PixogramHeadderComponent,
    MediaListComponent,
    MediaAddComponent,
    MediaUpdateComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
