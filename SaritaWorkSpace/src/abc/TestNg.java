package abc;

import org.testng.annotations.Test;

public class TestNg {
@Test
	public void test() {
		System.out.println("m");
	}

@Test
public void test1() {
	System.out.println("a");
}

@Test(priority = -1)
public void test2() {
	System.out.println("s");
}

}
