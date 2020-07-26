package tdd_junit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class stringRemovalTest
{
    stringRemoval string_removal;
    
	@Before
	public void setup()
	{
		string_removal = new stringRemoval();
    }
    @Test
	public void noChar()
	{
		assertEquals("",string_removal.removeChar(""));
	}
	@Test
	public void firstChar()
	{
		assertEquals("BCD",string_removal.removeChar("ABCD"));
	}
	@Test
	public void firstTwoChar()
	{
		assertEquals("CD",string_removal.removeChar("AACD"));
	}
	@Test
	public void secondChar()
	{
		assertEquals("BCD",string_removal.removeChar("BACD"));
	}
	@Test
	public void noChar()
	{
		assertEquals("BBAA",string_removal.removeChar("BBAA"));
	}
	@Test
	public void nextChar()
	{
		assertEquals("BAA",string_removal.removeChar("AABAA"));
	}

}