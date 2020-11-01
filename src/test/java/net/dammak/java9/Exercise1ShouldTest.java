package net.dammak.java9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

class Exercise1ShouldTest {

    @Test
    void get_members_by_family_name() {
        var family1 = Exercise1.Family.builder().name("Name1").firstNames(List.of("A","B","C")).build() ;
        var family2 = Exercise1.Family.builder().name("Name2").firstNames(List.of("D","E")).build() ;
        var family3 = Exercise1.Family.builder().name("Name1").firstNames(List.of("F","G")).build() ;
        var result = new Exercise1().getMembersBySameName(List.of(family1,family2,family3)) ;
        assertThat(result).containsExactly(
                entry("Name1",List.of("A","B","C","F","G")),
                entry("Name2",List.of("D","E"))) ;
    }

}