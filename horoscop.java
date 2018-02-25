
import java.util.Scanner;

public class horoscop {

    private static final int ENGUANY = 2018;
    private static final int SXX = 1900;
    private static final int MULT12 = 12;

    public static void main(String[] args) {
        horoscop programa = new horoscop();
        programa.inici();
    }

    void inici() {
        int opcioTriada;//variable per guardar quina opció es tria
        int[] recullDiaMes = new int[2];//array per recollir dia i mes
        String signeZodiac = " ";//cadena per a emmagatzemar el signe del zodiac
        int anyNaixement;//variable per guardar any de naixement
        String animalXines = " ";//cadena per guardar animal de l'horòscop xinès
        menu();
        opcioTriada = entrarEnter();
        System.out.println("L'opció triada és: " + opcioTriada);
        switch (opcioTriada) {
            case 1:
                System.out.println("Ha triat consultar el signe del Zodiac");
                recullDiaMes = zodiac();
                signeZodiac = signeZodiac(recullDiaMes[0], recullDiaMes[1]);
                System.out.println("El seu signe és " + signeZodiac);
                break;
            case 2:
                System.out.println("Ha triat consultar a l'horòscop");
                anyNaixement = horoscopXines();
                animalXines = animalHoroscop(anyNaixement);
                System.out.println("El seu animal de l'horòscop xinès és: " + animalXines);
                break;
            default:
                System.out.println("Ha triat sortir de l'aplicació");
                break;
        }
    }
//mètode per a mostrar el Menú

    void menu() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Programa que permet consultar el signe del zodíac  o el signe de l'horòscop xinés");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Marqui una de les opcions:");
        System.out.println("1. Consultar el signe del zodíac");
        System.out.println("2. Consultar l'horòscop");
        System.out.println("3. Sortir de l'aplicació");
        System.out.println("----------------------------------------------------------------------------------");
    }
//mètode per controlar i obtenir l'opció triada

    int entrarEnter() {
        int entrada = 0;
        Scanner lector = new Scanner(System.in);
        boolean tipusCorrecte;
        boolean numOk = false;
        while (!numOk) {
            System.out.print("Quina opció desitja? 1, 2 o 3? ");
            tipusCorrecte = lector.hasNextInt();
            if (tipusCorrecte) {
                entrada = lector.nextInt();
                if (entrada >= 1 && entrada <= 3) {
                    numOk = true;
                } else {
                    System.out.println("Si us plau, entri 1, 2 o 3.");
                    lector.nextLine();
                }
            } else {
                System.out.println("Si us plau, entri un número enter");
                lector.nextLine();
            }
        }
        return entrada;
    }
//mètode on es guardaran en una array el dia i el mes    

    int[] zodiac() {
        int[] recullDades = new int[2];
        int triaMes, triaDia;
        triaMes = triaDia = 0;
        Scanner lector = new Scanner(System.in);
        boolean tipusCorrecte;
        boolean numOk = false;
        while (!numOk) {
            System.out.print("Quin dia va nèixer? ");
            tipusCorrecte = lector.hasNextInt();
            if (tipusCorrecte) {
                triaDia = lector.nextInt();
                if (triaDia >= 1 && triaDia <= 31) {
                    numOk = true;
                } else {
                    System.out.println("Si us plau, entri un número enter entre 1 i 31");
                    lector.nextLine();
                }
            } else {
                System.out.println("Si us plau, entri un número enter");
                lector.nextLine();
            }
        }
        numOk = false;
        while (!numOk) {
            System.out.print("Quin mes va nèixer? ");
            tipusCorrecte = lector.hasNextInt();
            if (tipusCorrecte) {
                triaMes = lector.nextInt();
                if (triaMes == 2 && (triaDia >= 1 && triaDia <= 29)) {
                    numOk = true;
                } else if ((triaMes == 4 || triaMes == 6 || triaMes == 9 || triaMes == 11) && (triaDia >= 1 && triaDia <= 30)) {
                    numOk = true;
                } else if ((triaMes == 1 || triaMes == 3 || triaMes == 5 || triaMes == 7 || triaMes == 8 || triaMes == 10 || triaMes == 12) && (triaDia >= 1 && triaDia <= 31)) {
                    numOk = true;
                } else {
                    System.out.println("Error, data incorrecta. Torni a entrar el mes");
                    lector.nextLine();
                }
            } else {
                System.out.println("Si us plau, entri un número enter");
                lector.nextLine();
            }
        }
        recullDades[0] = triaDia;
        recullDades[1] = triaMes;
        return recullDades;
    }
