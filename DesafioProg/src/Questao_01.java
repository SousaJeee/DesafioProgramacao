
import javax.swing.JOptionPane;

public class Questao_01 {

	public static void main(String[] args) {
		
		
		int valor;
			
		valor = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
		
		for (int i = valor; i > 0 ; i--){ 
			
			for (int j = 1; j < i; j++){
				   
				System.out.print(" "); 
			}
			
			for (int j = i; j < valor+1; j++){
				   
				System.out.print("*");
			}
			   
			System.out.println("");
			  
		}
		
	}

}
