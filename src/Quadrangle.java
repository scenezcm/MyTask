
public class Quadrangle {
	
	private Quadrangle[] qtest = new Quadrangle[6];
	private int nextIndex = 0;
	
	public void draw(Quadrangle q) {
		if(nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	
	public Square getSquare() {
		return new Square();
	}
	
	public Parallelogramgle getParallelogramgle() {
		return new Parallelogramgle();
	}
	
class Square extends Quadrangle{
	public Square(){
		System.out.println("正方形");
	}
}

class Parallelogramgle extends Quadrangle{
	public Parallelogramgle() {
		System.out.println("长方形");
	}
}

}
