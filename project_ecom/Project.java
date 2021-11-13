package project_ecom;

import java.util.Scanner;

public class Project {
    public static Scanner input = new Scanner(System.in);

    public static void readCommand(State state, ProductList productList) {
        if (state.isMain == true) {
            readCommandMain(state, productList);
        } else

        if (state.isAdmin) {
            readAdminCommand(state, productList);
        } else if (!state.isAdmin) {
            readCustomerCommand(state, productList);
        }

    }

    public static void readCommandMain(State state, ProductList productList) {
        System.out.println("What do you want to do?\n 1.Customer \n 2.Seller \n");

        int n = input.nextInt();
        state.isMain = false;
        state.isAdmin = n == 2 ? true : false;
        readCommand(state, productList);
    }

    public static void CustomerAddProductToCart(State state, ProductList productList) {
        System.out.println("What Product id which you want?");

        int i = input.nextInt();
        System.out.println(i);
        String s = String.valueOf(i);
        Product p = productList.getProduct(s);
        state.addProductToCart(p);

        System.out.println("done");
    }

    public static void CustomerRemoveProductFromCart(State state, ProductList productList) {
        System.out.println("What Product id which you remove?");

        int i = input.nextInt();
        String s = String.valueOf(i);
        state.removeProductFromCart(s);

        System.out.println("done");
    }

    public static void SellerAddProduct(State state, ProductList productList) {
        System.out.println("What Product ID which you want to add?");
        String s1 = input.next();
        System.out.println("Name?");
        String s2 = input.next();
        System.out.println("Price?");
        int s3 = input.nextInt();

        Product p = new Product(s1, s2, s3);

        productList.addProduct(p);

        System.out.println("done");
    }

    public static void SellerRemoveProduct(State state, ProductList productList) {
        System.out.println("What Product ID which you want to Remove?");
        String s1 = input.next();
        productList.removeProduct(s1);

        System.out.println("done");
    }

    public static void readCustomerCommand(State state, ProductList productList) {
        System.out.println(
                "What do you do?\n 0.Show All Product in Shop\n 1.Show All Product In Cart\n 2.Add Product to Cart\n 3.Remove Product From Cart\n 4.Back to main");

        int n = input.nextInt();
        if (n == 0)
            productList.showAllProduct();
        if (n == 1)
            state.showAllProduct();
        if (n == 2) {
            CustomerAddProductToCart(state, productList);
        }
        if (n == 3) {
            CustomerRemoveProductFromCart(state, productList);
        }

        if (n == 4) {
            state.isMain = true;
        }

        readCommand(state, productList);

    }

    public static void readAdminCommand(State state, ProductList productList) {
        System.out.println("What do you do?\n 0.Show All Product\n 1.Add Product\n 2.Remove Product\n 3.Back to main");
        int n = input.nextInt();
        if (n == 0)
            productList.showAllProduct();
        if (n == 1)
            SellerAddProduct(state, productList);
        if (n == 2)
            SellerRemoveProduct(state, productList);
        if (n == 3)
            state.isMain = true;
        readCommand(state, productList);
    }

    public static void main(String[] args) {
        ProductList productList = new ProductList();
        State state = new State();
        Product test = new Product("123", "test", 123);
        Product test2 = new Product("113", "test", 123);

        productList.addProduct(test);
        productList.addProduct(test2);
        productList.getProduct("123");
        readCommand(state, productList);

    }

}
