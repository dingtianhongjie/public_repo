package work04;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Monster m = new Monster();
		
		System.out.println("名前は？");
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("初期HPは？");
		int hp = new java.util.Scanner(System.in).nextInt();
		
		h.name = name;
		h.hp = hp;
		
		System.out.println("武器を選択してください");
		System.out.println("=================");
		System.out.println("1:剣  2:斧  3:やり");
		System.out.println("=================");
		int select = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(h.name + "が生まれた");
		
		Buki b = new Buki(select);
		h.buki = b;
		h.monster = m;
		m.hero = h;
		
		System.out.println("武器は " + h.buki.name + "、攻撃力は " + h.buki.point +" です");
		System.out.println();
		
		System.out.println(m.monsterName + " が現れた");
		System.out.println();
		
		for (int i = 0; i != 3;){
			System.out.println("何をしますか？");
			System.out.println("HP: " + h.hp);
			System.out.println("=====================");
			System.out.println("1:戦う　2:休む　3:逃げる");
			System.out.println("=====================");
			int choice = new java.util.Scanner(System.in).nextInt();
		
			switch (choice) {
			case 1:
				h.attack();
				i = choice;
				break;
			case 2:
				System.out.println("何秒休みますか？");
				int sec = new java.util.Scanner(System.in).nextInt();
				h.sit(sec);
				i = choice;
				break;
			case 3:
				h.run();
				i = choice;
				break;
			default:
				System.out.println("ミス");
			}
			
				if (choice == 3) {
					break;
				}
			
				if(m.hp <= 0) {
					System.out.println(m.monsterName + " を倒した");
					break;
				}
			
				System.out.println("-------");
				m.attack();
				System.out.println("-------");
			
				if (h.hp <= 0) {
					System.out.println(h.name + " は死んでしまった");
					break;
				}
			
			}
	}
}
