public class Bitwise_Operator {
    public static void main(String[] args) {
        int a = 11;
        int b = 14;
        int c = 19;
      
        System.out.println(a<b & a>c);
        
    }
}

// explanation


// Bitwise operators are used to perform operations at the bit level. These operators treat their operands as sequences of 32 bits (binary digits) rather than as decimal, hexadecimal, or octal numbers. 

// In the given Java program, the expression `a < b & a > c` uses the bitwise AND operator (`&`). It's important to note that the bitwise AND operator in this context works similarly to the logical AND operator (`&&`), but without short-circuiting. Here's a detailed explanation and comparison with logical operators:

// ### Bitwise AND Operator (`&`)

// The bitwise AND operator performs a binary AND operation on each pair of corresponding bits of its operands. In the context of boolean expressions, it behaves like the logical AND but evaluates both operands even if the first one is false.

// ### Example in Program

// ```java
// public class Bitwise_Operator {
//     public static void main(String[] args) {
//         int a = 11;
//         int b = 14;
//         int c = 19;
      
//         System.out.println(a < b & a > c);
//     }
// }
// ```

// Here, `a < b & a > c` is evaluated as follows:
// 1. `a < b` evaluates to `true` because `11 < 14`.
// 2. `a > c` evaluates to `false` because `11` is not greater than `19`.

// ### Logical AND vs Bitwise AND

// - **Logical AND (`&&`)**: If the first operand is false, the second operand is not evaluated (short-circuiting).
// - **Bitwise AND (`&`)**: Both operands are always evaluated.

// ### Truth Table for Bitwise AND (`&`)

// When dealing with boolean values, the truth table for the AND operator (`&`) is straightforward:

// | Operand 1 | Operand 2 | Result  |
// |-----------|------------|---------|
// | `false`   | `false`    | `false` |
// | `false`   | `true`     | `false` |
// | `true`    | `false`    | `false` |
// | `true`    | `true`     | `true`  |

// ### Truth Table for Bitwise AND (`&`) with Integers

// When applied to integers, the bitwise AND compares each corresponding bit:

// ```
// Example: 11 & 14
// 11:  0000 1011
// 14:  0000 1110
// --------------
//      0000 1010 (Result: 10)

// Truth Table for each bit:
// 0 & 0 = 0
// 0 & 1 = 0
// 1 & 0 = 0
// 1 & 1 = 1
// ```

// ### Program Output Explanation

// In the program:

// ```java
// int a = 11;
// int b = 14;
// int c = 19;

// System.out.println(a < b & a > c);
// ```

// 1. `a < b` (i.e., `11 < 14`) evaluates to `true`.
// 2. `a > c` (i.e., `11 > 19`) evaluates to `false`.

// So, the expression `true & false` evaluates to `false`.

// ### Summary

// - **Bitwise AND (`&`)** is used for bit-level operations but can be applied to boolean values.
// - In boolean context, it evaluates both operands and behaves like logical AND without short-circuiting.
// - For integers, it performs a bitwise comparison and returns a result based on each pair of corresponding bits.

// This program demonstrates the use of the bitwise AND operator in a boolean context, where it evaluates both conditions and returns the appropriate boolean result.
