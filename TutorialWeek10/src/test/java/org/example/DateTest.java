package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DateTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addDays() {
        Date testDate = new Date(01, 01, 2000);
        Date expectedDate = new Date(15, 01, 2000);

        testDate.addDays(14);

        assertEquals(expectedDate, testDate);
    }

    @Test
    public void addDaysWrapping() {
        Date testDate = new Date(28, 12, 2019);
        Date expectedDate = new Date(1, 1, 2020);

        testDate.addDays(4);

        assertEquals(expectedDate, testDate);
    }

    @Test
    public void printDate() {
        PrintStream originalPrintStream = System.out;
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        Date testDate = new Date(28, 12, 2019);
        testDate.printDate();
        assertEquals(String.format("28/12/2019%n"), outputStream.toString());
    }
}