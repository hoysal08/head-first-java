
/*
 * public class GC {
 * public static GC doStuff() {
 * GC newGC = new GC();
 * doStuff2(newGC);
 * return newGC;
 * }
 * public static void main(String [] args) {
 * GC gc1;
 * GC gc2 = new GC();
 * GC gc3 = new GC();
 * GC gc4 = gc3;
 * gc1 = doStuff();
 * // call more methods
 * }
 * public static void doStuff2(GC copyGC) {
 * GC localGC = copyGC;
 * } }
 */

/*
 * 1 copyGC = null; -> false, The copyGC is out of scope
 * 2 gc2 = null; -> true ,This triggers the GC as the reference is set to null
 * and the object is technicaaly lost and out of scope
 * 3 newGC = gc3; -> false ,newGC is out of scope
 * 4 gc1 = null; -> true, gc1 referenced object got lost as we changed the value
 * to null
 * 5 newGC = null; -> false, newGC is out of scope
 * 6 gc4 = null; -> false, g3 still has reference to the object
 * 7 gc3 = gc2; -> false, gc4 is still referencing the object
 * 8 gc1 = gc4; -> true, gc1 reference object is lost
 * 9 gc3 = null; ->false, gc4 is still referencing the object
 * 
 */
