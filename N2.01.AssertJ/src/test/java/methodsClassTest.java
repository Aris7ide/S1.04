import instruments.Bajo;
import instruments.Guitar;
import instruments.Piano;
import instruments.Ukulele;
import instruments.Instrument;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    @DisplayName("Check the order of the elements of an ArrayList")
    void checkArrayElements() {
        List<Instrument> instrumentList = new ArrayList<>();
        Guitar guitar = new Guitar("Stratocaster");
        Piano piano = new Piano("Yamaha");
        Ukulele ukulele = new Ukulele("XTZ");
        Bajo bajo = new Bajo("Bajo increible");

        instrumentList.add(guitar);
        instrumentList.add(piano);
        instrumentList.add(ukulele);

        assertThat(instrumentList).containsExactly(guitar,piano,ukulele);

        assertThat(instrumentList).containsExactlyInAnyOrder(piano,ukulele,guitar);

        assertThat(instrumentList).containsOnlyOnce(guitar);

        assertThat(instrumentList).doesNotContain(bajo);
    }

    @Test
    @DisplayName("Check that Map has one of the elements")
    void checkMap() {
        Map<Integer, String> houses = new HashMap<>();

        houses.put(1,"Casa 1");
        houses.put(2,"Casa 2");

        assertThat(houses).containsKey(1);
    }

}