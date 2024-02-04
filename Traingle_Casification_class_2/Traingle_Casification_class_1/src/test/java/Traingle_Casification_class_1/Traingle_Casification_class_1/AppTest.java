package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();//mistake we change it too
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void check_Scalene(){
        int a = 2;
        int b = 2;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1fc2fc3f4f(){
        int a = 1;
        int b = 4;
        int c = 6;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1fc2fc3f4t(){
        int a = 5;
        int b = 2;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1fc2fc3t4f(){
        int a = 2;
        int b = 5;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1fc2tc3f4f(){
        int a = 2;
        int b = 2;
        int c = 5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1tc2fc3f4f(){
        int a = 2;
        int b = 3;
        int c = 4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1tc2fc3f4t(){
        int a = 3;
        int b = 2;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1tc2tc3f4f(){
        int a = 2;
        int b = 3;
        int c = 2;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void c1tc2tc3t4t(){
        int a = 3;
        int b = 3;
        int c = 3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
}