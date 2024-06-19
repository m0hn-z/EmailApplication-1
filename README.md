# Email Generator Java Program

## Overview

This Java program generates emails based on the user's first name, last name, and chosen department. It also creates a random password of a desired length. The program allows for the setting of an alternate email and the ability to change the password.

## Features

- **Email Generation**: Automatically creates an email address using the user's first name, last name, and chosen department.
- **Random Password Generation**: Generates a random password of specified length for the user.
- **Alternate Email**: Provides the option to set an alternate email address.
- **Password Management**: Allows users to change their password.

## Requirements

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, VSCode)

## Installation

1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/email-generator-java.git
   ```

2. **Navigate to the project directory**:
   ```sh
   cd email-generator-java
   ```

3. **Open the project in your preferred Java IDE**.

## Usage

1. **Compile the Java program**:
   ```sh
   javac Main.java
   ```

2. **Run the program**:
   ```sh
   java Main
   ```

3. **Follow the prompts** to input the first name, last name, and choose a department.

4. **Password Management**:
   - To generate a random password, follow the prompt and enter the desired length.
   - To set an alternate email, enter the alternate email address when prompted.
   - To change the password, follow the instructions provided during the execution of the program.

## Code Structure

- **Email.java**: Contains the `Email` class which manages the creation of email, password generation, and password management.
- **EmailApp.java**: Contains the `main` method to run the application and interact with the user.

## Example

Here is an example of how the program works:

```
Enter your first name: John
Enter your last name: Doe
Enter your department (1 for Sales, 2 for Development, 3 for Accounting): 2

Your email is: john.doe@dev.company.com
Generated password: xYz1234!
Enter alternate email: john.doe.alternate@gmail.com

Your alternate email is set to: john.doe.alternate@gmail.com

Would you like to change your password? (yes/no): yes
Enter new password: newPassw0rd!

Your password has been updated successfully.
```

## Contributing

Contributions are welcome! Please fork this repository and submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

