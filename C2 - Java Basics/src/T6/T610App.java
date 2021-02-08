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
public class T610App {

	/**
	 * @param args
	 */
	/*en este ejercicio he empezado a separar los metodos entre principales y secundarios para hacerme capas de 
	 * abstraccion extras porque me estaba friendo la cabeza sino.
	 * Otro apunte importante es que porque lo he hecho igual de eficiente que una tostadora tarda bastante en
	 * acabar de calcular los numeros incluso en un rango del 1-10 en un array de 1. Calcular un array de 100 le
	 * costo unos 7 minutos facil con 16 de ram que tengo*/
	public static void main(String[] args) {
		int arylgth=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		int[] aryrp= new int[arylgth];
		//creo el array en el main porque quiero que los metodos sean completamente independientes del programa en si
		aryrp= aryRellenarRandPrimos(aryrp);
		mostrarArray(aryrp);
	}
	
//metodos primarios------------------------------------------------------------------------------------------------------
	
	public static int[] aryRellenarRandPrimos(int[] ary){
		Random rand = new Random();
		
		String rprange=JOptionPane.showInputDialog("Introduce el rango de los numeros aleatorios separados por un guion");
		String[] rprangeary=rprange.split("-");
		int rpmin=Integer.parseInt(rprangeary[0]);
		int rpmax=Integer.parseInt(rprangeary[1]);
		/*lo que he hecho en este tocho de codigo es pedir el rango en un solo mensaje y separarlo para guardarlo en 
		 * diferentes variables*/
		
		int i=0;
		while(i<ary.length) {
			int rp=rand.nextInt(rpmax-rpmin)+rpmin;
			boolean p=bolPrimo(rp);
			if(p) {
				ary[i]=rp;
				i++;
			}
		}
	
		return ary;
	}
	/*aqui lo que he hecho es crear un numero aleatorio que sera introducido en el array solo si es un primo
	 * cosa que compruebo con otro metodo secundario que se dedica solo a eso. El bucle solo avanzara si el array
	 * ha sido rellenado con un numero primo*/
	
	
	public static void mostrarArray(int[] ary) {
		String strary="";
		for (int i = 0; i < ary.length; i++) {
			strary=strary+i+" : "+ary[i]+"\n";
		}
		int amax=arrayMayor(ary);
		JOptionPane.showMessageDialog(null, "Array:\n"+strary+"El mayor es "+amax);
	}
	/*este metodo solo se usa para mostrar por una ventana el array ademas de comprovar cual es el numero mas
	 * grande del array cosa que se comprueba en un metodo secundario*/
	
//metodos secundarios-----------------------------------------------------------------------------------------------
	
	public static boolean bolPrimo(int n) {
		boolean p=true;
		int c=2;
		while(p && c!=n) {
			if(n%c==0) {
				p=false;
			}
			c++;
		}
		return p;
		
	}
	/*este metetodo comprueba si el numero es un numero primo o no. Lo primero es crear el booleano que se devolvera
	 * como false. Luego en un bucle se comprovara de uno en uno todos los numeros para ver si se puede dividir con alguno
	 * que no sea el mismo. El contador empieza en 2 porque si empezase por 0 o 1 se acabaria el bucle en el primer tick */
	
	
	public static int arrayMayor(int[] ary) {
		int amax=0;
		for (int i = 0; i < ary.length; i++) {
			if(amax<ary[i]) {
				amax=ary[i];
			}
		}
		return amax;
	}
	/*Este metodo comprueba cual es el numero mas alto de un array numerico. Basicamente compara un numero con cada uno
	 * de los numeros del array y si algun numero del array es mas grande que el se vuelve igual a el numero del array
	 * y sigue lo que hace que solo quede el mas alto*/

}
