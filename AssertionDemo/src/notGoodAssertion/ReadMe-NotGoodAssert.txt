Caution must guide the development of the expressions used in assertstatements.
In addition to not producing side effects, assertions should not alter normal program execution.
As a pathological example, the Pathological.java class enters an infinite recursion when 
assertions are enabled and only stops when a StackOverflowError brings the program to a 
crashing halt.