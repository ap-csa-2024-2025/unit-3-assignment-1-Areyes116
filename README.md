[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=16676023)
# unit-3-assignment-1

## API and Documentation
Documentation for the shape classes can be found [here](https://coderunner.projectstem.org/docs/shapes/index.html).

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since the shape classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

For any of these questions, you are NOT writing if-statements.  You should only be making boolean variables, and creating boolean expressions using the relational and logical operators.  Find the documentation for the Circle, Rectangle, and RegularPolygon class at this link.

[Shapes API](https://coderunner.projectstem.org/docs/shapes/index.html?_ga=2.85318812.489019979.1697552509-1811407564.1697552446)

## Problem
Create two `Rectangle` objects (you can either hardcode or get user input).  Create boolean variables that meet the following criteria

 - `isRotated`: Evaluates to `true` if the rectangles are 90 degrees rotated from each other, and is `false` otherwise.  This means the length of one is equal to the width of the other, and vice versa.
 - `isCongruent`: Evaluates to `true` if the rectangles are equal to each other, or are rotated 90 degrees to each other.  Use both the `equals()` method from the `Rectangle` class as well as `isRotated` that you created earlier.
 - `isSimilar`: Evaluates to `true` if either the rectangles are congruent, or if the ratio of the lengths of the rectangles are equal to the ratio of the widths.

Print out all your booleans.

## CodingBat
Do the following on [CodingBat - Logic 1](https://codingbat.com/java/Logic-1)

No if-statements are needed (don't worry if this causes your solution to be slightly inefficient).
 - cigarParty
 - squirrelPlay
 - love6
 - in1To10

## Sample Solutions
```java
public class Main
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(2, 4);
		Rectangle r2 = new Rectangle(4, 2);

		// Rotated if the length of 1 is equal to the width of 2 and vice versa
		boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength());

		// Congruent if they are either rotated, or exactly equal to each other; equals() from the Rectangle class will check
		// equality of rectangles for me
		boolean isCongruent = isRotated || r1.equals(r2);

		// Similar if they are either congruent, or if the ratio of the lengths is equal to the ratio of the widths
		boolean isSimilar = isCongruent || ( (r1.getLength() / r2.getLength()) == (r1.getWidth() / r2.getWidth()) ) ;
	}
}
```
