import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-single-media',
  templateUrl: './single-media.component.html',
  styleUrls: ['./single-media.component.css']
})
export class SingleMediaComponent implements OnInit {

  constructor(private router : Router) { }
multimedia()
{
  this.router.navigate(['multimedia']);
}

  ngOnInit() {
  }

}
