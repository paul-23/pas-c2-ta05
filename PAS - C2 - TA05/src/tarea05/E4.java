package tarea05;

import javax.swing.JOptionPane;

public class E4 {

	public static void main(String[] args) {

		String rInput = JOptionPane.showInputDialog("Introduce el valor del radio (cm)");

		double r = Double.parseDouble(rInput), a = Math.PI * Math.pow(r, 2);
		
		JOptionPane.showMessageDialog(null, "El área del circulo es:  " + a + " cm2");

	}

}
