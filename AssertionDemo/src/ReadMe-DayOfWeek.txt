Here is an example of compiling and executing the sample program, DayOfWeek.java:

javac -source 1.4 DayOfWeek.java

java -ea DayOfWeek 1
Day of the week: Monday

java -ea DayOfWeek 6
Day of the week: Saturday

java -ea DayOfWeek 14
Day of the week: Sunday

java -ea DayOfWeek -2
Exception in thread "main" java.lang.AssertionError: -2
        at DayOfWeek.getDayOfWeek(DayOfWeek.java:34)
        at DayOfWeek.main(DayOfWeek.java:11)
As expected, the code does not handle negative numbers correctly.
