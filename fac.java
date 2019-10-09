import java.util.*;

public class fac {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);

		for(int i = num-1; i > 0; i--) {
			num *= i;
		} //for
		System.out.println(num%10);
	} //main
} //class