package de.dhbwka.java.exercise.io.textfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFile {
    private File f = null;

    List<String> liste = new ArrayList<>();

    public TextFile(File f) {
        this.f = f;

        this.read();
    }

    public TextFile(String pathname) {
        this(new File(pathname));
    }

    void read() {
        this.liste.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(this.f))) {

            while (br.ready()) {
                liste.add(br.readLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void write() {

        try (FileWriter fw = new FileWriter(this.f, false)) {

            for (String s : this.liste) {
                fw.write(s + System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int availableLines () {
        return this.liste.size();
    }

    public String[] getLines() {
        String [] str = new String[this.liste.size()];
        int c = 0;

        for (String s : this.liste) {
            str[c] = s;
            c++;
        }
        return str;
    }

    public String getLine (int i) throws LineNumberOutOfBoundsException {

        if (i < 1) {
            throw new LineNumberOutOfBoundsException("Zeilennummer zu klein");
        }
        if (i > this.liste.size()) {
            throw new LineNumberOutOfBoundsException("Zeilennummer zu groß");
        }
        return this.liste.get(i-1);
    }

    public void setLine(int line, String text) throws LineNumberOutOfBoundsException {
        if (line < 1 || line > liste.size()) {
            //throw exception
            throw new LineNumberOutOfBoundsException();
        }

        liste.set(line - 1, text);
        //write();
    }

    public TextFile replaceAll(String regEx, String replace) {
        for (int i = 0; i < liste.size(); i++) {
            liste.set(i, liste.get(i).replaceAll(regEx, replace));
        }

        return this;
    }

    public void close() {
        System.out.println("Closing");
        write();
        liste.clear();
    }

    public static void main(String[] args) {
        TextFile tf = new TextFile(".\\textfile.txt");
        tf.read();

        String[] str_arr = tf.getLines();
        System.out.println(str_arr[1]);
        try {
            System.out.println(tf.getLine(6));
        } catch (LineNumberOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(tf.availableLines());

        tf.write();
    }

}
