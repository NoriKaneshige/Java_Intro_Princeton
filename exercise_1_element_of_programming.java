// 1.1.1 Hello, World
// public class exercise_1{
//   public static void main(String[] args){
//     System.out.println("Hello, World");
//   }
// }

// 1.1.2 using a command-line argument
// public class exercise_1 {
//
//     public static void main(String[] args) {
//         System.out.print("Hi, ");
//         System.out.print(args[0]);
//         System.out.println(". How are you?");
//     }
// }
// % javac UseArgument.java
// % java UseArgument Alice
// Hi, Alice. How are you?
// % java UseArgument Bob
// Hi, Bob. How are you?


// public class exercise_1 {
//
//     public static void main(String[] args) {
//         System.out.println("**        ***    **********      **             *             **");
//         System.out.println("**      ***      **        **     **           ***           ** ");
//         System.out.println("**    ***        **         **     **         ** **         **  ");
//         System.out.println("**  ***          **          **     **       **   **       **   ");
//         System.out.println("*****            **          **      **     **     **     **    ");
//         System.out.println("**  ***          **          **       **   **       **   **     ");
//         System.out.println("**    ***        **         **         ** **         ** **      ");
//         System.out.println("**      ***      **        **           ***           ***       ");
//         System.out.println("**        ***    **********              *             *        ");
//     }
// }

// 1.2 Built-in types of data
// public class exercise_1{
//   public static void main(String[] args){
//     System.out.println(2 + 3 + "bc");
//     System.out.println("bc" + 2 + 3);
//   }
// }
// 5bc
// bc23


// 1.2.3Quadratic.java
// public class exercise_1{
//
//     public static void main(String[] args) {
//         double b = Double.parseDouble(args[0]);
//         double c = Double.parseDouble(args[1]);
//
//         double discriminant = b*b - 4.0*c;
//         double sqroot =  Math.sqrt(discriminant);
//
//         double root1 = (-b + sqroot) / 2.0;
//         double root2 = (-b - sqroot) / 2.0;
//
//         System.out.println(root1);
//         System.out.println(root2);
//     }
// }
// *  % java Quadratic -3.0 2.0
// *  2.0
// *  1.0
// *
// *  % java Quadratic -1.0 -1.0
// *  1.618033988749895
// *  -0.6180339887498949
// *
// *  Remark:  1.6180339... is the golden ratio.
// *
// *  % java Quadratic 1.0 1.0
// *  NaN
// *  NaN


// Distance.java
// public class exercise_1 {
//     public static void main(String[] args) {
//
//         // parse x- and y-coordinates from command-line arguments
//         int x = Integer.parseInt(args[0]);
//         int y = Integer.parseInt(args[1]);
//
//         // compute distance to (0, 0)
//         double dist = Math.sqrt(x*x + y*y);
//
//         // output distance
//         System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
//     }
// }


// prints the sum of two random integers between 1 and 6
// public class exercise_1 {
//     public static void main(String[] args) {
//         int SIDES = 6;
//         int a = 1 + (int) (Math.random() * SIDES);
//         int b = 1 + (int) (Math.random() * SIDES);
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
// public class exercise_1 {
//     public static void main(String[] args) {
//         int month = Integer.parseInt(args[0]);
//         int day   = Integer.parseInt(args[1]);
//         boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
//                          || (month == 4 && day >=  1 && day <= 30)
//                          || (month == 5 && day >=  1 && day <= 31)
//                          || (month == 6 && day >=  1 && day <= 20);
//
//         System.out.println(isSpring);
//     }
// }

// Uniform random numbers
// public class exercise_1 {
//     public static void main(String[] args) {
//         int n = 5;
//         double x1 = Math.random();
//         double x2 = Math.random();
//         double x3 = Math.random();
//         double x4 = Math.random();
//         double x5 = Math.random();
//
//         // print 5 values
//         System.out.println(x1);
//         System.out.println(x2);
//         System.out.println(x3);
//         System.out.println(x4);
//         System.out.println(x5);
//
//         // compute stats
//         double min     = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
//         double max     = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
//         double average = (x1 + x2 + x3 + x4 + x5) / n;
//
//         // print stats
//         System.out.println("Average = " + average);
//         System.out.println("Min     = " + min);
//         System.out.println("Max     = " + max);
//     }
// }

// boolean
// class exercise_1{
//   public static void main(String[] args){
//     int grade = 95;
//     boolean isA = (90 <= grade && grade <= 100);
//     System.out.println(isA);
//
//     boolean isTwo = Math.sqrt(2) * Math.sqrt(2) == 2;
//     System.out.println(isTwo);
//   }
// }

// Both divisible by 7?
// public class exercise_1 {
//     public static void main(String[] args) {
//         int x = Integer.parseInt(args[0]);
//         int y = Integer.parseInt(args[1]);
//
//         boolean isDivisible = (x % 7 == 0) && (y % 7 == 0);
//
//         System.out.println(isDivisible);
//     }
// }

// This is the end of 1.2
