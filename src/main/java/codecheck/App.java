package codecheck;

public class App {
	public static void main(String[] args) {
        int[] twice = new twice();
	}
	
	public static void twice(int[] array){
		for (int element:array) {
			if (element % 3 == 0 || Integer.toString(element).contains("3")) {
             System.out.println("dumb");
          } else if (element % 3 == 0) {
            System.out.println("idiot");
          } else if (Integer.toString(element).contains("3")){
            System.out.println("stupid");
          } else{
          	System.out.println("smart");
        }
   }
  }
}