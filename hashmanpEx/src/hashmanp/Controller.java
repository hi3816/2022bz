package hashmanp;

import java.util.HashMap;

public class Controller {
	public void setHAshMap(HashMap<String,String> map) {
		System.out.println("�̸� : "+map.get("name"));
		System.out.println("�ּ� : "+map.get("address"));
		System.out.println("�ڵ�����ȣ : "+ map.get("phone"));
	}
}
