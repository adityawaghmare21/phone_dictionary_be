# phone_dictionary_be

A Java Spring Boot project with PostgreSQL integration.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Development Environment Setup](#development-environment-setup)
  - [1. Install IntelliJ IDEA](#1-install-intellij-idea)
  - [2. Install PostgreSQL](#2-install-postgresql)
  - [3. Install pgAdmin](#3-install-pgadmin)
- [Database Configuration](#database-configuration)
- [Running the Project](#running-the-project)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you begin, ensure you have the following prerequisites:

- Java Development Kit (JDK) 8 or later installed
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recommended IDE)
- PostgreSQL database installed (see instructions below)
- [pgAdmin](https://www.pgadmin.org/download/) installed

## Development Environment Setup

### 1. Install IntelliJ IDEA

IntelliJ IDEA is a recommended IDE for Spring Boot development. You can download and install it from the official website:

[Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

### 2. Install PostgreSQL

#### Windows:

- Download the PostgreSQL installer from the [official website](https://www.postgresql.org/download/windows/).
- Run the installer and follow the installation wizard's instructions.
- During installation, set a password for the `postgres` user.

#### macOS:

- You can install PostgreSQL on macOS using [Homebrew](https://brew.sh/):

   ```bash
   brew install postgresql
   ```

- Start the PostgreSQL service:

   ```bash
   brew services start postgresql
   ```

- By default, PostgreSQL should start automatically when your computer boots up.

#### Linux (Ubuntu):

- Install PostgreSQL using apt:

   ```bash
   sudo apt update
   sudo apt install postgresql postgresql-contrib
   ```

- Start and enable PostgreSQL:

   ```bash
   sudo systemctl start postgresql
   sudo systemctl enable postgresql
   ```

### 3. Install pgAdmin

pgAdmin is a popular open-source administration and management tool for PostgreSQL. You can download and install it from the official website:

[Download pgAdmin](https://www.pgadmin.org/download/)

## Database Configuration

- Open pgAdmin and connect to your PostgreSQL server using the credentials you set during installation.

- In pgAdmin, right-click on "Databases" and choose "Create > Database."

- Enter a database name 'contact_list' and click "Save" to create the database.

- Update the `application.properties` or `application.yml` file in your Spring Boot project with the database connection details:

  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/mydb
  spring.datasource.username=myuser
  spring.datasource.password=mypassword
  ```

## Running the Project

- Open the project in IntelliJ IDEA.
- Build and run the project from the IDE, or you can use the following command to run it from the command line:

  ```bash
  ./mvnw spring-boot:run
  ```

- The Spring Boot application will start, and you can access it in your web browser at `http://localhost:8080`.

  OR

- Go to src/main/java/com.example.contactlist/ContactListApplication
- And run the ContactListApplication class

## Contributing

Contributions to this project are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository on GitHub.
2. Create a new branch with a descriptive name for your feature or bug fix.
3. Make your changes and commit them with clear, concise commit messages.
4. Push your changes to your fork.
5. Create a pull request on the original repository.
