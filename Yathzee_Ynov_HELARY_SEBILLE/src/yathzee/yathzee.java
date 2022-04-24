package yathzee;

public class yathzee {

	public static void main(String[] args) {
		combinaisonsYathzee(lancerDes(5));
	}

	private static int[] lancerDes(int nbDes) {
		int des[] = new int[5];
		for (int i = 0; i < des.length; i++) {
			des[i] = randomDe();
		}
		return des;
	}

	private static int randomDe() {
		int valMax = 6;
		int valMin = 1;
		int random = (int) (Math.random() * (valMax + 1 - valMin) + valMin);
		return random;
	}

	public static int combinaisonsYathzee(int[] des) {
		int nbPoints = 0;
		int nbDes[] = { 0, 0, 0, 0, 0, 0 };

		boolean paire = false;
		boolean brelan = false;

		// calcul du jeu de dés
		for (int i = 0; i < des.length; i++) {
			nbDes[des[i] - 1]++;
			nbPoints += des[i];
		}

		for (var i = 0; i < nbDes.length; i++) {
			if (nbDes[i] == 3) {
				brelan = true;
			}
			if (nbDes[i] == 2) {
				paire = true;
			}
			if (nbDes[i] == 5) {
				return 50; // Yathzee
			}
		}
		if (brelan && paire) {
			return 25; // Full House
		}

		if ((nbDes[0] == 1 && nbDes[1] == 1 && nbDes[2] == 1 && nbDes[3] == 1 && nbDes[4] == 1)
				|| (nbDes[1] == 1 && nbDes[2] == 1 && nbDes[3] == 1 && nbDes[4] == 1 && nbDes[5] == 1)) {
			return 40; // Grande suite
		}

		if ((nbDes[0] >= 1 && nbDes[1] >= 1 && nbDes[2] >= 1 && nbDes[3] >= 1)
				|| (nbDes[1] >= 1 && nbDes[2] >= 1 && nbDes[3] >= 1 && nbDes[4] >= 1)
				|| (nbDes[2] >= 1 && nbDes[3] >= 1 && nbDes[4] >= 1 && nbDes[5] >= 1)) {
			return 30; // Petite suite
		}

		return nbPoints; // Brelan et Carré
	}

	public static int sommeXYathzee(int[] des, int x) {
		int nbPoints = 0;

		for (int i = 0; i < des.length; i++) {
			if (des[i] == x) {
				nbPoints += des[i];
			}
		}
		return nbPoints;
	}

}
