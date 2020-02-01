import { Injectable } from '@angular/core';
import { AuthenticationService } from './authentication.service';
import { ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';


@Injectable({
  providedIn: 'root'
})
export class AuthGuardService {
  constructor(public auth : AuthenticationService, public router : Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {

      
      if(this.auth.isUserLoggedIn())
          return true;
      else{
      
        this.router.navigate(['/login']);
        return false;
      }    
          
  }
  }
