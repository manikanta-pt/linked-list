package org.egov.bootcamp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.AssertionFailedError;

public class LinkedListTest {

    //List<Double> list = new LinkedList<Double>(Arrays.asList(1.2,1.3,3.2));

    private LinkedList<Integer> ll = new LinkedList<>();

    @Before
    public void setUp(){
    }
    @Test
    public void add() throws Exception
    {
        ll.add(1);
       
    }
    /**
     * @throws Exception
     */
    @Test
    public void addVerfy()throws Exception
    {
        Integer intOne=new Integer(1);
        ll.add(intOne);
        Object[] array = ll.toArray();
        assertEquals(1,array.length);
        assertEquals(intOne, (Integer)array[0]);
    }
    
    
    @Test(expected=NullPointerException.class)
    public void addNull()throws Exception
    {
       
        ll.add(null);
    }
    
    
    
    
    /*@Test
    public void addVerfyFaiure()throws Exception
    {
        Integer intOne=new Integer(1);
        Integer intTwo=new Integer(2);
        ll.add(intOne);
        Object[] array = ll.toArray();
        assertEquals(1,array.length);
        assertNotSame(intTwo, (Integer)array[0]);
    }
    
    @Test
    public void addVerifyarray()throws Exception
    {
        Integer[] actualarray = new Integer[]{1};
        Integer intOne=new Integer(1);
        ll.add(intOne);
        Object[] array = ll.toArray();
        assertArrayEquals(actualarray,array);
        
    }*/
    
    @Test
    public void length()throws Exception{
        Integer intOne=new Integer(1);
        Integer intTwo=new Integer(2);
        ll.add(intOne);
        ll.add(intTwo);
        assertEquals(2,ll.length());
        
    }
    
    
    @Test
    public void remove()throws Exception{
        Integer intOne=new Integer(1);
        Integer intTwo=new Integer(2);
        ll.add(intOne);
        ll.add(intTwo);
        assertTrue(ll.remove(intTwo));
        assertEquals(1,ll.length()); 
        
        
    }

    @Test
    public void addDuplicate()throws Exception
    {
        Integer intOne=new Integer(1);
        ll.add(intOne);
        ll.add(intOne);
        assertEquals(2, ll.length());
    }

    @Test
    public void addOrder()throws Exception
    {
        Integer intOne=new Integer(1);
        Integer intTwo=new Integer(2);
        Integer intThree=new Integer(3);
        Integer intFour=new Integer(4);
        ll.add(intOne);
        ll.add(intTwo);
        Integer[] actualarray = new Integer[]{1,2};
        assertArrayEquals(actualarray, ll.toArray());
        ll.add(intThree);
        Integer[] actualarray3 = new Integer[]{1,2,3};
        assertArrayEquals(actualarray3, ll.toArray());
        ll.add(intFour);
        Integer[] actualarray4 = new Integer[]{1,2,3,4};
        assertArrayEquals(actualarray4, ll.toArray());
        
        
    }

    @Test
    public void insert()throws Exception
    {
        Integer intOne=new Integer(1);
        Integer intTwo=new Integer(2);
        Integer intThree=new Integer(3);
        Integer intFour=new Integer(4);
        ll.add(intOne);
        ll.add(intTwo);
        ll.insert(intThree,1);
        Integer[] actualarray3 = new Integer[]{1,3,2};
        assertArrayEquals(actualarray3, ll.toArray());
        ll.insert(intFour,1);
        Integer[] actualarray4 = new Integer[]{1,4,3,2};
        assertArrayEquals(actualarray4, ll.toArray());
        
        
    }


   
}