/*
 * 
 * y = x - y; --> 00 11 21 32 42
 * 
 * y = y + x; --> 00 11 23 36 410
 * 
 * y = y + 2;
 * if( y > 4 ) { --> 02 14 25 36 47
 * y = y - 1;
 * }
 * 
 * x = x + 1;
 * y = y + x; --> 11 34 59
 * 
 * if ( y < 5 ) {
 * x = x + 1;
 * if ( y < 3 ) { --> 02 14 36 48
 * x = x - 1;
 * }
 * }
 * y = y + 2;
 * 
 */