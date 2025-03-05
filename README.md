✨ First_Follow Java Program ✨
📌 Introduction
The First_Follow program is a Java-based implementation for computing the First and Follow sets of a given grammar. This program helps in constructing parsing tables for syntax analysis in compiler design.

🚀 Features
✔️ Accepts a user-defined grammar.
✔️ Computes the First and Follow sets for a given non-terminal.
✔️ Identifies terminals and non-terminals from user input.

📋 Prerequisites
📌 Java Development Kit (JDK) installed.
📌 Basic understanding of compiler design concepts.

🛠 How to Run the Program
1️⃣ Compile the Java program:


javac First_Follow.java
2️⃣ Run the compiled Java class:

sh
Copy
Edit
java First_Follow
🔢 Input Format
🔹 The number of grammar rules.
🔹 Grammar rules (one per line in A -> α | β format).
🔹 Number of terminals and non-terminals.
🔹 List of terminals and non-terminals.
🔹 The non-terminal for which First and Follow sets are to be calculated.

📌 Sample Input
mathematica
Copy
Edit
Enter the number of lines in the grammar:
3
E -> TX
X -> +TX | ε
T -> FY
Enter the number of non-terminals in the grammar:
3
Enter the number of terminals in the grammar:
3
Enter the terminals one by one:
+ * ( )
Enter the non-terminals one by one:
E X T
Enter the non-terminal whose first and follow you want to calculate:
E
📌 Sample Output
csharp
Copy
Edit
The First is:
( T  ε  +
The Follow is:
) $
🔍 Functions Overview
🛠 first(char s, List<String> gr, char[] t, char[] nt, int te, int no_t)

Recursively computes the First set of a non-terminal.
🛠 follow(char s, List<String> gr, char[] t, char[] nt, int te, int no_t)

Computes the Follow set by checking the position of the non-terminal in the grammar rules.
🛠 is_terminal(char[] x, char t)

Checks if a character is a terminal.
🛠 is_non_terminal(char[] x, char t)

Checks if a character is a non-terminal.
⚠️ Notes
⚡ The program assumes the grammar is provided in a structured format.
⚡ It does not handle left recursion.
⚡ The epsilon (ε) is used to denote an empty production.

📜 License
📖 This project is open-source and free to use for educational purposes.

👨‍💻 Author: Developed by [Your Name] 🚀

Let me know if you want any further changes! 







