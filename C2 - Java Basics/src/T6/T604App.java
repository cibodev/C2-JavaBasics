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
public class T604App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		factorial(n);
	}
	public static void factorial(int n) {
		long fn=1;
		for (int i = 1; i < n; i++) {
			fn=fn+(fn*i);
		}
		JOptionPane.showMessageDialog(null, "El factorial de "+n+" es "+fn);
	}
}
