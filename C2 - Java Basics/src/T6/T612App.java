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
public class T612App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arylgth=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		int[] ary= new int[arylgth];
		arrayRellenarRand(ary);
		int[][] arylast=arrayAcabado(ary);
		arrayMostrar(arylast);
	}

//METODOS PRINCIPALES----------------------------------------------------------------------------------------------------	
	
	public static int[] arrayRellenarRand(int[] ary){
		Random rand = new Random();
		
		for (int i = 0; i < ary.length; i++) {
			ary[i]=rand.nextInt(300);
		}
		
		return ary;
	}
	
	
	public static int[][] arrayAcabado(int[] ary) {
		int[][] arylast=new int[2][ary.length];
		int ldig=0;
		
		do {
			ldig=Integer.parseInt(JOptionPane.showInputDialog("Indica el ultimo digito de los numeros que quieres que se muestren"));
		} while(ldig>9);
		
		int c=0;
		for (int i = 0; i < ary.length; i++) {
			if(ary[i]%10==ldig) {
				arylast[0][i]=i;
				arylast[1][i]=ary[i];
				c++;
			}
		}
		
		return arylast;
	}
	/*ya que aun no habia usado los arrays bidimensionales he querido rizar el rizo y hacer uno para guardar la posicion
	 * de cada uno de los numeros. Basicamente cuando la primera posicion es 0 se refiere a la posicion del array original
	 * y si es 1 se refiere al valor de esa posicion*/
	
	
	public static void arrayMostrar(int[][] ary) {
		String strary="";
		
		for (int i = 0; i < ary[1].length; i++) {
			if(ary[1][i]!=0) {
				strary=strary+ary[0][i]+" : "+ary[1][i]+"\n";
				
			}
		}

		JOptionPane.showMessageDialog(null, "Array:\n"+strary);
	}
	/*al imprimirlo lo unico que tengo que tengo que cambiar es variar entre 0 y 1 dependiendo de que quiero imprimir*/

}
