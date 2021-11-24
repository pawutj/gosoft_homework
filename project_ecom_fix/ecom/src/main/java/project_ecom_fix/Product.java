package project_ecom_fix;

public class Product extends ProductAbstract implements showDetailAble {
    public int Price;

    public Product(String ID, String Name, int Price) {
        this.Price = Price;
        super.ID = ID;
        super.Name = Name;
    }

    public void showDetail() {
        System.out.printf("ID: %s NAME: %s Price: %d\n", super.ID, super.Name, this.Price);
    }
}
