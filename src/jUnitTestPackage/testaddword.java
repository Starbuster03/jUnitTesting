package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddword {

	@Test
	public void test() {
		jUnitTestPackage.jUnitFunctions a = new jUnitTestPackage.jUnitFunctions();
		a.AddStrings("Tejas", "Iyer");
	}

}
