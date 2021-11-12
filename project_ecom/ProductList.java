package project_ecom;

import java.util.HashMap;
import java.util.Iterator;

public class ProductList {
    public HashMap<String, Product> ProductHashMap;

    public ProductList() {
        this.ProductHashMap = new HashMap<>();
    }

    public void addProduct(Product temp) {
        this.ProductHashMap.put(temp.ID, temp);
    }

    public void removeProduct(String ID) {
        this.ProductHashMap.remove(ID);
    }

    public Product getProduct(String ID) {
        Product temp = this.ProductHashMap.get(ID);
        System.out.println("test");
        return temp;
    }

    public void showAllProduct() {
        Iterator<String> itr = ProductHashMap.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            Product temp = ProductHashMap.get(key);
            System.out.printf("ID :%s , Name : %s , Price : %d\n", temp.ID, temp.Name, temp.Price);
        }
    }
}
