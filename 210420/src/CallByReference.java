class Number{
	public int x;   public int y;
}
public class CallByReference {
	public static void swap(Number z) {
		int temp = z.x;
		z.x = z.y;
		z.y = temp;
	}
	public static void objRef(Number obj) {
		obj = null;
	}
	public static void main(String[] args) {
		Number n = new Number();
		n.x = 10;
		n.y = 20;
		System.out.println(n.x +", " + n.y);
		swap(n); //Call by Reference
		System.out.println(n.x +", " + n.y);
		objRef(n);
		System.out.println(n.x + n.y);
	}
}