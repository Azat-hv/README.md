# README.md
# Java Optimized Fibonacci  A high-performance recursive Fibonacci implementation in Java.  ### Key Logic Unlike standard recursion, this approach uses state-shifting (`bef = f - bef`) to achieve $O(n)$ time complexity, mirroring iterative performance while maintaining a clean recursive structure. Supports `BigInteger` for limitless calculations.
