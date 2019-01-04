// 1.1.1 Hello, World
// public class exercise_1_element_of_programming{
//   public static void main(String[] args){
//     System.out.println("Hello, World");
//   }
// }

// 1.1.2 using a command-line argument
// public class exercise_1_element_of_programming {
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


// public exercise_1_element_of_programming {
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
// public class exercise_1_element_of_programming{
//   public static void main(String[] args){
//     System.out.println(2 + 3 + "bc");
//     System.out.println("bc" + 2 + 3);
//   }
// }
// 5bc
// bc23


// 1.2.3Quadratic.java
// public class exercise_1_element_of_programming{
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
// public class exercise_1_element_of_programming {
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
// public class exercise_1_element_of_programming {
//     public static void main(String[] args) {
//         int SIDES = 6;
//         int a = 1 + (int) (Math.random() * SIDES);
//         int b = 1 + (int) (Math.random() * SIDES);
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.
// public class exercise_1_element_of_programming {
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
// public class exercise_1_element_of_programming {
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
// class exercise_1_element_of_programming{
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
// public class exercise_1_element_of_programming {
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

// 1.3 Conditionals and Loops
// public class exercise_1_element_of_programming {
//     public static void main(String[] args) {
//         // command-line argument
//         int n = Integer.parseInt(args[0]);
//
//         // compute 1/1 + 1/2 + 1/3 + ... + 1/n
//         double sum = 0.0;
//         for (int i = 1; i <= n; i++) {
//             sum += 1.0 / i;
//         }
//         // print the nth harmonic number
//         System.out.println(sum);
//     }
// }

// Gambler's ruin
// public class exercise_1_element_of_programming {
//     public static void main(String[] args) {
//         int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
//         int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
//         int trials = Integer.parseInt(args[2]);    // number of trials to perform
//         int bets = 0;        // total number of bets made
//         int wins = 0;        // total number of games won
//         // repeat trials times
//         for (int t = 0; t < trials; t++) {
//             // do one gambler's ruin simulation
//             int cash = stake;
//             while (cash > 0 && cash < goal) {
//                 bets++;
//                 if (Math.random() < 0.5) cash++;     // win $1
//                 else                     cash--;     // lose $1
//             }
//             if (cash == goal) wins++;                // did gambler go achieve desired goal?
//         }
//         // print results
//         System.out.println(wins + " wins of " + trials);
//         System.out.println("Percent of games won = " + 100.0 * wins / trials);
//         System.out.println("Avg # bets           = " + 1.0 * bets / trials);
//     }
// }

// 1.4 Arrays
// Coupon Collector
// public class exercise_1_element_of_programming {
//     public static void main(String[] args) {
//         int n = Integer.parseInt(args[0]);       // number of card types
//         boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card i has been collected
//         int count = 0;                           // total number of cards collected
//         int distinct = 0;                        // number of distinct cards
//         // repeatedly choose a random card and check whether it's a new one
//         while (distinct < n) {
//             int value = (int) (Math.random() * n);   // random card between 0 and n-1
//             count++;                                 // we collected one more card
//             if (!isCollected[value]) {
//                 distinct++;
//                 isCollected[value] = true;
//             }
//         }
//
//         // print the total number of cards collected
//         System.out.println(count);
//         System.out.println(isCollected);
//         // why "isCollected" doesn't print
//     }
// }

// How many args!!!???
// public class exercise_1_element_of_programming {
//     public static void main(String[] args) {
//         // number of command-line arguments
//         int n = args.length;
//         // output message
//         System.out.print("You entered " + n + " command-line argument");
//         if (n == 1) System.out.println(".");
//         else        System.out.println("s.");
//     }
// }



// public class exercise_1_element_of_programming {
//     public static void main(String[] args) {
//         // read in frequency of occurrence of n values
//         int n = args.length;
//         int[] freq = new int[n];
//         for (int i = 0; i < n; i++) {
//             freq[i] = Integer.parseInt(args[i]);
//         }
//         // compute total count of all frequencies
//         int total = 0;
//         for (int i = 0; i < n; i++) {
//             total += freq[i];
//         }
//         // generate random integer with probability proportional to frequency
//         int r = (int) (total * Math.random());   // integer in [0, total)
//         int sum = 0;
//         int event = -1;
//         for (int i = 0; i < n && sum <= r; i++) {
//             sum += freq[i];
//             event = i;
//         }
//         System.out.println(event);
//         System.out.println(total);
//         System.out.println(sum);
//     }
// }

