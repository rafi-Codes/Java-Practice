public class stringEvr{
	public static void main (String[] args){
		String string1 = "Nigger";
		String string2 = new StringBuilder(string1).reverse().toString();
		String num = "121";
		int stringNum = Integer.parseInt(num);
		System.out.println(stringNum);
		System.out.println(string2);
		System.out.println(string1.toUpperCase());
		System.out.println(string1.contains("Nig"));
		System.out.println(string1.startsWith("Ni"));
		System.out.println(string1.endsWith("ga"));
		System.out.println(string1.lastIndexOf('g'));
		System.out.println(string1.replace('g','k'));
		String[] arr = string1.split("e");
		for (String x : arr){
			System.out.println(x);
		}
	}
}