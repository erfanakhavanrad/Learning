package mySelf.superKeyword;

/**
 * @author Erfan Akhavan Rad
 * @created 04/15/2024
 */
  class Cat extends Animal{
    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference) {
        super(age, name);
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Cat is eating.");
    }

    public void jump() {
        super.makeNoise();
        System.out.println("Cat is Jumping.");
    }


}
