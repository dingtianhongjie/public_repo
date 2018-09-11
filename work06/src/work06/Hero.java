package work06;

public class Hero {
	private String heroName;
	int heroHp;
	int heroAttackPoint;
	int i;
	int a;
	int atPoint;
	int tmpPoint;
	Buki buki;
	MasterMonster monster;
	
	public void setName(String heroName) {
		this.heroName = heroName;
	}
	
	public String getName() {
		return this.heroName;
	}

	Hero(){
		i = new java.util.Random().nextInt(100);
		this.heroHp = i + 50;
	}
	
	void attack() {
		if(buki.bukiName.equals("すで")) {
			a = buki.point + 1;
			atPoint = new java.util.Random().nextInt(a);
		}else {
			a = buki.point / 2;
			atPoint = new java.util.Random().nextInt(a);
			atPoint = atPoint + a + 1;
		}

		System.out.println(this.heroName + " の攻撃");
		System.out.println(monster.getMonName() + " に " + atPoint + " のダメージ");
		tmpPoint = monster.getMonHp() - atPoint;
		monster.setMonHp(tmpPoint);
	}
	
	void sit() {
		int sec = new java.util.Random().nextInt(91);
		sec = sec + 10;
		this.heroHp += sec;
		System.out.println(this.heroName + "は、" + sec + "秒座った");
		System.out.println("HPが " + sec + " ポイント回復して " + this.heroHp + " になった");
	}
	
	void run() {
		System.out.println(this.heroName + "は逃げ出した");
	}
}
