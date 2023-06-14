package package_lab8;

import java.util.ArrayList;


public class Lab8Bai1 {
	public static void main(String[] args) {
		// TODO code application logic here
		ArrayList mylist = new ArrayList();
		mylist.add(10);
		mylist.add(15.75);
		mylist.add(true);
		mylist.add("Hello");

		int a = (Integer) mylist.get(0);
		double b = (Double) mylist.get(1);
		boolean c = (boolean) mylist.get(2);
		String str = (String) mylist.get(3);

		System.out.println("So nguyen: " + a);
		System.out.println("So thuc: " + b);
		System.out.println("Boolean: " + c);
		System.out.println("Xau: " + str);
	}
}
