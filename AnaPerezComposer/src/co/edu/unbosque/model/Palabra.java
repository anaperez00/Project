package co.edu.unbosque.model;

public class Palabra {
	
	public String [] palabra1 ;
	public String [] palabra2;
	public String [] palabra3;
	public String [] palabra4;
	public String [] palabra5;
	public String [] palabra6;

	public Palabra () {
		
		palabra1 = new String [4];
		palabra2 = new String [4];
		palabra3 = new String [4];
		palabra4 = new String [4];
		palabra5 = new String [4];
		palabra6 = new String [4];
		
		palabra1[0] = "mami ";
		palabra1[1] = "bebé ";
		palabra1[2] = "princess ";
		palabra1[3] = "mami ";
		
		palabra2[0] = "yo quiero ";
		palabra2[1] = "yo puedo ";
		palabra2[2] = "yo vengo a ";
		palabra2[3] = "voy a ";
		
		palabra3[0] = "encendelte ";
		palabra3[1] = "amalte ";
		palabra3[2] = "ligal ";
		palabra3[3] = "jugal ";
		
		palabra4[0]= "suave ";
		palabra4[1]= "lento ";
		palabra4[2]= "rapido ";
		palabra4[3]= "fuerte ";
		
		palabra5[0]= "hasta que salga el sol ";
		palabra5[1]= "toda la noche ";
		palabra5[2]= "hasta el amanecer ";
		palabra5[3]= "todo el dia ";
		
		palabra6[0]= "sin anestesia";
		palabra6[1]= "sin compromiso";
		palabra6[2]= "feis to feis";
		palabra6[3]= "sin miedo";
	}

	public String[] getPalabra1() {
		return palabra1;
	}

	public void setPalabra1(String[] palabra1) {
		this.palabra1 = palabra1;
	}

	public String[] getPalabra2() {
		return palabra2;
	}

	public void setPalabra2(String[] palabra2) {
		this.palabra2 = palabra2;
	}

	public String[] getPalabra3() {
		return palabra3;
	}

	public void setPalabra3(String[] palabra3) {
		this.palabra3 = palabra3;
	}

	public String[] getPalabra4() {
		return palabra4;
	}

	public void setPalabra4(String[] palabra4) {
		this.palabra4 = palabra4;
	}

	public String[] getPalabra5() {
		return palabra5;
	}

	public void setPalabra5(String[] palabra5) {
		this.palabra5 = palabra5;
	}

	public String[] getPalabra6() {
		return palabra6;
	}

	public void setPalabra6(String[] palabra6) {
		this.palabra6 = palabra6;
	}

}
