package calculator ;

import calculator.Model;
import calculator.View;
import java.awt.event.*;


public class Controller implements ActionListener {
	
	Model model;
	View view;
	
	
	public Controller(View v , Model m) {
		
		model = m;
		view = v;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == View.add) {
			
			View.label1.setText("+"); 
			View.result.setText(model.add(View.firstN.getText() , View.secondN.getText()));
		}
		
		else if(e.getSource() == View.sub) {
			
			View.label1.setText("-"); 
			View.result.setText(model.sub(View.firstN.getText() , View.secondN.getText()));
		}
		
        else if(e.getSource() == View.mul) {
			
			View.label1.setText("*"); 
			View.result.setText(model.mul(View.firstN.getText() , View.secondN.getText()));
		}
		
        else if(e.getSource() == View.div) {
			
			View.label1.setText("/"); 
			View.result.setText(model.div(View.firstN.getText() , View.secondN.getText()));
		}
		
        else if(e.getSource() == View.mod) {
			
			View.label1.setText("%"); 
			View.result.setText(model.mod(View.firstN.getText() , View.secondN.getText()));
		}
		
        else if(e.getSource() == View.sqr) {
			
			View.label1.setText("√"); 
			View.secondN.setVisible(false);
			View.result.setText(model.sqrt(View.firstN.getText()));
		}
		
        else if(e.getSource() == View.delete) {
			
        	View.secondN.setVisible(true);;
			View.label1.setText(""); 
			View.firstN.setText("");
			View.secondN.setText("");
			View.result.setText("");
		}
		
	}
}