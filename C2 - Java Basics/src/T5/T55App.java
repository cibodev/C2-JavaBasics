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
public class T55App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		if (n%2==0) {
			JOptionPane.showMessageDialog(null, n+" es par");
		} else {
			JOptionPane.showMessageDialog(null, n+" es impar");
		}
	}

}
