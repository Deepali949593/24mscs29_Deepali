# Backend Internship - Day2<RegNo> Project

This project is part of my backend internship training and focuses on learning Maven, object-oriented programming in Java, exception handling, and MongoDB integration for basic systems. The project is structured as a Maven project and contains two key modules: a **Library Management System** and a **Banking System**.

## 📁 Project Title
**Day2<RegNo>**

> Replace `<RegNo>` with your registration number, e.g., `Day2_24MSCS29`.

---

## 🔧 Technologies & Tools

- Java 17+
- Maven (Build Tool)
- Apache Log4j SLF4J Binding
- Apache Commons CLI
- MongoDB (via MongoDB Java Driver)
- IntelliJ IDEA / VS Code (IDE)
- Terminal / PowerShell

---

## 📦 Maven Dependencies

This project uses the following Maven dependencies, added in the `pom.xml` file:

```xml
<dependencies>
    <!-- Logging -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-log4j12</artifactId>
        <version>1.7.32</version>
    </dependency>

    <!-- Apache CLI -->
    <dependency>
        <groupId>commons-cli</groupId>
        <artifactId>commons-cli</artifactId>
        <version>1.4</version>
    </dependency>

    <!-- MongoDB Driver (for banking system) -->
    <dependency>
        <groupId>org.mongodb</groupId>
        <artifactId>mongodb-driver-sync</artifactId>
        <version>4.11.0</version>
    </dependency>
</dependencies>
