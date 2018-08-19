import java.io.Serializable;
//Implements serializable so objects of this type can be serialized
public abstract class Shape implements Serializable {
	
		private int width;
		
			
		public void setWidth(int wdth) {
			width = wdth;
		}
		
		public int getWidth() {
			return width;
		}


}
