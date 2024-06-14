<p align="center">
    <img src="https://raw.githubusercontent.com/fb-buss/fb-buss/main/gifs/galaxy.gif">
</p>

<h1 align="center">Challenge: Flow Control</h1>

<h2 align="center">Objective</h2>

<p align="center">
    The system should <strong>receive two parameters via the terminal representing two integers</strong>.<br>
    With these two numbers, you will determine the number of iterations (<strong>using a for loop</strong>) and print the incremented numbers to the console (<strong>using System.out.print</strong>).<br>
</p>

<p align="center">
    <strong>For example:</strong> <br>
    If you pass <strong>the numbers 12 and 30</strong>, there will be <strong>a loop with 18 occurrences</strong> to print the numbers, such as: "<strong>Printing number 1</strong>", "<strong>Printing number 2</strong>", and so on. <br>
    If the <strong>first parameter is Greater than the second parameter</strong>, you should <strong>throw a custom exception called InvalidParametersException</strong> with the message: "<strong>The second parameter must be greater than the first</strong>".<br>
</p>

<h3 align="center">The things I used in this challenge</h3>

<p align="center">
    Packages, imports, classes, methods, control structures, exceptions, and variables.
</p>

<h3 align="center">Note</h3>

<p align="center">
    Initially, I created the custom exception class InvalidParametersException only as a suggestion, as prompted by the challenge, with the message: "The second parameter must be greater than the first". I set this message directly in the constructor, since for this case, the same error message would always be thrown. However, later on, I decided to stick with the existing IllegalArgumentException exception in my code.
</p>

```java
public class InvalidParametersException extends Exception {

    public InvalidParametersException() {
        super("The second parameter must be greater than the first.");
    }
}
```

<p align="center">
    <a href="https://github.com/fb-buss/code-challenges/tree/main/digital-innovation-one/java/flow-control/src">Click here or access the file Challenge.java to view the code.</a>
</p>

<p align="center">
    Challenge by <a href="https://github.com/glysns">Gleyson Sampaio.</a> <br>
    <a href="https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo">Click here to access Gleyson's challenge.</a>
</p>

<p align="center">
    <img src="https://raw.githubusercontent.com/fb-buss/fb-buss/main/gifs/galaxy.gif">
</p>
