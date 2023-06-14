package package_lab8.bai4;

public class ProductManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product p1 = new Product("iPhone9", 1000.0);
        Product p2 = new Product("Samsung Start", 3000.0);
        
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.store();
        
        ProductDAO dao2 = new ProductDAO();
        dao2.load();
        Product p = dao2.find("iPhone9");
        System.out.println(">Name: " + p.name);
        System.out.println(">Price: " + p.price);
    }

}
