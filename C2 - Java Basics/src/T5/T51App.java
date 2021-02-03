/**
 * 
 */
package T5;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas
 *
 */
public class T51App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Introducimos los numeros por una ventana. Normalmente la ventana nos devolveria un string pero con un parseint podemos transformar ese string en un int
		int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));;
		//primer if para ver si los numeros son distintos, si no lo son sabremos que son iguales
		if (n1!=n2) {
			if (n1>n2) {//si son diferentes pasaran a este ifelse que diferenciara cual de los dos es mas grande
				JOptionPane.showMessageDialog(null, n1+" es mas grande que "+n2);
			} else {
				JOptionPane.showMessageDialog(null, n1+" es mas pequeño que "+n2);
			}
		} else {
			JOptionPane.showMessageDialog(null, n1+" y "+n2+" son iguales");
		}
	}

}
