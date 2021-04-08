import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException, JavaLayerException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase(Locale.ROOT);

        char[] chars = str.toCharArray();

        for (char i: chars){
            switch (i){
                case 'а':
                    play("a.mp3");
                    break;
                case 'б':
                    play("b.mp3");
                    break;
                case 'в':
                    play("v.mp3");
                    break;
                case 'г':
                    play("g.mp3");
                    break;
                case 'д':
                    play("d.mp3");
                    break;
                case 'з':
                    play("z.mp3");
                    break;
                case 'є':
                    play("є.mp3");
                    break;
                case 'ж':
                    play("ж.mp3");
                    break;
                case 'и':
                    play("и.mp3");
                    break;
                case 'і':
                    play("і.mp3");
                    break;
                case 'к':
                    play("к.mp3");
                    break;
                case 'л':
                    play("л.mp3");
                    break;
                case 'м':
                    play("м.mp3");
                    break;
                case 'н':
                    play("н.mp3");
                    break;
                case 'о':
                    play("о.mp3");
                    break;
                case 'п':
                    play("п.mp3");
                    break;
                case 'р':
                    play("р.mp3");
                    break;
                case 'с':
                    play("с.mp3");
                    break;
                case 'т':
                    play("т.mp3");
                    break;
                case 'у':
                    play("у.mp3");
                    break;
                case 'ф':
                    play("ф.mp3");
                    break;
                case 'х':
                    play("х.mp3");
                    break;
                case 'ц':
                    play("ц.mp3");
                    break;
                case 'ч':
                    play("ч.mp3");
                    break;
                case 'ш':
                    play("ш.mp3");
                    break;
                case 'щ':
                    play("ш.mp3");
                    break;
                case 'ю':
                    play("ю.mp3");
                    break;
                case 'я':
                    play("я.mp3");
                    break;
                default: Thread.sleep(50);
            }

        }
    }
    private static void play(String path) throws FileNotFoundException, JavaLayerException, InterruptedException {
        new Player(new FileInputStream(path)).play();
        //Thread.sleep(10);
    }
}
