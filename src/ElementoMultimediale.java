// Classe astratta per gli elementi multimediali
abstract class ElementoMultimediale {
    String titolo;
    ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }
    abstract void esegui();
}