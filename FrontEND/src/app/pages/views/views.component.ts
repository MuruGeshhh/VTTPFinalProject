import { Component, OnInit } from '@angular/core';
import { faThumbsUp, faComments, faThumbsDown, faTintSlash } from '@fortawesome/free-solid-svg-icons';
import { PostModel } from 'src/app/models/post-model';
import { PostService } from 'src/app/services/post.service';
import { views } from './views';
import { LocalStorageService } from 'ngx-webstorage';
@Component({
  selector: 'app-views',
  templateUrl: './views.component.html',
  styleUrls: ['./views.component.css']
})
export class ViewsComponent  {

  View : views[] = [];
  newViews:String;


   
  constructor(
    private localStorage: LocalStorageService) {
  }

  saveWatchlist(){
    if(this.newViews){
      let Views: any= new views();
      Views.name = this.newViews;
      Views.isCompleted = true;
      this.View.push(Views);
      this.newViews = '';

      



      


    }
    else{
      alert("please enter a movie")
    }

  }


  done(id:number){

    this.View[id].isCompleted = !this.View[id].isCompleted;
 

  }

  remove(id:number){
    this.View = this.View.filter((v,i)=> i!==id);


  }
  


  

}
