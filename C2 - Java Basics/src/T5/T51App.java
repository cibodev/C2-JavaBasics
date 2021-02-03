/**
 * 
 */
package T5;

import javax.swing.JOptionPane;

/**
 * @author User
 *
 */
public class T51App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));;
		if (n1!=n2) {
			if (n1>n2) {
				JOptionPane.showMessageDialog(null, n1+" es mas grande que "+n2);
			} else {
				JOptionPane.showMessageDialog(null, n1+" es mas pequeño que "+n2);
			}
		} else {
			JOptionPane.showMessageDialog(null, n1+" y "+n2+" son iguales");
		}
	}

}
