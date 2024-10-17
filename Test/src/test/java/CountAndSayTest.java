import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
@DisplayName("Junit: CountAndSayTest")
class CountAndSayTest {


   /* @Test
    @DisplayName("Test method count and Say")
    public void countAndSayTestMethod() {
        String actualResult = CountAndSay.compressString("aaaaabbbcccaaddd");
        Assertions.assertEquals(actualResult, "a5b3c3a2d3");
    }*/


    @ParameterizedTest
    @MethodSource("getRequestParams")
    @DisplayName("Test compressString")
    public void testCompressString(String input, String output) {
        String actualResult = CountAndSay.compressString(input);
        Assertions.assertEquals(actualResult, output);
    }


    private static Stream<Arguments> getRequestParams() {
        return Stream.of(
                Arguments.of("abc", "a1b1c1"),
                Arguments.of("aaaaabbbcccaaddd", "a5b3c3a2d3"),
                Arguments.of("", "")
        );
    }

}