package tarea05;

import javax.swing.JOptionPane;

public class EJ11 {

	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("Introduce un día de la semana:");

		switch (dia) {
			case "Lunes":
				JOptionPane.showMessageDialog(null, dia + " es un día laboral");
				break;
			case "Martes":
				JOptionPane.showMessageDialog(null, dia + " es un día laboral");
				break;
			case "Miércoles":
			case "Miercoles":
				JOptionPane.showMessageDialog(null, dia + " es un día laboral");
				break;
			case "Jueves":
				JOptionPane.showMessageDialog(null, dia + " es un día laboral");
				break;
			case "Viernes":
				JOptionPane.showMessageDialog(null, dia + " es un día laboral");
				break;
			case "Sábado":
			case "Sabado":
				JOptionPane.showMessageDialog(null, dia + " no es un día laboral");
				break;
			case "Domingo":
				JOptionPane.showMessageDialog(null, dia + " no es un día laboral");
				break;
			default:
				JOptionPane.showMessageDialog(null, "No has introducido un día correcto");
		}
	}

}
