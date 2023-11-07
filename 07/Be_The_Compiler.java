public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}

class Monster {

}

class Vampire extends Monster {

}

class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
}

/*
 * 1 -> The method is rightly overridden and will work
 * boolean frighten(int d) {
 * System.out.println(“arrrgh”);
 * return true;
 * }
 * boolean frighten(int x) {
 * System.out.println(“a bite?”);
 * return false;
 * }
 * 
 * 
 * 2 -> The override is illegal as there is return type conflict boolean-> int
 * 
 * boolean frighten(int x) {
 * System.out.println(“arrrgh”);
 * return true;
 * }
 * int frighten(int f) {
 * System.out.println(“a bite?”);
 * return 1; 
 * }
 * 
 * 
 * 3 -> The code will compile but will result different output than expected
 * 
 * boolean frighten(int x) {
 * System.out.println(“arrrgh”);
 * return false;
 * }
 * boolean scare(int x) {
 * System.out.println(“a bite?”);
 * return true;
 * }
 * 
 * 
 * 4-> The code will compile but will result different output than expected
 * 
 * boolean frighten(int z) {
 * System.out.println(“arrrgh”);
 * return true;
 * }
 * boolean frighten(byte b) {
 * System.out.println(“a bite?”);
 * return true;
 * }
 */