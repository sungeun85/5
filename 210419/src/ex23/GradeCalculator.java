package exercise23_05;

public class GradeCalculator implements GradeSource {

	String[]name = {"ȫ�浿", "������", "������", "�̼���", "�谩��"};
	String[]title = {"�̸�", "C#", "Java", "HTML5"};
	String[]totalTitle = {"�̸�", "C#", "Java", "HTML5", "��", "���", "����"};
	
	int[][] scores={{90, 80, 70},
					{80, 90, 60}, 
					{80, 30, 60}, 
					{80, 20, 60}, 
					{70, 90, 60}};
	
	int[] sum = new int[5];			//�� �л��� ���� ��
	int[] avg = new int[5];			//�� �л��� ��� ��
	int[] rank = new int[5];		//�� �л��� ����
	int[] subSum = new int[3];		//�� ������ ����
	int totalSum = 0;				//��ü �л��� ����
	
	public void calc() {
	//�� �л��� ���� �� �� ��� ���
	for(int i=0; i<scores.length; i++) {
		for(int j=0; j<scores[1].length; j++) {
			sum[i]+=scores[i][j];
			avg[i]=(int)sum[i]/scores[1].length;
		}
	}
	//�� ������ ���� ���
	for(int i=0; i<scores[1].length; i++){  
        for(int j=0; j<scores.length; j++){  
            subSum[i]+=scores[j][i];  
        }  
    }  
	//�л��� ���� ���					
	for(int i=0;i<scores.length;i++) {
		for(int j=0;j<scores.length;j++) {
			if(avg[i] <= avg[j])			//��հ��� 0��°�� 0~4��° ���� �۰ų� ������
				rank[i]++;					//1�� ����
			}
		}
	}
	//ǥ ���� ���
	public void input() {
	System.out.println("1. �Է�" + "\n");
	for(String t:title) {
		System.out.print(t + "\t");
	}
	System.out.println();
	for(int i=0; i<30; i++) {
		System.out.print("=");
	}
	//�л� �̸� �� ���� ����
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
	//ǥ ���� ���
	for(int i=0; i<30; i++) {
		System.out.print("=");
		}
	System.out.println("\n\n" + "2. ���" + "\n");
	
	for(String t:totalTitle) {
		System.out.print(t + "\t");
		}
	System.out.println();
	for(int i=0; i<54; i++) {
		System.out.print("=");
		}
	//�л� �̸� �� ���� ����
	System.out.println();
	for(int i=0; i<scores.length;i++) {
		System.out.print(name[i]+"\t");
		for(int j=0; j<scores[i].length;j++) {
			System.out.print(scores[i][j]+"\t");
		}
		//�л��� ���� ��, ���, ��� ���
		System.out.print(sum[i]+"\t" + avg[i] + "\t" + rank[i]+"��");
		System.out.println();
		}
	for(int i=0; i<54; i++) {
		System.out.print("=");
		}
		System.out.println();
		System.out.print("����\t");
		//���� �հ� �� ���� ���
	for(int i=0; i<scores[1].length;i++) {
		System.out.print(subSum[i] + "\t");
		totalSum += subSum[i];
		}
		System.out.print(totalSum);
	}
}



