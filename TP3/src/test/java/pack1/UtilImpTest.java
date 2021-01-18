package pack1;

import static pack3.UtilImp.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import pack3.UtilImp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



@TestMethodOrder(OrderAnnotation.class)
@org.junit.jupiter.api.TestInstance(Lifecycle.PER_CLASS)

@Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
class UtilImpTest extends UtilImp{

	 static int cmp =0;
	
	 
	 @AfterEach
	 public void inc() {
		 cmp++;
	 }
	 
	 
	 @AfterAll
	 @Test
	 public void Testcmp() {
		 
		 assertEquals(cmp, this.getClass().getDeclaredMethods().length + 5);
		  
	 }
	 

		 
	
	@Test
	@DisplayName("Test Addition")
	//@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	@Tag("Math")
	void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Test Produit")
	@Tag("Math")
	void testMult() {
		fail("Not yet implemented");
	}


	@Test
	@DisplayName("Test pour trouver Max (int, int)")


	void testMax() {
		assertEquals(20, max(20,9));
	}

	//@Test
	@DisplayName("Test Parametré Minimum")
	@ParameterizedTest(name = "{index} => a={0}, b={1}, expected={2}")
    @CsvSource({
            "17, 4, 4",
            "2, 13, 5",
            "12, 8, 8",
    })
	void testMin(int a, int b, int expected) {
		assertEquals(expected, min(a,b));
	}
	

	@Test
	@DisplayName("Test pour division de double")
	@Order(3)
	void testDiv1() {
		assertEquals(3.33, divDouble(10,3), 0.01);
	}

	

	@Test
	@Disabled
	@DisplayName("Test Affichage")
	void testAfficher() {
		assertEquals("Bonj", afficher());
	}
	

	
	
	@Test
	@DisplayName("Test de Parité simple")
	@Order(1)
     void testPaire() {
		
		assertFalse(paire(17));
	}
	
	
	//@Test
	@DisplayName("Test de Parité paramétré")
	
	@Order(2)
	@ParameterizedTest
	@ValueSource(ints = {16, 3, 41, 13})
	//@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void testPaire(int x) {
		
		assertTrue(paire(x));
	}
	
	
	
	@Test
	@DisplayName("Test de somme d'un tableau")
	void testSum() {
		
		final int[] tab = {1,7,9,3};
		//assertEquals(20, Sum(tab));
		
		assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> {Sum(tab);} , "Exception attendue n'est pas levée");
		
	}
	
	

	@DisplayName("Test Répété")
    @RepeatedTest(6)
	//@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void TestIncrement() {		

		   assertEquals(3, increment());
		
	}
	
	
	/*
	 * @BeforeAll public static void TestInstance() { assertSame(UtilImp.class,
	 * UtilImpTest.class.getSuperclass()); }
	 */
	
	@BeforeAll
	public void TestInstance() {
		System.out.println(" same Instance for the class");
	}
	
	
	
	@Test
	public void test_exception() {

       Exception exception = assertThrows(IllegalArgumentException.class, () -> divInt(1,0));

       assertEquals(" / By Zero", exception.getMessage());

       //assertTrue(exception.getMessage().contains("zero"));

   }
	
}
