import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long numberToWrite = 0;
        long two = 2;
        long power = 32;


        FileWriter fw = new FileWriter("output.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);

        for(; power <= 32; power++){
            numberToWrite = (long) Math.pow(two, power);

            bw.write("\n\n2^"+power+":\n");
            for(long i = 1; i <= numberToWrite; i++){

                bw.write("X");
                if(i % 50 == 0 ) {
                    bw.newLine();
                }

            }
            System.out.println("Finished Power of " + power);

        }
        bw.close();
    }
}
