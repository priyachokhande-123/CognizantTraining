import { Component, OnInit } from '@angular/core';
import { Media } from '../model/media.model';


@Component({
  selector: 'app-media',
  templateUrl: './media-content.component.html',
  styleUrls: ['./media-content.component.css']
})
export class MediaContentComponent implements OnInit {



  media : Array<Media>;

  constructor() { 
    
    this.media= [
      new Media("title1","I am title1","@title1"),
      new Media("title2","I am title2","@title2"),
      new Media("title3","I am title3","@title3"),
    ];
    
  }

  addNewMedia(medial:Media):void
  {
    this.media.push(medial);
  }

  

  ngOnInit() {
  }

}
