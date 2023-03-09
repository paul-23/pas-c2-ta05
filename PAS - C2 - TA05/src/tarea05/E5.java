package tarea05;

import javax.swing.JOptionPane;

public class E5 {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Introduce un numero:");

		int numInt = Integer.parseInt(num);

		if (numInt % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero " + numInt +" es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, "El numero " + numInt +" no es divisible entre 2");
		}
	}

}
