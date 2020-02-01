import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { Router } from '@angular/router';

@Component({
  selector: 'pixogram-headder',
  templateUrl: './pixogram-headder.component.html',
  styleUrls: ['./pixogram-headder.component.css']
})
export class PixogramHeadderComponent implements OnInit {

  constructor(private router : Router, public auth : AuthenticationService) { }

  ngOnInit() {
  }

}
