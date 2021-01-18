package pack1;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Random;
import java.util.Stack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@org.junit.jupiter.api.TestInstance(Lifecycle.PER_CLASS)
class StackTest {

	Stack<Object> st;
	
	@Test
	void instanciateTest(){
		 st = new Stack<Object>();
	}
	
	
	@Nested
	class NewStack{
		

		
		
		@Test
		void isEmpty() {
		
			assertTrue(st.empty());
		}
				
		
		@Test
		void exceptionEmpty() {
			
			assertThrows(EmptyStackException.class, st::pop);
		}
		
		
		@Nested
		
		class Pushing{
			
			@Test
			void isNotEmpty() {
			
				assertFalse(st.empty());
			}
			
			
			@BeforeEach
			void pushRandom() {
				
				Random a = new Random();
				a.nextInt(100);
				st.push(a);
			}
			
		}
		
		
				
	}
	
	
	
	
	

}
