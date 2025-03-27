public class Fila {
    private int dados[];
    private int tamanho;
   
    public Fila(int capMax){
        dados = new int[capMax];
        tamanho = 0;
    }
    public boolean cheia(){
        return tamanho == dados.length;
    }
    public boolean vazia(){
        return tamanho == 0;
    }
    public String toString(){
        String r = "";
        for(int i = 0 i < tamanho; i++){
            r = r + "\t" + dados[i];
        }
        return r;
    }
    public int remove() throws Exception{
        if (vazia()){
            throw new Exception("ERRO! Lista Vazia!");
        } else {
            int r = dados[0];
            for(int i = 1; i < tamanho; i++){
                dados[i-1] = dados[i];
            }
        tamanho--;
        }
    }
    public void adiciona(int e) throws Exception{
        if(cheia()){
            throw new Exception("ERRO! Fila Cheia!");
        } else {
            dados[tamanho] = e;
            tamanho++;
        }
    }
}
 