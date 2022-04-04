
public class ForLoop {
	public static void main(String args[]) {
		int row=3;
		if(row<=0)
		{
			throw new IllegalArgumentException("invalid value");
		
		}for(row=3;row>=1;row--) {
			for(int col=0; col<row; col++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}
	

}
