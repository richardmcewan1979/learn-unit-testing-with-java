# learn-unit-testing-with-java
My notes for learning unit testing with Java

New priority: get confident setting up the JUnit 5 tests alongside project...
Issue: IntelliJ not recognising Jupiter, alternatively set up with Maven or Gradle but get a lot of build files and wrappers. 
Side question: Can I write a simple class and test class via sublime and run it out of terminal?

Some learning resources to get started:

Entry point: 

Pragmatic Unit Testing in Java with JUnit, A Hunt & D Thomas

Mastering Software testing with JUnit 5, B García.

other

JUnit Team 
https://github.com/junit-team 
https://junit.org

JetBrains 
Wriing test with JUnit 5, Trisha Gee (includes sorting dependencies via Maven or Gradle - [Edit: as I can't recall which].
https://blog.jetbrains.com/idea/2020/09/writing-tests-with-junit-5/

Mastering Java course, Udemy, Tim Bulchalka
OCP Java SE 11 Developer Complete Study Guide, J Boyarsky & S Selikoff 


Questions what is different in Junit 4 and 5?
What is Spock?
What is Mockito?


Add some notes on configuration and getting a unit tests up and running in IntelliJ.

Task: 
1) Follow some recommended tasks to establish all is working as intended.
2) write a FizzBuzz exercise with TDD and Junit 5.


Some further notes:

From Pragmatic Unit Testing.

See Largest as example for a test to find the largest value element of an array. 
Note that approach is later extended see the example concept via TestLargestDataFile p39. See also TestSuite and custom asserts addressed in earlier sections for test classes containing test classes etc. 

JUnit skeleton requires:

1) An import statement to bring in junit.framework.* (or similar)
2) An extends statement so your class will inherit from TestCase
3) A constructor with a call to super(string)

DRY - test conform to: Don't Repeat Yourself - Note see annotations such as @Before e.g. in case of reading a file

Right BICEP

If the code ran correctly, how would I know?

Right - are the results right?

B - are all the BOUNDARY conditions CORRECT?

I - can you check INVERSE relationships? e.g. square root function should match expected square

C - can you CROSS-CHECK results e.g. two data sources agree

E - can you force ERROR CONDITIONS to happen?

P - are PERFORMANCE CHARACTERISTICS within bounds e.g. run tests at various scale to check linear regression as expected 

See also

CORRECT

What else can go wrong?

Conformance - does the value conform to the expected format?

Ordering - is the set of values ordered or unordered as appropriate

Range - is the value within reasonable minimum and maximum values?

Reference - Does the code reference anything external that isn't under the direct control of the code?

Existence - Does the value exist? e.g. non-null, non-zero, present in the set etc

Cardinality - Are there enough values?

Time - Absolute and relative, is everything happening in order? At the right time? in time?

with respect to Range - p51 Bearings example AND stack example of an array p54 has some useful criteria to consider upon testing an array.

With respect to Reference - pre-conditions and post-conditions. Example, car transmission p55.

with respect to Existence - would would happen to the method if the value didn't exist, if it were null, or blank or zero? Consider URL, file, network, user input, etc test with plenty of nulls, zeros, empty strings and other 'nihilist trappings'.

with respect to Cardinality - counting bugs - fencepost errors example "| | | | |" 5 posts 3 feet apart partition a 12 foot distance end to end - not 12/3 = 4 posts. See also "0-1-n Rule". See criteria to consider on p57.

with respect to Time - Relative time, Absolute time and concurrency issues. Interesting example of Daylight Savings Time (DST) and Universal Coordinated Time (UTC). I recall some new Time (stamp) features of Java 8 or 11. Might wish to trigger back here when I learn more. All this is especially important for my project (maze solving robot) where real-time coordination will be critical. 

Next sectoon to make some notes on is Mock Objects...
