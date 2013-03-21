import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import static junit.framework.Assert.*;
import br.ifpi.poo.bean.Cliente;
import br.ifpi.poo.bean.Conta;



public class TesteCliente {
	
	@SuppressWarnings("deprecation")
	
	@Test
	public void TesteIsMaior(){
		
		Date data= Calendar.getInstance().getTime();
		
		data.setMonth(5);
		data.setYear(1990);
		
		Cliente cliente01 = new Cliente(01,"Julio",data);
		assertTrue(cliente01.isMaior());
		
		data.setMonth(9);
		data.setYear(1996);
		
		Cliente cliente02 = new Cliente(02,"Lara",data);
		assertFalse(cliente02.isMaior());
		
		data.setDate(21);
		data.setMonth(03);
		data.setYear(1995);
		
		Cliente cliente03 = new Cliente(03,"Maicon",data);
		assertFalse(cliente03.isMaior());
	}
	
	@Test
	public void totalConta(){
		
		Conta contaA = new Conta(01, 1000, 2000);
		Conta contaB = new Conta(02, 500, 800);
		Conta contaC = new Conta(03, 8000,10000);
		
		Cliente cliente01 = new Cliente();
		cliente01.contas = new ArrayList<Conta>();
		cliente01.contas.add(contaA);
		cliente01.contas.add(contaB);
	
		Cliente cliente02 = new Cliente();
		cliente02.contas = new ArrayList<Conta>();
		cliente02.contas.add(contaA);
		cliente02.contas.add(contaB);
		cliente02.contas.add(contaC);
		
		Cliente cliente03 = new Cliente();
		cliente03.contas = new ArrayList<Conta>();
		cliente03.contas.add(contaB);
		
		
		assertEquals(1500.0,cliente01.totalContas());
		assertEquals(9500.0, cliente02.totalContas());
		
		assertEquals(500.0, cliente03.totalContas());
		
	}
	

}
