package yathzee;

public class yathzee {
	
	public static void main(String[] args) {
		yathzee(lancerDes(5));
	}
	
	private static int[] lancerDes(int nbDes) {
		int des[] = new int[5];
		for (int i=0; i < des.length; i++) {
			des[i]=randomDe();
		}
		return des;
	}
	
	private static int randomDe() {
	    int valMax = 6;
	    int valMin = 1;
	    int random = (int) (Math.random() * (valMax + 1 - valMin) + valMin);
	    return random;
	}

	public static int yathzee(int[] des) {
		int nbPoints = 0;
		int nbDes[] = {0,0,0,0,0};
		
		for (int i=0; i<des.length; i++) {
			nbDes[des[i] - 1]++;
			nbPoints += des[i];
		}
		return nbPoints;
	}

}
