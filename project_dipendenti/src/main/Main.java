
package main;
import java.util.Date;

import model.Dipendenti;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dipendenti d1 = new Dipendenti();
		d1.setNome("pippo");
		d1.setCognome("pluto");
		d1.setRuoloAziendale("manager");
		d1.setDataNascita(new Date(2000,01,01));
		System.out.println(d1);
		
		Dipendenti d2 = new Dipendenti();
		d2.setNome("manuel");
		d2.setCognome("rossi");
		d2.setRuoloAziendale("ingeniere");
		d2.setDataNascita(new Date(2005,03,06));
		System.out.println(d2);
		
		Dipendenti d3 = new Dipendenti();
		d3.setNome("nicola");
		d3.setCognome("lorenzo");
		d3.setRuoloAziendale("artigiano");
		d3.setDataNascita(new Date(2008,04,01));
		System.out.println(d3);
	}

}
