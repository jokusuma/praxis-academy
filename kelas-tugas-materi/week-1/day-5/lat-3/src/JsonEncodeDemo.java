//download dari https://github.com/fangyidong/json-simple , lalu di copy folder "org" yg ada di dlm "src/main"
//lalu masukkan folder "org" tsb ke dlm folder src kita
import org.json.simple.JSONObject;

class JsonEncodeDemo {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
   }
}