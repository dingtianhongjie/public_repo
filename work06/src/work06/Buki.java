package work06;

public class Buki {
	String bukiName;
	int point;
//	int atPoint;
	
	Buki(int select){
		switch(select) {
		case 1:
			this.bukiName = "剣";
			this.point = 10;
			break;
		case 2:
			this.bukiName = "斧";
			this.point = 20;
			break;
		case 3:
			this.bukiName = "やり";
			this.point = 30;
			break;
		default:
			this.bukiName = "すで";
			this.point = 5;
		}
	}
}
