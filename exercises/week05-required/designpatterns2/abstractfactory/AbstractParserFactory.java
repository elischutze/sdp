import com.sun.deploy.xml.XMLParser;

public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);
}

class NYCFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {

        return new XMLParser();
    }
}

class LondonFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {
        return new XMLParser(parserType);
    }
}

