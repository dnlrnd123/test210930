package AssessmentTest_Collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
// �ȳ��ϼ���

public class UsingHashMap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		System.out.print("�ο���>>");
		int inputTotalNumber = scan.nextInt();
		String bf = scan.nextLine(); //enter���� �����ֱ� �����̴�. 
		for (int i = 0; i < inputTotalNumber; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
			String inputNameNumber = scan.nextLine();
			StringTokenizer st = new StringTokenizer(inputNameNumber," "); // ��ũ�������� line���� name�� telNumber�� �����ش�.
			String name = st.nextToken();
			String telNumber = st.nextToken();
			map.put(name, telNumber); // �ؽ��ʿ� �־��ش�.
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String searchName = scan.next();
			if (searchName.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if (map.get(searchName) == null) {
				System.out.println(searchName+" �� �����ϴ�.");
			}else {
				System.out.println(searchName+"�� ��ȣ�� "+map.get(searchName)+ " �Դϴ�.");
			}
		}
		scan.close(); // �ڿ� �ݳ�
	}
}
