// Classe per le registrazioni audio
class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    int durata;
    int volume;
    RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println(" " + titolo);
        }
    }

    @Override
    void esegui() {
        play();
    }
    void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }
    void alzaVolume() {
        volume++;
    }
}