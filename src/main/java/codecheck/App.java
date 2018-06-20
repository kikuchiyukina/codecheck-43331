package codecheck;


public class App {
	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);

        // キーボードから整数の入力を受け取る
		int[] ia = new int[args.length];
        //int score = Integer.parseInt(args);

		for (int i = 0; i < args.length; i++) {
			ia[i] = Integer.parseInt(args[i]);


        if (0 <= ia || ia <= 1000) {
		if (ia % 3 == 0|| Integer.toString(ia).contains("3")) {
				System.out.println("dumb");

			} else if (ia % 3 == 0) {
				System.out.println("idiot");
			} else if (Integer.toString(ia).contains("3")) {
				System.out.println("stupidt");

			} else {
				System.out.println("smart");
			}
        } else {
        	System.out.println("invalid");
        }


		}
		}
	}
