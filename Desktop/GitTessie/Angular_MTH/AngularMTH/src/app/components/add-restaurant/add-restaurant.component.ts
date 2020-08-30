import { Component, OnInit } from '@angular/core';
import { AddRestaurantService } from 'src/app/Services/add-restaurant.service';
import { Restaurant } from 'src/app/Model/Restaurant';

@Component({
  selector: 'app-add-restaurant',
  templateUrl: './add-restaurant.component.html',
  styleUrls: ['./add-restaurant.component.scss']
})
export class AddRestaurantComponent implements OnInit {

  restaurant: Restaurant;
  restaurantName: string;

  constructor(private service: AddRestaurantService) { }

  ngOnInit(): void {
    this.service.getByRestaurantName(this.restaurantName).subscribe(
      data => {
        this.restaurant = data;
      }
    );
  }

}
