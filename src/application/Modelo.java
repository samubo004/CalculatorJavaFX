package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Modelo implements Initializable {
	
	@FXML
    private TextArea operaciones;  //cuadro donde mostrare las operaciones 
	
	@FXML private Button boton0;
	
	

	public void clickNumero0(ActionEvent event) {
		operaciones.appendText("0");
	}
	
	public void clickNumero1(ActionEvent event) {
		operaciones.appendText("1");
	}
	
	public void clickNumero2(ActionEvent event) {
		operaciones.appendText("2");
	}
	
	public void clickNumero3(ActionEvent event) {
		operaciones.appendText("3");
	}
	
	public void clickNumero4(ActionEvent event) {
		operaciones.appendText("4");
	}
	
	public void clickNumero5(ActionEvent event) {
		operaciones.appendText("5");
	}
	
	public void clickNumero6(ActionEvent event) {
		operaciones.appendText("6");
	}
	
	public void clickNumero7(ActionEvent event) {
		operaciones.appendText("7");
	}
	
	public void clickNumero8(ActionEvent event) {
		operaciones.appendText("8");
	}
	
	public void clickNumero9(ActionEvent event) {
		operaciones.appendText("9");
	}
	
	
	public void clickDividir(ActionEvent event) {
		operaciones.appendText("/");
	    }

	    
	public void clickEnter(ActionEvent event) {
		try {
			
		
		String operacion = operaciones.getText();
		char operador;
		int cortar = 0;
		int numero1, numero2;
		
		for(int i=0;i<=operacion.length();i++) {
			
			operador=operacion.charAt(i);
			
			if(operador=='+' || operador=='-' || operador=='*' || operador=='/' ) {
				
				
				
				numero1=Integer.parseInt(operacion.substring(0, cortar));
				numero2=Integer.parseInt(operacion.substring(cortar+1, operacion.length()));
				
				
				if(operador=='+') {
					
					Operaciones suma = new Operaciones(numero1, numero2);
					operaciones.setText(String.valueOf(suma.sumar()));
					break;
				}
				
				if(operador=='-') {
					
					Operaciones menos = new Operaciones(numero1, numero2);
					operaciones.setText(String.valueOf(menos.restar()));
					break;
				}
				
				if(operador=='*') {
					
					Operaciones multiplicar = new Operaciones(numero1, numero2);
					operaciones.setText(String.valueOf(multiplicar.multiplicar()));
					break;
				}
				
				if(operador=='/') {
					
					Operaciones dividir = new Operaciones(numero1, numero2);
					operaciones.setText(String.valueOf(dividir.dividir()));
					break;
				}
				
				
			} else {
				cortar++;
				
				operaciones.setText("Ningun operante encontrado");
				
			}
		
			
		}
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void clickIgual(ActionEvent event) {
		operaciones.appendText("=");
	    }

	   
	public void clickLimpiar(ActionEvent event) {
		
		operaciones.setText("");
		//operaciones.appendText("0");
	    }

	    
	public void clickMultiplicar(ActionEvent event) {
		operaciones.appendText("*");
	    }
	    
	    
	public void clickRestar(ActionEvent event) {
		operaciones.appendText("-");
	    }

	    
	public void clickSumar(ActionEvent event) {
		operaciones.appendText("+");
	    }

	
	// String op="";
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
		
	}

}
