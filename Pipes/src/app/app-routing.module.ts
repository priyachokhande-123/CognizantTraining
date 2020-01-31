import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { AuthGuardService } from './services/auth-guard.service';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductAddComponent } from './product/product-add/product-add.component';
import { LogoutComponent } from './logout/logout.component';
import { ErrorComponent } from './error/error.component';
import { ProductUpdateComponent } from './product-update/product-update.component';
import { pipe } from 'rxjs';
import { PipeComponent } from './mypipe/pipe/pipe.component';


const routes: Routes = [

{ path:"", redirectTo : "home", pathMatch: "full"},
{ path:"home", component: HomeComponent},
{ path:"contactus", component:ContactComponent},
{ path:"aboutus", component:AboutComponent},
{ path:"search/:searchText", component: SearchComponent},
{ path:"login", component: LoginComponent},
{ path:"pipe", component: PipeComponent},
{ path:"product", component: ProductListComponent, canActivate : [AuthGuardService]},
{ path:"product-add", component: ProductAddComponent, canActivate : [AuthGuardService]},
{ path:"product-update/:productId", component: ProductUpdateComponent, canActivate : [AuthGuardService]},
    // connect the guard service
    
    { path:"logout", component: LogoutComponent, canActivate : [AuthGuardService]},
    // <url>/:<name by which data is accessed>
    { path:"search/:searchText", component: SearchComponent},

    // add a fallback mapping
    { path:"**", component: ErrorComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],//registering route
  exports: [RouterModule]
})
export class AppRoutingModule { }
