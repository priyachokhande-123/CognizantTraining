import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { SearchComponent } from './search/search.component';


const routes: Routes = [

{ path:"", redirectTo : "home", pathMatch: "full"},
{ path:"home", component: HomeComponent},
{ path:"contactus", component:ContactComponent},
{ path:"aboutus", component:AboutComponent},
{ path:"search/:searchText", component: SearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],//registering route
  exports: [RouterModule]
})
export class AppRoutingModule { }
