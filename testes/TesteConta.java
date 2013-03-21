

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.persistence.config.LoggerType;
import org.junit.Test;

import sun.util.logging.resources.logging;
import static junit.framework.Assert.*;
import static java.util.logging.Level;

import br.ifpi.poo.bean.Conta;


public class TesteConta {
				
		@Test
		public void testeSaca(){
			
			Conta contaA = new Conta(01, 1000, 2000);
			Conta contaB = new Conta(02, 500, 800);
			Conta contaC = new Conta(03, 8000,10000);
						
			Logger.global.log(Level.WARNING, "Cuidado");
		
			assertEquals(contaA.saca(1000));
			
			
		}

}	



