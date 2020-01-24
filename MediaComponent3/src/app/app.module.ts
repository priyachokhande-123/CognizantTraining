import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediaContentComponent } from './media-content/media-content.component';
import { MediaListComponent } from './media-list/media-list.component';
import { MediaEntryComponent } from './media-entry/media-entry.component';

@NgModule({
  declarations: [
    AppComponent,
    MediaContentComponent,
    MediaListComponent,
    MediaEntryComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
