package package_lab1;

public class NoTaxProduct extends Product{
    @Override
    public double getImportTax() {
        return 0;
    }
}
