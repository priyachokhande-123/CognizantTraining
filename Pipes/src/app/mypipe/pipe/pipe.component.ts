import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe',
  templateUrl: './pipe.component.html',
  styleUrls: ['./pipe.component.css']
})
export class PipeComponent implements OnInit {
name:string;
rate :number;
gpa:number;

  constructor() {
    this.name="";
    this.rate=100;
    this.gpa=1234.45;
   }

  ngOnInit() {
  }

}
