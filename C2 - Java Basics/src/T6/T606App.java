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
public class T606App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ints=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		//Me podria saltar perfectamente este parse int pero creo que es necesario para comprobar que lo que se escribe es un entero
		String s= Integer.toString(ints);
		String[] arys=s.split("");
		JOptionPane.showMessageDialog(null, "El numero "+ints+" tiene "+arys.length+" cifras");

	}

}
