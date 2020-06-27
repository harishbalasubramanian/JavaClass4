
public class Code {

	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			if(i == 7) continue;
//			System.out.println(i+" Hello World");
//		}
//		for(int i = 0; i < 10; i++) {
//			if(i == 7) break;
//			System.out.println(i+" Hello World");
//		}
//		break -> exits loops
//		continue -> skips past code in loop and moves to next value of i
//		println("Goodbye");
//		String t = talk("greetings");
//		System.out.println(t);
//		Human h1 = new Human();
//		h1.breathe("Hello");
//		int c = add(5,6);
//		System.out.println(c);
//		double c = sub(3.14,2.71);
//		System.out.println(c);
//		int a = 5;
//		if(a == 5) {
//			System.out.println("Hello World");
//			return;
//		}
//		System.out.println("Goodbye World");
		main();
	}
	public static void hello() {
		System.out.println("Hello World");
	}
	public static void main() {
		System.out.println("Main");
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static double sub(double a, double b) {
		return a - b;
	}
	//parameter
	public static void println(String text) {
		System.out.println(text);
	}
	public static String talk(String text) {
		text = text + "Hello World";
		//text = "greetings"
		//text = "greetingsHello World"
//		System.out.println(text);
		return text;
	}
}
class Banana{
	String color;
	String smell;
	public void taste() {
		System.out.println("Bananas taste good");
	}
}
class Human {
	int height;
	int age;
	int birthday;
	int weight;
	public static void breathe(String hello) {
		System.out.println(hello);
	}
	public void eat(int calories) {
		System.out.println("You ate "+calories+" many calories today");
	}
}
