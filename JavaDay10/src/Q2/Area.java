package Q2;

public class Area extends Shape{

	@Override
	public int rectangle(int length, int breadth) {
		// TODO Auto-generated method stub
		return (length*breadth);
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return (side*4);
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return (int) (radius*3.14);
	}
	
	

}
