package com.kodilla.testing.collection;

        import org.junit.*;
        import sun.jvm.hotspot.jdi.IntegerTypeImpl;

        import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Collection Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Collection Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Collection Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Collection Test Suite: end");
    }
@Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    ArrayList<Integer> numbers = new ArrayList<>();

    ArrayList<Integer>expectedResult = new ArrayList<>();

    // When
    ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);

    // Then
    Assert.assertEquals(expectedResult, result);

        }

@Test
    public void testOddNumbersExterminatorNormalList(){

            // Given
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);

            ArrayList<Integer> expectedResult = new ArrayList<>();
            expectedResult.add(2);
            expectedResult.add(4);

            // When
            ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);

            // Then
            Assert.assertEquals(expectedResult, result);
        }
    }

