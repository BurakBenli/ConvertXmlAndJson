import org.json.JSONObject;
import org.json.XML;

public class Json2Xml {
    public static void main(String[] args) {

        StringBuilder jsonObj = new StringBuilder("{\"employees\":[\n" +
                "  { \"firstName\":\"John\", \"lastName\":\"Doe\" },\n" +
                "  { \"firstName\":\"Anna\", \"lastName\":\"Smith\" },\n" +
                "  { \"firstName\":\"Peter\", \"lastName\":\"Jones\" }\n" +
                "]}");

        JSONObject json = new JSONObject(jsonObj.toString());

        String xml = XML.toString(json);

        System.out.println("JSON Convert to XML   "  + xml);


    }
}
