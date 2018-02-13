package calculator;

import calculator.Controller;
import calculator.Model;
import calculator.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
  Model model= new Model() ;
  View view =new View(model);
  new Controller(view,model);
  
	
	}

}
