/*Clas for building doll toys*/

package toy;

public class Doll extends Toy{

    int age;

    public Doll(String name, int winRate, int age, int qty) {
        super(name, winRate, qty);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Doll: " + super.toString() + "; Age to play from : " + getAge() + "years" ;
    }
}
