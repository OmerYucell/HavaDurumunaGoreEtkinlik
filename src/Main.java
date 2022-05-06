import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class Main {
    /**Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.**/


    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Bir Derece Giriniz :");
        heat = inp.nextInt();

        if (heat <5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        } else if (heat <=25) {
            if (heat <15){
                System.out.println("Sinema etkinligine gidebirsiniz");
            } if (heat >10) {
                System.out.println("Piknik Yapmaya Gidebilirsiniz");

            }

        }else {
            System.out.println("Yüzmeye Gidebilirsiniz ");
        }


    }
}
