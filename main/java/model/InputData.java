
package model;

public class InputData {
    private String pathname;
    private String word;

    public InputData(String pathname, String word) {
        this.pathname = pathname;
        this.word = word;
    }

    public InputData() {
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
