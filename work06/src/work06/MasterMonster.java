package work06;

public class MasterMonster {
	private String monName;
	private int monHp;
	private int monAttackPoint;
	private int tmpPoint;
	int atPoint;
	int i;
	Hero hero;
	
	MasterMonster() {
		i = new java.util.Random().nextInt(3);
		
		switch(i) {
		case 0:
			this.monName = "junior dragon";
			this.monHp = 100;
			this.monAttackPoint = 10;
			break;
		case 1:
			this.monName = "dragon";
			this.monHp = 200;
			this.monAttackPoint = 20;
			break;
		case 2:
			this.monName = "senior dragon";
			this.monHp = 300;
			this.monAttackPoint = 30;
			break;
		default:
			this.monName = "Ultra dragon";
			this.monHp = 1000;
			this.monAttackPoint = 100;
			
		}
	}

	// getter
	public String getMonName() {
		return this.monName;
	}
	
	public int getMonHp() {
		return this.monHp;
	}
	
	public int getMonAttackPoint() {
		return this.monAttackPoint;
	}
	
	public void setMonHp(int monHp) {
		this.monHp = monHp;
	}

	void attackMon() {
		tmpPoint = new java.util.Random().nextInt(this.monAttackPoint / 2);
		atPoint = tmpPoint + (this.monAttackPoint / 2) + 1;
		
		System.out.println(this.monName + " の攻撃");
		System.out.println(hero.getName() + " に " + atPoint + " のダメージ");
		
		hero.heroHp -= atPoint;
	}
}
