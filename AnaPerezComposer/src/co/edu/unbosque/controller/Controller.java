package co.edu.unbosque.controller;


import javax.swing.JOptionPane;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller {

	private Cancion c;
	private View gui;

	public Controller() {
		c = new Cancion();
		gui = new View();
		
		String cancion=c.crearCancion();
		String nombre="";

		gui.mostrarIntro();
		gui.mostrarResultados(cancion);

		if (gui.preguntar()==0) {
			nombre = gui.pedirNombreCancion();
			gui.mostrarATexto(nombre.toUpperCase());
			String archivo = c.gestionarArchivoCadena(nombre.toUpperCase(),cancion);
			gui.mostrarResultados(archivo);
			String prop =  c.gestionarPropiedades();	
			gui.mostrarFinal();
			
		}else {
			gui.mostrarFinal2();
		}
	}
}
