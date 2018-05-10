import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JsonExample {
	public static void main(String[] args) {
		JSONObject js=new JSONObject();
		
		js.put("FirstName", "Amol");
		js.put("LastName", "Patil");
		js.put("DOB","30-10-1995");
		
		Map m= new LinkedHashMap(3);
		m.put("City","Udgir");
		m.put("District", "Latur");
		m.put("State", "Maharashtra");		
		js.put("Address", m);
		
		JSONArray ja=new JSONArray();
		m=new LinkedHashMap(2);
		m.put("type", "Home");
		m.put("Number", "7775070019");		
		ja.add(m);		
		m=new LinkedHashMap(2);
		m.put("type", "Work");
		m.put("Number","111214547");
		
		ja.add(m);
		
		js.put("ContactNumbers", ja);
		
		try {
			PrintWriter pw= new PrintWriter("Info.json");
			pw.write(js.toJSONString());
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Succesfully write json file");
	}
}
