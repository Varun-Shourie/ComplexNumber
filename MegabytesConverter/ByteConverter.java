package academy.learnprogramming;

public class ByteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainderDivision = kiloBytes % 1024;
        if(kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + "MB and " + remainderDivision + "KB");
        }

    }
}
