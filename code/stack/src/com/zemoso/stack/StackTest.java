package com.zemoso.stack;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
    private MyStack stack;

    private void pushing3ElementsInStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }
    @Before
    public void setUp() throws Exception {
        stack= new MyStack(3);
    }
    @Test
    public void newlyCreatedStacksShouldBeEmpty() throws Exception {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void addingAnElementMustIncreaseSize() throws Exception {
        stack.push(1);
        assertEquals(1, stack.getSize());
    }

    @Test
    public void pushingThreeElementsAndPoppingOne_ShouldReturnTwo() throws Exception{
        pushing3ElementsInStack();
        stack.pop();
        assertEquals(2, stack.getSize());
    }
    @Test(expected = MyStack.OverflowError.class)
    public void pushingIntoAFullStack_ShouldThrowAnException() throws Exception{
        pushing3ElementsInStack();
        stack.push(4);
    }

    @Test(expected = MyStack.UnderflowError.class)
    public void poppingAnEmptyArray_ShouldThrowUnderflowException() throws Exception {
        stack.pop();
    }

    @Test
    public void pushingOneAndPoppingOneShouldReturnOne() throws Exception {
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test
    public void pushingOneAndTwo_ShouldReturnTwoAndOne() throws Exception {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void pushingOne_ShouldHaveOneAtTop() throws Exception {
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test(expected = MyStack.IllegalCapacity.class)
    public void negativeCapacityShouldThrowIllegalCapacityError() throws Exception {
        stack = new MyStack(-1);
    }
}
