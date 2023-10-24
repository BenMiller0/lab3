import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    
    @Test
    public void testMerge(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");list1.add("b");list1.add("c");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("d");list2.add("e");list2.add("f");
        
        assertEquals("1", "2");
    }
}
