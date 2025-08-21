# Factorial Generator

This project is a simple Java application that calculates the factorial of numbers between 50 and 60. It demonstrates the use of Maven as a build tool and includes unit tests to verify the correctness of the factorial calculations.

## Project Structure

```
factorial-generator
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── FactorialGenerator.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── FactorialGeneratorTest.java
├── pom.xml
└── README.md
```

## Building the Project

To build the project, ensure you have Maven installed on your machine. Navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="com.example.FactorialGenerator"
```

This will execute the `main` method in the `FactorialGenerator` class, which calculates and prints the factorials of numbers from 50 to 60.

## Running Tests

To run the unit tests, use the following command:

```
mvn test
```

This will execute the tests defined in the `FactorialGeneratorTest` class to ensure the correctness of the factorial calculations.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.