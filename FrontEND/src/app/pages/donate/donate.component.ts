import { AfterViewChecked, Component, ElementRef, OnInit, ViewChild } from '@angular/core';

import { render } from 'creditcardpayments/creditCardPayments';



@Component({
  selector: 'app-donate',
  templateUrl: './donate.component.html',
  styleUrls: ['./donate.component.css']
})
export class DonateComponent implements OnInit {

  ngOnInit(){
    
    render({
      
      id:'#payments',
      currency:"SGD",
      value : "5",
      onApprove: (details) =>{
        alert("transaction sucess")
      }

    });
      
  }

  constructor(){

   

    


    }

    


    
  

}
  


