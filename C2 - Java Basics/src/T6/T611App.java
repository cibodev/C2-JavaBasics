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
public class T611App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arylgth=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		int[] ary1= new int[arylgth];
		int[] ary2= new int[ary1.length];
		//aqui he puesto el .lenght porque dices que el segundo array tiene que apuntar al primero sino hubiese puesto el arylght y tira
		ary1=arrayRellenarRand(ary1);
		ary2=arrayRellenarRand(ary2);
		int[] aryMult=arrayMultiplicarArrays(ary1, ary2);
		arrayMostrar(ary1, ary2, aryMult);
	}
	
//METODOS PRINCIPALES-----------------------------------------------------------------------------------------------------
	public static int[] arrayRellenarRand(int[] ary){
		Random rand = new Random();
		
		for (int i = 0; i < ary.length; i++) {
			ary[i]=rand.nextInt(10);
		}
		
		return ary;
	}
	
	
	public static int[] arrayMultiplicarArrays(int[] ary1, int[] ary2) {
		int[] aryMult= new int[ary1.length];
		for (int i = 0; i < aryMult.length; i++) {
			aryMult[i]=ary1[i]*ary2[i];
		}
		return aryMult;
	}
	/*esta es la unica parte que realmente se diferencia del ejercicio anterior. El array multiplicacion lo creo con
	 * un for que multiplica los dos valores de los arrays de la misma posicion y en esa misma posicion le da el 
	 * valor al array multiplicacion.
	 * Lo importante aqui es mantener la posicion siempre igual, cosa facil si usas un for*/
	
	
	public static void arrayMostrar(int[] ary1, int[] ary2, int[] aryMult) {
		String strarys="";
		for (int i = 0; i < ary1.length; i++) {
			strarys=strarys+"(array1)"+ary1[i]+" * (array2)"+ary2[i]+" = (arrayMultiplicar)"+aryMult[i]+"\n";
		}
		JOptionPane.showMessageDialog(null, "Arrays:\n"+strarys);
		
		
	}

}
