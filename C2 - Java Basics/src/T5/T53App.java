/**
 * 
 */
package T5;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas
 *
 */
public class T53App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido "+name);
	}

}