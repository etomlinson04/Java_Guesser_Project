all: Guesser.class


Guesser.class: Guesser.java
	javac -g Guesser.java

run: all
	java Guesser

clean:
	rm -f *.class
