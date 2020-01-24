import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-myform',
  templateUrl: './myform.component.html',
  styleUrls: ['./myform.component.css']
})
export class MyformComponent implements OnInit {

  title : string;
  desc : string;
  tag:string;

  constructor() { }

  ngOnInit() {
  }

  upload(frm:any){
      this.title= frm.mytitle;
      this.desc= frm.mydesc;
      this.tag = frm.mytag;

  }

}
 


