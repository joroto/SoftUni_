package aquarium;

import org.junit.Assert;
import org.junit.Test;

public class AquariumTests {

    @Test(expected = NullPointerException.class)
    public void test1(){
        Aquarium aquarium = new Aquarium(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void test2(){
        Aquarium aquarium = new Aquarium("  ", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3(){
        Aquarium aquarium = new Aquarium("fish", -10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4(){
        Aquarium aquarium = new Aquarium("fish", 1);
        Fish fish = new Fish("fish");

        aquarium.add(fish);
        aquarium.add(fish);
    }

    @Test
    public void test5(){
        Aquarium aquarium = new Aquarium("fish", 5);
        Fish fish = new Fish("fish_1");

        aquarium.add(fish);

        Assert.assertEquals(1, aquarium.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test6(){
        Aquarium aquarium = new Aquarium("fish", 1);

        aquarium.remove(null);
    }

    @Test
    public void test7(){
        Aquarium aquarium = new Aquarium("fish", 5);
        Fish fish = new Fish("fish_1");
        Fish fish1 = new Fish("fish_2");

        aquarium.add(fish);
        aquarium.add(fish1);
        aquarium.remove("fish_1");

        Assert.assertEquals(1, aquarium.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test8(){
        Aquarium aquarium = new Aquarium("fish", 5);
        aquarium.sellFish(null);
    }

    @Test
    public void test9(){
        Aquarium aquarium = new Aquarium("ribi", 5);
        Fish fish = new Fish("fish_1");
        Fish fish1 = new Fish("fish_2");
        aquarium.add(fish);
        aquarium.add(fish1);

        Fish soldFish =aquarium.sellFish("fish_1");

        Assert.assertEquals("fish_1", soldFish.getName());
    }

    @Test
    public void test10(){
        Aquarium aquarium = new Aquarium("fish", 5);
        Fish fish = new Fish("fish_1");
        Fish fish1 = new Fish("fish_2");
        aquarium.add(fish);
        aquarium.add(fish1);

        Fish soldFish =aquarium.sellFish("fish_1");

        Assert.assertFalse(fish.isAvailable());
        Assert.assertEquals("fish_1", soldFish.getName());
    }
}

