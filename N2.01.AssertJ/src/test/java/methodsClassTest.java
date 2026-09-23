import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class methodsClassTest {

    @Test
    @DisplayName("Equals and NotEquals")
    void checkEquals() {
        assertThat(1).isEqualTo(1);
        assertThat(2).isNotEqualTo(1);
    }

    @Test
    @DisplayName("The reference of 2 objects is the same")
    void checkReference() {
        Book book1 = new Book();
        Book book2 = book1;

        assertThat(book1).isSameAs(book2);
    }

    @Test
    @DisplayName("Two arrays are the same")
    void checkArrays() {
        List<Integer> list1 = List.of(1,2,3,4);
        List<Integer> list2 = List.of(1,2,3,4);

        assertThat(list1).isEqualTo(list2);
    }

}