package fileIOEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class main {

	public static void main(String[] args) {
		File pFile = new File("C:\\Users\\������\\Desktop\\test.txt");
		
		
		try {
			FileWriter fileWriter1 = new FileWriter(pFile);
			fileWriter1.write("�ݰ����ϴ�");
			fileWriter1.flush();
			fileWriter1.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//���Ͽ��� �������б�
		
		try {
			FileReader fileReader1 = new FileReader(pFile);
			int read;
			char[] buffer = new char[100];
			while((read = fileReader1.read(buffer)) != -1) {
				String data = new String(buffer, 0 ,read);
				System.out.println(data);
			}
			fileReader1.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
