package test3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticingGitTest {
    @Test void TestFoobar1(){
        int[] data = {1,2,3,4,5};
        PracticingGit p = new PracticingGit();


        assertEquals(false, p.foobar(data));
    }

    @Test void TestFoobar2(){
        int[] data = {1,2,3,4};
        PracticingGit p = new PracticingGit();


        assertEquals(true, p.foobar(data));
    }

    
    @Test void TestFoobar3(){
        int[] data = {-1,-2,-3,-4};
        PracticingGit p = new PracticingGit();


        assertEquals(true, p.foobar(data));
    }

    
    @Test void TestFoobar4(){
        int[] data = {1};
        PracticingGit p = new PracticingGit();


        assertEquals(false, p.foobar(data));
    }

    @Test void TestFoobar5(){
        int[] data = {2};
        PracticingGit p = new PracticingGit();


        assertEquals(true, p.foobar(data));
    }

    @Test void TestFoobar6(){
        int[] data = {};
        PracticingGit p = new PracticingGit();


        assertEquals(true, p.foobar(data));
    }



    
}
