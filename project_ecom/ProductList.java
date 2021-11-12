public class ProductList {
    public HashMap<String, Product> ProductHashMap;

    public ProductList() {
        this.ProductHashMap = new HashMap<>();
    }

    public void addProduct(Product temp) {
        this.ProductHashMap.put(temp.ID, temp);
    }

    public void showAllProduct() {
        System.out.println(ProductHashMap);
    }
}