// Minesweeper game
// public class exercise_1_element_of_programming {
//     public static void main(String[] args) {
//         int m = Integer.parseInt(args[0]);
//         int n = Integer.parseInt(args[1]);
//         double p = Double.parseDouble(args[2]);
//
//         // game grid is [1..m][1..n], border is used to handle boundary cases
//         boolean[][] bombs = new boolean[m+2][n+2];
//         for (int i = 1; i <= m; i++)
//             for (int j = 1; j <= n; j++)
//                 bombs[i][j] = (Math.random() < p);
//
//         // print game
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++)
//                 if (bombs[i][j]) System.out.print("* ");
//                 else             System.out.print(". ");
//             System.out.println();
//         }
//
//         // sol[i][j] = # bombs adjacent to cell (i, j)
//         int[][] sol = new int[m+2][n+2];
//         for (int i = 1; i <= m; i++)
//             for (int j = 1; j <= n; j++)
//                 // (ii, jj) indexes neighboring cells
//                 for (int ii = i - 1; ii <= i + 1; ii++)
//                     for (int jj = j - 1; jj <= j + 1; jj++)
//                         if (bombs[ii][jj]) sol[i][j]++;
//
//         // print solution
//         System.out.println();
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (bombs[i][j]) System.out.print("* ");
//                 else             System.out.print(sol[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Random walkers
// import java.util.Arrays;
// public class exercise_1_element_of_programming {
//
//     public static void main(String[] args) {
//         int n = Integer.parseInt(args[0]);
//         int[] x = new int[n];         // x positions
//         int[] y = new int[n];         // y positions
//         int cellsToVisit = n*n;       // cells left to visit
//         int steps = 0;                // number of steps taken
//         double r;
//         boolean[][] visited = new boolean[n][n];  // has the i-j been visited?
//         // still true and false are not assigned to "visited"
//         // start at center
//         for (int i = 0; i < n; i++) {
//             x[i] = n/2;
//             y[i] = n/2;
//         }
//         visited[n/2][n/2] = true;
//         cellsToVisit--;
//
//         // repeat until all cells have been visited
//         while (cellsToVisit > 0) {
//             steps++;
//             // move random walker i
//             for (int i = 0; i < n; i++) {
//                 r = Math.random();
//                 if      (r <= 0.25) x[i]++;
//                 else if (r <= 0.50) x[i]--;
//                 else if (r <= 0.75) y[i]++;
//                 else if (r <= 1.00) y[i]--;
//
//                 // check if (x[i], y[i]) is inside N-by-N boundary and has been visited
//                 if (x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]) {
//                     cellsToVisit--;
//                     visited[x[i]][y[i]] = true;
//                 }
//             }
//         }
//         System.out.println(steps);
//         // System.out.println(Arrays.toString(visited));
//     }
// }

// Birthday, I have no idea
// public class exercise_1_element_of_programming {
//
//     public static void main(String[] args) {
//         int days = Integer.parseInt(args[0]);     // number of days
//         int people = 0;                           // total number of people
//
//         //  hasBirthday[d] = true if someone born on day d; false otherwise
//         //  auto-initialized to false
//         boolean[] hasBirthday = new boolean[days];
//         // I think first this boolean array is auto-initiated to false
//         while (true) {
//         // this "true" doesn't mean an element of array is true, instead this true just mean that while the program in while loop works, this means true
//             people++;
//             int d = (int) (days * Math.random());    // integer between 0 and days-1
//             if (hasBirthday[d]) break;               // two people with the same birthday, so break out of loop
//             hasBirthday[d] = true;                   // update array
//         }
//
//         System.out.println(people);
//     }
// }


// 1.5 Input and Output
// I copied and paste the codes from StdOut.java and StdIn.java from the website to create those files in the same directry.
// Then, I became able to use StdIn and StdOut.
public class exercise_1_element_of_programming {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = StdIn.readInt();
            sum = sum + value;
        }
        StdOut.println("Sum is " + sum);
    }
}
