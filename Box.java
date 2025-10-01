public class Box {
	
	public double height;
	public double width;
	public double depth;

	Box (double height, double width, double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public void displayBox(){
		System.out.println("Height : " + height);
		System.out.println("Width : " + width);
		System.out.println("Depth : " + depth);
	}

	public  double volume(){
		return height*depth*width;
	}
}