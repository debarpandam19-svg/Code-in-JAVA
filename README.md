# Java Revision Mini-Projects

A beginner-friendly collection of small Java programs to practice fundamental coding concepts.

##  What you will find in this repository

* **`ATM.java`** – A basic ATM simulator using `Scanner` for user input, PIN verification, and balance tracking.
* **`BattleGame.java`** – A turn-based game using `Random` logic for attacking, healing, and tracking player/enemy health points (HP).
* **`GameIdeaSimulation.java`** – A simple leveling system where enemies scale up in strength when defeated.

##  What you will learn

* Setting up a `public class` and `main` method.
* Reading keyboard input with `Scanner`.
* Making decisions with `if / else` statements.
* Repeating actions using `while` loops.
* Generating random numbers using `Random`.
* Managing variables (updating health, balances, and levels).

##  How to open and run

### Step 1: Open the Project
1. Launch **VS Code**.
2. Go to **File > Open Folder**.
3. Select your Java directory (e.g., `C:\Users\HP\CODEJAVA`).

### Step 2: Run the code
Choose one of the three options below to run your files:

####  Option A: The VS Code Run button / F5
1. Open the file you want to run (e.g., `ATM.java`).
2. Press **`F5`** on your keyboard, or click the **Run** button above the `main` method.
* **PowerShell:** Works instantly out of the box.
* **Git Bash:** Requires the **Extension Pack for Java** installed in VS Code to handle the execution path automatically.

####  Option B: Terminal (PowerShell / Windows Command Prompt)
Open your terminal in VS Code using `Ctrl + \`` and type:
```powershell
# Compile the file
javac ATM.java

# Run the program
java ATM
```

####  Option C: Terminal (Git Bash)
Open your terminal in VS Code using `Ctrl + \`` and type:
```bash
# Compile the file
javac ATM.java

# Run the program
java ATM
```
*(Replace `ATM` with `BattleGame` or `GameIdeaSimulation` to run the other games.)*

##  Troubleshooting Common Errors

###  Error: `javac is not recognized as an internal or external command`
* **Why it happens:** Windows cannot find your Java compiler because the environment variables are not set.
* **The Fix:**
  1. Download and install the **Java Development Kit (JDK)**.
  2. Search for "Environment Variables" in your Windows search bar.
  3. Under **System Variables**, find `Path`, select it, and click **Edit**.
  4. Click **New** and add the path to your JDK bin folder (e.g., `C:\Program Files\Java\jdk-xx\bin`).
  5. Restart VS Code and try again.

###  Error: `Could not find or load main class`
* **Why it happens:** You tried to run `java ATM.java` instead of `java ATM`, or you are in the wrong folder.
* **The Fix:**
  * Compile with the extension: `javac ATM.java`
  * Run **without** the extension: `java ATM`
  * Ensure your terminal shows your exact folder path: `c:/Users/HP/CODEJAVA`

###  Error: `class ATM is public, should be declared in a file named ATM.java`
* **Why it happens:** Java is strictly case-sensitive. Your file name does not perfectly match your code's class name.
* **The Fix:** 
  * Rename your file so the spelling and capitalization match exactly (e.g., `atm.java` must be changed to `ATM.java`).
