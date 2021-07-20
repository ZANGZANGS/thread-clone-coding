package thread.ramen;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class RamenProgram {

	public static void main(String[] args) throws Exception {
		int odrRamenCnt;
		
		System.out.println("라면 몇 개 끓일까요?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		odrRamenCnt = Integer.parseInt(br.readLine());
		
		System.out.println(odrRamenCnt + "개 주문 완료! 조리시작!");
		
		
		try{
			RamenCook ramenCook = new RamenCook(odrRamenCnt);
			new Thread(ramenCook,"A").start();
			new Thread(ramenCook,"B").start();
			new Thread(ramenCook,"C").start();
			new Thread(ramenCook,"D").start();
		}catch(Exception e){
			e.printStackTrace();
		}
		 
	}

}
