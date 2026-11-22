import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    private Map<String,Item> map;
    public ShoppingCart(){
        this.map=new HashMap<>();
    }
    public void add(String product,int price){
        if(map.containsKey(product)){
            map.get(product).increaseQuantity();
        }
        else{
            this.map.put(product,new Item(product, 1, price));
        }
    }
    public int price(){
        int sum=0;
        for(Item x:map.values()){
            sum+=x.price();
        }
        return sum;
    }
    public void print(){
        for(Item x : map.values()){
            System.out.println(x);
        }
    }

}
