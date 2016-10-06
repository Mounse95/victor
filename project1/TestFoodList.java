package project1;

import java.io.IOException;

public class TestFoodList {

	public static int main() throws IOException{
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
