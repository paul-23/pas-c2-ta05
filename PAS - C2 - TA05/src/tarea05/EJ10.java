package tarea05;

import javax.swing.JOptionPane;

public class EJ10 {

	public static void main(String[] args) {

		String ventasTeclado = JOptionPane.showInputDialog("Introduce el número de ventas:"), ventasTeclado2 = "";

		double numVentas = Double.parseDouble(ventasTeclado), sumaTotal = 0;

		for (int i = 1; i <= numVentas; i++) {
			ventasTeclado2 = JOptionPane.showInputDialog("Introduce el valor de la venta " + (i));
			int suma = Integer.parseInt(ventasTeclado2);
			sumaTotal = sumaTotal + suma;
		}

		JOptionPane.showMessageDialog(null, "La suma de todas las ventas es: " + sumaTotal);
	}

}
