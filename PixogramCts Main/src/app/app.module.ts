import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PixogramHeaderComponent } from './pixogram-header/pixogram-header.component';
import { MyMediaComponent } from './my-media/my-media.component';

@NgModule({
  declarations: [
    AppComponent,
    PixogramHeaderComponent,
    MyMediaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
