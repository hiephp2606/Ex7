package entities;

public class BizStudent extends TechmasterStudent{
    private static int autoId;
    private int id;
    private double marketing;
    private double sales;

    public BizStudent(String fullName, String major, double marketing, double sales) {
        super(fullName, major);
        this.id = ++autoId;
        this.marketing = marketing;
        this.sales = sales;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getPoint() {
        return (2*marketing + sales)/3;
    }

    @Override
    public String toString() {
        return "BizStudent [ " +
                "name: " + getFullName() +
//                ", id:" + id +
                ", major: " + getMajor() +
                ", marketing: " + marketing +
                ", sales: " + sales +
                ", classify: " + classify() +
                " ]";
    }
}
