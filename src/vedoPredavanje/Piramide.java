package vedoPredavanje;
import java.util.*;
public class Piramide {
	/**ispisuje piramidu :
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 . . .n */
	public static void Piramida1(int n) {
	for (int i = 1 ; i <= n; i++) {
	for (int j= 1; j <=i ; j++) {
		System.out.printf("%3d", j);
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
