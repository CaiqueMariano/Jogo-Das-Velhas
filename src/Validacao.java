
public class Validacao extends Variaveis{

	public int ValidarX () {	
		//Diagonais
		
	
		if(t[0][0] == "X" && t[1][1] == "X" && t[2][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return 1;
		}else if(t[0][2] == "X" && t[1][1] == "X" && t[2][0] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return 1;		
		}//Linhas
		else if(t[0][0] == "X" && t[0][1] == "X" && t[0][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return 1;
			
		}else if(t[1][0] == "X" && t[1][1] == "X" && t[1][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return 1;
		}
		else if(t[2][0] == "X" && t[2][1] == "X" && t[2][2] == "X"){
			System.out.println("Prabéns vc ganhou X!");
			return 1;
		}
		
		
		//Vertical
		
		else if(t[0][0] == "X" && t[1][0] == "X" && t[2][0] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return 1;
		}
		else if(t[0][1] == "X" && t[1][1] == "X" && t[2][1] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return 1;
		}
		else if(t[0][2] == "X" && t[1][2] == "X" && t[2][2] == "X") {
			System.out.println("Prabéns vc ganhou X!");
			return 1;
		}
		else if(numRodadas == 10) {
			System.out.println("Kate Bush!");
			return 2;
		}
		

		return 0;
	}
	
	public int ValidarO () {
		//Diagonais
		
		
		if(t[0][0] == "O" && t[1][1] == "O" && t[2][2] == "O") {
					
					System.out.println("Prabéns vc ganhou O!");
					return 1;
					
				}else if(t[0][2] == "O" && t[1][1] == "O" && t[2][0] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return 1;
					
				}//Linhas
				
				else if(t[0][0] == "O" && t[0][1] == "O" && t[0][2] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return 1;
					
				}else if(t[1][0] == "O" && t[1][1] == "O" && t[1][2] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return 1;
				}
				else if(t[2][0] == "O" && t[2][1] == "O" && t[2][2] == "O"){
					System.out.println("Prabéns vc ganhou O!");
					return 1;
				}
				
				//Vertical
				
				else if(t[0][0] == "O" && t[1][0] == "O" && t[2][0] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return 1;
				}
				else if(t[0][1] == "O" && t[1][1] == "O" && t[2][1] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return 1;
				}
				else if(t[0][2] == "O" && t[1][2] == "O" && t[2][2] == "O") {
					System.out.println("Prabéns vc ganhou O!");
					return 1;
				}
				else if(numRodadas == 10) {
					System.out.println("Kate Bush!");
					return 2;
				}
		return 0;
	}
}
