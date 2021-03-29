package co.edu.unbosque.model.persistence;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ArchivoFile {	
	private JFileChooser seleccionarArchivo = new JFileChooser();
	private File archivoSeleccionado;
    private FileNameExtensionFilter filter=new FileNameExtensionFilter(".txt",".TXT");

	public void ejecutarFileChosser() {

		seleccionarArchivo.setFileFilter(filter);
		seleccionarArchivo.showOpenDialog(null);
		archivoSeleccionado = seleccionarArchivo.getSelectedFile();

		System.out.println("el archivo seleccionado es" + archivoSeleccionado);
		System.out.println("path actual "+ seleccionarArchivo.getCurrentDirectory());
	}
	public int escribirArchivo (String dato) {
		try {			
			FileWriter fw = new FileWriter(archivoSeleccionado);
			PrintWriter pw = new PrintWriter(fw );
			pw.println(dato);
			fw.close();

		}catch (IOException e) {
			return -1;
		}
		return 0;
	}
	public String leerArchivo() {
		String linea="";
		String cadena ="";
		try {
			FileReader fr = new FileReader (archivoSeleccionado);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();

			while (linea != null) {
				cadena += linea+"\n";
				linea = br.readLine();
			}
			fr.close();
		}
		catch (IOException e ) {
			return null;
		}
		return cadena;
	}
}
