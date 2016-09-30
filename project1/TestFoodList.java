package project1;

public class TestFoodList {

	public static void main(String[] args){
		FoodList f = new FoodList();

		// petit test de size
		if (f.size() == 0) {
			//ok
		} else {
			//ko
		}

		// petit test de addFood
		f.addFood("poulet", 3000);
		if (f.size() == 1) {
			//ok
		} else {
			//ko
		}

		return 0;
	}
}
