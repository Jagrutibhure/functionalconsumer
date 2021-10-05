Functional interface Example
public class LmbdaTest {
  public static void main(String[] args) {
    
    MyInterface1 f1 = () -> System.out.println("It's Test Time!");
    f1.show();
    
    MyInterface2 f2 = () -> System.out.println("It's My Test!");
    f2.show();
  }
}

Consumer interface Example
package Interface;

import java.util.function.Consumer;

public class FunctionalInterface {
	
		public static void main(String[] args) {


		System.out.println("Consumer  is a interface");
			 Consumer c = (x) -> System.out.println(x);

		 Object signal = 345;
		c.accept(signal);
		 c.accept("This is solution");

}
}


PredicateInterface Example
package Interface;
import java.util.function.Predicate;
public class PredicateInterfaceExample2 {
	
	
	    public static void main(String[] args)
	    {
	        Predicate<Integer> lesserthan = i -> (i < 15); 
	        System.out.println(lesserthan.test(12)); 
	    }
	}

