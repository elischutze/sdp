package designpatterns1.factorypattern;

/**
 * Created by elianne on 19/01/2016.
 */
public interface Creator {


   static Creator getInstance(){
       return new ConcreteCreator();
   };



}
