/**
 * 
 */
package T6;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 8 feb. 2021
 *
 */
public class T609App {

	/**
	 * @param args
	 */
	/*creo que en este tengo que hacer leyenda de las variables porque me he pasao un poco con las abreviaciones
	 * arylgth= array lenght
	 * aryrn= array random number
	 * strarn string array random number
	 * c = contador*/
	public static void main(String[] args) {
		int arylgth = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tamaño del array"));
		int[] aryrn = new int [arylgth];
		String strarn=stringAryrn(aryrn);
		aryrnMostrar(aryrn, strarn);		
	}
	
	public static String stringAryrn(int[] aryrn) {
		Random rand = new Random();
		String strarn="";
		for (int i = 0; i < aryrn.length; i++) {
			aryrn[i]=rand.nextInt(9);
			strarn=strarn+(i)+" : "+aryrn[i]+"\n";
		}
		/*En este for lo que he hecho es introducir numeros aleatorios del 0 al 9 en el array y crear un string con los 
		 * valores y la posicion de los mismos del array*/
		return strarn;
	}
	
	public static void aryrnMostrar(int[] aryrn, String strarn){
		int c=0;
		for (int i = 0; i < aryrn.length; i++) {
			c=aryrn[i]+c;
		}
		JOptionPane.showMessageDialog(null, strarn+"\n Total: "+c);
		/*Gracias a hacer el string ahora queda un mensaje bien corto y bonito que ademas gracias a el \n que he añadido
		 * al final de cada instancia quedara bien ordenadito*/
	}

}
