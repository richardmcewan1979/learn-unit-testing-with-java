# learn-unit-testing-with-java
My notes for learning unit testing with Java

New priority: (fix below) still need to get more confident setting up the JUnit 5 tests alongside project...AND working with version control/git.

Issue: IntelliJ was not recognising Jupiter - some issues configuring perhaps. 
Fix: Just go into project structure and depdenices and select compile on JUnit from drop down. 

Alternative approach works to set up with Maven or Gradle but get a lot of build files and wrappers. May be fixed, leave this here till sorted. 

Setting up Junit5 
Via Gradle. See blog video below from T Gee:
CMD N on Gradle build file (think that is POM - have a go).
Type JUnit in Archetype box. Select 5.6.2 (or most recent see JUNit Git).
Need to add to dependencies -> compile "org.junit.jupiter:junit-jupiter:5.6.2"
Add 
test{
  useJUnitPlatform()
}
Then CMD N create test class, CMD N generate test etc

Setting up JUnit via Maven.
Create project with Maven > select helloworld archetype or simple. see attached Readme on setting up Maven dependencies: Readme_setup_maven.md. Need to work out how to default configure to Jupiter.

Side questions: Can I write a simple class and test class via sublime and run it out of terminal? Dig around to learn how to execute builds etc from command line. Can launch command line in IntelliJ with integration. 

////////
---Some learning resources to get started, 
search for * for leads what to explore next---
////////

Entry point: 

JetBrains 
Wriing test with JUnit 5, Trisha Gee (includes sorting dependencies Gradle (I am using Maven so some tinkering with POM see above).
https://blog.jetbrains.com/idea/2020/09/writing-tests-with-junit-5/

Other resources:

Pragmatic Unit Testing in Java with JUnit, A Hunt & D Thomas * almost read

Mastering Software testing with JUnit 5, B García. *

* I like this person, C V Guntar. He did a nice video via IntelliJ youtube on Maven. his blog, which includes a JUnit section, here: https://cguntur.me/


JUnit Team *
https://github.com/junit-team 
https://junit.org

JetBrains 
Wriing test with JUnit 5, Trisha Gee (includes sorting dependencies Gradle.
https://blog.jetbrains.com/idea/2020/09/writing-tests-with-junit-5/


Mastering Java course, Udemy, Tim Bulchalka *

OCP Java SE 11 Developer Complete Study Guide, J Boyarsky & S Selikoff 


Questions what is different in Junit 4 and 5? *
What is Spock?
What is Mockito?
*Guess above is for mocking objects I want to test. How does that work for GUI. See JavaFX (JavaFXTest or similar name also see Flutter for UI).


DONE - Add some notes on configuration and getting a unit tests up and running in IntelliJ.

Task: 
1) Follow some recommended tasks to establish all is working as intended.
2) write a FizzBuzz exercise with TDD and Junit 5.


Some further notes:

From Pragmatic Unit Testing.

General Principles:

-Test anything that might break

-Test everything that dies break

-New code is guilty until proven innocent

-Write at least as much test code as production code

-Run local tests with each compile

-Run all tests before check-in to repository

some questions: 

If the code ran correctly, how would I know?

How am I going to test this?

What else can go wrong?

Could this same kind of problem happen anywhere else?

See Largest as example for a test to find the largest value element of an array. [Edit add code for reference, I couldn't locate it as it appears as RAW maybe due to being built and turned to bytecode]

Note Largest number in array example is later extended see the example concept via TestLargestDataFile p39. See also TestSuite and custom asserts addressed in earlier sections for test classes containing test classes etc. 

JUnit skeleton requires:

1) An import statement to bring in junit.framework.* (or similar such as import org.junit.Test;)
2) An extends statement so your class will inherit from TestCase
3) A constructor with a call to super(string)
*Cannot see all of these in JUnit5

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

Next section to make some notes on is Using Mock Objects Chapter 6...

To do:

Make notes on Chapter 6 through up to Appendic C (to complte read). Appendix contains links and bibliography. *

Summary questions and acronyms on p140 including A-Trip which needs further notes here. 

A-TRIP

Automatic

Thorough

Repeatable

Independent

Professional.

/////Done//////

Set up JUnit 5 with Maven

created live template 'test' for test methods

Started FizzBuzz programme for learning testing: see Example folder

Question: how can do I test the for loop - directly via some kind of parametric, by refactoring the code to make testable or indirectly as attempted in penultimate test?




