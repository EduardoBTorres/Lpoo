package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        //1
        Bicicleta b1 = new Bicicleta(2, "humana", "Monark", "BMX", 2010, 26, "AW2010BMX");
        System.out.println(b1);

        Carro c1 = new Carro(2, "humana", "Chevrolet", "Prisma", 2019, 50, "7263636", "AWXVC2019", "JAG5B29");
        System.out.println(c1);

        Caminhao cam1 = new Caminhao(3, "humana", "Mercedes-Benz", "Atego", 2006, 15000, "7325235263", "CERISLADSL", "IMT8037");
        System.out.println(cam1);

        //2
        Bicicleta b2 = new Bicicleta(2, "humana", "Caloi", "Skinny", 2012, 28, "DGHDGHS");
        Bicicleta b3 = new Bicicleta(2, "humana", "Houston", "Skinny-Top", 2022, 26, "KFJKDJ");
        Bicicleta b4 = new Bicicleta(2, "humana", "Monark", "Mountain-Bike", 2018, 20, "GSHDIUD");
        Bicicleta b5 = new Bicicleta(2, "humana", "Focus", "Bike", 2017, 16, "OPEYRT");

        Carro c2 = new Carro(2, "humana", "Chevrolet", "Prisma", 2019, 50, "899846", "AWXVC2019", "JAG5B29");
        Carro c3 = new Carro(2, "humana", "Citroen", "C3", 2020, 20, "212565", "AWXVC2019", "IRJ9640");
        Carro c4 = new Carro(2, "humana", "Ford", "Focus", 2016, 60, "2626549815", "AWXVC2019", "AMD4567");
        Carro c5 = new Carro(2, "humana", "Wolkswagen", "Gol", 2017, 30, "200545485", "AWXVC2019", "MAD1978");

        Caminhao cam2 = new Caminhao(3, "humana", "Mercedes-Benz", "Atego", 2009, 15000, "7757575", "BFBDF", "SGF3456");
        Caminhao cam3 = new Caminhao(4, "humana", "Wolkswagen", "W310", 2010, 25000, "845932100", "KYJKUYKUY", "IEG7456");
        Caminhao cam4 = new Caminhao(6, "humana", "DAF", "XF105", 2020, 47000, "9465780", "DSDSFSD", "IQW2345");
        Caminhao cam5 = new Caminhao(9, "humana", "MAN", "TGX", 2022, 56000, "10234657", "IWOEIWOPE", "RWV5566");

        System.out.println("\nLista de veiculos Detran-RS\n");
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);
        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);
        veiculos.add(c5);
        veiculos.add(cam1);
        veiculos.add(cam2);
        veiculos.add(cam3);
        veiculos.add(cam4);
        veiculos.add(cam5);
        System.out.println(veiculos);

        //a
        System.out.println("\nOrdenando a lista Veiculos em ordem decrescente pelo ano de fabricação\n");
        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println(veiculos);
        System.out.println();

        //b
        System.out.print("\n\nLista de AUTOMOVEIS cadastrados (por ano de fabricação:) ");
        veiculos.forEach(v -> {
            if (v instanceof Automovel) {
                System.out.print(v);
            }
        });

        //c
        System.out.print("\n\nLista de BICICLETAS cadastrados (por ano de fabricação): ");
        veiculos.forEach(v -> {
            if (v instanceof Bicicleta) {
                System.out.print(v);
            }
        });

        //d
        System.out.print("\n\nLista de VEÍCULOS que a placa começa por I ou i: ");
        veiculos.forEach(v -> {
            if (v instanceof Automovel) {
                if( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {
                    System.out.print(v);
                }
            }
        });
    }
}
