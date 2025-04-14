package BAI66;

public class TEST {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        cat.greets(); 

        Dog dog = new Dog("Buddy");
        dog.greets(); 

        Dog anotherDog = new Dog("Rocky");
        dog.greets(anotherDog); 

        BigDog bigDog1 = new BigDog("Max");
        bigDog1.greets(); 

        bigDog1.greets(dog); 

        BigDog bigDog2 = new BigDog("Bruno");
        bigDog1.greets(bigDog2); 
    }
}

