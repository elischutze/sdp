package designpatterns1.factorypattern;

/**
 * Created by elianne on 19/01/2016.
 */
public class ConcreteCreator implements Creator {

    @Override
    public Product getInstance() {
        return new ConcreteProduct();
    }


}
