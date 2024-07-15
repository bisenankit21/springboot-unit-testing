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

@DisplayName  :- Custom display name with spaces, special caharcters and emojis. useful for test report in IDE or external test runner
Junit can generate dispaly names for you
Simple -- Remove trailling parenthesis from the test method name.
ReplaceUnderscores  -- Replaces underscoe in test method name with spaces.
IndicativeSentences -- generate senetence based on test class name and test method name.
how to write ---   @DisplayNameGeneration(DisplayNameGenerator.Simple.class)   --define at the top top of the class



assertSame = Assert that items refer to same object
assertNotSame = assert that items do not refer to same object

Test for true or false
assertTrue  = assert that condition is true;
assertFalse= assert that condition is false


assertIterableEquals  -- assert that both object iterables are deeply equal
assertLinesMatch  -- assert that both lists of string match

assertThrows(Exception.class , ()->{object.function_call()};,"Should throw an exception");
assertDoesNotThrow(()->{object.function_call()}, should not throw an exception)

assertTimeoutPreemptively -- assert tha an executable completes before given timeout is exceeded

@TestMethodOrder - Configure the order/ sort algorithm for the test methods
Specify method order - 
    1. MethodOrderer.DisplayName  - Sort test method alphanumerically based on display names
     2. MethodOrderer.MethodName  - Sort test method alphanumerically based on method names
3. MethodOrderer.Random   - Pseudo random order based on @method name
4. MethodOrderer.OrderAnnotation  - Sort test method numerically based on order annoation


@Order   -- Mannually specify the order with an int number
            --order with lowest number has highest priority
            --Negative numbers are allowed

@Disabled   -- Disable a test method
@EnableOnOs   --Enable test when running on a given operating system.
@EnebaledOnJre- Enable on specific Java version range 
@ParameterizedTest  -  Junit will run the test multiple times and supply the data. Junit  does the looping for you.
values  :- 1. @ValueSource - Arrays of values : Sting. ints, doubles, floats ets
           2. @CsvSource - Array of CSV String Values
           3. @CsvFileSource  :-  CSV values reads from a file
           4. @EnumSource :- Enum Constant Values
           5. @MethodSource  :-  Custom method for providing values

