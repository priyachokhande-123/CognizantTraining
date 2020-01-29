import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { NavigationComponent } from './navigation/navigation.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { ProductEntryComponent } from './product-entry/product-entry.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ErrorComponent } from './error/error.component';
import { LogoutComponent } from './logout/logout.component';
import { ProductBaseComponent } from './product-base/product-base.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    NavigationComponent,
    SearchComponent,
    LoginComponent,
    ProductEntryComponent,
    ProductListComponent,
    ErrorComponent,
    LogoutComponent,
    ProductBaseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
