package hashmanp;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String, String>();
		
		map1.put("name", "이름");
		map1.put("phone", "폰");
		map1.put("address", "주소");
		map1.put("height", "키");
		map1.put("weight", "몸무게");
		
		System.out.println(map1);
		map1.put("name", "다른이름");
		System.out.println(map1);
		
		Controller controll = new Controller();
		controll.setHAshMap(map1);
	}

}
