/**
 * Created by elianne on 02/02/2016.
 */


public class ParserFactoryProducer implements AbstractFactoryProducer {

    AbstractParserFactory getFactory(String factory){

        if(factory=="NYCFactory") {
            return new NYCFactory();
        } else if (factory=="LondonFactory") {
            return new LondonFactory();
        } else {
            System.out.println("That is not a valid Factory! ");
        }



    }



}
