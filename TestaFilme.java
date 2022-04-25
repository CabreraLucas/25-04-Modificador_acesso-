public class TestaFilme {
    public static void main(String[] args) {
        Filme f=new Filme();
        f.setCodigo(1);
        f.setNome("A era do Gelo");
        f.setValor(2);
        
        System.out.println("Código: "+f.getCodigo());
        System.out.println("Filme : "+f.getNome());
        System.out.println("Valor: R$ "+f.getValor());
        
        System.out.println("");
        
        f.setCodigo(2);
        f.setNome("Stars Wars");
        f.setValor(5);

        System.out.println("Código: "+f.getCodigo());
        System.out.println("Filme : "+f.getNome());
        System.out.println("Valor: R$ "+f.getValor());

    
    }
}
