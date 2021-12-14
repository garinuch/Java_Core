
class Leson6HomeWork {
    public static void main(String[] args) {
        Animal.Cat cat = new Animal.Cat(200);
        Animal.Dog dog = new Animal.Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(201));
            System.out.println(animal.run(501));
            System.out.println(animal.run(5));
            System.out.println(animal.run(15));
        }
        System.out.println("Dog and Сat : " + Animal.getCountOfAnimals());
    }
}

interface IAnimal {
    String run(int dist);
    String swim(int dist);
}

abstract class Animal implements IAnimal {
    protected int runLims;
    protected int swimLims;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int runLims, int swimLims) {
        this.runLims = runLims;
        this.swimLims = swimLims;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }


    @Override
    public String toString() {
        return className + "runLims; " + ", swimLims: " + swimLims;
    }

    static class Dog extends Animal {

        Dog(int runLims, int swimLims) {
            super(runLims, swimLims);
        }
    }

    static class Cat extends Animal {

        Cat(int runLims, int swimLims) {
            super(runLims, swimLims);
        }

        Cat (int runLims) {
            super(runLims, -1);
        }

        @Override
        public String swim(int dist) {
            return getClassName() + " can't swim";
        }
    }


    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int dist) {
        if (dist > runLims) {
            return className + " couldn't run " + dist;
        } else {
            return className + " run away  " + dist;
        }
    }

    @Override
    public String swim(int dist) {
        if (dist > swimLims) {
            return className + " couldn't swim" + dist;
        } else {
            return className + " successfully swim" + dist;
        }
    }

}