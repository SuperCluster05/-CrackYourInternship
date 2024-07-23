package Day8;

import java.util.*;
class RandomizedCollection {
    ArrayList<Integer> lst;
    HashMap<Integer,Set<Integer>> idx;
    java.util.Random rand = new java.util.Random();

    public RandomizedCollection() {
        lst = new ArrayList();
        idx = new HashMap<Integer,Set<Integer>>();
    }
    
    public boolean insert(int val) {
        lst.add(val);
        if(idx.containsKey(val) == false){
            idx.put(val,new HashSet<Integer>());
        }
        idx.get(val).add(lst.size() -1);
        return idx.get(val).size() == 1;
    }
    
    public boolean remove(int val) {
        if(!idx.containsKey(val) || idx.get(val).size() == 0) return false;
        int removeIdx = idx.get(val).iterator().next();
        idx.get(val).remove(removeIdx);
        int last = lst.get(lst.size() - 1);
        lst.set(removeIdx,last);
        idx.get(last).add(removeIdx);
        idx.get(last).remove(lst.size() - 1);
        lst.remove(lst.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return lst.get(rand.nextInt(lst.size())); // generates a random number between 0 to lst.size()
    }
}