//mètode per obtenir el signe del zodiac a partir del dia i del mes obtingut

    String signeZodiac(int dia, int mes) {
        String signe = "";
        switch (mes) {
            case 1:
                if (dia >= 21) {
                    signe = "AQUARI";
                } else {
                    signe = "CAPRICORNI";
                }
                break;
            case 2:
                if (dia >= 21) {
                    signe = "PISCIS";
                } else {
                    signe = "AQUARI";
                }
                break;
            case 3:
                if (dia >= 21) {
                    signe = "ARIES";
                } else {
                    signe = "PISCIS";
                }
                break;
            case 4:
                if (dia >= 21) {
                    signe = "TAURE";
                } else {
                    signe = "ARIES";
                }
                break;
            case 5:
                if (dia >= 21) {
                    signe = "BESSONS";
                } else {
                    signe = "TAURE";
                }
                break;
            case 6:
                if (dia >= 21) {
                    signe = "CRANC";
                } else {
                    signe = "BESSONS";
                }
                break;
            case 7:
                if (dia >= 21) {
                    signe = "LLEÓ";
                } else {
                    signe = "CRANC";
                }
                break;
            case 8:
                if (dia >= 21) {
                    signe = "VERGE";
                } else {
                    signe = "LLEO";
                }
                break;
            case 9:
                if (dia >= 21) {
                    signe = "BALANÇA";
                } else {
                    signe = "VERGE";
                }
                break;
            case 10:
                if (dia >= 21) {
                    signe = "ESCORPI";
                } else {
                    signe = "BALANÇA";
                }
                break;
            case 11:
                if (dia > 21) {
                    signe = "SAGITARI";
                } else {
                    signe = "ESCORPI";
                }
                break;
            case 12:
                if (dia >= 21) {
                    signe = "CAPRICORNI";
                } else {
                    signe = "SAGITARI";
                }
                break;
        }
        return signe;
    }
//mètode per emmagatzemar i controlar l'any de naixement

    int horoscopXines() {
        int any = 0;
        boolean tipusCorrecte;
        boolean numOk = false;
        while (!numOk) {
            Scanner lector = new Scanner(System.in);
            System.out.print("Introdeixi el seu any de naixement: ");
            tipusCorrecte = lector.hasNextInt();
            if (tipusCorrecte) {
                any = lector.nextInt();
                if (any >= SXX && any <= ENGUANY) {
                    numOk = true;
                } else {
                    System.out.println("ERROR. Rang vàlid entre " + SXX + " i " + ENGUANY);
                    lector.nextLine();
                }
            } else {
                System.out.println("ERROR. Si us plau entri un enter");
                lector.nextLine();
            }
        }
        return any;
    }
//mètode per guardar en una cadena l'animal en funció de l'any

    String animalHoroscop(int any) {
        String animal = " ";
        int residu = any % MULT12;
        switch (residu) {
            case (0):
                animal = "MONO";
                break;
            case (1):
                animal = "GALL";
                break;
            case (2):
                animal = "GOS";
                break;
            case (3):
                animal = "PORC";
                break;
            case (4):
                animal = "RATA";
                break;
            case (5):
                animal = "BOU";
                break;
            case (6):
                animal = "TIGRE";
                break;
            case (7):
                animal = "CONILL";
                break;
            case (8):
                animal = "DRAC";
                break;
            case (9):
                animal = "SERP";
                break;
            case (10):
                animal = "CAVALL";
                break;
            default:
                animal = "CABRA";
        }
        return animal;
    }
}
