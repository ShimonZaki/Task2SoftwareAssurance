package  Root_classificatin.Root_classificatin;
import org.junit.Assert;
import org.junit.Test;
import Root_classificatin.Root_classificatin.Roots;
import Root_classificatin.Root_classificatin.Root_Types;

public class RootsTest {

    @Test
    public void testNotQuadratic_Min() {
        Roots.calculate_roots(0, 0, 0); // a = 0, not a quadratic equation
        Assert.assertEquals(Root_Types.Not_quadratic, Roots.root_types());
    }

    @Test
    public void testNoRoots_MinPlusOne() {
        Roots.calculate_roots(1, 1, 1); // Discriminant < 0, no real roots
        Assert.assertEquals(Root_Types.No_roots, Roots.root_types());
    }

    @Test
    public void testNoRoots_Nominal() {
        Roots.calculate_roots(25, 25, 50); // Discriminant < 0, no real roots
        Assert.assertEquals(Root_Types.No_roots, Roots.root_types());
    }

    @Test
    public void testNoRoots_MaxMinusOne() {
        Roots.calculate_roots(49, 49, 99); // Discriminant < 0, no real roots
        Assert.assertEquals(Root_Types.No_roots, Roots.root_types());
    }

    @Test
    public void testNoRoots_Max() {
        Roots.calculate_roots(50, 50, 100); // Discriminant < 0, no real roots
        Assert.assertEquals(Root_Types.No_roots, Roots.root_types());
    }
}
