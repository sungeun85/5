package ex23;

public class Test23 implements ITest23{
	
	int sum2 =0;
	int[] sum = new int[5];
	int[] avg = new int[5];
	int[] sum1 = new int[3];
	int[] rank = new int[5];
	int i = 0;
	int j = 0;
	String[] name = {"ȫ�浿" , "������" , "������" , "�̼���" , "�谩��"};
	int [][] s = {{90,80,70},{80,90,60},{80,30,60},{80,20,60},{70,90,60}};

	public void title() {               //�׸� ����
		System.out.println("-----------------------------------------------------");    
		System.out.println(" �̸�\tc#\t�ڹ�\tHTML5\t��\t���\t����");
		System.out.println("-----------------------------------------------------");    
	}
	
	public void sumAvgRank() {             //���,��,���� 
		for(i=0; i<s.length; i++) {      // ����� ��,��� ���ϱ�            
			for(j=0; j<s[i].length; j++) {
				sum[i]+=s[i][j];
				avg[i] = sum[i]/s[i].length;
			}
		}
  
		for(i=0; i<rank.length; i++) {   // ���� ���ϱ�                  
			rank[i]=1;
  				for(j=0; j<rank.length; j++) {
  					if(avg[i]<avg[j]) {               
  						rank[i]++;
  							if(avg[i]==avg[j])             //������ ó�� ( 1���� 2���̸� ������� 3��)
  								rank[i]++;
  					}
  				}
		}
	}
	public void doOut() {               // ��� �ϱ�(�̸�,���� ����,����� ��,����� ���,����)
		for( i=0;i<s.length;i++) {           
			System.out.print(" "+name[i]);             //�̸� ����
  				for(j=0;j<s[i].length;j++) {
  					System.out.print("\t" + s[i][j]);  //���� ����  
  				}
  		System.out.print("\t"+ sum[i]);            	   //����� ��
  		System.out.print("\t" +avg[i]);                //����� ���
  		System.out.println("\t" +rank[i]);             //����
		}
	}
	public void sum2() {                 //��� �ϱ�(���� ����)
		System.out.println("-----------------------------------------------------");      
		System.out.print(" ���� ");
		for(j = 0; j <s[j].length; j ++) {
			for(i = 0; i<s.length; i ++)
				sum1[j] = sum1[j] +s[i][j];		// �� ����
				System.out.print("\t"+sum1[j]);        
				sum2 = sum2 + sum1[j];				// �� ������ ��
		}
		System.out.print("\t" + sum2);            
		System.out.println();
		System.out.println("-----------------------------------------------------");     
	}
}