# Java_Guesser_Project

##**Main loop**
1. show menu and read the choice.
2. 1 = humanGuesser(), 2 = computerGuesser(), 0 = exit
3. Repeat until the choice is 0.

##**Human guesser**
1. target = random 1-100, count = 0.
2. loop: count++, read the guess
3. if guess < target, print "too low", if guess > target print "too high". Otherwise print "you guessed it!" and stop.

##**Computer guesser**
1. low = 1, high = 100, count = 0.
2. loop: guess = (low + high) / 2, count++ then print the guess read H/L/C.
3. If H: high = guess - 1, If L: low = guess + 1, if C: stop.
