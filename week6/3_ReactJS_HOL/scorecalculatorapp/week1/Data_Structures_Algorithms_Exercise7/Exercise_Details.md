## Understanding Recursive Algorithms

Recursion is a technique where a method calls itself to solve smaller parts of a problem until it reaches a base condition.  
It is helpful for problems that can be broken down into similar subproblems, like calculating factorials, Fibonacci numbers, or in this case, predicting future financial values year by year based on previous growth.

In financial forecasting, recursion can be used to calculate the projected value for each year by reusing the calculation for the previous year.  
This makes the logic clean and avoids repetitive code for each period.

---

## Analysis

**Time Complexity:**  
The time complexity of a simple recursive forecasting algorithm is **O(n)**, where *n* is the number of years to forecast.  
Each recursive call handles one year until the base case (like when years = 0) is reached.

**How to Optimize:**  
Although basic recursion works for this scenario, recursion can become inefficient if it recalculates the same values many times (like in naive Fibonacci).  
To optimize it:
- Use **memoization** to store and reuse already calculated results.
- Or convert the recursion to an **iterative loop**, which removes the overhead of function calls and uses less memory.

For financial forecasting with simple annual growth, an iterative approach is usually clearer and faster in practice.
