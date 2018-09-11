package work06;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		MasterMonster mMon = new MasterMonster();
		
		System.out.println("名前を入力してください？");
		String name = new java.util.Scanner(System.in).nextLine();
		
		h.setName(name);
		
		System.out.println("武器を選択してください");
		System.out.println("=================");
		System.out.println("1:剣  2:斧  3:やり");
		System.out.println("=================");
		int select = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(h.getName() + " が生まれた");
		System.out.println("初期HPは " + h.heroHp);
		
		Buki b = new Buki(select);
		h.buki = b;
		h.monster = mMon;
		mMon.hero = h;
		
		System.out.println("武器は " + h.buki.bukiName + "、攻撃力は " + h.buki.point +" です");
		System.out.println();
		
		System.out.println(mMon.getMonName() + " が現れた");

		System.out.println();
		
		for (int i = 0; i != 3;){
			System.out.println("何をしますか？");
			System.out.println("HP: " + h.heroHp);
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
				h.sit();
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
			
				if(mMon.getMonHp() <= 0) {
					System.out.println(mMon.getMonName() + " を倒した");
					break;
				}
			
				System.out.println("-------");
				mMon.attackMon();
				System.out.println("-------");
			
				if (h.heroHp <= 0) {
					System.out.println(h.getName() + " は死んでしまった");
					break;
				}
			
			}

	}

}
