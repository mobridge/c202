import java.util.*;

public class cmd {
	public static void main(String args[]){
		
		switch(args[0]) {
			case "-a":
				for(int i = 1; i < args.length; i++) {
					System.out.println(args[i]);
				}
				break;
			case "-i":
				try {
					int j = Integer.parseInt(args[1]);
					try {
						Integer.parseInt(args[j]);
						System.out.println("Integer");
					} catch (Exception e) {
						try {
							Double.parseDouble(args[j]);
							System.out.println("Double");
						} catch (Exception ex) {
							System.out.println("String");
						}
					}
				} catch (Exception y) {
					System.out.println("ERR.. 2 argument is not an integer");
				}
				break;
			case "-ai":
			case "-ia":
				for(int i = 1; i < args.length; i++) {
					try {
						Integer.parseInt(args[i]);
						System.out.println("Integer");
					} catch (Exception e) {
						try {
							Double.parseDouble(args[i]);
							System.out.println("Double");
						} catch (Exception ex) {
							System.out.println("String");
						}
					}
					System.out.println(args[i]);
				}
				break;
			case "1":
				System.out.println(args[1]);
				break;
			case "2":
				System.out.println(args[2]);
				break;
			case "3":
				System.out.println(args[3]);
				break;
			default:
				System.out.println("ERR");
		}
	}
}