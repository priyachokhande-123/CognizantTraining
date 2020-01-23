import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'myclass',
  templateUrl: './myclass.component.html',
  styleUrls: ['./myclass.component.css']
})
export class MyclassComponent implements OnInit {
name:string;
age:number;
email:string;

ngOnInit()
{

}
constructor() { 
  this.name="priya";
  this.age=10;
  this.email="priya@gmail.com";
    }
    isEligible():boolean{
      if(this.age>18)
      return true;
      return false;
    }
      changeAge():void{
        this.name="sonal";
        this.age=20;
        this.email="sona@gmail.com";
      }
  }