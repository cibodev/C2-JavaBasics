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
public class T607App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Introduzca una cantidad en euros"));
		//he hecho una variable seleccionadora para el switch para hacerlo mas modular. Tambien he añadido bitcoin para
		//tener algo mas de variedad
		String s=JOptionPane.showInputDialog("Introduzca a que moneda desea convertir la cantidad introducida:"
				+ "\nLibras"
				+ "\nDolares"
				+ "\nYenes"
				+ "\nBitcoin");
		s.toLowerCase();
		switch (s) {
		case "libras":
			convertirLibras(n);
			break;
		case "dolares":
			convertirDolares(n);
			break;
		case "yenes":
			convertirYenes(n);
			break;
		case "bitcoin":
			convertirBitcoin(n);
			break;
		default:
			break;
		}

	}
	//Todas las conversiones estan actualizadas de hoy mismo segun google. Si pudiera llamaria a un api que controlara esto pero nose aun
	public static void convertirLibras(int n) {
		JOptionPane.showMessageDialog(null, n+"€ es igual a "+(n*0.88)+"£");
	}
	public static void convertirDolares(int n) {
		JOptionPane.showMessageDialog(null, n+"€ es igual a "+(n*1.2)+"$");
	}
	public static void convertirYenes(int n) {
		JOptionPane.showMessageDialog(null, n+"€ es igual a "+(n*127.05)+"¥");
	}
	public static void convertirBitcoin(int n) {
		JOptionPane.showMessageDialog(null, n+"€ es igual a "+(n*0.000031)+"₿");
	}

}
