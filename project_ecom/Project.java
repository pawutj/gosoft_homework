package project_ecom;

import java.util.Scanner;

public class Project {
    public static Scanner input = new Scanner(System.in);

    public static void readCommand(State state, ProductList productList) {
        if (state.isMain) {
            readCommandMain(state, productList);
        }

        if (state.isAdmin) {
            readAdminCommand(state, productList);
        }
        if (!state.isAdmin) {
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

    public static void readCustomerCommand(State state, ProductList productList) {
        System.out.println(
                "What do you do?\n 0.Show All Product in Shop 1.Show All Product In Cart\n 2.Add Product to Cart\n 3.Remove Product From Cart\n");
    }

    public static void readAdminCommand(State state, ProductList productList) {
        System.out.println("What do you do?\n 0.Show All Product\n 1.Add Product\n 2.Remove Product\n");
    }

    public static void main(String[] args) {

        Product test = new Product("123", "test", 123);
        Product test2 = new Product("113", "test", 123);
        ProductList productList = new ProductList();
        State state = new State();
        productList.addProduct(test);
        productList.addProduct(test2);

        productList.showAllProduct();

        readCommandMain(state, productList);
        // readCustomerCommand(state, productList);
        // readAdminCommand(state, productList);
    }

}
