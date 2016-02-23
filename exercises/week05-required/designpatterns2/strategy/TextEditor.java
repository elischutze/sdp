package designpatterns2.strategy;

/**
 * Created by elianne on 02/02/2016.
 */
public class TextEditor {
    public TextFormatter formatter;
    String text;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text){
        formatter.format(text);
    }



}
