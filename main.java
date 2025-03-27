public class Main
{
    public static void main(String[] args) {
        Pilha p1 = new Pilha(5);
        Fila f1 = new Fila(5);
        try{
            p1.empilha(100);
            p1.empilha(51);
            System.out.println("Pilha = " + p1.toString());
            int pilha = p1.desempilha();
            System.out.println("Removido da Pilha = " + pilha);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}