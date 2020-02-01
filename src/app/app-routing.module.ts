import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './authentication/login/login.component';
import { MediaDetailsComponent } from './media/media-details/media-details.component';
import { AuthGuardService } from './services/auth-guard.service';
import { LogoutComponent } from './logout/logout.component';
import { SingleMediaComponent } from './upload-media/single-media/single-media.component';
import { MultiMediaComponent } from './upload-media/multi-media/multi-media.component';
import { AccountComponent } from './Account/account/account.component';
import { RegisterComponent } from './authentication/register/register.component';


const routes: Routes = [
  
  { path:"", redirectTo : "login", pathMatch: "full"},
  { path:"login", component: LoginComponent},
  { path:"logout", component:LogoutComponent , canActivate : [AuthGuardService]},
  { path:"media", component:MediaDetailsComponent , canActivate : [AuthGuardService]},
  { path:"singlemedia", component:SingleMediaComponent},
  { path:"signup", component:RegisterComponent},
  { path:"multimedia", component:MultiMediaComponent},
  { path:"account", component:AccountComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
