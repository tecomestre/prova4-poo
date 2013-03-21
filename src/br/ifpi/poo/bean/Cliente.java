package br.ifpi.poo.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cliente {
	private int id;
	private String nome;
	private Date dataNascimento;
	public ArrayList<Conta> contas;
	
	public Cliente(int id, String nome, Date dataNascimento){
		this.id=id;
		this.nome = nome;
		this.dataNascimento =dataNascimento;
	};
	public Cliente(){};
	
	@SuppressWarnings("deprecation")
	public boolean isMaior(){
		
		Date data = Calendar.getInstance().getTime();
		data.setDate(20);
		data.setYear(1995);
		data.setMonth(03);
				
		if(this.dataNascimento.before(data))
			return true;
		else return false;	
	}
	public double totalContas(){
		double valorTotal=0;
		for(Conta c: this.contas){
			valorTotal=valorTotal+c.getSaldo();
		}
		return valorTotal;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
}