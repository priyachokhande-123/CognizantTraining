import { Component, OnInit } from '@angular/core';
import { ProductDataService } from '../../services/data/product-data.service';
import { Router } from '@angular/router';
import { Product } from '../../models/product.model';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {
  constructor(public productService: ProductDataService, public router : Router)
 { }

  ngOnInit() {
  }
  saveProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));

    // need to send it to server using product Data Service
    this.productService.addNewProduct(product).subscribe(
      (response) => {
        console.log(response);
        // navigate to product-list
        this.router.navigate(['/product']);
      });


    // reset the form
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";


    }
  }
