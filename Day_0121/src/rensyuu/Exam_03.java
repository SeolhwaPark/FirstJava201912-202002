package rensyuu;

import java.util.Scanner;

class Hak {
	int bun;
	String name;
	int[] score;

	Hak(int bun, String name, int[] score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
}

class HakData {
	Hak[] data;

	HakData() {
	}

	HakData(Hak[] data) {
		this.data = data;
	}

	void totSearch(int sum) { //������ �̿�

	}

	void bunSearch(int tot) { // ��ȣ�� �̿��� �˻�
		for (int x = 0; x < data.length; x++) {
			boolean flag = true;
			if (tot == data[x].bun) {
				System.out.println("��ȣ :" + data[x].bun);
				System.out.println("�̸� :" + data[x].name);
				for (int y = 0; y < data[x].score.length; y++) {
					System.out.println("���� :" + data[x].score[y]);
				}
				flag = false; // �� == 0
				break;
			}
			if (flag) {
				System.out.println("�˻� �Ұ�");
			}
		}
	}
}

public class Exam_03 {
	public static void main(String[] args) {

		Hak[] hak = new Hak[10];
		hak[0] = new Hak(1, "AA", new int[] { 55, 78, 90, 67, 90 });
		hak[1] = new Hak(2, "BB", new int[] { 50, 88, 60, 47, 70 });
		hak[2] = new Hak(3, "CC", new int[] { 99, 98, 91, 97, 98 });
		hak[3] = new Hak(4, "DD", new int[] { 58, 38, 84, 37, 55 });
		hak[4] = new Hak(5, "EE", new int[] { 65, 51, 53, 67, 90 });
		hak[5] = new Hak(6, "FF", new int[] { 37, 82, 40, 89, 91 });
		hak[6] = new Hak(7, "GG", new int[] { 28, 54, 30, 63, 49 });
		hak[7] = new Hak(8, "HH", new int[] { 66, 60, 69, 67, 64 });
		hak[8] = new Hak(9, "II", new int[] { 95, 33, 56, 85, 54 });
		hak[9] = new Hak(10, "JJ", new int[] { 59, 68, 93, 61, 10 });

		HakData data = new HakData(hak);
		Scanner scn = new Scanner(System.in);
		System.out.print("�˻� ��� �л� ��ȣ");
		int bun = scn.nextInt();

		HakData had = new HakData(hak);
		had.bunSearch(bun);
	}

}
