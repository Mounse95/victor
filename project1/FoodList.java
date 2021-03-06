package project1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FoodList {

	private ArrayList<Food> list;
	private int max;
	
	/**
	 * Default constructor, will set the list threshold to 10 items
	 */
	public FoodList() {
		this.max = 10;
		this.list = new ArrayList<Food>();
	}

	/**
	 * Will set the list threshold to max
	 * @param  max	maximum number of items
	 */
	public FoodList(int max) {
		this.max = max;
		this.list = new ArrayList<Food>(this.max);
	}

	/**
	 * Add a food to the list
	 * @param  food	name of the food to be added
	 * @param  calories	number of calories of the food
	 * @throws IOException 
	 */
	public void addFood(String food, int calories) throws IOException {
		Food f = new Food(food, calories);
		
		if (this.list.size() == 0) {
			this.list.add(f);
		} else {
			for (int i = 0 ; i < this.list.size() ; i++) {
				if (calories >= this.list.get(i).getCalories()) {
					if (this.list.size() == max) {						
						this.list.remove(this.list.size() - 1);
					}
					this.list.add(i, f);
					break;
				}
			}
		}
		
		this.retainState();
	}

	/**
	 * Gives the size of the list
	 * @return the size of the list
	 */
	public int size() {
		return this.list.size();
	}

	/**
	 * Gives the i-th element of the list
	 * @param  i	the rank of the wanted element
	 * @return		the corresponding element
	 */
	public Food get(int i) {
		return this.list.get(i);
	}

	private void retainState() throws IOException {
		File f = new File("last_FoodList_state.log");
		f.delete();
		f.createNewFile();

		FileWriter fw = new FileWriter(f);
		for (int i = 0 ; i < this.list.size() ; i++) {
			fw.write(this.list.get(i).getName() + " ");
			String c = this.list.get(i).getCalories() + "\n";
			fw.write(c);
		}
		fw.close();
	}

}
