package first;

import objects.employe;

public class second {
	
	public static void main(String[] args) {
		System.out.println((compareEmployee(new employe(1), new employe(2))));
	}
	
	public static int compareEmployee(employe e1, employe e2) {
		if (e1.getAmount() == e2.getAmount()) {
			return 0;
		} else if (e1.getAmount() > e2.getAmount()) {
			return 1;
		} else { 
			return -1;
		}
	}

}
