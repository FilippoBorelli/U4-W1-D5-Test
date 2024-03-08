// Classe per i video
class Video extends RegistrazioneAudio {
    int luminosita;
    Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println(" " + titolo);
        }
    }
    void aumentaLuminosita() {
        luminosita++;
    }
    void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
}
