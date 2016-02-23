package designpatterns2.strategy;

public interface TextFormatter {
    void format(String text);
}

class LowerTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        System.out.println(text.toLowerCase());
    }

}
class CapTextFormatter implements TextFormatter{

    @Override
    public void format(String text) {
        System.out.println(text.toUpperCase());
    }
}