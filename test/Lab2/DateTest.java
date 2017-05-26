package Lab2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void leapYearNormal() {
		Date test=new Date();
		test.setDay(1);
		test.setMonth(1);
		test.setYear(1234);
		Date result = test.nextDate(test);
		System.out.println("Result: "+result.toString());
		Date expected=new Date(1234,1,2);
		Assert.assertEquals( expected.getDay(), result.getDay() );
		Assert.assertEquals( expected.getMonth(), result.getMonth() );
		Assert.assertEquals( expected.getYear(), result.getYear() );
	}
	
	@Test
	public void leapYearEdge() {
		Date test=new Date();
		test.setDay(28);
		test.setMonth(2);
		test.setYear(4000);
		Date result = test.nextDate(test);
		System.out.println("Result: "+result.toString());
		Date expected=new Date(4000,2,29);
		Assert.assertEquals( expected.getDay(), result.getDay() );
//		Assert.assertEquals( expected.getMonth(), result.getMonth() );
//		Assert.assertEquals( expected.getYear(), result.getYear() );
	}
	
	

}
