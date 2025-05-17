
# 💳 Bank System (Java Console App)

Hi there! I built this tiny **Bank System** to practice OOP concepts in Java while giving users a friendly CLI to manage a single bank account.

## ✨ Features
- **Check Balance** – instantly see how much money I have.  
- **Deposit / Withdraw** – add or remove funds with basic validation.  
- **Previous Transaction Log** – view the last action (deposit or withdrawal).  
- **Case‑Insensitive Menu** – I can type `a` or `A` and it still works.  
- **Loop Until Exit** – stay in the menu until I choose to quit.


  🔍 How It Works
=> bankAccount class holds balance, previousTransaction, customerName, and customerID.
=> Simple constructor injects user details.
=> Four core methods: deposit(), withdraw(), getPreviousTransaction(), and showMenu() (the CLI loop).
=> The main method just creates an account and calls showMenu().
