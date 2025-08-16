public class ProjetoCarro {
    public static void main(String[] args) {
       
        Carro carro1 = new Carro();
        carro1.marca = "Porsche";
        carro1.modelo = "718 Boxster";
        carro1.ano = 2024;

        Carro carro2 = new Carro();
        carro2.marca = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2013;

        System.out.println("--- Carro 1 ---");
        carro1.mostrarInformacoes();
        carro1.ligar();

        System.out.println("\n---- Carro 2 antes da alteração ----");
        carro2.mostrarInformacoes();

        carro2.marca = "Chevrolet";
        carro2.modelo = "Onix";
        carro2.ano = 2022;

        System.out.println("\n---- Carro 2 depois da alteração ----");
        carro2.mostrarInformacoes();
        carro2.ligar();
    }
    
}
