package org.egov.bootcamp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void sanity() throws Exception {
        assertEquals(1, 1);
        assertTrue(true);
        assertFalse(false);
        assertNotEquals(1, 0);
        assertArrayEquals(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3});
    }
}