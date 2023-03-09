package tarea05;

import javax.swing.JOptionPane;

public class EJ12 {

	public static void main(String[] args) {

		String contraseña = "Contra1234";
		String contraseñaTeclado = JOptionPane.showInputDialog("Introduce la contraseña:");
		int intentos = 3;
		
		for (int intento = 1; intento <= 3; intento++) {
			intentos--;
			if(contraseña.equals(contraseñaTeclado)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				intento = 3;
			} else if ((!contraseña.equals(contraseñaTeclado)) && (intento < 3)) {
				JOptionPane.showMessageDialog(null, "Intentos resptantes: " + intentos);
				contraseñaTeclado = JOptionPane.showInputDialog("Introduce la contraseña:");
			} else if ((!contraseña.equals(contraseñaTeclado)) && (intento == 3)) {
				JOptionPane.showMessageDialog(null, "Has superado el límite de intentos");
				intento = 3;
			}
			
		}
		
	}

}
