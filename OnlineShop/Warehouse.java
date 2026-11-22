import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String,Integer> pricMap ;
    private Map<String,Integer> stockMap;
    public Warehouse(){
        this.pricMap=new HashMap<>();
        this.stockMap=new HashMap<>();
    }
    public void addProduct(String product,int price,int stock){
        pricMap.put(product, price);
        stockMap.put(product, stock);
    }
    public int price(String product){
        if(pricMap.containsKey(product)){
            return pricMap.get(product);
        }
        return -99;
    }
    public int stock(String product){
        if(stockMap.containsKey(product)){
            return stockMap.get(product);
        }
        return 0;
    }
    public boolean take(String product){
        if(stockMap.containsKey(product)){
            if(stockMap.get(product)>0){
                stockMap.put(product, stockMap.get(product)-1);
            }
            if(stockMap.get(product)>0){
                return true;
            }
        }
        return false;
    }
    public Set<String> products(){
        Set<String> keySet = this.pricMap.keySet();
        return keySet;
    }


}
