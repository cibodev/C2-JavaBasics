/**
 * 
 */
package T6;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 8 feb. 2021
 *
 */
public class T605App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		String bn="";
		while(n!=0) {
			/*si el numero introducido no es cero seguira el bucle*/
			if (n%2==1) {
				/*calcula la diferencia de n/2 y si es 1 añade el 1 al principio de la cadena y sino le añade el 0*/
				bn="1"+bn;
			} else {
				bn="0"+bn;
			}
			n=n/2;
			/*dividiremos el numero entre 2 para poder seguir con el bucle*/
		}
		if (bn=="") {
			//ahora para acabar miraremos si bn ha recibido algun cambio, si no lo ha recibido sera 0
			JOptionPane.showMessageDialog(null, "El numero en binario es 0");
		} else {
			JOptionPane.showMessageDialog(null, "El numero en binario es "+bn);
		}
	}

}
