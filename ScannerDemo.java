
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// Oh! This needs to be changed !
	// this is her file private static String file1 = "C:\\Users\\cscharff\\eclipse-workspace\\ScannerSolution\\src\\prog1.kay";
	private static String file1 = "C:\Users\karen\source\repos\cs361scannerparser\\prog1.kay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		Token tk;
		while (!ts.isEndofFile()) {
			// TODO TO BE COMPLETED
			// tk is not defined on the line below
			tk = ts.nextToken(); 
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}

