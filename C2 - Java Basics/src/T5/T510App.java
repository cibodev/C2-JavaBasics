/**
 * 
 */
package T5;

import java.util.Iterator;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T510App {

	/**
	 * @param args
	 */
	/*Antes de nada perdon por la nomenclatura tan mala esto va a estar muy 
	 * desordenado en el github, simplemente no habia pensado que pasaria 
	 * al llegar a 10*/
	public static void main(String[] args) {
		//creamos la variable nv o numero de ventas y le pedimos al usuario que le de el valor
		int nv= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ventas"));
		int v=0;
		//creamos un bucle con for acabe cuando i sea igual a nv o numero de ventas
		for (int i = 0; i < nv; i++) {
			//le damos valor a v que hemos iniciado antes y este valor es el que le da el usuario
			v = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de la venta"))+v;
		}
		JOptionPane.showMessageDialog(null, "El total del valor de las ventas asciende a "+v);
	}

}
