package pattern.strategy;

public class StrategyTest {
      public static void main(String[] args) {
		Context ctx = new Context(new Add());
		int res = ctx.executeStrategy(2, 3);
		System.out.println(res);
	}
      
}
