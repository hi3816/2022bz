package mid_practice4;

public class main {

	public static void main(String[] args) {
		
		System.out.println("456 겹치지않게 채워넣기 프로그램 시작!");
		
		int [][] nArray = new int [3][3];
		nArray[0][0] = 6;
		nArray[0][2] = 4;
		nArray[1][1] = 4;
		nArray[2][1] = 6;
		nArray[2][2] = 5;
		
		//int widthTotal1 = 0;
		
		
		
		while()
		//가로 비교
		for(int j = 0; j<3; j++) {
			
			int widthTotal = 0;
			for (int i = 0; i < 3; i++) {
				widthTotal += nArray[j][i];
			}
			
			//System.out.println(widthTotal1);
			
			for (int i = 0; i < 3; i++) {
				if (9 <= widthTotal && widthTotal <= 11) {
					if(nArray[j][i]==0) {
						nArray[j][i] = 15 - widthTotal;
					}
				}
			}
		}
		
		
		//세로비교
		for(int j = 0; j<3; j++) {
			int heightTota = 0;
			for (int i = 0; i < 3; i++) {
				heightTota += nArray[i][j];
			}
			
			//System.out.println(heightTota);
			
			for (int i = 0; i < 3; i++) {
				if (9 <= heightTota && heightTota <= 11) {
					if(nArray[i][j]==0) {
						nArray[i][j] = 15 - heightTota;
					}
				}
			}
		}
		
		
		for(int i = 0; i <3; i++) {
			for(int j = 0; j <3; j++) {
				System.out.print(nArray[i][j]+" ");
			}System.out.println();
		}
		

		
		
		
		/*
		int intSample = 10;
		String stringSample = "20";
		
		String s = Integer.toString(intSample);
		String s2 = String.valueOf(intSample);
		System.out.println("데이터타입 : " +s.getClass().getName() + " 값 : " + s);
		System.out.println("데이터타입 : " +s2.getClass().getName() + " 값 : " + s2);
		
		Integer i = Integer.valueOf(stringSample); // getClass() 사용하려 Integer에 넣음
		int i2 = Integer.valueOf(stringSample);
		System.out.println("데이터타입 : " +i.getClass().getName() + " 값 : " + i);
		*/
	}

}
