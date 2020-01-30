import { Component, OnInit } from '@angular/core';
import { MediaDataService } from 'src/app/services/data/media-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-media-add',
  templateUrl: './media-add.component.html',
  styleUrls: ['./media-add.component.css']
})
export class MediaAddComponent implements OnInit {

  constructor(public mediaService: MediaDataService, public router : Router) { }

  ngOnInit() {
  }


  (txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    
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
