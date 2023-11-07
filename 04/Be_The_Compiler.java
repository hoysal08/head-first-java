/*
 * class XCopy {
 * public static void main(String [] args) {
 * int orig = 42;
 * XCopy x = new XCopy();
 * int y = x.go(orig);
 * System.out.println(orig + “ “ + y); }
 * int go(int arg) {
 * arg = arg * 2;
 * return arg; }
 * }
 * 
 * //The orginal value (orig) is not overwritten as the java uses pass by value
 */

/*
 * 
 * class Clock {
 * String time;
 * void setTime(String t) {
 * time = t;
 * }
 * void getTime() {
 * return time;
 * }
 * }
 * class ClockTestDrive {
 * public static void main(String [] args) {
 * Clock c = new Clock();
 * c.setTime("1245");
 * String tod = c.getTime();
 * System.out.println("time: " + tod);
 * }
 * }
 * 
 * //The return type of the getter getTime shouldn't be void
 */