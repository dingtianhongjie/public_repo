package work04;

public class Hero {
	String name;
	int hp;
	int atPoint;
	int a;
	Buki buki;
	Monster monster;
	
	void attack() {
		if(buki.name.equals("すで")) {
			a = buki.point + 1;
			atPoint = new java.util.Random().nextInt(a);
		}else {
			a = buki.point / 2;
			atPoint = new java.util.Random().nextInt(a);
			atPoint = atPoint + a + 1;
		}

		System.out.println(this.name + " の攻撃");
		System.out.println(monster.monsterName + " に " + atPoint + " のダメージ");
		monster.hp -= atPoint;
	}
	
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが " + sec + " ポイント回復して " + this.hp + " になった");
	}
	
	void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
