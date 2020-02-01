import { Component, OnInit, Input } from '@angular/core';
import { Media } from 'src/app/model/media.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-media-list',
  templateUrl: './media-list.component.html',
  styleUrls: ['./media-list.component.css']
})
export class MediaListComponent implements OnInit {
/*
  
  medias : Array<Media>;
  constructor(private mediaService : MediaDataService, public router : Router) { 

  }
  
  add(){
    this.router.navigate(['/media-add']);
  }

 

  this.mediaService.getMedia().subscribe((response:any) => this.medias = response);
*/
  ngOnInit() {
      }
}
