package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Propiedades {

	int numeroEstrofas= 3;
	int numeroRenglones= 4;

	String numCadena = String.valueOf(numeroEstrofas);
	String numCadena2 = String.valueOf(numeroRenglones);

	private Properties prop= new Properties();
	private String archivoprop= "./Data/Propiedades.txt";	

	public int escribirPropiedades() {
		try {

			prop.setProperty("artista","BadBunny");
			prop.setProperty("album","Sin Sentido");
			prop.setProperty("numeroEstrofas", numCadena);
			prop.setProperty("numeroRenglones",numCadena2);
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	

	public String leerPropiedades() {
		String linea= "";

		try {
			prop.load(new FileInputStream(archivoprop));

			prop.list(System.out);

			linea +="Artista"+prop.getProperty("artista")+"\n";
			linea +="Album"+prop.getProperty("album")+"\n";
			linea +="numero de estrofas: "+prop.getProperty("numeroEstrofas")+"\n";
			linea+="numero de renglones:"+prop.getProperty("numeroRenglones")+"\n";
		}
		catch (IOException ex) {
			return null;
		}
		return  linea;
	}
	
	public int getNumEstrofa() {
		return numeroEstrofas;
	}

	public void setNumEstrofa(int numEstrofa) {
		this.numeroEstrofas = numEstrofa;
	}

	public int getNumRenglon() {
		return numeroRenglones;
	}

	public void setNumRenglon(int numRenglon) {
		this.numeroRenglones = numRenglon;
	}
}
