public class Earth {

    public static void main(String[] args) {

        //Instance variable
        Human tom;

        tom = new Human();
        tom.name = "Tom";
        tom.age = 5;
        tom.heightInInches = 36;
        tom.eyeColor = "Brown";

        tom.speak();

        Human human1 = new Human("Joe", 25, 72, "Blue");
        Human human2 = new Human("Billy",46,68,"Hazel");

        human1.speak();
        human2.speak();



    }
}
