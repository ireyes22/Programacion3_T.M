package org.eclipse.wb.swing;

public class Jugador {

	private int x;
	private int y;
	private int ancho;
	private int alto;
	private String color;
	
	public Jugador(int x, int y, int ancho, int alto, String color) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setIzq(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAncho() {
		return ancho;
	}

	public String getColor() {
		return color;
	}
	
//	public boolean colision(Jugador j1) {
//		
////		for (Jugador j1 : obstaculo) {
////			if(x+(ancho-10)>=(j1.getX()) && x<=(j1.getX()+j1.getAncho()-10)  && y+(alto-10)>=(j1.getY()) && y<=(j1.getY()+j1.getAlto()-10))
////			{
////				return true;
////			}
////		}
//			
//		if(x+(ancho-10)>=(j1.getX()) && x<=(j1.getX()+j1.getAncho()-10)  && y+(alto-10)>=(j1.getY()) && y<=(j1.getY()+j1.getAlto()-10))
//		{
//			return true;
//		}
//
//		return false;
//	}
	
}
