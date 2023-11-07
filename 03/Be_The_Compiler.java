/*
 * 
 * class Books {
 * String title;
 * String author;
 * }
 * 
 * class BooksTestDrive {
 * public static void main(String [] args) {
 * Books [] myBooks = new Books[3];
 * int x = 0;
 * myBooks[0].title = “The Grapes of Java”;
 * myBooks[1].title = “The Java Gatsby”;
 * myBooks[2].title = “The Java Cookbook”;
 * myBooks[0].author = “bob”;
 * myBooks[1].author = “sue”;
 * myBooks[2].author = “ian”;
 * while (x < 3) {
 * System.out.print(myBooks[x].title);
 * System.out.print(“ by “);
 * System.out.println(myBooks[x].author);
 * x = x + 1;
 * }
 * }
 * }
 * 
 * //The Book objects can only be created by calling the new Books();
 */

/*
 * 
 * class Hobbits {
 * String name;
 * public static void main(String [] args) {
 * Hobbits [] h = new Hobbits[3];
 * int z = 0;
 * while (z < 4) {
 * z = z + 1;
 * h[z] = new Hobbits();
 * h[z].name = “bilbo”;
 * if (z == 1) {
 * h[z].name = “frodo”;
 * }
 * if (z == 2) {
 * h[z].name = “sam”;
 * }
 * System.out.print(h[z].name + “ is a “);
 * System.out.println(“good Hobbit name”);
 * }
 * }
 * }
 * //since we're pre-incrementing the z value before acessing array variable, we would have to init with z = -1
 */