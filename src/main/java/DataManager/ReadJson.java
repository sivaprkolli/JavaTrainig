package DataManager;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJson {
    public static void main(String args[]) throws IOException, ParseException {
        sampleJson();
        Object obj = new JSONParser().parse(new FileReader(System.getProperty("user.dir") + "/TestData/JsonData.json"));
        JSONObject jsonObject = (JSONObject) obj;

        String name = (String) jsonObject.get("College");

        System.out.println("College :: " + name);
    }

    public static void sampleJson(){
        JSONObject j = new JSONObject();
        j.put("Name", "Kolli");
        j.put("College", "BITS");
        j.put("Branch" , "Computer science engineering");
        j.put("Section", "CSE-C");
        System.out.println(j);
    }

}
