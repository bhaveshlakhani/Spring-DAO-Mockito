package com.ibaset.pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.mockito.Mockito.*;




public class Mockinteraction 
{

	@Test
	public void sampleMockTest()
	
	
	
	{
		List mockOne = mock(List.class);
		
		
		//List mockOne=new ArrayList();
		
		 mockOne.add("one");
		 
		 System.out.println(mockOne.add("one"));
		 System.out.println(mockOne.add("two"));

		 //ordinary verification
		 verify(mockOne).add("one");

		 //verify that method was never called on a mock
		 verify(mockOne, never()).add("two");

		 //verify that other mocks were not interacted
		// verifyZeroInteractions(mockTwo, mockThree);

		 
	
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