package AssessmentTest_Collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
// 안녕하세요

public class UsingHashMap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		System.out.print("인원수>>");
		int inputTotalNumber = scan.nextInt();
		String bf = scan.nextLine(); //enter값을 없애주기 위함이다. 
		for (int i = 0; i < inputTotalNumber; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			String inputNameNumber = scan.nextLine();
			StringTokenizer st = new StringTokenizer(inputNameNumber," "); // 토크나이저로 line값을 name과 telNumber로 나눠준다.
			String name = st.nextToken();
			String telNumber = st.nextToken();
			map.put(name, telNumber); // 해쉬맵에 넣어준다.
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			String searchName = scan.next();
			if (searchName.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (map.get(searchName) == null) {
				System.out.println(searchName+" 이 없습니다.");
			}else {
				System.out.println(searchName+"의 번호는 "+map.get(searchName)+ " 입니다.");
			}
		}
		scan.close(); // 자원 반납
	}
}
