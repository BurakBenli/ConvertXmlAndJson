import org.json.JSONObject;
import org.json.XML;

public class Xml2Json {

    private static final int INDECT_FACTOR = 4;

    public static void main(String[] args) {

        String xmlString = "<note><to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend!</body></note>";

        JSONObject jsonObject = XML.toJSONObject(xmlString);

        String jsonResultString = jsonObject.toString(INDECT_FACTOR);

        System.out.println(jsonResultString);

    }
}
