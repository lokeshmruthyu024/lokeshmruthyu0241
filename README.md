# Java Programming Solutions

This repository contains Java solutions for four programming problems, each implemented as a separate class with user input functionality. The programs take input from the user via the console and display the corresponding output, addressing specific tasks as outlined below.

## Project Structure

The repository includes the following Java files:

1. **`Calculator.java`** (Problem-1): A calculator class that performs basic arithmetic operations (addition, subtraction, multiplication, division) based on user input.
2. **`OddSeries.java`** (Problem-2): Generates a series of the first `a` odd numbers based on a single integer input `a`.
3. **`OddSeriesCeiling.java`** (Problem-3): Generates a series of odd numbers up to the ceiling of `(a+1)/2` based on a single integer input `a`.
4. **`CountMultiples.java`** (Problem-4): Counts how many numbers in a user-provided array are divisible by each number from 1 to 9 and outputs the counts in a map.

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed.
- A Java compiler (e.g., `javac`) and runtime environment (e.g., `java`).
- A terminal or command-line interface to compile and run the programs.

## How to Compile and Run

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Compile a Program**:
   For each Java file, compile it using:
   ```bash
   javac <FileName>.java
   ```
   Example:
   ```bash
   javac Calculator.java
   ```

3. **Run a Program**:
   Run the compiled program using:
   ```bash
   java <ClassName>
   ```
   Example:
   ```bash
   java Calculator
   ```

4. **Follow Console Prompts**:
   Each program prompts the user for input (e.g., numbers, operation type, or an array of integers) and displays the output.

## Program Details and Examples

### 1. Calculator.java (Problem-1)
- **Description**: Implements a calculator that takes two `double` numbers (`a` and `b`) and a string specifying the operation (`addition`, `subtraction`, `multiplication`, or `division`). It performs the operation and outputs the result.
- **Input**:
  - First number (`a`): A double value.
  - Second number (`b`): A double value.
  - Operation: A string (`addition`, `subtraction`, `multiplication`, or `division`).
- **Output**: The result of the operation, formatted to two decimal places, or an error message for invalid inputs or division by zero.
- **Example**:
  ```
  Enter first number (a): 10.5
  Enter second number (b): 5.5
  Enter operation (addition, subtraction, multiplication, division): addition
  Result: 16.00
  ```
  ```
  Enter first number (a): 10.5
  Enter second number (b): 5.5
  Enter operation (addition, subtraction, multiplication, division): division
  Result: 1.91
  ```

### 2. OddSeries.java (Problem-2)
- **Description**: Generates a list of the first `a` odd numbers (1, 3, 5, ...) based on a single integer input `a`.
- **Input**: A positive integer `a`.
- **Output**: A list of odd numbers `[1, 3, 5, ..., 2a-1]`. Returns an empty list if `a < 1`.
- **Example**:
  ```
  Enter a positive integer (a): 4
  Output: [1, 3, 5, 7]
  ```
  ```
  Enter a positive integer (a): 1
  Output: [1]
  ```

### 3. OddSeriesCeiling.java (Problem-3)
- **Description**: Generates a list of odd numbers up to the ceiling of `(a+1)/2` based on a single integer input `a`. For example, `a=3` or `a=4` generates `[1, 3, 5]`, `a=5` or `a=6` generates `[1, 3, 5, 7, 9]`.
- **Input**: A positive integer `a`.
- **Output**: A list of odd numbers based on the ceiling rule. Returns an empty list if `a < 1`.
- **Example**:
  ```
  Enter a positive integer (a): 3
  Output: [1, 3, 5]
  ```
  ```
  Enter a positive integer (a): 5
  Output: [1, 3, 5, 7, 9]
  ```

### 4. CountMultiples.java (Problem-4)
- **Description**: Takes an array of integers and counts how many numbers are divisible by each integer from 1 to 9, outputting the counts in a map.
- **Input**:
  - Number of elements (`n`): An integer specifying the array size.
  - `n` integers: The array elements.
- **Output**: A map with keys 1 to 9 and values representing the count of numbers divisible by each key.
- **Example**:
  ```
  Enter the number of elements in the array: 11
  Enter 11 integers:
  1 2 8 9 12 46 76 82 15 20 30
  Output: {1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}
  ```

## Notes
- **Input Validation**: The programs handle basic error cases (e.g., division by zero, invalid operation strings). For simplicity, they assume valid numeric inputs. Add try-catch blocks for `InputMismatchException` if robust input validation is needed.
- **Output Format**: The map output in `CountMultiples.java` may display keys in a non-sorted order due to `HashMap` behavior, but the counts are correct.
- **Running Multiple Programs**: Compile and run each program separately, as they are independent.

## Contributing
Feel free to fork this repository, make improvements (e.g., add input validation, enhance output formatting), and submit pull requests.

## License
This project is unlicensed and provided as-is for educational purposes.

---

**Instructions for Use:**
1. Save the above content in a file named `README.md` in the root of your Git repository.
2. Ensure the Java files are named exactly as provided:
   - `Calculator.java`
   - `OddSeries.java`
   - `OddSeriesCeiling.java`
   - `CountMultiples.java`
3. Place these files in the same directory as the `README.md` or in an appropriate subdirectory (e.g., `src/`).
4. Push the files to your Git repository:
   ```bash
   git add .
   git commit -m "Add Java solutions and README"
   git push origin main
   ```

   