# Scala Training 2000

This project is a collection of Scala exercises and worksheets designed for learning and practicing Scala programming, ranging from basic semester 1 tasks to advanced algorithms.

## Project Overview

- **Purpose**: Educational repository for Scala training.
- **Main Technologies**: 
    - **Scala**: 2.13.18
    - **sbt**: 1.12.10
- **Structure**:
    - `src/main/scala/Semester1/`: Basic exercises (e.g., Armstrong numbers, palindromes, basic logic).
    - `src/main/scala/Exercices_Scala_Worksheet_Advanced/`: Advanced algorithms and data structures (e.g., Dijkstra, KMP, Sudoku validator, Game of Life).
    - 

## Building and Running

The exercises are provided as **Scala Worksheets (`.sc`)**. 

### How to use:
1. **IDE**: Open the project in an IDE with Scala support (e.g., IntelliJ IDEA with the Scala plugin). Worksheets can be executed directly within the IDE to see results in real-time.
2. **REPL**: Copy the code from a worksheet and paste it into a Scala REPL (`sbt console`).
3. **Compilation**: Run `sbt compile` to ensure all worksheets are syntactically correct.

## Development Conventions

- **File Structure**: Each worksheet typically follows this template:
    1. **Problem Description**: A comment block at the top explaining the goal and constraints.
    2. **Implementation**: A labeled section `// 1. IMPLEMENTATION` where the logic should be written.
    3. **Tests**: A labeled section `// 2. TESTS` containing `println` statements to verify the implementation against expected outputs.
- **Testing**: This project uses manual verification via `println` rather than a formal testing framework like ScalaTest or MUnit.
- **Style**: Code should be idiomatic Scala, focusing on functional programming principles where appropriate for the exercise.
