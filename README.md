# 🧮 Kotlin CLI Calculator

A simple **command-line calculator** written in **Kotlin**, built to handle user input safely, perform basic arithmetic operations, and format expressions neatly.  
It includes basic error handling and input validation to prevent crashes on invalid data.

---

## 🚀 Features

- ✅ Supports **basic arithmetic operations**: `+`, `-`, `*`, `/`
- 🧩 Handles **user input dynamically**
- 🧠 Performs **input cleaning and validation**
- ⚠️ Gracefully handles **invalid inputs and errors**
- 💬 Continuous calculation loop — type `exit` to quit
- ✨ Formats and displays the full expression with the computed result

---

## 🧰 How It Works

1. **Reads input** from the user (`readln()`).
2. **Validates** the expression to ensure it includes valid operators.
3. **Formats** the input into numbers and operators using `formatValues()`.
4. **Performs calculations** sequentially (no operator precedence).
5. **Displays** the result in a readable format.
6. **Loops** until the user types `exit`.

---

## ⚙️ Code Overview

- **`OPERATORS`** – defines the list of supported operators (`+`, `-`, `*`, `/`)
- **`main()`** – handles the main loop, user input, and calculation logic
- **`formatValues()`** – parses and cleans up the raw string input

---

## 🪄 Example Expression Handling

| Input | Formatted | Output |
|-------|------------|--------|
| `5+3` | `5 + 3` | `8.0` |
| `10/2` | `10 / 2` | `5.0` |
| `-5+2` | `-5 + 2` | `-3.0` |
| `4--3` | `4 -3` | `7.0` |

---

## 🧩 Requirements

- Kotlin 1.9+
- JVM (Java 8 or later)

---

## 🏗️ How to Run

### From command line:
```bash
kotlinc Calculator.kt -include-runtime -d calculator.jar
java -jar calculator.jar
```
