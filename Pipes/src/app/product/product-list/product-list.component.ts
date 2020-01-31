import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductDataService } from '../../services/data/product-data.service';
import { Product } from '../../models/product.model';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products :Array<Product>;
  constructor(private productService : ProductDataService, public router : Router) { }

  add(){
    // navigate to product-add component
    this.router.navigate(['/product-add']);
  }
  update(id:number){
    // navigate to update Component (associate id also)
    this.router.navigate(['/product-update/' + id]);
  }

  delete(id:number){
    // call product data service to delete
    this.productService.deleteProduct(id).subscribe((response) => {
        console.log(response);
        // call getAllProducts (selective loading)
        this.productService.getAllProducts().subscribe((response:any) => this.products = response);
        
        // navigate to same component (caching issues)
        // this.router.navigate(['/product']);
    });
  }
  ngOnInit() {
    this.productService.getAllProducts().subscribe((response:any) => this.products = response);
  }
  }

  

