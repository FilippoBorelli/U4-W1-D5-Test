// Classe per le immagini
class Immagine extends ElementoMultimediale {
    int luminosita;
    Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }
    @Override
    void esegui() {
        show();
    }
    void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println(" " + titolo);
    }
}