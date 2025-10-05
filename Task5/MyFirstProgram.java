import myfirstpackage.*;
        
class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass(10, 10);
                int i, j;
                for (i = 1; i <= 8; i++) {
                    for(j = 1; j <= 8; j++) {
                        o.setFirstNum(i);
                        o.setSecondNum(j);
                        System.out.print(o.multiply());
                        System.out.print(" ");
                    }
                    System.out.println();
                }

	}
}