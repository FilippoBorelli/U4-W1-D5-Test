import java.util.Scanner;
public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] playlist = new ElementoMultimediale[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il titolo dell'elemento multimediale:");
            String titolo = scanner.nextLine();
            System.out.println("Seleziona il tipo di elemento (1 = Immagine, 2 = Registrazione Audio, 3 = Video):");
            int tipo = scanner.nextInt();
            scanner.nextLine();
            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosita dell'immagine:");
                    int luminositaImmagine = scanner.nextInt();
                    scanner.nextLine();
                    playlist[i] = new Immagine(titolo, luminositaImmagine);
                    break;
                case 2:
                    System.out.println("Inserisci la durata dell'audio:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume dell'audio:");
                    int volumeAudio = scanner.nextInt();
                    scanner.nextLine();
                    playlist[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("Inserisci la durata del video:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume del video:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosita del video:");
                    int luminositaVideo = scanner.nextInt();
                    scanner.nextLine();
                    playlist[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo non valido. Inserisci 1, 2 o 3.");
                    i--;
            }
        }
        int scelta;
        do {
            System.out.println("Seleziona l'elemento da eseguire (da 1 a 5, 0 per terminare):");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                playlist[scelta - 1].esegui();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);
    }
}