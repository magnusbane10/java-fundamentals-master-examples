package loop.for_each;

public class Example1 {

    public static void main(String[] args) {

        Animal dog = new Animal();
        Animal cat = new Animal();

        Animal[] animals = {dog, cat};

        for (Animal a: animals) {
            System.out.println(a);
        }

    }

}

class Animal {

    // empty class only for explanation

}
