package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	public void mostrarIntro() {
		JOptionPane.showMessageDialog(null, "Hola bienvenido a Regueton Music Composer, \n! te envito a cantar la siguiente composición ¡");
	}

	public  void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato);	
	}
	public int preguntar() {
		int var=0;
		var = JOptionPane.showConfirmDialog(null,"¿ Te gusto la composición?",null, JOptionPane.YES_NO_OPTION);
		return var;
	}

	public String pedirNombreCancion() {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, "Por favor digite  el nombre de la canción: ");
		return dato;
	}

	public void mostrarATexto(String dato) {
		JOptionPane.showMessageDialog(null,"A continuación escoga la carpeta donde desee guardar el archivo y \n digite el nombre del archivo de su proximo exito "+"''"+dato+"''");
	}

	
	public void mostrarFinal() {
		JOptionPane.showMessageDialog(null, "Felicidades se ha guardado con exito su creación");
	}

	public void mostrarFinal2() {
		JOptionPane.showMessageDialog(null, "Lo siento, la composicion no ha sido de su agrado por favor vuelva a ejecutar ");
	}

}
