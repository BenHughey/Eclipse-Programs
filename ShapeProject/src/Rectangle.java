
public class Rectangle extends Shape {
		
	private int length;
	public void setLength(int lgth) {
		length = lgth;
		}
	
	public int getLength() {
		return length;
	}

	public int calculateArea() {
		
		int area = getWidth() * getLength();
		
		return area;
		
		
		
	}
	}


