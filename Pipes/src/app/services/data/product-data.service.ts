import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../../models/product.model';

const API_URL = "http://localhost:3000/products"; 
@Injectable({
  providedIn: 'root'
})

export class ProductDataService {

  constructor(public http : HttpClient)
{ }
  getAllProducts(){
    return this.http.get(API_URL);
  }
  addNewProduct(product : Product){
    // POST http verb
    return this.http.post(API_URL, product);
  }

  // methid to get single record of given id
  getOneProduct(id:number){
    // GET http verb
    return this.http.get(API_URL + "/" + id);

  }

  // method to send updated object(product) to server
  updateProduct(id:number, product : Product){
    // PUT http verb
    return this.http.put(API_URL + "/" + id, product);
  }

  // method to delete single record of given id
  deleteProduct(id:number){
    // DELETE http verb
    return this.http.delete(API_URL + "/" + id);

  }

}
