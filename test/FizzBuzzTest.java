import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void given_2_should_return_2 (){
        Assert.assertEquals("2", new FizzBuzz().get(2));
    }
    @Test
    public void given_3_should_return_3 (){
        Assert.assertEquals("Fizz", new FizzBuzz().get(3));
    }
    @Test
    public void given_4_should_return_4 (){
        Assert.assertEquals("4", new FizzBuzz().get(4));
    }
    @Test
    public void given_5_should_return_5 (){
        Assert.assertEquals("Buzz", new FizzBuzz().get(5));
    }
    @Test
    public void given_15_should_return_15 (){
        Assert.assertEquals("FizzBuzz", new FizzBuzz().get(15));
    }

    @Test
    public void reward (){
        Assert.assertEquals("FizzBuzz", new FizzBuzz().get(150));
        Assert.assertEquals("FizzBuzz", new FizzBuzz().get(1500));
        Assert.assertEquals("1449", new FizzBuzz().get(1449));
        Assert.assertEquals("Fizz", new FizzBuzz().get(1447));
        Assert.assertEquals("Buzz", new FizzBuzz().get(1445));
    }

    private static class FizzBuzz {
        public String get(int position){
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
