# University Club Recruitment System 🎓

## Overview
This project is an Object-Oriented Programming (OOP) simulation built in Java. It models a university co-curricular ecosystem where students apply to join various clubs (e.g., BUCC, Robotics Club). The system enforces strict recruitment logic, department-specific restrictions, and capacity management.

## 🚀 Key Features & System Rules

* **Dynamic Club Constraints:** Every club has a unique minimum completed credit requirement, minimum CGPA requirement, and maximum member capacity.
* **Automated ID Generation:** Student IDs are dynamically generated upon creation in the format: `[DEPT_PREFIX]-[Name]-[Credits]`.
* **Constructor Overloading:** If a student registers without specifying a department or wing, the system defaults them to the `"CSE"` department and `"General"` wing.
* **Strict Wing Restrictions:** The `"Research and Development"` wing is highly specialized. The system rejects applications from any student not in the `"CSE"` or `"EEE"` departments.
* **Nested Priority Overrides:**
  * **Fresher Bypass:** Students with strictly less than 15 completed credits are classified as freshers and automatically bypass the club's minimum CGPA requirement.
  * **Executive Override:** Students recruited directly to the `"Executive"` wing bypass *both* the minimum credit and minimum CGPA requirements.
* **State & Static Tracking:** 
  * A student is locked to a single club and cannot join multiple organizations.
  * A global static counter tracks the total number of successfully recruited students across the entire university ecosystem.

## 📁 Project Structure

* `Club.java`: Manages club attributes, capacity limits, and eligibility thresholds. All attributes are strictly private (Encapsulation).
* `Student.java`: Handles the core validation logic, priority overrides, default constructors, and assigns students to clubs if they meet all criteria.
* `BRACUTester.java`: The main driver class that initializes the objects and tests the system's logic against various edge cases.

## 💻 How to Compile and Run

1. Clone the repository or download the source code.
2. Ensure you have the Java Development Kit (JDK) installed.
3. Open your terminal or command prompt and navigate to the directory containing the files.
4. Compile all the Java files using the following command:
   ```bash
   javac *.java
