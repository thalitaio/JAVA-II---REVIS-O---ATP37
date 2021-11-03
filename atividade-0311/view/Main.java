package view;

import controller.AlmocoController;
import controller.BaseRepository;
import model.Almoco;
import model.BaseModel;

public class Main {
    public static void main(String[] args) {
        AlmocoController almocoCont = new AlmocoController();


        create(almocoCont);
        read(almocoCont);
        update(almocoCont);
        
       

    } 
    public static void create(AlmocoController almocoCont) {
        Almoco almoco1 = new Almoco();
        almoco1.id = 1;
        almoco1.nome = "Arroz e Feijão";
        almoco1.valor = 15.50;

        Almoco almoco2 = new Almoco();
        almoco2.id = 2;
        almoco2.nome = "Macarrão";
        almoco2.valor = 13.60;
    }

    public static void read(AlmocoController almocoCont) {
        for (Almoco a : almocoCont.read()) {
            System.out.printf(" %s %d % s" , a.nome, a.id, a.valor);
        }
    }

    private static void update(AlmocoController almocoCont) {
        Almoco almoco1 = new Almoco();
        almoco1.id = 1;
        almoco1.nome = "Arroz e Feijão e Farofa";
        almoco1.valor = 17.50;
        almocoCont.update(almoco1);
    }

    public static void delete(AlmocoController almocoCont) {
        Almoco almoco1 = new Almoco();
        almoco1.id = 2;
        almocoCont.delete(almoco1);
    }
}
