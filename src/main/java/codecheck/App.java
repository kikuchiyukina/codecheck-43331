package codecheck;


public class App {
	public static void main(String[] args) {

		int[] ia = new int[args.length];
		String [] ib = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			try {
				ia[i] = Integer.parseInt(args[i]);
				ib[i] = args[i];
				byte[] bytes = ib[i].getBytes();

				if  (ib[i].length() == bytes.length) {
					if (0 <= ia[i] && ia[i] <= 1000) {
						if (ia[i] % 3 == 0 && Integer.toString(ia[i]).contains("3")) {
							System.out.println("dumb");
						} else if (ia[i] % 3 == 0) {
							System.out.println("idiot");
						} else if (Integer.toString(ia[i]).contains("3")) {
							System.out.println("stupid");
						} else {
							System.out.println("smart");
						}
					} else {
						System.out.println("invalid");
					}
				} else {
					System.out.println("invalid");
				}
			} catch (NumberFormatException e) {
					System.out.println("invalid");
			}
		}
	}
}
