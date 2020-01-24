import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { Media } from '../model/media.model';

@Component({
  selector: 'app-media-entry',
  templateUrl: './media-entry.component.html',
  styleUrls: ['./media-entry.component.css']
})
export class MediaEntryComponent implements OnInit {
@Output()
submit_info:EventEmitter<Media>;

constructor() { 
  this.submit_info=new EventEmitter();
}

  upload(title:HTMLInputElement, description:HTMLInputElement,tags:HTMLInputElement):void{
      
    let media = new Media(title.value, description.value,tags.value);
   
    this.submit_info.emit(media);

    title.value = "";
    description.value = "";
  tags.value = "";
}
  ngOnInit() {
  }

}
