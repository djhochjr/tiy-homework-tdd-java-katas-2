import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by davehochstrasser on 8/25/16.
 */
public class Map1Test {
    //if, when, then
    /*if the key "a" has a value, set the key "b" to have that value,
    and set the key "a" to have the value "". Basically "b" is a bully,
     taking the value of "a".
     */
    @Test
    public void mapBullyTest() {
        //arrange
        Map<String, String>values = new HashMap<>();
        //act
        values.put("a", "candy");
        values.put("b", "dirt");


        Map<String,String>returnValues = Map1.mapBully(values);


        //assert
        assertThat(returnValues.get("a"),is(equalTo("")));
        assertThat(returnValues.get("b"),is(equalTo("candy")));

    }
    @Test
    public void mapBully1Test1() {
        //arrange
        Map<String, String>values = new HashMap<>();
        //act
        values.put("a", "candy");
        values.put("b", "candy");


        Map<String,String>returnValues = Map1.mapBully(values);


        //assert
        assertThat(returnValues.get("a"),is(equalTo("")));
        assertThat(returnValues.get("b"),is(equalTo("candy")));

    }
    @Test
    public void mapBully2Test2() {
        //arrange
        Map<String, String>values = new HashMap<>();
        //act
        values.put("a", "candy");
        values.put("b", "carrot");
        values.put("c", "meh");


        Map<String,String>returnValues = Map1.mapBully(values);


        //assert
        assertThat(returnValues.get("a"),is(equalTo("")));
        assertThat(returnValues.get("b"),is(equalTo("candy")));
        assertThat(returnValues.get("c"),is(equalTo("meh")));

    }

    @Test
    public void mapBully3Test3() {
        //arrange
        Map<String, String>values = new HashMap<>();
        //act
        values.put("b", "carrot");


        Map<String,String>returnValues = Map1.mapBully(values);


        //assert
        assertThat(returnValues.get("b"),is(equalTo("carrot")));
    }

    @Test
    public void mapBully4Test4() {
        //arrange
        Map<String, String>values = new HashMap<>();
        //act
        values.put("c", "meh");


        Map<String,String>returnValues = Map1.mapBully(values);


        //assert
        assertThat(returnValues.get("c"),is(equalTo("meh")));
    }

    @Test
    public void mapBully5Test5() {
        //arrange
        Map<String, String>values = new HashMap<>();
        //act
        values.put("c", "meh");
        values.put("a","sparkle");


        Map<String,String>returnValues = Map1.mapBully(values);


        //assert
        assertThat(returnValues.get("b"),is(equalTo("sparkle")));
        assertThat(returnValues.get("c"),is(equalTo("meh")));
        assertThat(returnValues.get("a"),is(equalTo("")));


    }

    /*if the key "a" has a value, set the key "b" to have that same value.
    In all cases remove the key "c", leaving the rest of the map unchanged.
     */
    @Test
    public void mapShareTest() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("b", "bbb");
        values.put("c","ccc");
        values.put("a","aaa");


        Map<String,String>returnValues = Map1.mapShare(values);


