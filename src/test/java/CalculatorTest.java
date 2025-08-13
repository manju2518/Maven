import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

	
		@Test
		
void Testadd() {
			Calculator cop=new Calculator();
			Calculator cop1=new Calculator();
			Calculator cop2=new Calculator();
			Calculator cop3=new Calculator();
			int res=cop.add(3, 2);
			int res1=cop1.sub(3,2);
			int res2=cop2.multi(2, 3);
			int res3=cop3.div(4,2);
			assertEquals(5,res,"2+3 should equal 5");
			assertEquals(1,res1,"3-2 should equal 1");
			assertEquals(6,res2,"3*2 should equal 6");
			assertEquals(2,res3,"4/2 should equal 2");
		}

	}
