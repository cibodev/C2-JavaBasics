/**
 * 
 */
package T7;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier 
 * 
 * 8 feb. 2021
 *
 */
public class T701App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String,String> ntsx=new Hashtable<String,String>();
		boolean bol=true;
		while(bol) {
			String name= JOptionPane.showInputDialog("Introduzca el nombre completo del alumno");
			String ntsmed=notasMedia();
			ntsx.put(name, ntsmed);
			int s=Integer.parseInt(JOptionPane.showInputDialog("Quiere seguir \n(si=1/no=2)"));
			if(s==2) {
				bol=false; 
			}
		}
		mostrarNotasX(ntsx);
		
	}
	
	
//METODOS PRINCIPALES----------------------------------------------------------------------------------------------------
	
	public static String notasMedia() {
		String strn=JOptionPane.showInputDialog("Introduzca las notas del alumno separadas por espacios");
		String[] straryn=strn.split(" ");
		int ntst=0;
		for (int i = 0; i < straryn.length; i++) {
			ntst=ntst+(Integer.parseInt(straryn[i]));
		}
		String ntsx=Integer.toString(ntst/straryn.length);
		return ntsx;
	}
	
	
	public static void mostrarNotasX(Hashtable<String,String> ntsx) {
		Enumeration<String> enu = ntsx.elements();
		Enumeration<String> key = ntsx.keys();
		String strash="";
		while(enu.hasMoreElements()) {
			strash= strash+key.nextElement()+": "+enu.nextElement()+"\n";
		}
		JOptionPane.showMessageDialog(null, "Estas son las notas medias: \n"+strash);
	}
	
	
//METODOS SECUNDARIOS----------------------------------------------------------------------------------------------------


}