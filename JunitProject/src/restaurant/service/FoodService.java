package restaurant.service;

import restaurant.dao.Snacks;
import restaurant.dao.Tea;

public class FoodService {
	
	public void serveTheFood(String string1, String string2) {
		System.out.println("Food Service started...");
		System.out.println("serving.."+string1);//.getSnacksName());
		System.out.println("serving.."+string2);//.getTeaName());
	}
}
/*
   index.html
   	  Samosa
   	  Tea
   	  
   	  class Controller
   	  {
   	  	void takeOrder(String s1, String s2) {
   	  		FoodService fs = new FoodService();
   	  		fs.serveTheFood(s1,s2);
   	  	}
   	  }

*/