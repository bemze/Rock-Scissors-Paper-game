package rock.scissors.paper;

import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int pcPergales = 0;
        int zmPergales = 0;
        int lygu = 0;
        int akmuo = 0;          // Zmogaus pasirinkimas 
        int zirkles = 0;
        int popierius = 0;
        int akmuoK = 0;        //PC pasirinkimas
        int zirklesK = 0;
        int popieriusK = 0;
//        boolean playGame = true;
//        while(playGame){
        for (i = 1; i <= 5; i++) {

            System.out.println();
            System.out.println();
            System.out.println("Zaidimo nr:" + i);

            System.out.println("Galimi pasirinkimai:");
            System.out.println("1. Akmuo");
            System.out.println("2. Zirkles");
            System.out.println("3. Popierius");
            System.out.println("0. Zaidimo pabaiga");
            System.out.println();

            System.out.print("Zaidejo pasirinkimas: ");

            int zaidejas = sc.nextInt();
            if (zaidejas == 1) {
                akmuo++;
            }
            if (zaidejas == 2) {
                zirkles++;
            }
            if (zaidejas == 3) {
                popierius++;
            }

            System.out.println();

//Validacijos, jei netinkamas skaicius
            if (zaidejas == 0) {
                System.out.println("Zaidimas sustabdytas");
//                  playGame = false;
                break;
            }
            if (zaidejas > 3) {
                System.out.print("!!!Ivestas netinkamas pasirinkimas!!!");
                i = i - 1;  //kad neiskaiciuotu i statistika, kaip ivykusi losima
                continue;

            }

            //padaryt, kad apskaiciutu PC mano pasirinkima
            System.out.print("Kompiuterio pasirinkimas: ");
            int pc = 0;
            if (zaidejas == 1) {
                pc = 3;
            } else {
                pc = (int) (Math.random() * 3) + 1;
            }

            if (pc == 1) {
                akmuoK++;
            }
            if (pc == 2) {
                zirklesK++;
            }
            if (pc == 3) {
                popieriusK++;
            }
            System.out.println(pc);
//         kas laimejo kintamasis
//            zaidejas;
//            pc;
            if (pc == 2 && zaidejas == 1 || pc == 3 && zaidejas == 2 || pc == 1 && zaidejas == 3) {
                System.out.println("----------");
                System.out.println("Laimejo zaidejas");
                zmPergales = zmPergales + 1;
            }
            if (pc == 1 && zaidejas == 2 || pc == 2 && zaidejas == 3 || pc == 3 && zaidejas == 1) {
                System.out.println("----------");
                System.out.println("Laimejo kompiuteris");
                pcPergales = pcPergales + 1;
            }

            if (pc == zaidejas) {
                System.out.println("----------");
                System.out.println("Lygiosios");
                lygu = lygu + 1;
            }
        }

        System.out.println();

        System.out.println(
                "Zaidimo pabaiga");
        System.out.println(
                "=====================");
        System.out.println();

        System.out.println(
                "Suzaista losimu:" + (i - 1));

        System.out.println(
                "Laimejo zmogus:" + zmPergales);
        System.out.println(
                "Laimejo zmogus: " + (float) (zmPergales * 100) / (i
                - 1) + "%");
        System.out.println();

        System.out.println(
                "Laimejo kompiuteris:" + pcPergales);
        System.out.println(
                "Laimejo kompiuteris: " + (float) (pcPergales * 100) / (i
                - 1) + "%");
        System.out.println();

        System.out.println(
                "Suzaista taikiai:" + lygu);
        System.out.println(
                "Suzaista taikiai: " + (float) (lygu * 100) / (i
                - 1) + "%");

        System.out.println();

        System.out.println(
                "Zaidejas pasirinko akmeni: " + akmuo + " karta(/us)");
        System.out.println(
                "Zaidejas pasirinko zirkles: " + zirkles + " karta(/us)");
        System.out.println(
                "Zaidejas pasirinko popieriu: " + popierius + " karta(/us)");

        System.out.println();

        System.out.println(
                "Kompiuteris pasirinko akmeni: " + 1 + " karta(/us)");
        System.out.println(
                "Kompiuteris pasirinko zirkles: " + zirklesK + " karta(/us)");
        System.out.println("Kompiuteris pasirinko popieriu: " + popieriusK + " karta(/us)");

    }

}
