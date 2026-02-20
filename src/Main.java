import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Validacao v = new Validacao();
		Inserir inserir = new Inserir();
		Tabuleiro t = new Tabuleiro();
		int i, r;
		
		for(i = 1; i < 10; i++) {
			//De quem é a vez
			r = i % 2;
			
			//Ver se alguém ganhou
			if(v.ValidarX() == true) {
				break;
			}
			else if(v.ValidarO() == true) {
				break;
			}
				
			//Inserir resposta
			if(r != 0) {
				System.out.println("SUA VEZ X");
				inserir.Player1(in.nextInt(), in.nextInt());
			}else {
				System.out.println("SUA VEZ O");
				inserir.Player2(in.nextInt(), in.nextInt());
			}
			
			//Mostrar o jogo
			t.tabuleiro();
			
		}
		
		in.close();
	}

}
