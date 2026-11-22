import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;
    public ChangeHistory(){
        this.list=new ArrayList<>();
    }
    public void add(double status){
        list.add(status);
    }
    public void clear(){
        list.clear();
    }
    public String toString(){
        return this.list.toString();
    }
    public double maxValue(){
        if(!(list.isEmpty())){
            double val= list.get(0);
            for(double x:list){
                if(val<x){
                    val=x;
                }
            }
            return val;
        }
        return 0;
    }
    public double minValue(){
        if(!(list.isEmpty())){
            double val = list.get(0);
            for(double x : list){
                if(val>x){
                    val=x;
                }
            }
            return val;
        }
        return 0;
    }
    public double average(){
        if(!(list.isEmpty())){
            double sum =0;
            for(double x:list){
                sum+=x;
            }
            return 1.0*sum/list.size();
        }
        return 0;
    }
}
