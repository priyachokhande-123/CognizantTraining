import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-multi-media',
  templateUrl: './multi-media.component.html',
  styleUrls: ['./multi-media.component.css']
})
export class MultiMediaComponent implements OnInit {

  constructor(private router : Router) { }
  singlemedia()
  {
    this.router.navigate(['singlemedia']);
  }
  ngOnInit() {
  }

}
