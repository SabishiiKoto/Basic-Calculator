# Project Title
- A basic calculator with a GUI (a basic calculator that is in everyone's phone).
# Features:
- Add, subtract, multiply, and divide numbers.
- Handle decimal, negative numbers, and percentage.
- Allow to pick a color theme among 5 options.
<p align = "left">
   <img src = "https://github.com/SabishiiKoto/Basic-Calculator/blob/master/src/main/resources/assets/Screenshot%202025-09-13%20113512.png?raw=true" width = "200" height = "400">
   <img src = "https://github.com/SabishiiKoto/Basic-Calculator/blob/master/src/main/resources/assets/Screenshot%202025-09-13%20113523.png?raw=true" width = "200" height = "400">
</p>


# Technologies Used
- Language: Java
- GUI Library: JavaFX, SceneBuilder
- IDE: IntelliJ IDEA

# How to run
## Option 1: Run from source code
1. Clone the repository.
2. Open the folder in your IDE (I use IntelliJ).
3. Run the 'MainApplication.java' file.

## Option 2: Run JAR
1. Download the 'basicCalculator.jar' file.
2. Run it using the below command in the folder that contains the JAR file (replace your path in):
   
java --module-path "C:\Program Files(where SDK is saved)\lib" --add-modules javafx.controls,javafx.fxml -jar basicCalculator.jar

- For example my command is: 

java --module-path "C:\Users\AnhNg\IdeaProjects\openjfx-24_windows-x64_bin-sdk\javafx-sdk-24\lib" --add-modules javafx.controls,javafx.fxml -jar basicCalculator.jar

# What I Learned / Why I Made This
- It helped me to practice GUI layout and handle strings of calculation.

# License
This project is for learning purposes only.
