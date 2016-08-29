import java.util.HashMap;

/**
 * Created by davehochstrasser on 8/26/16.
 */
public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("b", "dirt");
        map.put("a", "candy");
        System.out.printf("Map1.mapBully(%s) -> ", map);
        System.out.printf("%s\n", Map1.mapBully(map));

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.printf("Map1.mapShare(%s) -> ", map1);
        System.out.printf("%s\n", Map1.mapShare(map1));

        HashMap<String, String> datas = new HashMap<>();
        datas.put("a", "Hi");
        datas.put("b", "there");
        System.out.printf("Map1 .mapAB(%s) -> ", datas);
        datas = Map1.mapAB(datas);
        System.out.printf("%s\n", datas);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("ice cream", "peanuts");
        map2.put("bread", "butter");
        System.out.printf("Map1.topping1(%s) -> ", map2);
        System.out.printf("%s\n", Map1.topping1(map2));

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("ice cream", "peanuts");
        map3.put("bread", "butter");
        System.out.printf("Map1.topping2(%s) -> ", map3);
        System.out.printf("%s\n", Map1.topping2(map3));

        HashMap<String, String> map4 = new HashMap<>();
        map4.put("potato", "ketchup");
        map4.put("potato", "butter");
        System.out.printf("Map1.topping3(%s) -> ", map4);
        System.out.printf("%s\n", Map1.topping3(map4));

        System.out.printf("Example of String Times (Hi,2) -->> %s\n",
                WarmUp2.stringTimes("Hi",2));
        System.out.printf("Example of Count XX (abcxx) --> %s\n",
                WarmUp2.countXX("abcxx"));
        System.out.printf("Example of Double XX (axxbb) --> %s\n",
                WarmUp2.doubleX("axxbb"));
        System.out.printf("Example of String Bits (Hello) --> %s\n",
                WarmUp2.stringBits("Hello"));
        System.out.printf("Example of StringSpolosion (Code) --> %s\n",
                WarmUp2.stringSplosion("Code"));
        System.out.printf("Example of Last 2 (hixxxhi) --> %s\n",
                WarmUp2.last2("hixxxhi"));
        int[] nines = {1,2,9};
        System.out.printf("Example of Array Count 9s [1, 2, 9] --> %s\n",
                WarmUp2.arrayCount9(nines));
        System.out.printf("Example of String Match (xxcaazz) --> %s\n",
                WarmUp2.stringMatch("xxcaazz","xxbaaz"));
        System.out.printf("Example of String X (xxHxix) --> %s\n",
                WarmUp2.stringX("xxHxix"));
        System.out.printf("Example of Alt Pairs (kitten) --> %s\n",
                WarmUp2.altPairs("kitten"));


    }

}
