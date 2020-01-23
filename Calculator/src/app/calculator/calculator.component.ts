import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
res:number

add(value1:HTMLInputElement,value2:HTMLInputElement,result:HTMLInputElement):void
{
  let a=parseInt(value1.value);
  let b=parseInt(value2.value);
  this.res=a+b;
}
sub(value1:HTMLInputElement,value2:HTMLInputElement,result:HTMLInputElement):void
{
  let a=parseInt(value1.value);
  let b=parseInt(value2.value);
  this.res=a-b;
}
mul(value1:HTMLInputElement,value2:HTMLInputElement,result:HTMLInputElement):void
{
  let a=parseInt(value1.value);
  let b=parseInt(value2.value);
  this.res=a*b;
}
div(value1:HTMLInputElement,value2:HTMLInputElement,result:HTMLInputElement):void
{
  let a=parseInt(value1.value);
  let b=parseInt(value2.value);
  this.res=a/b;
}
clear(value1:HTMLInputElement,value2:HTMLInputElement,result:HTMLInputElement):void
{
value1.value="";
value2.value="";
result.value="";
  
}



  constructor() { }

  ngOnInit() {
  }

}
