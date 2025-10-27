# 📚 Core Java Library Management System

A console-based Library Management System built using Core Java to demonstrate OOP concepts, collections, and layered architecture (Entity, Repository, Service).

## 🧠 Features
- Add, delete, and view books
- Register members
- Issue and return books
- View issued books
- Clean separation of logic (Entity → Repo → Service → Main)

## 🏗️ Architecture
- **Entity:** Book, Member  
- **Repository:** BookRepository, MemberRepository  
- **Service:** Library  
- **Main:** Starter (CLI-based user interaction)

## 🧑‍💻 Tech Stack
- Java 17+
- Collections Framework
- OOP (Encapsulation, Abstraction)
- Simple In-Memory Storage

## 🚀 How to Run
```bash
javac Starter.java
java Starter
