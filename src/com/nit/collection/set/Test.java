package com.nit.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
     public static void main(String[] a) 
     {
          Set<Apple> set = new TreeSet<Apple>();
          set.add(new Apple(12));
          set.add(new Apple(33));
          set.add(new Apple(22));
          System.out.println(set);
     }
}
record Apple(Integer id)  implements Comparable<Apple>
{
	@Override
    public int compareTo(Apple other) {
        return this.id.compareTo(other.id);
    }

}