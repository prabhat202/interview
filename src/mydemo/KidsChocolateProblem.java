package mydemo;

public class KidsChocolateProblem {
	
	public static void main(String[] args) {
		int noOfChances = 5;
		int [] bags = {2, 4, 6, 8, 10};
		findMaxChocolate(noOfChances, bags);
	}

	private static void findMaxChocolate(int chance, int[] bags) {
		int maxSum = 0;
		
		for (int i = 0; i < chance; i++) {
			int maxChoco = 0;
			int index = 0;
			for (int j = 0; j < bags.length ; j++) {
				if( maxChoco < bags[j]) {
					maxChoco = bags[j];
					index = j;
				} 
			}
			System.out.println("MaxChocho for "+i+" iteration -"+maxChoco);
			maxSum+=maxChoco;
			bags[index] = maxChoco/2;
			System.out.println("MaxSum- "+maxSum);
		}
	}

}
