package T5;
/**
 * 
 */

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T56App {

	/**
	 * @param args
	 */
	static double IVA=1.21;//creo la variable global IVA que sera 1.21 ya que al multiplicarla por el precio del producto me dara el precio del producto mas iva
	public static void main(String[] args) {
		//Hacemos el parse double para tener el tipo de datoq ue queremos
		double n= Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de el producto"));
		JOptionPane.showMessageDialog(null, "El precio del producto mas IVA es "+(IVA*n));
	}

}
