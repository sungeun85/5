package exercise23_05;

public class GradeCalculator implements GradeSource {

	String[]name = {"홍길동", "강감찬", "유관순", "이순신", "김갑순"};
	String[]title = {"이름", "C#", "Java", "HTML5"};
	String[]totalTitle = {"이름", "C#", "Java", "HTML5", "합", "평균", "석차"};
	
	int[][] scores={{90, 80, 70},
					{80, 90, 60}, 
					{80, 30, 60}, 
					{80, 20, 60}, 
					{70, 90, 60}};
	
	int[] sum = new int[5];			//각 학생의 과목 합
	int[] avg = new int[5];			//각 학생의 평균 값
	int[] rank = new int[5];		//각 학생의 석차
	int[] subSum = new int[3];		//각 과목의 총점
	int totalSum = 0;				//전체 학생의 총점
	
	public void calc() {
	//각 학생의 과목 합 및 평균 계산
	for(int i=0; i<scores.length; i++) {
		for(int j=0; j<scores[1].length; j++) {
			sum[i]+=scores[i][j];
			avg[i]=(int)sum[i]/scores[1].length;
		}
	}
	//각 과목의 총점 계산
	for(int i=0; i<scores[1].length; i++){  
        for(int j=0; j<scores.length; j++){  
            subSum[i]+=scores[j][i];  
        }  
    }  
	//학생별 석차 계산					
	for(int i=0;i<scores.length;i++) {
		for(int j=0;j<scores.length;j++) {
			if(avg[i] <= avg[j])			//평균값의 0번째와 0~4번째 값중 작거나 같으면
				rank[i]++;					//1씩 증가
			}
		}
	}
	//표 목차 출력
	public void input() {
	System.out.println("1. 입력" + "\n");
	for(String t:title) {
		System.out.print(t + "\t");
	}
	System.out.println();
	for(int i=0; i<30; i++) {
		System.out.print("=");
	}
	//학생 이름 및 점수 나열
	System.out.println();
	for(int i=0; i<scores.length;i++) {
		System.out.print(name[i]+"\t");
		for(int j=0; j<scores[i].length;j++) {
			System.out.print(scores[i][j]+"\t");
		}
		System.out.println();
		}
	}
	public void result() {
	//표 목차 출력
	for(int i=0; i<30; i++) {
		System.out.print("=");
		}
	System.out.println("\n\n" + "2. 출력" + "\n");
	
	for(String t:totalTitle) {
		System.out.print(t + "\t");
		}
	System.out.println();
	for(int i=0; i<54; i++) {
		System.out.print("=");
		}
	//학생 이름 및 점수 나열
	System.out.println();
	for(int i=0; i<scores.length;i++) {
		System.out.print(name[i]+"\t");
		for(int j=0; j<scores[i].length;j++) {
			System.out.print(scores[i][j]+"\t");
		}
		//학생당 과목별 합, 평균, 등수 출력
		System.out.print(sum[i]+"\t" + avg[i] + "\t" + rank[i]+"등");
		System.out.println();
		}
	for(int i=0; i<54; i++) {
		System.out.print("=");
		}
		System.out.println();
		System.out.print("총점\t");
		//과목별 합계 및 총점 출력
	for(int i=0; i<scores[1].length;i++) {
		System.out.print(subSum[i] + "\t");
		totalSum += subSum[i];
		}
		System.out.print(totalSum);
	}
}



