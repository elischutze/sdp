package designpatterns1.factorypattern;

/**
 * Created by elianne on 19/01/2016.
 */
public class CreateProductWithFactory {

    public static void main(String[] args) {

        Creator fact = Creator.getInstance();
        Product myProduct = fact.getProduct();

    }
}
