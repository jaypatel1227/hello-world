// Created by: Jay Patel
// Tests the majority of possibilities using the AnimalList class
public class AnimalListRunner {
    public static void main(String[] args){
        System.out.println("This runner works like Mr. Mckeen's runner except the format is not as good :)");
        // creates the AnimalList used in the testing
        AnimalList one = new AnimalList(); // full list
        AnimalList two = new AnimalList(); // null at the end
        AnimalList three = new AnimalList(); // null
        // test addAnimal
        one.addAnimal("alpaca");
        one.addAnimal("bear");
        one.addAnimal("cat");
        one.addAnimal("dog");
        one.addAnimal("elephant");
        one.addAnimal("alligator");
        one.addAnimal("bear");
        two.addAnimal("alpaca");
        // test removeAnimal
        System.out.println("The following should display false, true, true, true:\n" + three.removeAnimal("hello"));
        System.out.println(one.removeAnimal("bear"));
        System.out.println(one.removeAnimal("alligator"));
        System.out.println(two.removeAnimal("alpaca") + "\n\nThe following should display alpaca, bear, cat, dog, elephant, and three empty lines:");
        // test displayList should display:
        one.displayList();
        two.displayList();
        three.displayList();
        // test getnumAddRemove() should display:
        System.out.println("The following should display 9, 2, 0:\n" + one.getnumAddRemove());
        System.out.println(two.getnumAddRemove());
        System.out.println(three.getnumAddRemove());
    }
}
