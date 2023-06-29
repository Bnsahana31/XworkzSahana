class FoodRun
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Food name = new Food();
        Food type = new Food();
        Food origin = new Food();
        Food ingredients = new Food();
        Food allergens = new Food();
        Food isVegetarian = new Food();
        Food isVegan = new Food();
        Food isGlutenFree = new Food();
        Food isSpicy = new Food();
        Food isSweet = new Food();
        Food isSalty =new Food();
	}
}
class Food
{
	Food()
	{
		System.out.println("Running const Food");
	}
}
	