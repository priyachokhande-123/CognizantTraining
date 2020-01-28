import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { Component1Component } from './component1/component1.component';
import { Component2Component } from './component2/component2.component';
import { ConvertUpperComponent } from './convert-upper/convert-upper.component';

@NgModule({
  declarations: [
    AppComponent,
    Component1Component,
    Component2Component,
    ConvertUpperComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
