package work04;

public class Buki {
	String name;
	int point;
//	int atPoint;
	
	Buki(int select){
		switch(select) {
		case 1:
			this.name = "剣";
			this.point = 10;
//			atPoint = new java.util.Random().nextInt(6);
//			this.atPoint = atPoint + 5;
			break;
		case 2:
			this.name = "斧";
			this.point = 20;
			break;
		case 3:
			this.name = "やり";
			this.point = 30;
			break;
		default:
			this.name = "すで";
			this.point = 5;
			
		}
		

	}
}
