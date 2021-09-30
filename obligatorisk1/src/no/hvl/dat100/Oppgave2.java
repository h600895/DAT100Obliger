package no.hvl.dat100;

public class Oppgave2 {
	public static void main(String[] args) {
		String karakter;
		
		for (int i=0; i<10; i++) {
			
			String tallStr = javax.swing.JOptionPane.showInputDialog("Skriv inn et tall: ");
			int  tall = Integer.parseInt(tallStr);
			
			while (tall < 0 || tall > 100) {
				System.out.println("Ugyldig poengsum, prøv igjen.");
				tallStr = javax.swing.JOptionPane.showInputDialog("Skriv inn et tall: ");
				tall = Integer.parseInt(tallStr);			
			}
			if (tall <= 39) {
				karakter = "F";
			}else if (tall <= 49) {
				karakter = "E";
			}else if (tall <= 59) {
				karakter = "D";
			}else if (tall <= 79) {
				karakter = "C";
			}else if (tall <= 89) {
				karakter = "B";
			}else {
				karakter = "A";
			}
			System.out.println(karakter);
		}
	}

}
