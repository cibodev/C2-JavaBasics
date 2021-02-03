/**
 * 
 */
package T5;

import java.util.Iterator;

/**
 * @author Christian Rivas Pottier 
 * 
 * 3 feb. 2021
 *
 */
public class T58App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {//gracias a esa variable temporal que te permite tener for puedo ahorrarme un par de lineas
			//no puedo hacer lo de subir el valor antes del print asi que tengo que subir en 1 todos los numeros de i
			if (i%10!=0) {//me he montado aqui una serie simple de ifelses para que se vea algo ordenado todo esto
				if (i<10) {
					System.out.print("0"+i+" ");
				} else {
					System.out.print(i+" ");
				}
			} else {
				System.out.println(i+" ");
			}
			
		}

	}

}
