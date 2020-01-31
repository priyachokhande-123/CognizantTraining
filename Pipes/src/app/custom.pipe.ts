import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'custom'
})
export class CustomPipe implements PipeTransform {


  transform(name: any): any {
    if (name=="")
    {
      return "No data available";
    }
    return name;
  }

  

}
