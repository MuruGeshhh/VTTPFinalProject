import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  constructor(private http: HttpClient) { }

  
  url = "https://typical-cat-production.up.railway.app/";
  
  makePayment(sum : any):  Observable<any>  {
    return this.http.post(this.url+'paypal/make/payment?sum='+sum, {})
      
  }

  completePayment(paymentId: any, payerId : any):  Observable<any> {
    return this.http.post(this.url + 'paypal/complete/payment?paymentId=' + paymentId + '&payerId=' + payerId , {})
      
  }

 
}
