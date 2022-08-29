package ex23;

public class Test23 implements ITest23{
	
	int sum2 =0;
	int[] sum = new int[5];
	int[] avg = new int[5];
	int[] sum1 = new int[3];
	int[] rank = new int[5];
	int i = 0;
	int j = 0;
	String[] name = {"홍길동" , "강감찬" , "유관순" , "이순신" , "김갑순"};
	int [][] s = {{90,80,70},{80,90,60},{80,30,60},{80,20,60},{70,90,60}};

	public void title() {               //항목 나열
		System.out.println("-----------------------------------------------------");    
		System.out.println(" 이름\tc#\t자바\tHTML5\t합\t평균\t석차");
		System.out.println("-----------------------------------------------------");    
	}
	
	public void sumAvgRank() {             //평균,합,석차 
		for(i=0; i<s.length; i++) {      // 사람별 합,평균 구하기            
			for(j=0; j<s[i].length; j++) {
				sum[i]+=s[i][j];
				avg[i] = sum[i]/s[i].length;
			}
		}
  
		for(i=0; i<rank.length; i++) {   // 석차 구하기                  
			rank[i]=1;
  				for(j=0; j<rank.length; j++) {
  					if(avg[i]<avg[j]) {               
  						rank[i]++;
  							if(avg[i]==avg[j])             //동점자 처리 ( 1등이 2명이면 다음등수 3등)
  								rank[i]++;
  					}
  				}
		}
	}
	public void doOut() {               // 출력 하기(이름,과목별 점수,사람별 합,사람별 평균,석차)
		for( i=0;i<s.length;i++) {           
			System.out.print(" "+name[i]);             //이름 나열
  				for(j=0;j<s[i].length;j++) {
  					System.out.print("\t" + s[i][j]);  //과목별 점수  
  				}
  		System.out.print("\t"+ sum[i]);            	   //사람별 합
  		System.out.print("\t" +avg[i]);                //사람별 평균
  		System.out.println("\t" +rank[i]);             //석차
		}
	}
	public void sum2() {                 //출력 하기(과목별 총점)
		System.out.println("-----------------------------------------------------");      
		System.out.print(" 총점 ");
		for(j = 0; j <s[j].length; j ++) {
			for(i = 0; i<s.length; i ++)
				sum1[j] = sum1[j] +s[i][j];		// 언어별 총점
				System.out.print("\t"+sum1[j]);        
				sum2 = sum2 + sum1[j];				// 언어별 총점의 합
		}
		System.out.print("\t" + sum2);            
		System.out.println();
		System.out.println("-----------------------------------------------------");     
	}
}