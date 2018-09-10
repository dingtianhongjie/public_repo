package work04;

public class Monster {
	String monsterName = "dragon";
	int point;
//	int point = new java.util.Random().nextInt(31);
	int hp = 100;
	Hero hero;
	
	void attack() {
		point = new java.util.Random().nextInt(11);
		point = point + 20;
		
		System.out.println(this.monsterName + " の攻撃");
		System.out.println(hero.name + " に " + this.point + " のダメージ");

		hero.hp -= this.point;
//		System.out.println(hero.name + "のHPが " + hero.hp + " になった");
	}
}
