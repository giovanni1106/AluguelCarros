package Pessoas;

import java.awt.Image;

public class CNH {

	private Image fotoFrente;
	private Image fotoVerso;
	
	public CNH(Image F, Image V) {
		
		this.fotoFrente = F;
		this.fotoVerso = V;
		
	}
	
	public Image getFotoFrente() {
		return fotoFrente;
	}
	public void setFotoFrente(Image fotoFrente) {
		this.fotoFrente = fotoFrente;
	}
	public Image getFotoVerso() {
		return fotoVerso;
	}
	public void setFotoVerso(Image fotoVerso) {
		this.fotoVerso = fotoVerso;
	}
	
	
}
