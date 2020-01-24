// https://www.thepolyglotdeveloper.com/2015/03/parse-json-file-java/

// package jsonparser;
import java.io.*;
import org.json.*;

public class Reader {

    public static void main(String[] args) {
        String jsonData = readFile("src/a.json");
        JSONObject jobj = new JSONObject(jsonData);
        JSONArray jarr = new JSONArray(jobj.getJSONArray("keywords").toString());
        System.out.println("Name: " + jobj.getString("name"));
        for(int i = 0; i < jarr.length(); i++) {
            System.out.println("Keyword: " + jarr.getString(i));
        }
    }


    public static String readFile(String filename) {
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            result = sb.toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}