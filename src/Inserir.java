
public class Inserir extends Variaveis{
	
	public void Player1 (int pL, int pC) {
		
		t[pL][pC] = "O";
		numRodadas += 1;
	}
	
	public void Player2 (int pL, int pC) {
		t[pL][pC] = "X";
		numRodadas += 1;
	}
}
