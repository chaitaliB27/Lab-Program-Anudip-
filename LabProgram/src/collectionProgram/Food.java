package collectionProgram;

public class Food implements Comparable<Food>{
private Integer foodId;
private String foodName;
private String foodType;
private Integer foodPrice;
private Integer foodRating;

public Integer getFoodId() {
	return foodId;
}

public void setFoodId(Integer foodId) {
	this.foodId = foodId;
}

public String getFoodName() {
	return foodName;
}

public void setFoodName(String foodName) {
	this.foodName = foodName;
}

public String getFoodType() {
	return foodType;
}

public void setFoodType(String foodType) {
	this.foodType = foodType;
}

public Integer getFoodPrice() {
	return foodPrice;
}

public void setFoodPrice(Integer foodPrice) {
	this.foodPrice = foodPrice;
}

public Integer getFoodRating() {
	return foodRating;
}

public void setFoodRating(Integer foodRating) {
	this.foodRating = foodRating;
}

public Food(Integer foodId, String foodName, String foodType, Integer foodPrice, Integer foodRating) {
	super();
	this.foodId = foodId;
	this.foodName = foodName;
	this.foodType = foodType;
	this.foodPrice = foodPrice;
	this.foodRating = foodRating;
}

public Food() {
	super();
}

@Override
public String toString() {
	return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodType=" + foodType + ", foodPrice=" + foodPrice
			+ ", foodRating=" + foodRating + "]";
}

@Override
public int compareTo(Food o) {
	// TODO Auto-generated method stub
	return this.foodPrice.compareTo(o.foodPrice);
}

}
