public class Pilha {
    private int dados[];
    private int topo;
 
    public Pilha(int capMax){
        dados = new int[capMax];
        topo = -1;
       
    }
    public boolean vazia(){
        return topo == -1;
    }
    public boolean cheia(){
        return topo == dados.length -1;
    }
    public void empilha(int e) throws Exception{
        if (cheia()){
        throw new Exception("ERRO! Pilha Cheia!");
        } else{
            topo++;
            dados[topo] = e;
        }
    }
    public int desempilha() throws Exception{
        if (vazia()){
            throw new Exception("ERRO! Pilha Vazia!");
        } else {
            int r = dados[topo];
            topo--;
            return r;
        }
    }
    public String toString(){
        String r = "";
        for (int i = 0; i <= topo; i++){
            r = dados[i] + "\t" + r;
        }
        return r;
    }
}