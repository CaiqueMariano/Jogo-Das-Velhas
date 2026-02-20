
public class Validacao extends Variaveis{

	public boolean ValidarX () {	
		//Diagonais
		if(t[0][0] == "X" && t[1][1] == "X" && t[2][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return true;
		}else if(t[0][2] == "X" && t[1][1] == "X" && t[2][0] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return true;		
		}//Linhas
		else if(t[0][0] == "X" && t[0][1] == "X" && t[0][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return true;
			
		}else if(t[1][0] == "X" && t[1][1] == "X" && t[1][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return true;
		}
		else if(t[2][0] == "X" && t[2][1] == "X" && t[2][2] == "X"){
			System.out.println("Prabéns vc ganhou X!");
			return true;
		}
		
		//Vertical
		
		else if(t[0][0] == "X" && t[1][0] == "X" && t[2][0] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return true;
		}
		else if(t[0][1] == "X" && t[1][1] == "X" && t[2][1] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return true;
		}
		else if(t[0][2] == "X" && t[1][2] == "X" && t[2][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return true;
		}
		

		return false;
	}
	
	public boolean ValidarO () {
		//Diagonais
				if(t[0][0] == "O" && t[1][1] == "O" && t[2][2] == "O") {
					
					System.out.println("Prabéns vc ganhou O!");
					return true;
					
				}else if(t[0][2] == "O" && t[1][1] == "O" && t[2][0] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return true;
					
				}//Linhas
				
				else if(t[0][0] == "O" && t[0][1] == "O" && t[0][2] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return true;
					
				}else if(t[1][0] == "O" && t[1][1] == "O" && t[1][2] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return true;
				}
				else if(t[2][0] == "O" && t[2][1] == "O" && t[2][2] == "O"){
					System.out.println("Prabéns vc ganhou O!");
					return true;
				}
				
				//Vertical
				
				else if(t[0][0] == "O" && t[1][0] == "O" && t[2][0] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return true;
				}
				else if(t[0][1] == "O" && t[1][1] == "O" && t[2][1] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return true;
				}
				else if(t[0][2] == "O" && t[1][2] == "O" && t[2][2] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return true;
				}
		return false;
	}
}
