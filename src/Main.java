import java.util.Scanner;

class tekstuAnalizatorius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite teksta");
        String text = scanner.nextLine(); // vartotojo inputa iraso
        System.out.println("tekste yra raidziu: " + text.length()); // paraso kiek yra tekste simboliu
        System.out.println(text.split("\\s+"));
        scanner.close();


    }

}