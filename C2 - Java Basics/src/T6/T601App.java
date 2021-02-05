/**
 * 
 */
package T6;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 5 feb. 2021
 *
 */
public class T601App {

	/**
	 * @param args
	 */
	static double PI=3.141592653589793238462;
	public static void main(String[] args) {
		String eleccion=JOptionPane.showInputDialog("Introduce que operacion quieres hacer:"
													+ "\nArea de un triangulo = 1"
													+ "\nArea de un circulo = 2"
													+ "\nArea de un cuadrado = 3");
		switch (eleccion) {
		case "1":
			triangulo();
			break;
		case "2":
			circulo();
			break;
		case "3":
			cuadrado();
			break;

		default: JOptionPane.showMessageDialog(null, "Lo que has introducido no es ninguna de las 3 operaciones. Introduce el numero que corresponda a la operacion que quieras hacer.");
			break;
		}

	}
	public static void triangulo() {
		double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo"));
		double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
		JOptionPane.showMessageDialog(null, "El area del triangulo es "+((base*altura)/2));
	}
	
	public static void circulo() {
		double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo"));
		JOptionPane.showMessageDialog(null, "El area del triangulo es "+((radio*radio)*PI));
	}
	
	public static void cuadrado() {
		double lado=Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
		JOptionPane.showMessageDialog(null, "El area del triangulo es "+(lado*lado));
		
		
	}

}
