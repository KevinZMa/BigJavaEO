# Chapter 5: Decisions

## Programming Projects

### P5.1: [`Season.java`](./Season.java)

The following algorithm yields the season (Spring, Summer, Fall, or Winter) for a given month and day.

```py
if month is 1, 2, or 3, season = "Winter"
else if month is 4, 5, or 6, season = "Spring"
else if month is 7, 8, or 9, season = "Summer"
else if month is 10, 11, or 12, season = "Fall"
if month is divisible by 3 and day >= 21
   if season is "Winter", season = "Spring"
   else if season is "Spring", season = "Summer"
   else if season is "Summer", season = "Fall"
   else season = "Winter"
```

Write a program that prompts the user for a month and day and then prints the season, as determined by this algorithm. Use a class `Date` with a method `getSeason`.

### P5.2: [`Horoscope.java`](./Horoscope.java)

Write a program that prompts for the day and month of the user’s birthday and then prints a horoscope. Make up fortunes for programmers, like this:

```
Please enter your birthday (month and day): 6 16
Gemini are experts at figuring out the behavior of complicated programs.
You feel where bugs are coming from and then stay one step ahead. Tonight,
your style wins approval from a tough critic.
```

Each fortune should contain the name of the astrological sign. (You will find the names and date ranges of the signs at a distressingly large number of sites on the Internet.) Use a class `Date` with a method `getFortune`.

<details>
    <summary>Astrological Signs</summary>

| Sign        | Start        | End          |
| ----------- | ------------ | ------------ |
| Aquarius    | January 21   | February 18  |
| Pisces      | February 19  | March 20     |
| Aries       | March 21     | April 19     |
| Taurus      | April 20     | May 20       |
| Gemini      | May 21       | June 20      |
| Cancer      | June 21      | July 22      |
| Leo Dates   | July 23      | August 22    |
| Virgo       | August 23    | September 22 |
| Libra       | September 23 | October 22   |
| Scorpio     | October 23   | November 21  |
| Sagittarius | November 22  | December 21  |
| Capricorn   | December 21  | January 20   |

[Source](https://www.astrology.com/article/zodiac-sign-dates/)

> **Note**
> The start/end dates may vary by 1-2 days.

</details>

### P5.13: [`PIN.java`](./PIN.java)

When you use an automated teller machine (ATM) with your bank card, you need to use a personal identification number (PIN) to access your account. If a user fails more than three times when entering the PIN, the machine will block the card. Assume that the user’s PIN is "1234" and write a program that asks the user for the PIN no more than three times, and does the following:

-   If the user enters the right number, print a message saying, "Your PIN is correct", and end the program.
-   If the user enters a wrong number, print a message saying, "Your PIN is incorrect" and, if you have asked for the PIN less than three times, ask for it again.
-   If the user enters a wrong number three times, print a message saying "Your bank card is blocked" and end the program.

### P5.14: [`Tip.java`](./Tip.java)

Calculating the tip when you go to a restaurant is not difficult, but your restaurant wants to suggest a tip according to the service diners receive. Write a program that calculates a tip according to the diner’s satisfaction as follows:

-   Ask for the diners’ satisfaction level using these ratings: 1 = Totally satisfied, 2 = Satisfied, 3 = Dissatisfied.
-   If the diner is totally satisfied, calculate a 20 percent tip.
-   If the diner is satisfied, calculate a 15 percent tip.
-   If the diner is dissatisfied, calculate a 10 percent tip.
-   Report the satisfaction level and tip in dollars and cents.
