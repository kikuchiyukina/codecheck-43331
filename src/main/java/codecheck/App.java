package codecheck;


public class App {
	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);

        // キーボードから整数の入力を受け取る
		int[] ia = new int[args.length];
        //int score = Integer.parseInt(args);

		for (int i = 0; i < args.length; i++) {
			try {
			ia[i] = Integer.parseInt(args[i]);


        if (0 <= ia[i] && ia[i] <= 1000) {
		if (ia[i] % 3 == 0 && Integer.toString(ia[i]).contains("3")) {
				System.out.println("dumb");

			} else if (ia[i] % 3 == 0) {
				System.out.println("idiot");
			} else if (Integer.toString(ia[i]).contains("3")) {
				System.out.println("stupidt");

			} else {
				System.out.println("smart");
			}
        } else {
        	System.out.println("invalid");
        }

			}catch (NumberFormatException e) {
				System.out.println("invalid");
		    }
		}
		}
	}
