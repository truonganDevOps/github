package package_lab7;

public class Lab7Bai1Student {

    public String fullname;
    public Lab7Bai1Career lab7Bai1Career;

    public void print() {
        System.out.println(">Fullname: " + this.fullname);
        switch (this.lab7Bai1Career) {
            case PTPM:
                System.out.println(">Career: Phát Triển Phần Mềm");
                break;
            case TKTW:
                System.out.println(">Career: Thiết kế trang web");
                break;
            case LTDĐ:
                System.out.println(">Career: Lập trình di động");
                break;
            case TKĐH:
                System.out.println(">Career: Thiết kế đồ họa");
                break;
        }
    }
    public static void main(String[] args) {
        Lab7Bai1Student sv = new Lab7Bai1Student();
        sv.fullname = "Nguyễn Văn Trường An";
        sv.lab7Bai1Career = Lab7Bai1Career.PTPM;
        sv.lab7Bai1Career = Lab7Bai1Career.valueOf("PTPM");
        sv.print();
    }
}