package Exercicio_4.mainEgenerico;

public class generico<T> {
    private T ob;
    T vals[];
    public generico(int o, T[] nums){
        vals = nums;
    }
    public T[] getT(){
        return vals;
    }
}
