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
public class T608App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] aryn=arrayNumberRellenar();
		arrayNumberMostrar(aryn);
		
	}
	public static int[] arrayNumberRellenar() {
		/*
		 * Lo que yo queria hacer era poder introducir todos los numeros en un solo input pero por alguna razon me 
		 * da error la parte marcada con exclamaciones. Podria haberlo hecho sin el do while de comprobacion pero
		 * seria bastante poco pulido dejar al usuario introducir menos de 10 numeros asi que decidi ir por el 
		 * metodo facil y obvio pero pesado
		String[] aryn;
		do {
			String strn=JOptionPane.showInputDialog("Introduzca 10 numeros separados por espacios");
			aryn[]=strn.split(" ");!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}while(aryn.lenght!=10);*/
		int[] aryn=new int[10];
		for (int i = 0; i < aryn.length; i++) {
			aryn[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		}
		return aryn;
		/*no hay nada extraño aqui, solo un for rellenado por inputs de mensajes*/
	}
	public static void arrayNumberMostrar(int[] aryn){
		String strn="";
		for (int i = 0; i < aryn.length; i++) {
			strn=strn+aryn[i]+" ";
		}
		JOptionPane.showMessageDialog(null, "Los numeros introducidos son los siguientes: \n"+strn);
		/*aqui el invento si me ha funcionado y he podido mostrar todos los numeros en un mensaje transformando
		 * el array en un string que de hecho si no lo hubiese pedido el ejercicio hubiese creado un string para
		 * empezar algo estilo
		 String strn="";
		 int n=0;
		 for (int i = 0; i < 10; i++) {
			n=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			strn=strn+n;
		}
		 *asi me hubiese ahorrado hacer el array q creo que come mas ram que un string  */
	}

}
