package com.levelup.lesson1.task4;


import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

public class NotePad {
    @Getter
    @Setter
    private Note[] notes = new Note[10];

    private int size = 0;

    public boolean addNote(String value) {
        if (size < notes.length) {
            notes[size++] = Note.of(value);
            return true;
        }
        System.out.println("Notepad is full");
        return false;
    }

    public int findNoteIndexByValue(String value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(notes[i].getValue())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeNote(String value) {
        int index = findNoteIndexByValue(value);
        if (index != -1) {
            notes[index] = notes[size - 1];
            notes[--size] = null;
            return true;
        }
        return false;

    }

    public boolean changeValue(String from, String to) {
        int index = findNoteIndexByValue(from);
        if (index != -1) {
            notes[index].setValue(to);
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        NotePad notePad=new NotePad();
        notePad.addNote("first");
        notePad.addNote("second");
        System.out.println(Arrays.toString(notePad.getNotes()));

        notePad.removeNote("first");
        System.out.println(Arrays.toString(notePad.getNotes()));

        notePad.changeValue("second", "first");
        System.out.println(Arrays.toString(notePad.getNotes()));
    }
}
