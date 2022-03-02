package online_class.linked_list;

import java.util.List;

public class NestedIterator {
    List<Integer> flattenList=null;
    int current=0;
    /*NestedIterator(ArrayList<NestedInteger> nestedList) {
        flattenList=new ArrayList<>();
        for(NestedInteger integer: nestedList){
            helper(integer);
        }
    }
    int next() {
        return flattenList.get(current++);
    }

    boolean hasNext() {
        return current<flattenList.size();
    }
    private void helper(NestedInteger value){
        if(value.isInteger()){
            flattenList.add(value.getInteger());
        }else{
            for(NestedInteger integer: value.getList()){
                helper(integer);
            }
        }
    }*/
}
