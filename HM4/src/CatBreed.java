//task 3

public class CatBreed {

    private Cat cat; //Has-a
    public CatBreed(Cat cat){
        this.cat = cat;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        CatBreed persian = new CatBreed(myCat);

    }
}
