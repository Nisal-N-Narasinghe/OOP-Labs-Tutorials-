
public class Rectangle extends Shape {
	
	private int hight;
	private int width;
	
	//Override
	public int getArea() {
		return this.hight*this.width;
	}

	//Override
	public int getPerimeter(int x) {
		
		return this.width*2+this.hight*2;
	}


	
}
