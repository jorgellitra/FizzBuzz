import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void given_2_should_return_2 (){
        assertThat(new FizzBuzz().of(2), is("2"));
    }
    @Test
    public void given_3_should_return_3 (){
        assertThat(new FizzBuzz().of(3), is("Fizz"));
    }
    @Test
    public void given_4_should_return_4 (){
        assertThat(new FizzBuzz().of(4), is("4"));
    }
    @Test
    public void given_5_should_return_5 (){
        assertThat(new FizzBuzz().of(5), is("Buzz"));
    }
    @Test
    public void given_15_should_return_15 (){
        assertThat(new FizzBuzz().of(15), is("FizzBuzz"));
    }

    @Test
    public void reward (){
        assertThat(new FizzBuzz().of(150), is("FizzBuzz"));
        assertThat(new FizzBuzz().of(1500), is("FizzBuzz"));
        assertThat(new FizzBuzz().of(1449), is("Fizz"));
        assertThat(new FizzBuzz().of(1447), is("1447"));
        assertThat(new FizzBuzz().of(1445), is("Buzz"));
    }

    private static class FizzBuzz {
        public String of(int position){
            return get(fizzOf(position) + buzzOf(position), String.valueOf(position));
        }

        private String fizzOf(int position) {
            return position % 3 == 0 ? "Fizz" : "";
        }

        private String buzzOf(int position) {
            return position % 5 == 0 ? "Buzz" : "";
        }

        private String get(String... text) {
            return text[0].isEmpty() ? text[1] : text[0];
        }

    }
}
