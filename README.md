✨ First_Follow Java Program ✨
<br>
📌 Introduction
<br>
The First_Follow program is a Java-based implementation for computing the First and Follow sets of a given grammar. This program helps in constructing parsing tables for syntax analysis in compiler design.
<br>
🚀 Features
<br>
✔️ Accepts a user-defined grammar.
<br>
✔️ Computes the First and Follow sets for a given non-terminal.
<br>
✔️ Identifies terminals and non-terminals from user input.
<br>

📋 Prerequisites
<br>
📌 Java Development Kit (JDK) installed.
<br>
📌 Basic understanding of compiler design concepts.
<br>

🛠 How to Run the Program
<br>
1️⃣ Compile the Java program:
<br>


javac First_Follow.java
<br>
2️⃣ Run the compiled Java class:
<br>


java First_Follow
<br>
🔢 Input Format

<br>
🔹 The number of grammar rules.<br>
🔹 Grammar rules (one per line in A -> α | β format).<br>
🔹 Number of terminals and non-terminals.<br>
🔹 List of terminals and non-terminals.<br>
🔹 The non-terminal for which First and Follow sets are to be calculated.
<br>

📌 Sample Input
<br>
Enter the number of lines in the grammar:<br>
3<br>
E -> TX<br>
X -> +TX | ε<br>
T -> FY<br>
Enter the number of non-terminals in the grammar:<br>
3<br>
Enter the number of terminals in the grammar:<br>
<!-- Enter the number of terminals in the grammar: -->
3<br>
Enter the terminals one by one:<br>
+ * ( )<br>
Enter the non-terminals one by one:<br>
E X T<br>
Enter the non-terminal whose first and follow you want to calculate:<br>
E<br>
📌 Sample Output<br>

The First is:
( T  ε  +<br>
The Follow is:
) $<br>
🔍 Functions Overview
<br>
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

👨‍💻 Author: Developed by Vidya Patil 🚀

Let me know if you want any further changes! 







