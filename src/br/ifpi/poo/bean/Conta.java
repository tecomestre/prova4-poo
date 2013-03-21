package br.ifpi.poo.bean;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Conta {
	
	private int id;
	private double saldo;
	private double limite;
	
	
	public Conta(int id, double saldo, double limite){
		
		this.id = id;
		this.saldo = saldo;
		this.limite = limite;
				
	}
	
	public void saca(double valor){
		
		try{
			if(this.saldo > this.limite && valor>=this.limite){
				this.saldo = this.saldo-valor;
			}	
		}catch (Exception e){
			Logger.global.setLevel(Level.FINE);
			Logger.getLogger("Cuidado");
			System.out.println("Saque não realizado, pois ultrapassaria o valor limite da conta");		}
	}
	
	
	public void deposita (double valor){
		
		this.saldo=this.saldo+valor;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
				
}
