
public class Tabuleiro extends Variaveis{
	
	public void tabuleiro() {
		for (i = 0; i< 3; i++) {
			for(j = 0; j<3; j++) {
				
				if(t[i][j] == null) {
					t[i][j] = "-";
				}
				System.out.print(" "+t[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
