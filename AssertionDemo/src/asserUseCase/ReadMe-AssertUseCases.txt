1. pre-conditions (in private methods only) - the requirements which a method requires its caller to fulfill
2. post-conditions - verify the promises made by a method to its caller
3. class invariants - validate object state
4. unreachable-at-runtime code - parts of your program which you expect to be unreachable, but which cannot be verified as such at compile-time 
(often else clauses and default cases in switch statements)