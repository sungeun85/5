package ex23;

public class Sol23 {
	private String[] name = {"È«±æµ¿", "°­°¨Âù", "À¯°ü¼ø", "ÀÌ¼ø½Å", "±è°©¼ø"}; 
	private int[][] score = {{90, 80, 70}, {80, 90, 60}, { 80, 30, 60}, {80, 20, 60}, {70, 90, 60}};
	private int[] sum = new int[5];
	private double[] avg = new double[5];
	private int[]rank = new int[5];
	
	void resultScore() {
		
		System.out.println("----------------------------------------");
		System.out.println(" ÀÌ¸§   C#  java html5  ÇÕ       Æò±Õ         ¼®Â÷");
		System.out.println("----------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "  ");
			
			for (int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
				System.out.print(score[i][j] + "   ");
			}
			
			avg[i] = (double)sum[i] / score[i].length;
				
			for(int i=0;i<score.length;i++) {
				for(int j=0;j<score.length;j++) {
					if(avg[i] <= avg[j])		
						rank[i]++;				
				}		
			}
				         	            
			System.out.printf("%d   %.02f", sum[i], avg[i], rank[i]);
			System.out.println();
					}
           	
	void totalScore() {
		System.out.println("----------------------------------------");
		System.out.print("ÃÑÁ¡ : ");
		
		int totalScore = 0; 
		int sumTotalScore = 0; 
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < score.length; i++) {
				totalScore += score[i][j];
			}
			sumTotalScore += totalScore;
			System.out.print(totalScore + "  ");
			totalScore = 0;
		}
		System.out.println(sumTotalScore + "     -");
		System.out.println("----------------------------------------");
	}
}