        //assert
        assertThat(returnValues.get("b"),is(equalTo("aaa")));
        assertThat(returnValues.get("a"),is(equalTo("aaa")));
    }

    @Test
    public void mapShare1Test1() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("b", "xyz");
        values.put("c","ccc");


        Map<String,String>returnValues = Map1.mapShare(values);


        //assert
        assertThat(returnValues.get("b"),is(equalTo("xyz")));
    }

    @Test
    public void mapShare2Test2() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("d", "hi");
        values.put("c","meh");
        values.put("a","aaa");

        Map<String,String>returnValues = Map1.mapShare(values);


        //assert
        assertThat(returnValues.get("d"),is(equalTo("hi")));
        assertThat(returnValues.get("b"),is(equalTo("aaa")));
        assertThat(returnValues.get("a"),is(equalTo("aaa")));

    }

    @Test
    public void mapShare3Test3() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("z", "zzzz");
        values.put("c","yo");
        values.put("a","xyz");
        values.put("b","1234");

        Map<String,String>returnValues = Map1.mapShare(values);


        //assert
        assertThat(returnValues.get("z"),is(equalTo("zzzz")));
        assertThat(returnValues.get("b"),is(equalTo("xyz")));
        assertThat(returnValues.get("a"),is(equalTo("xyz")));

    }

    @Test
    public void mapShare4Test4() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("d", "ddd");
        values.put("c","yo");
        values.put("e","everything");
        values.put("b","1234");
        values.put("a","xyz");

        Map<String,String>returnValues = Map1.mapShare(values);


        //assert
        assertThat(returnValues.get("d"),is(equalTo("ddd")));
        assertThat(returnValues.get("b"),is(equalTo("xyz")));
        assertThat(returnValues.get("a"),is(equalTo("xyz")));
        assertThat(returnValues.get("e"),is(equalTo("everything")));

    }

    @Test
    public void mapABTest() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("b","there");
        values.put("a","Hi");

        Map<String,String>returnValues = Map1.mapAB(values);

        //assert
        assertThat(returnValues.get("b"),is(equalTo("there")));
        assertThat(returnValues.get("a"),is(equalTo("Hi")));
        assertThat(returnValues.get("ab"),is(equalTo("Hithere")));

    }
    @Test
    public void mapAB1Test1() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("a","Hi");

        Map<String,String>returnValues = Map1.mapAB(values);

        //assert
        assertThat(returnValues.get("a"),is(equalTo("Hi")));

    }

    @Test
    public void mapAB2Test2() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("b","There");

        Map<String,String>returnValues = Map1.mapAB(values);

        //assert
        assertThat(returnValues.get("b"),is(equalTo("There")));

    }

    @Test
    public void mapAB3Test3() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("c","meh");

        Map<String,String>returnValues = Map1.mapAB(values);

        //assert
        assertThat(returnValues.get("c"),is(equalTo("meh")));

    }

    @Test
    public void mapAB4Test4() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("b","bbb");
        values.put("c","ccc");
        values.put("a","aaa");
        values.put("ab","nope");

        Map<String,String>returnValues = Map1.mapAB(values);

        //assert
        assertThat(returnValues.get("c"),is(equalTo("ccc")));
        assertThat(returnValues.get("b"),is(equalTo("bbb")));
        assertThat(returnValues.get("a"),is(equalTo("aaa")));
        assertThat(returnValues.get("ab"),is(equalTo("aaabbb")));

    }

    @Test
    public void mapAB5Test5() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("b","bbb");
        values.put("c","ccc");
        values.put("ab","nope");

        Map<String,String>returnValues = Map1.mapAB(values);

        //assert
        assertThat(returnValues.get("c"),is(equalTo("ccc")));
        assertThat(returnValues.get("b"),is(equalTo("bbb")));
        assertThat(returnValues.get("ab"),is(equalTo("nope")));

    }
    /*Given a map of food keys and their topping values, modify
     and return the map as follows: if the key "ice cream" has a value,
      set that as the value for the key "yogurt" also. If the key "spinach"
      has a value, change that value to "nuts".
      */

    @Test
    public void topping1Test() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("ice cream", "peanuts");
        values.put("bread","butter");

        Map<String,String>returnValues = Map1.topping1(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.get("ice cream"),is(equalTo("cherry")));
        assertThat(returnValues.put("bread","butter"),is(equalTo(returnValues.put("bread","butter"))));

    }
    @Test
    public void topping1Test1() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("bread","butter");

        Map<String,String>returnValues = Map1.topping1(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.put("bread","butter"),is(equalTo(returnValues.put("bread","butter"))));

    }

    @Test
    public void topping1Test2() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("pancake","syrup");

        Map<String,String>returnValues = Map1.topping1(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.get("pancake"),is(equalTo("syrup")));
        assertThat(returnValues.put("bread","butter"),is(equalTo(returnValues.put("bread","butter"))));

    }

    @Test
    public void topping1Test3() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("ice cream", "Strawberries");
        values.put("bread","dirt");

        Map<String,String>returnValues = Map1.topping1(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.get("ice cream"),is(equalTo("cherry")));
        assertThat(returnValues.get("bread"),is(equalTo("butter")));

    }

    @Test
    public void topping1Test4() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("ice cream", "strawberries");
        values.put("bread","jam");
        values.put("salad","oil");

        Map<String,String>returnValues = Map1.topping1(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.get("ice cream"),is(equalTo("cherry")));
        assertThat(returnValues.put("salad","oil"),is(equalTo(returnValues.put("salad","oil"))));
        assertThat(returnValues.get("bread"),is(equalTo("butter")));


    }

    /*Given a map of food keys and their topping values, modify and return the map as follows:
     if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
      If the key "spinach" has a value, change that value to "nuts".
      */
    @Test
    public void topping2Test() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("ice cream", "cherry");

        Map<String,String>returnValues = Map1.topping2(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.put( "ice cream","cherry"),is(equalTo(returnValues.put("yogurt","cherry"))));
        assertThat(returnValues.put("ice cream", "cherry"),is(equalTo(returnValues.put("ice cream", "cherry"))));
    }

    @Test
    public void topping2Test2() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("ice cream", "cherry");
        values.put("spinach", "dirt");

        Map<String,String>returnValues = Map1.topping2(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.put( "ice cream","cherry"),is(equalTo(returnValues.put("yogurt","cherry"))));
        assertThat(returnValues.put("ice cream", "cherry"),is(equalTo(returnValues.put("ice cream", "cherry"))));
        assertThat(returnValues.get("spinach"),is(equalTo(returnValues.put("spinach","nuts"))));

    }

    @Test
    public void topping2Test3() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("yogurt", "salt");
        values.put("bread","butter");


        Map<String, String> returnValues = Map1.topping2(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.put("yogurt", "salt"), is(equalTo(returnValues.put("yogurt", "salt"))));
        assertThat(returnValues.put("bread", "butter"), is(equalTo(returnValues.put("bread", "butter"))));


    }

    @Test
    public void topping2Test4() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        //values.put();
        //values.put("bread","butter");


        Map<String, String> returnValues = Map1.topping2(values);

        assertThat(returnValues.isEmpty(),is(equalTo(returnValues.isEmpty())));
        //assertThat(returnValues.();
        //assertThat(returnValues.put("yogurt", "salt"), is(equalTo(returnValues.put("yogurt", "salt"))));
        //assertThat(returnValues.put("bread", "butter"), is(equalTo(returnValues.put("bread", "butter"))));
    }

    @Test
    public void topping2Test5() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("ice cream", "air");
        values.put("salad", "oil");

        Map<String,String>returnValues = Map1.topping2(values);

        //assert
        //assertThat(returnValues.();
        assertThat(returnValues.put( "ice cream","air"),is(equalTo(returnValues.put("yogurt","air"))));
        assertThat(returnValues.put("ice cream", "air"),is(equalTo(returnValues.put("ice cream", "air"))));
        assertThat(returnValues.put("salad","oil"),is(equalTo(returnValues.put("salad","oil"))));

    }








    /*Given a map of food keys and topping values, modify and return the map as follows:
     if the key "potato" has a value, set that as the value for the key "fries".
      If the key "salad" has a value, set that as the value for the key "spinach".
      */

    @Test
    public void topping3Test() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("potato", "ketchup");

        Map<String,String>returnValues = Map1.topping3(values);

        //assert
        assertThat(returnValues.put("potato","ketchup"),is(equalTo(returnValues.put("fries","ketchup"))));
        assertThat(returnValues.put("potato","ketchup"),is(equalTo(returnValues.put("potato","ketchup"))));
    }

    @Test
    public void topping3Test1() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("potato", "butter");

        Map<String,String>returnValues = Map1.topping3(values);

        //assert
        assertThat(returnValues.put("potato","butter"),is(equalTo(returnValues.put("fries","butter"))));
        assertThat(returnValues.put("potato","butter"),is(equalTo(returnValues.put("potato","butter"))));
    }

    @Test
    public void topping3Test2() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("salad", "oil");
        values.put("potato","ketchup");

        Map<String,String>returnValues = Map1.topping3(values);

        //assert
        assertThat(returnValues.put("potato","ketchup"),is(equalTo(returnValues.put("fries","ketchup"))));
        assertThat(returnValues.put("potato","ketchup"),is(equalTo(returnValues.put("potato","ketchup"))));
        assertThat(returnValues.put("salad","oil"),is(equalTo(returnValues.put("spinach","oil"))));
        assertThat(returnValues.put("salad","oil"),is(equalTo(returnValues.put("salad","oil"))));


    }

    @Test
    public void topping3Test3() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("salad", "oil");
        values.put("potato","ketchup");
        values.put("toast","butter");

        Map<String,String>returnValues = Map1.topping3(values);

        //assert
        assertThat(returnValues.put("potato","ketchup"),is(equalTo(returnValues.put("fries","ketchup"))));
        assertThat(returnValues.put("potato","ketchup"),is(equalTo(returnValues.put("potato","ketchup"))));
        assertThat(returnValues.put("salad","oil"),is(equalTo(returnValues.put("spinach","oil"))));
        assertThat(returnValues.put("salad","oil"),is(equalTo(returnValues.put("salad","oil"))));
        assertThat(returnValues.put("toast","butter"),is(equalTo(returnValues.put("toast","butter"))));
    }

    @Test
    public void topping3Test4() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        //values.put("potato", "butter");

        Map<String,String>returnValues = Map1.topping3(values);

        //assert
        assertThat(returnValues.isEmpty(),is(equalTo(returnValues.isEmpty())));

    }

    @Test
    public void topping3Test5() {
        //arrange
        HashMap<String, String> values = new HashMap<>();
        //act
        values.put("salad", "pepper");
        values.put("fries","salt");

        Map<String,String>returnValues = Map1.topping3(values);

        //assert
        assertThat(returnValues.put("fries","salt"),is(equalTo(returnValues.put("fries","salt"))));
        assertThat(returnValues.put("salad", "pepper"),is(equalTo(returnValues.put("spinach","pepper"))));
        assertThat(returnValues.put("salad","pepper"),is(equalTo(returnValues.put("salad","pepper"))));


    }





}
