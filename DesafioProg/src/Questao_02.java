import javax.swing.JOptionPane;

public class Questao_02 {
	
	
	public static void main(String[] args) {
		
		String senha;
		int a=0;
				
		while(a==0) {
				
			senha = JOptionPane.showInputDialog(
					
					"Por favor digite uma senha que atenda as caracteristcas abaixo:\n\n"+
					"- Possui no mínimo 6 caracteres. \n" + 
					"- Contém no mínimo 1 digito.\n" + 
					"- Contém no mínimo 1 letra em minúsculo.\n" + 
					"- Contém no mínimo 1 letra em maiúsculo.\n" + 
					"- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ \n ");
			
			if(senha.length()<6) {
				
				JOptionPane.showMessageDialog(null, "Voce digitou uma senha com " + senha.length() + " digito(s) o minimo são 6, ainda faltam "+ (6-senha.length()));
					
			}else if(senha.matches(".*[a-z].*") == false){
			
				JOptionPane.showMessageDialog(null, "Por favor, digite uma senha com no minimo uma letra minúscula!");
			
			}else if(senha.matches(".*[A-Z].*") == false){
				
				JOptionPane.showMessageDialog(null, "Por favor, digite uma senha com no minimo uma letra maiúscula!");
				
			}else if(senha.matches(".*[!@#$%^&*()-+].*") == false){
				
				JOptionPane.showMessageDialog(null, "Por favor, digite uma senha que contenha um dos caracters especiais a segir:  !@#$%^&*()-+");
						
			}else{
				
				a++;
				JOptionPane.showMessageDialog(null,"Parabens, sua senha foi cadastrada com sucesso e tem " + senha.length() + " caracters." );
						
			}
			
		}
		
	}
	
}


