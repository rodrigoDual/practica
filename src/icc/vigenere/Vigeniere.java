package icc.vigenere;

/**
 * Clase que implementa el algoritmo de Vigeniere.
 */
public class Vigeniere {

    /**
     * Constructor.
     * @param path Ruta del archivo donde se encuentra
     *        el texto a descifrar.
     * @param secret La palabra clave para descifrar el
     *        código.
     */
    public Vigeniere(String path, String secret) {
    }

    private String readFile() {
        return "";
    }

    private void writeFile(String text) {
    }

    public void encode() {
        String text = this.readFile();
        String encodedText = "";
        // Completar METODO

        this.writeFile(encodedText);
    }

    public void decode() {
        String text = this.readFile();
        String decodedText = "";
        // Completar METODO

        this.writeFile(decodedText);
    }
}
