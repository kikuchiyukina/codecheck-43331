package codecheck;


public class App {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        // キーボードから整数の入力を受け取る
        int score = scan.nextInt();

        scan.close();
        if (0<=score<=1000) {
		if (score % 3 == 0|| Integer.toString(score).contains("3")) {
				System.out.println("dumb");

			} else if (score % 3 == 0) {
				System.out.println("idiot");
			} else if (Integer.toString(score).contains("3")) {
				System.out.println("stupidt");

			} else {
				System.out.println("smart");
			}
        } else {
        	System.out.println("invalid");
        }

	    }
	}
