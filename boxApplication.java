public class boxApplication{
    public static void main (String[] args){
		Box b1 = new Box(10,10,10);
		b1.displayBox();
		double vol = b1.volume();
		System.out.println(vol);
	}
}