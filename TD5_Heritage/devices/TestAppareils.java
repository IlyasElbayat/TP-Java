package TD5_Heritage.devices;


import java.util.ArrayList;
import java.util.List;


public class TestAppareils {
public static void main(String[] args) {
List<Appareil> appareils = new ArrayList<>();
appareils.add(new Imprimante("HP", 600));
appareils.add(new Scanner("Canon", 30));


for (Appareil a : appareils) {
a.allumer();
a.afficherInfos();
}
}
}