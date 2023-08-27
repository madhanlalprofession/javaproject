package madhan;

		public class fibbannocci {
		    public static void main(String[] args) {
		        int n = 15; // The number of Fibonacci numbers to generate
		        int prev = 0, curr = 1;

		        System.out.println("Fibonacci Series:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(prev + " ");
		            int next = prev + curr;
		            prev = curr;
		            curr = next;
		        }
		    }
		

	}
	


