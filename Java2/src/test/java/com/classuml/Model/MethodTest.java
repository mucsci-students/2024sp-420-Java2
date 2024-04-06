package com.classuml.Model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;

public class MethodTest {
  private Method method;

  @SuppressWarnings("unlikely-arg-type")
  @Test
	public <MyClass> void Method() {         
		Method m = new Method("test");
		m.addParameter("int", "p1");
		assertEquals("test",m.getName());
		assertEquals("p1",m.getParameter("p1").getName());
		assertEquals("int",m.getParameter("p1").getType());
		m.setName("test1");
		SortedSet<Parameter> parameters = new TreeSet<Parameter>();
		Parameter p = new Parameter("string", "p2");
		parameters.add(p);
		m.setParameters(parameters);
		m.setType("int");
		assertEquals("test1",m.getName());
		assertEquals(parameters,m.getParameters());
		assertEquals("int test1 string p2", m.toString());
		
		Method m1 = new Method("test1");
		m1.setParameters(parameters);
		assertTrue(m.equals(m1));
		m1.setName("t1");
		assertFalse(m.equals(m1));

    parameters = new TreeSet<>();
    parameters.add(new Parameter("int", "p1"));
    method = new Method("testMethod", "void", parameters);

    method.deleteParameter("p1");
    assertFalse(method.containsParameter("p1"));
    Method anotherMethod = new Method("anotherMethod", "void", parameters);
    assertTrue(method.compareTo(anotherMethod) != 0);

    Method sameMethod = new Method("testMethod", "int", parameters);
    Method differentMethod = new Method("testMethod", "int", parameters);
    equals(sameMethod);
    assertNotEquals(differentMethod, method);

    method.addParameter("string", "p2");
    assertTrue(method.containsParameter("p2"));
    equals( method.getType());
                
    Method method1 = new Method("testMethod", "void", parameters);
    Method method2 = new Method("anotherMethod", "void", parameters);
    Method methodNull = new Method(null, "void", parameters);
        
    assertEquals("Comparing method with itself should return 0", 0, method.compareTo(method));
    assertEquals("Comparing method with identical method should return 0", 0, method.compareTo(method1));
    assertTrue("Comparing method with method of different name should not return 0", method.compareTo(method2) != 0);
    assertTrue("Comparing method with null-named method should return positive", method.compareTo(methodNull) > 0);
    assertTrue("Comparing null-named method with method should return negative", methodNull.compareTo(method) < 0);
                
    String expectedGUIString = "testMethod void(string p2)";
    assertEquals("toStringGUI should return the correct String", expectedGUIString, method.toStringGUI());
    Method method = new Method();
    assertNotNull("Instance should be created", method);
	}
}
