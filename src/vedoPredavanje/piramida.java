package vedoPredavanje;

import java.util.*;
public class piramida {
	/**ispisuje piramidu :
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 . . .n */
	public static void Piramida1(int n) {
	for (int index1 = 1 ; index1 <= n; index1++) {
		for (int index2 = 1 ; index2 <= n - index1; index2++){
		System.out.printf("%3s", "");
	}
	for (int index3 =1 ; index3 <= index1; index3++){
	System.out.printf("%3s",index3);
	}
	System.out.println();
	}
	}
	/**
	 * 
	 * za n ispisuje:
	 *          1
	 *        1 2
	 *      1 2 3
	 *   ........
	 *  1 2 3 ...
	 *1 2 3...  (n)
	 */
public static void main(String[] args) {
	Piramida1(4);
}
}



