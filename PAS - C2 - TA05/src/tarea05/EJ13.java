package tarea05;

import javax.swing.JOptionPane;

public class EJ13 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Introduce el primer valor:");
		String n2 = JOptionPane.showInputDialog("Introduce el primer valor:");

		int num1 = Integer.parseInt(n1), num2 = Integer.parseInt(n2);

		String signo = JOptionPane.showInputDialog("Introduce el primer valor:");
		
		double solucion = 0;

		switch (signo) {
		case "+":
			solucion = num1 + num2;
			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + solucion);
			break;
		case "-":
			solucion = num1 - num2;
			JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + solucion);
			break;
		case "*":
			solucion = num1 * num2;
			JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + solucion);
			break;
		case "/":
			solucion = Double.valueOf(num1) / Double.valueOf(num2);
			JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + solucion);
			break;
		case "^":
			solucion = Math.pow(num1, num2);
			JOptionPane.showMessageDialog(null, num1 + " ^ " + num2 + " = " + solucion);
			break;
		case "%":
			solucion = num1 % num2;
			JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + solucion);
			break;

		default:
			JOptionPane.showMessageDialog(null, "No has introducido un valor correcto");
			break;
		}

	}

}
