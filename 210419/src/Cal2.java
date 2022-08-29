
public class Cal2 {
	private int num1;
	private int num2;
	private String sign;
	
	public Cal2(String num1, String num2, String sign){
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		this.sign = sign;
	}
	
	public void doCal() {
		if(sign.equals("add")) {
			System.out.println(num1 + num2);
		} else if(sign.equals("sub")) {
			System.out.println(num1 - num2);
		} else if(sign.equals("mul")) {
			System.out.println(num1 * num2);
		} else if(sign.equals("div")) {
			System.out.println(num1 / num2);
		}
	}
}