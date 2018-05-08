
public class Test3 {

	private int num = 0;
	
	private void fun1() {
		System.out.println("This test3  fun1"+"     num :"+num);
	}
	
	class TestSon{
		public void fun2() {
			System.out.println("This testson fun2");
			fun1();
			num++;
			fun1();
		}
		
	}
}
