package com.ibaset.pattern;

import java.util.LinkedList;

import org.junit.Test;
import static org.mockito.Mockito.*;




public class SampleMock 
{

	@Test
	public void sampleMockTest()
	{
		LinkedList mockedList = mock(LinkedList.class);
		
		// stubbing appears before the actual execution
		when(mockedList.get(0)).thenReturn("first");
		
		when(mockedList.get(1)).thenReturn("second");

		// the following prints "first"
		System.out.println(mockedList.get(0));

		System.out.println(mockedList.get(1));

		// the following prints "null" because get(999) was not stubbed
		System.out.println(mockedList.get(999));
		
		verify(mockedList).get(0);
	
	}
}


/*
Other mock behavior which may be useful for you


//stubbing using built-in anyInt() argument matcher
 when(mockedList.get(anyInt())).thenReturn("element");


//stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
 when(mockedList.contains(argThat(isValid()))).thenReturn("element");
 
 
 verify(mock).someMethod(anyInt(), anyString(), eq("third argument"));
//above is correct - eq() is also an argument matcher
 
//exact number of invocations verification
 verify(mockedList, times(2)).add("twice");
 verify(mockedList, times(3)).add("three times");
 
 
 doThrow(new RuntimeException()).when(mockedList).clear();

   //following throws RuntimeException:
   mockedList.clear();
 
 
 
 find more Example---> http://static.javadoc.io/org.mockito/mockito-core/2.18.3/org/mockito/Mockito.html
 
*/