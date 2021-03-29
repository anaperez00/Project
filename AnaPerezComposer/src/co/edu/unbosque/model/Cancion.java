package co.edu.unbosque.model;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.ArchivoFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Cancion {

	private Palabra p;
	private Propiedades propi;

	public Cancion () {
	 p = new Palabra();
	 propi=new Propiedades();
	}

//	
	public String crearCancion () {
		String estrofa="";
		String frase="";
		String cancion="";
		
		for (int i=0;i<propi.getNumEstrofa();i++) {
			for(int j=0;j<propi.getNumRenglon();j++) {
				frase =p.getPalabra1()[(int) (Math.random()*4)]
						+p.getPalabra2()[(int)(Math.random()*4)]
								+p.getPalabra3()[(int)(Math.random()*4)]
										+p.getPalabra4()[(int)(Math.random()*4)]	
												+p.getPalabra5()[(int)(Math.random()*4)]	
														+p.getPalabra6()[(int)(Math.random()*4)]	;
				estrofa += frase+"\n";
			}
			cancion = estrofa+="\n";
		}
		return  cancion;
	}

	public String gestionarArchivoCadena(String nombre, String dato) {
		ArchivoFile archivo = new ArchivoFile ();
		archivo.ejecutarFileChosser();
		archivo.escribirArchivo(nombre +"\n" +dato);
		return archivo.leerArchivo();
	}

	public String gestionarPropiedades () {
		Propiedades prop = new Propiedades ();
		prop.escribirPropiedades();
		return prop.leerPropiedades();
		
	}
}

