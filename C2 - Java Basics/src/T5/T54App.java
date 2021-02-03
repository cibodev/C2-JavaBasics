/**
 * 
 */
package T5;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T54App {

	/**
	 * @param args
	 */
	static double PI =3.141592653589793238462;
	public static void main(String[] args) {
		double r = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio en mm"));
		JOptionPane.showMessageDialog(null, "El area del circulo cuyo radio es "+r+" milimetros es: "+(PI*(r*r))+"milimetros cuadrados");

	}

}
