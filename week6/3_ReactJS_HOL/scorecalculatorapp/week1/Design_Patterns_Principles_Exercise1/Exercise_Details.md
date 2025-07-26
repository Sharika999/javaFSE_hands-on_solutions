## Creating the Java Project

For this exercise, I created a new Java project named **SingletonPatternExample** in my IDE.  
This project contains two main classes:
- `Logger` → which implements the Singleton pattern.
- `LoggerTest` → which tests that only one instance of the Logger is created and used.

Setting up a separate project made it easy to keep the code organized and test the pattern properly.

---

## Testing the Singleton Implementation

To check that my Singleton works as expected, I wrote a simple test class called `LoggerTest`.  
In this class, I called `Logger.getInstance()` multiple times and printed the hash codes of the returned objects.

If the Singleton is implemented correctly, all the hash codes should be the same, which proves that only **one instance** of `Logger` exists in the entire application.

This confirms that logging is consistent and that no extra Logger objects are created accidentally.
