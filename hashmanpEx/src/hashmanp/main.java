package hashmanp;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String, String>();
		
		map1.put("name", "�̸�");
		map1.put("phone", "��");
		map1.put("address", "�ּ�");
		map1.put("height", "Ű");
		map1.put("weight", "������");
		
		System.out.println(map1);
		map1.put("name", "�ٸ��̸�");
		System.out.println(map1);
		
		Controller controll = new Controller();
		controll.setHAshMap(map1);
	}

}
