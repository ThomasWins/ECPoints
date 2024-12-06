# Elliptic Curve Points Generator

This Java program efficiently generates all points on an elliptic curve \(y^2 /(x^3 + ax + b) % p), leveraging an optimized algorithm for primes (p % 4 == 3). The algorithm computes solutions for (y) using the Legendre symbol and provides output in O(p) time complexity.

## Features
- **Efficient point generation**: Implements an O(p) algorithm for generating all points on an elliptic curve.
- **Support for modular arithmetic**: Works for primes where: (p % 4 == 3).
- **Input from standard input**: Reads input from standard input to facilitate testing with multiple cases.
- **Output to standard output**: Outputs the generated points in an easy-to-parse format.

## Algorithm Overview
The program uses the following steps:
1. **Identify potential ( x ) values**:
   - For each x from 0 to p-1, calculate (c = (x^3 + ax + b) % p).
   - Use the Legendre symbol to determine whether c has solutions for y.
2. **Calculate ( y ) values**:
   - Compute the square roots y % p.
   - If (c == 0) then (y = 0) is the only solution.
   - If (c == 1), there exists 2 solutions for y.
   - If (c == -1), no solutions exist for y.
3. **Generate and output points**:
   - Output all valid (x, y) pairs, including their symmetric counterpart (x, p-y), when (c == 1) is true.

## Input Format
The program expects input from standard input in the following format: `p a b`
- `p`: A prime number such that (p % 4 == 3).
- `a` and `b`: Coefficients of the elliptic curve equation.
