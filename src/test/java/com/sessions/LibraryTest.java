package com.sessions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    Library library = new Library();

    public int totalBooksInLibrary () {
        return library.getBooks().size();
    }

    /* It will trigger before all tests */
    @BeforeAll
    public static void beforeAll () {
        System.out.println("beforeAll");
    }

    /* It will trigger after all tests */
    @AfterAll
    public static void afterAll () {
        System.out.println("afterAll");
    }

    /* It will trigger before each test */
    @BeforeEach
    public void beforeEach () {
        System.out.println("beforeEach");
    }

    /* It will trigger after each test */
    @AfterEach
    public void afterEach () {
        System.out.println("afterEach");
    }

    @Test
    public void check_default_number_of_books_in_library_is_1_initially () {

        String nameOfFirstBook = library.getBooks().get(0).getName();

        assertEquals(2, totalBooksInLibrary());
        assertEquals("The God Of Small Things", nameOfFirstBook);

    }

    @Test
    public void adding_a_new_book_and_checking_total_books_and_whether_book_is_created () {

        library.addToCatalogue("Sita", "Devdutt U.", 100, 11.99);
        
        assertEquals(3, totalBooksInLibrary());

    }

    @Test
    public void find_an_available_book_to_check_not_null_value () {
        
        Book searchedBook = library.findBookByName("Inner Engineering");

        assertNotNull(searchedBook);

    }

    @Test
    public void find_an_unavailable_book_to_check_null_value () {
        
        Book searchedBook = library.findBookByName("Invalid book name");

        assertNull(searchedBook);

    }

}
