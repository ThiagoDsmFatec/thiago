package br.edu.fatecpg.veiculo;

public class Carro {
	private String chassi;
	private String marca;
	private String modelo;
	private String placa;
	private double motor;
	private boolean ligado=false;
	private double tanque;
	
	public Carro(String ch, String mrc, String mod, double Motor) {
		this.chassi = ch;
		this.marca = mrc;
		this.modelo = mod;
		this.motor = Motor;
		
	}
	public String getChassi() {
		return this.chassi;
	}
  public void setChassi(String ch) {
	  this.chassi = ch;
	  }
  public double getTanque() {
		return this.tanque;
	}
public void setTanque(double tanque) {
	  this.tanque = tanque;
}
	
    public void tanque(double G) {   
    	  double total= tanque * G;
		System.out.println("o valor total gasto foi"+ total);
    	}
}
	


