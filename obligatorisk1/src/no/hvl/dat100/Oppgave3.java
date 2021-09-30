package no.hvl.dat100;

public class Oppgave3 {

	public static void main(String[] args) {
		
		String tallStr = javax.swing.JOptionPane.showInputDialog("Skriv inn et tall:  ");
		int tall = Integer.parseInt(tallStr);
		int sum = 1;
		
		for (int i = 1; i <= tall; i++) {
			 sum *= i;
		}
		System.out.println(tall + "! = " + sum);
		
	}

}
