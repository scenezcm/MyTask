
public class TheSameName {

	private int x = 0;
	private TheSon theson = new TheSon();
	
	class TheSon{
		
		int x = 10;
		public void SameNameF(int x) {
			System.out.println(x+1);
			System.out.println(this.x + 1);
			System.out.println(TheSameName.this.x +1);
		}
	}
}
