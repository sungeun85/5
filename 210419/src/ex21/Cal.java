package ex21;

public class Cal extends Parent {
	void doCal(String[] args) {
		int op1 = Integer.parseInt(args[0]);
		String op = args[1];
		int op2 = Integer.parseInt(args[2]);
		
		if(op.equals("add")) {
			System.out.println(op1 + op2);	
		} else if(op.equals("sub")) {
			System.out.println(op1 - op2);
		} else if(op.equals("mul")) {
			System.out.println(op1 * op2);
		} else if(op.equals("div")) {
			System.out.println(op1 / op2);
		}
	}
}