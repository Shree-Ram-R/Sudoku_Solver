# Sudoku Solver
The Sudoku Solver is a backtracking-based algorithm that finds solutions to a 9×9 Sudoku puzzle, ensuring all numbers follow Sudoku rules.

### Problem Description
Sudoku is a number placement puzzle where the goal is to fill a 9×9 grid so that:

Each row contains the numbers 1-9 exactly once.
Each column contains the numbers 1-9 exactly once.
Each 3×3 subgrid contains the numbers 1-9 exactly once.
Given a partially filled Sudoku board, the algorithm finds a valid solution (if one exists) using backtracking.

### Algorithm
The solution employs a recursive backtracking approach:

The program searches for an empty cell in the grid.
It tries placing numbers 1 to 9, checking if each placement is valid.
If a valid number is found, it recursively proceeds to solve the next empty cell.
If a conflict arises, the algorithm backtracks and tries a different number.
Once the board is fully filled, a valid solution is found.
### Features
✔ Backtracking Algorithm: Ensures efficient searching while minimizing unnecessary computations.
✔ Constraint Checking: Validates number placement based on Sudoku rules (row, column, and 3×3 subgrid).
✔ Fast Execution: Solves most puzzles in milliseconds.
✔ Automatic Output: Displays the solved Sudoku board upon completion.

### How to Run
Clone the repository.
Run the program, providing a partially filled Sudoku grid as input.
The program will return the solved Sudoku board (if a solution exists).
Example 
```py
sudoku_board = [
    [5, 3, 0, 0, 7, 0, 0, 0, 0],
    [6, 0, 0, 1, 9, 5, 0, 0, 0],
    [0, 9, 8, 0, 0, 0, 0, 6, 0],
    [8, 0, 0, 0, 6, 0, 0, 0, 3],
    [4, 0, 0, 8, 0, 3, 0, 0, 1],
    [7, 0, 0, 0, 2, 0, 0, 0, 6],
    [0, 6, 0, 0, 0, 0, 2, 8, 0],
    [0, 0, 0, 4, 1, 9, 0, 0, 5],
    [0, 0, 0, 0, 8, 0, 0, 7, 9]
]

solveSudoku(sudoku_board)
printBoard(sudoku_board)
```
Expected Output

5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9

### Technologies Used
Programming Language:Java 
Concepts: Backtracking, Recursion, Constraint Satisfaction
Output 
![image](https://github.com/user-attachments/assets/d98c9cf1-f57f-4777-9964-af02b9ebc1dd)


Conclusion
This Sudoku Solver efficiently finds solutions using backtracking and is designed for fast execution. It can be used to solve any valid Sudoku puzzle.
