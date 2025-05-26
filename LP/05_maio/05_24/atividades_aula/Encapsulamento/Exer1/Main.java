public class Main {
    public static void main(String args[]) {
        Produtos componetesComputadores[][] = {
                {
                    new Produtos(0, "Memoria Ram 8GB 4200mhz", 400.00),
                    new Produtos(1, "Memoria Ram 16GB 3200mhz", 600.00),
                    new Produtos(2, "Memoria Ram 32GB 3600mhz", 1200.00),
                    new Produtos(3, "Memoria Ram 8GB 2666mhz", 300.00),
                    new Produtos(4, "Memoria Ram 16GB 3000mhz", 500.00),
                    new Produtos(5, "Memoria Ram 64GB 4000mhz", 2500.00), 
                },
                {
                    new Produtos(0, "i5 11400F", 1400.00),
                    new Produtos(1, "Ryzen 5 5600X", 1200.00),
                    new Produtos(2, "i7 12700K", 2500.00),
                    new Produtos(3, "i3 10100F", 700.00),
                    new Produtos(4, "Ryzen 7 5800X", 1800.00),
                    new Produtos(5, "i9 13900K", 4000.00), 
                },
                {
                    new Produtos(0, "Asus HoiGate", 800.00),
                    new Produtos(1, "Gigabyte B550M", 900.00),
                    new Produtos(2, "MSI Z690", 1800.00),
                    new Produtos(3, "ASRock H410M", 500.00),
                    new Produtos(4, "ASUS TUF B550", 1100.00),
                    new Produtos(5, "ASUS ROG Maximus", 3500.00), 
                }
        };

        for (int i = 0; i < componetesComputadores.length; i++) {
            for (int j = 0; j < componetesComputadores[i].length; j++) {
                
                System.out.println("Descrição "+componetesComputadores[i][j].getDescProd());
                System.out.println("Valor "+componetesComputadores[i][j].getPrecoProd());
            }
            System.out.println("\n");
        }
    }
}
