package n1exercici1;

import java.util.ArrayList;

public class Lista {
	protected String mes1;
	protected String mes2;
	protected String mes3;
	protected String mes4;
	protected String mes5;
	protected String mes6;
	protected String mes7;
	protected String mes8;
	protected String mes9;
	protected String mes10;
	protected String mes11;
	protected String mes12;
	
	protected static ArrayList<String> Calendario = new ArrayList<String>();
	
	public Lista(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l) {
		mes1 = a;
		mes2 = b;
		mes3 = c;
		mes4 = d;
		mes5 = e;
		mes6 = f;
		mes7 = g;
		mes8 = h;
		mes9 = i;
		mes10 = j;
		mes11 = k;
		mes12 = l;
		
	}
	

	public void agregar() {
		
		Calendario.add(mes1);
		Calendario.add(mes2);
		Calendario.add(mes3);
		Calendario.add(mes4);
		Calendario.add(mes5);
		Calendario.add(mes6);
		Calendario.add(mes7);
		Calendario.add(mes8);
		Calendario.add(mes9);
		Calendario.add(mes10);
		Calendario.add(mes11);
		Calendario.add(mes12);
	}
	
	
	
}
