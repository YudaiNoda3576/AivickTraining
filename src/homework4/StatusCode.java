package homework4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StatusCode {
	
	private static Map<Integer, String> errorResponse = new HashMap<>() {
		{
			this.put(100, "Continue");
			this.put(200, "OK");
			this.put(202, "Accepted");
			this.put(204, "No content");
			this.put(300, "Multiple Choice");
			this.put(302, "Found");
			this.put(402, "Payment Required");
			this.put(404, "NotFound");
			this.put(502, "Bad Gateway");
		}		
	};
	
	
	static String errorMessage(int code) {
		return errorResponse.get(code);
	
	}
	
	
	
}
