import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MessageService {
 
  message : string;
  constructor() { 
    this.message = "Good morning all..";
  }

  getMessage():string{
    return this.message;
  }
  
}
