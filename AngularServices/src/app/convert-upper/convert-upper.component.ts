import { Component, OnInit } from '@angular/core'
import { ConvertService } from '../services/convert.service';


@Component({
  selector: 'app-convert-upper',
  templateUrl: './convert-upper.component.html',
  styleUrls: ['./convert-upper.component.css']
})
export class ConvertUpperComponent implements OnInit {

  upperName : string;
  constructor(public convertService :ConvertService) { 

  }

  fun(txt : HTMLInputElement){
  
     this.upperName = this.convertService.convertToUpper(txt.value);
  }
  

  ngOnInit() {
  }

}
