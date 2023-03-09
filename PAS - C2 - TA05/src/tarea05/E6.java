package tarea05;

import javax.swing.JOptionPane;

public class E6 {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Introduce el precio del producto:");

		double precioProducto = Double.parseDouble(num);

		final double IVA = 0.21;

		double precioIVA = (precioProducto * IVA) + precioProducto;

		JOptionPane.showMessageDialog(null, "El precio del producto, inluido el IVA es: " + precioIVA + "€.");

	}

}
