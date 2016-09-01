package ar.fiuba.tdd.tp0;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void checkSizeAddingFiveStrings() {
        Queue<String> strings = new QueueImpl<>("First Str");

        strings.add("Second Str");
        strings.add("Third Str");
        strings.add("Fourth Str");
        strings.add("Fifth Str");

        Assert.assertEquals(5, strings.size());
    }

    @Test
    public void checkSizeAddFourAndRemoveOneInteger() {
        Queue<Integer> integers = new QueueImpl<>(1);

        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.remove();

        Assert.assertEquals(3, integers.size());
    }

    @Test
    public void getTopAfterAddingFiveAndRemoveTwoStrings() {
        Queue<String> strings = new QueueImpl<>("First Str");

        strings.add("Second Str");
        strings.add("Third Str");
        strings.add("Fourth Str");
        strings.add("Fifth Str");
        strings.remove();
        strings.remove();

        Assert.assertEquals("Third Str", strings.top());
    }

    @Test
    public void getAllIntegersUsingTopAndRemove() {
        Queue<Integer> integers = new QueueImpl<>(1);

        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        Assert.assertTrue(integers.top().equals(1));
        integers.remove();
        Assert.assertTrue(integers.top().equals(2));
        integers.remove();
        Assert.assertTrue(integers.top().equals(3));
        integers.remove();
        Assert.assertTrue(integers.top().equals(4));
        integers.remove();
        Assert.assertTrue(integers.top().equals(5));
    }

    @Test
    public void checkEmptyQueue() {
        Queue<String> strings = new QueueImpl<>("First Str");

        Assert.assertFalse(strings.isEmpty());

        strings.remove();

        Assert.assertTrue(strings.isEmpty());
    }

}
