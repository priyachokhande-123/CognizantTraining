import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Media } from 'src/app/model/media.model';


const API_URL = "http://localhost:3000/media";
@Injectable({
  providedIn: 'root'
})
export class MediaDataService {

   constructor(public http : HttpClient) { }

getMedia(){
 
  return this.http.get(API_URL);

}
addNewMedia(media : Media){

  return this.http.post(API_URL,media);
}
}
