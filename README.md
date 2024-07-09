----------------------Junit------------------------------
Unit test have following structures
1. Set Up  --create  instance of the class
2. Execute  --call the method you want to test
3. Assert   --check the result and verify that it is the expected result 

assertEquals = assert that the values are equals
assertNotEquals = assert that the values are not euqal
assertNull= Assert that the values are null
assertNotNull = Assert that the value is not null
 format : assertEquals(expected, actual, optional message)

dependency we need to add :-
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<version>5.10.3</version>
<scope>test</scope>
</dependency>



we need to do some common operation like
Lifecycle method annotation :
1. @BeforeEach  - Method is executed before each test method(useful for common set up code : creating object, setting up test data)
2. @AfterEach - Method is executed after each test method ( Useful for common clean up code: releasing resources, cleaning up test data)
3. @BeforeAll- Method is executed only once, before all test methods.( useful for getting database connection, connecting to servers...)
4. @AfterAll - Method is executed only once, after all test methods(useful for releasing database connection, disconnecibg from servers)
5. NOte- @BeforeAll and @AfterALl method are by defoult static 



