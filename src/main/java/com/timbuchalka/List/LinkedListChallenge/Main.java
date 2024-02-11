package com.timbuchalka.List.LinkedListChallenge;

import javax.swing.text.BadLocationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album();

        Song song = new Song("Eminem - Survival", "3:22");
//        song.setTitle();
//        song.setDuration();

        Song song2 = new Song("Adel - Sky Fall", "2:02");
        Song song3 = new Song("Hans Zimmer - Don't Leave (Extended)", "17:03");
        Song song4 = new Song("Dark Piano", "1:13:00");
        Song song6 = new Song("Eminem - Without me", "3:22");
        Song song7 = new Song("Adel - 24", "1:12");


        LinkedList<Song> playList = new LinkedList<>();
//        playList.add();

        Album eminem = new Album();
        eminem.songLinkedList.add(song);
        eminem.songLinkedList.add(song6);

        Album adel = new Album();
        adel.songLinkedList.add(song2);
        adel.songLinkedList.add(song7);

        Album hansZimmer = new Album();
        hansZimmer.songLinkedList.add(song3);

        Album classicalPieces = new Album();
        classicalPieces.songLinkedList.add(song4);


        albums.add(eminem);
        albums.add(adel);
        albums.add(hansZimmer);
        albums.add(classicalPieces);


        printListOfAlbums();


    }


    // TODO: 8/28/2023 This maybe difficult. I'll come back to it later.
    private static void printListOfAlbums() {
        ListIterator listIterator = albums.listIterator();
        while (listIterator.hasNext()){
//     String mtwt =listIterator.next();
        }

//
//        for (int i = 0; i < albums.size(); i++) {
//            System.out.println("Albums are: " + Arrays.toString(albums.get(i)));
//            albums.
//        }
    }


}
