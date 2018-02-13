package calculator;

public class Model extends java.util.Observable {
	
	public Model() {
		
	}
	
	public String add(String x , String y) {
		try{
			Double x1 = Double.parseDouble(x);
			Double y1= Double.parseDouble(y);
			Double res=x1 + y1;
			return (""+res);
		} catch (NumberFormatException e){
			return "Error: String";
		}
	 
	}
	
	public String sub(String x , String y) {
		try{
			Double x1 = Double.parseDouble(x);
			Double y1= Double.parseDouble(y);
			Double res=x1 - y1;
			return (""+res);
		} catch (NumberFormatException e){
			return "Error: String";
		}
		
		 
	}
	
	public String div(String x , String y) {
		try{
			Double x1 = Double.parseDouble(x);
			Double y1= Double.parseDouble(y);
			if (y1 == 0.0)
				return "Cannot divide by 0";
			Double res= x1 / y1;
			res = Math.floor(res * 1e9) / 1e9;
			return (""+res);
		} catch (NumberFormatException e){
			return "Error: String";
		}
	}
	
	public String mul(String x , String y) {
		try{
			Double x1 = Double.parseDouble(x);
			Double y1= Double.parseDouble(y);
			Double res=x1 * y1;
			res = Math.floor(res * 1e9) / 1e9;			
			return (""+res);
		} catch (NumberFormatException e){
			return "Error: String";
		}
	}
	
	public String mod(String x , String y) {
		try{
			Double x1 = Double.parseDouble(x);
			Double y1= Double.parseDouble(y);
			if(y1==0)
				return "No Mod by 0";
			Double res=x1 % y1;
			res = Math.floor(res * 1e9) / 1e9;			
			return (""+res);
		} catch (NumberFormatException e){
			return "Error: String";
		}
	}
	
	public String sqrt(String x) {
		try{
			Double x1 = Double.parseDouble(x);	
			Double result;
			if (x1>=0){
				result = Math.floor(Math.sqrt(x1) * 1e9) / 1e9;
				return ""+result;
			} else {
				return "No Negative sqrt";
			}			
		} catch (NumberFormatException e){
			return "Error: String";
		}
	}
	

}
