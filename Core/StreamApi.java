import java.util.*;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,7,3,4);

         Stream<Integer> stream1 = list.stream(); 
         Stream<Integer> sortedData = stream1.sorted();
         Stream<Integer> doubleVal = sortedData.map(m -> m*2);

         doubleVal.forEach(n -> System.out.println(n));
         

        
    }
}
