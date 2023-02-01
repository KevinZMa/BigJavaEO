# Chapter 4: Fundamental Data Types

## Practice Exercises

### E4.1 - [`SheetProperties.java`](./SheetProperties.java)

Write a program that displays the properties of a letter-size (8.5 × 11 inches) sheet of paper in millimeters. There are 25.4 millimeters per inch. The program should print:

-   The width and height
-   The perimeter
-   The length of the diagonal

Use constants and comments in your program.

### E4.2 - [`Powers.java`](./Powers.java)

Write a program that reads a number and displays the square, cube, and fourth power. Use the `Math.pow` method only for the fourth power.

### E4.3 & 4.4 - [`Operations.java`](./Operations.java)

Write a program that prompts the user for two integers and then prints

-   The sum
-   The difference
-   The product
-   The average
-   The distance (absolute value of the difference)
-   The maximum (the larger of the two)
-   The minimum (the smaller of the two)

Hint: The max and min functions are declared in the `Math` class.

Enhance the output so that the numbers are properly aligned:

```
Sum:             45
Difference:      -5
Product:        500
Average:         22.50
Distance:         5
Maximum:         25
Minimum:         20
```

### E4.5 - [`Conversions.java`](./Conversions.java)

Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches.

### E4.6 - [`CircularDimensions.java`](./CircularDimensions.java)

Write a program that prompts the user for a radius and then prints:

-   The area and circumference of a circle with that radius
-   The volume and surface area of a sphere with that radius

### E4.7 - [`RectangleDimensions.java`](./RectangleDimensions.java)

Write a program that asks the user for the lengths of a rectangle's sides. Then print:

-   The area and perimeter of the rectangle
-   The length of the diagonal (use the Pythagorean theorem)

### E4.9 - [`Gas.java`](./Gas.java)

Write a program that asks the user to input:

-   The number of gallons of gas in the tank
-   The fuel efficiency in miles per gallon
-   The price of gas per gallon

Then print the cost per 100 miles and how far the car can go with the gas in the tank.

#### Cost per 100 miles:

$$
100\text{ miles}\cdot\frac{\text{gallons}}{{\tt efficiency}\text{ miles}}\cdot\frac{\tt price}{\text{gallons}}
$$

### E4.11 - [`FilePath.java`](./FilePath.java)

_File names and extensions._ Write a program that prompts the user for the drive letter (`C`), the path (`\Windows\System`), the file name (`Readme`), and the extension (`txt`). Then print the complete file name `C:\Windows\System\Readme.txt`. (If you use UNIX or a Macintosh, skip the drive name and use `/` instead of `\` to separate directories.)

## Programming Projects

### P4.1 - [`HybridCarDecider.java`](./HybridCarDecider.java)

Write a program that helps a person decide whether to buy a hybrid car. Your program’s inputs should be:

-   The cost of a new car
-   The estimated miles driven per year
-   The estimated gas price
-   The efficiency in miles per gallon
-   The estimated resale value after 5 years

Compute the total cost of owning the car for five years. (For simplicity, we will not take the cost of financing into account.) Obtain realistic prices for a new and used hybrid and a comparable car from the Web. Run your program twice, using today’s gas price and 15,000 miles per year. Include pseudocode and the program runs with your assignment.

### P4.2 - [`EasterSunday.java`](./EasterSunday.java)

Easter Sunday is the first Sunday after the first full moon of spring. To compute the date, you can use this algorithm, invented by the mathematician Carl Friedrich Gauss in 1800:

1. Let `y` be the year (such as 1800 or 2001).

2. Divide `y` by `19` and call the remainder `a`. Ignore the quotient.

3. Divide `y` by `100` to get a quotient `b` and a remainder `c`.

4. Divide `b` by `4` to get a quotient `d` and a remainder `e`.

5. Divide `8 * b + 13` by `25` to get a quotient `g`. Ignore the remainder.

6. Divide `19 * a + b - d - g + 15` by `30` to get a remainder `h`. Ignore the quotient.

7. Divide `c` by `4` to get a quotient `j` and a remainder `k`.

8. Divide `a + 11 * h` by `319` to get a quotient `m`. Ignore the remainder.

9. Divide `2 * e + 2 * j - k - h + m + 32` by `7` to get a remainder `r`. Ignore the quotient.

10. Divide `h - m + r + 90` by `25` to get a quotient `n`. Ignore the remainder.

11. Divide `h - m + r + n + 19` by `32` to get a remainder `p`. Ignore the quotient.

Then Easter falls on day `p` of month `n`. For example, if `y` is `2001`:

```
a = 6            g = 6           m = 0    n = 4
b = 20, c = 1    h = 18          r = 6    p = 15
d = 5, e = 0     j = 0, k = 1
```

Therefore, in 2001, Easter Sunday fell on April 15. Write a program that prompts the user for a year and prints out the month and day of Easter Sunday.

## Extras

### [`Balance.java`](./Balance.java)

An online bank wants you to create a program that shows prospective customers how their deposits will grow. Your program should read the initial balance and the annual interest rate. Interest is compounded monthly. Print out the balances after the first three months.

Here is a sample run:

```
Initial balance: 1000
Annual interest rate in percent: 6.0
After first month:     1005.00
After second month:    1010.03
After third month:     1015.08
```
