import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class JsonEncodeDemo {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", 100);
      obj.put("balance", 1000.21);
      obj.put("is_vip", true);

      System.out.println(obj);
      
      JSONObject jsonArray[] = new JSONObject[5];
      jsonArray[0]=obj;
      jsonArray[1]=new JSONObject();
      jsonArray[2]=new JSONObject();
      jsonArray[3]=new JSONObject();
      jsonArray[4]=new JSONObject();
    
      jsonArray[0].put("name", "foo");
      jsonArray[0].put("num", 100);
      jsonArray[0].put("balance", 1000.21);
      jsonArray[0].put("is_vip", true);

      //System.out.println(jsonArray[0]);
      StringWriter out = new StringWriter();
      try {
    	  jsonArray[0].writeJSONString(out);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      String jsonText = out.toString();
      System.out.print(jsonText);

   }
}