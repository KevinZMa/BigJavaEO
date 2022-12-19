# Chapter 3: Implementing Classes

### Section 3.5: [`cash_register/`](./cash_register/)

**Problem Solving: Tracing Objects**

The `CashRegister` class totals up sales and computes change due.

## Interactive Review & Practice

### IR 3.3 (all): [`suburban_scene/`](./suburban_scene/)

Complete the `TrafficLight` class to draw a traffic light. Modify the `TrafficLight` class so that the width of the rectangle can be specified in the constructor. The gap between the circles should be 20 percent of the width.

![resulting traffic light](./suburban_scene/traffic_light.png)

Using the `Car` class from the textbook and your `TrafficLight` class, draw the following scene:

![suburban scene](./suburban_scene/suburban_scene.png)

## Practice Exercises

### E3.1: [`Counter.java`](./Counter.java) ([`undo()`](./Counter.java#L43))

Add a button to the tally counter in Section 3.1 that allows an operator to undo an accidental button click. As an added precaution, make sure that clicking the undo button more often than the click button has no effect.

### E3.2: [`Counter.java`](./Counter.java) ([`setLimit()`](./Counter.java#L25))

Simulate a tally counter that can be used to admit a limited number of people. If the click button is clicked more often than the limit, it has no effect.

### E3.10: [`cash_register/`](./cash_register/) - ([`printReceipt()`](./cash_register/CashRegister.java#L120))

Add a method `printReceipt` to the `CashRegister` class. The method should print the prices of all purchased items and the total amount due.

### E3.11: [`cash_register/`](./cash_register/)

After closing time, the store manager would like to know how much business was transacted during the day. Modify the `CashRegister` class to enable this functionality. Supply methods ([`getSalesTotal`](./cash_register/CashRegister.java#L164)) and ([`getSalesCount`](./cash_register/CashRegister.java#L156)) to get the total amount of all sales and the number of sales. Supply a method ([`reset`](./cash_register/CashRegister.java#L171)) that resets any counters and totals so that the next day’s sales start from zero.

### E3.15: [`Letter.java`](./Letter.java)

Provide a class for authoring a simple letter. In the constructor, supply the names of the sender and the recipient:

```java
public Letter(String from, String to)
```

Supply a method

```java
public void addLine(String line)
```

to add a line of text to the body of the letter.

Supply a method

```java
public String getText()
```

that returns the entire text of the letter. The text has the form:

```
Dear recipient name:
blank line 
first line of the body
second line of the body
. . .
last line of the body
blank line 
Sincerely, 
blank line
sender name 
```

Also supply a class [`LetterPrinter`](./LetterPrinter.java) that prints this letter.

```
Dear John:
   
I am sorry we must part.
I wish you all the best.
   
Sincerely,
   
Mary 
```

Construct an object of the `Letter` class and call `addLine` twice.

## Programming Projects

### P3.1: [`cash_register/`](./cash_register/)

Enhance the `CashRegister` class so that it counts the purchased items. Provide a [`getItemCount()`](./cash_register/CashRegister.java#L108) method that returns the count.

### P3.2: [`cash_register/`](./cash_register/)

Support computing sales tax in the `CashRegister` class. The tax rate should be supplied when constructing a `CashRegister` object. Add [`recordTaxablePurchase()`](./cash_register/CashRegister.java#L61) and [`getTotalTax()`](./cash_register/CashRegister.java#L101) methods. (Amounts added with `recordPurchase` are not taxable.) The `giveChange` method should correctly reflect the sales tax that is charged on taxable items.

### P3.3: [`Balloon.java`](./Balloon.java)

Implement a class `Balloon` with a radius. A balloon starts with radius 0. Supply a method

```java
public void inflate(double amount)
```

that increases the radius by the given amount. Supply a method

```java
public double getVolume()
```

that returns the current volume of the balloon.

### P3.4: [`Sheet.java`](./Sheet.java)

Most countries (with the exception of Canada, Colombia, the Dominican Republic, Mexico, and the United States) follow the ISO 216 standard for paper sizes. An A0 sheet has dimensions 841 × 1189 millimeters. An A1 sheet is obtained by cutting an A0 sheet in half along the larger dimension, yielding a 594 × 841 sheet. An A2 sheet is obtained by cutting it in half again, yielding a 420 × 594 sheet, and so on. Implement a class `Sheet` whose constructor makes an A0 sheet. Provide a method `cutInHalf` that yields a `Sheet` object of half the size. Also provide methods `width`, `height`, and `name`, returning the width and height in millimeters, as well as the name (such as `"A2"`).

### P3.5: [`Microwave.java`](./Microwave.java)

A microwave control panel has four buttons: one for increasing the time by 30 seconds, one for switching between power levels 1 and 2, a reset button, and a start button. Implement a class that simulates the microwave, with a method for each button. The method for the start button should print a message "Cooking for ... seconds at level ...".

### P3.6 & 3.7: [`Person.java`](./Person.java)

A Person has a name (just a first name for simplicity) and friends. Store the names of the friends in a string, separated by spaces. Provide a constructor that constructs a person with a given name and no friends. Provide methods

```java
public void befriend(Person p)
public void unfriend(Person p)
public String getFriendNames()
public int getFriendCount()
```

### P3.8: [`Student.java`](./Student.java)

Implement a class `Student`. For the purpose of this exercise, a student has a name and a total quiz score. Supply an appropriate constructor and methods `getName()`, `addQuiz(int score)`, `getTotalScore()`, and `getAverageScore()`. To compute the average, you also need to store the *number of quizzes* that the student took.
