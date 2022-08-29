

public class Hong {
	 interface Person {
			void doService();
		  }

		  class Student implements Person {
			public void doService() {
				System.out.println("ȫ�浿");
			}
		  }

		  class Client {
			  Person p;
			  Client() {
				  p = new Student();
			  }
			  void doService() {
				  p.doService(); 
			  }
		  }
		  class TestStudent {
			public static void main(String[] args) {
				Client c = new Client();
				c.doService();
			}
		  }
}