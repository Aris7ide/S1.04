import instruments.Bajo;
import instruments.Guitar;
import instruments.Piano;
import instruments.Ukulele;
import instruments.Instrument;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

class methodsClassTest {

    @Test
    @DisplayName("Equals and NotEquals")
    void shouldEquals() {
        assertThat(1).isEqualTo(1);
        assertThat(2).isNotEqualTo(1);
    }

    @Test
    @DisplayName("The reference of 2 objects is the same")
    void shouldMatch() {
        Book book1 = new Book();
        Book book2 = book1;

        assertThat(book1).isSameAs(book2);
    }

    @Test
    @DisplayName("The reference of 2 Objects is not the same")
    void shouldNotMatch() {
        Book book1 = new Book();
        Book book2 = new Book();

        assertThat(book1).isNotSameAs(book2);
    }

    @Test
    @DisplayName("Two arrays are the same")
    void shouldMatchArrays() {
        Integer[] arrayA = {1,2,3,4};
        Integer[] arrayB = {1,2,3,4};

        assertThat(arrayA).isEqualTo(arrayB);
        assertThat(arrayA).containsExactly(arrayB);
    }

    @Test
    @DisplayName("Check the order of the elements of an ArrayList")
    void shouldMatchArrayElements() {
        List<Object> mixedList = new ArrayList<>();
        Guitar guitar = new Guitar("Stratocaster");
        Piano piano = new Piano("Yamaha");
        Ukulele ukulele = new Ukulele("XTZ");
        String string = "ABC";
        Bajo bajo = new Bajo("Bajo increible");

        mixedList.add(guitar);
        mixedList.add(piano);
        mixedList.add(ukulele);
        mixedList.add(string);

        assertThat(mixedList).containsExactly(guitar,piano,ukulele,string);

        assertThat(mixedList).containsExactlyInAnyOrder(piano,ukulele,guitar,string);

        assertThat(mixedList).containsOnlyOnce(guitar);

        assertThat(mixedList).doesNotContain(bajo);
    }

    @Test
    @DisplayName("Check that Map has one of the elements")
    void shouldExist() {
        Map<Integer, String> houses = new HashMap<>();

        houses.put(1,"Casa 1");
        houses.put(2,"Casa 2");

        assertThat(houses).containsKey(1);
    }

    @Test
    @DisplayName("Check ArrayIndexOutOfBound exception")
    void shouldThrowException() {
        assertThatThrownBy(() -> excepcionClass.exception(6)).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

    @Test
    @DisplayName("Check empty object")
    void shouldBeEmpty() {
        Optional<String> opEmpty = Optional.empty();

        assertThat(opEmpty).isEmpty();
    }
}