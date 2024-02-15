package edu.pdx.cs410J.pair3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RequestTest {
    @Test
    void TestConstructor() {
        Requests requests = new Requests("plane", 1, 2, 3);
        assertEquals("plane", requests.getPlane());
        assertEquals(1, requests.getBegin());
        assertEquals(2, requests.getDuration());
        assertEquals(3, requests.getPrice());
        assertEquals(3, requests.getEnd());
    }


}
