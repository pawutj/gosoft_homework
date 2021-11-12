
package project_ecom;

import java.util.ArrayList;

public class State {
    public boolean isMain = true;
    public boolean isAdmin = false;
    public ArrayList<Product> shoppingCart;

    public State() {
        shoppingCart = new ArrayList<Product>();
    }

    public static State getInstance() {
        if (instance == null)
            instance = new State();
        return instance;

    }

    public void addProductToCart(Product product) {
        this.shoppingCart.add(product);
    }

    public void showAllProduct() {
        for (int i = 0; i < shoppingCart.size(); i++) {
            Product temp = shoppingCart.get(i);
            System.out.printf("ID :%s , Name : %s , Price : %d\n", temp.ID, temp.Name, temp.Price);
        }
    }

    public void removeProductFromCart(String ID) {
        this.shoppingCart.removeIf(p -> p.ID == ID);
    }

}
