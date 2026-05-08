# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

**Scala Training 2000** is an educational repository with 63 Scala exercises covering programming fundamentals through advanced algorithms. All exercises are **Scala Worksheets** (`.sc` files) that execute directly in the IDE.

- **Purpose**: Learning and practicing Scala programming
- **Scala Version**: 2.13.18
- **Build Tool**: sbt 1.12.10

## Building and Running

The exercises are provided as **Scala Worksheets (`.sc`)**.

### How to use:
1. **IDE (Recommended)**: Open in IntelliJ IDEA with Scala plugin. Worksheets execute directly within the IDE to see results in real-time.
2. **REPL**: Copy code from a worksheet and paste it into `sbt console`.
3. **Compilation**: Run `sbt compile` to ensure all worksheets are syntactically correct.

## Architecture

All exercises are under `src/main/scala/` in three modules by difficulty:

- **`Semester1/`** — Basic fundamentals (24 exercises)
  - Number theory: Armstrong numbers, palindromes, primes, perfect squares
  - String manipulation: RLE compression, vowel doubling, tautograms
  - Geometry: polygon area, rectangle overlap, matrix rotation
  - Logic puzzles: divisibility, pyramid patterns, autonomous car logic

- **`Recursion_Training/`** — Recursive algorithms (16 exercises)
  - Simple: sum digits, reverse strings, power calculations
  - Medium: binary search, GCD, Hanoi towers, permutations
  - Advanced: power sets, sudoku solver, grid paths, Pascal's triangle

- **`Exercices_Scala_Worksheet_Advanced/`** — Advanced algorithms & data structures (23 exercises)
  - Graph algorithms: Dijkstra, BFS shortest path
  - String algorithms: KMP, longest substring without repeat, anagrams
  - Dynamic programming: 0/1 knapsack, LCS
  - Data structures: binary trees, balanced brackets, linked lists
  - Other: CSV parsing, expression evaluation, token bucket rate limiting, Game of Life

## Development Conventions

- **File Structure**: Each worksheet typically follows this template:
    1. **Problem Description**: A comment block at the top explaining the goal and constraints.
    2. **Implementation**: A labeled section `// 1. IMPLEMENTATION` where the logic should be written.
    3. **Tests**: A labeled section `// 2. TESTS` containing `println` statements to verify the implementation against expected outputs.

- **Testing**: This project uses manual verification via `println` rather than a formal testing framework like ScalaTest or MUnit.

- **Style**: Code should be idiomatic Scala, focusing on functional programming principles where appropriate for the exercise (recursion, pattern matching, higher-order functions over imperative loops).
