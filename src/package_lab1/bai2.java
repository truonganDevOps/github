package package_lab1;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập sản phẩm
        for (int i = 0; i < 5; i++) {
            Product p1 = new Product();
            System.out.println("Sản phẩm thứ " + (i + 1) + ": ");
            System.out.print("Tên sản phẩm: ");
            p1.setName(sc.nextLine());
            System.out.print("Giá sản phẩm: ");
            p1.setPrice(sc.nextDouble());
            sc.nextLine();
            // In ra thông tin sản phẩm
            xuat(p1);
        }		
    }

    static void xuat(Product p) {
        System.out.println(">> THONG TIN SAN PHAM <<");
        System.out.printf("Tên: %s - Giá: %.2f - Thuế: %.2f\n",
                p.getName(), p.getPrice(), p.getImportTax());
    }
}
	
