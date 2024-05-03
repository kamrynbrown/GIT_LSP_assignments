package org.howard.edu.lsp.oopfinal.question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    public void setUp() {
        db = new SongsDatabase();
    }

    @Test
    public void testAddSong() {
        db.addSong("Rap", "Savage");
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
    }

    @Test
    public void testGetGenreOfSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
    }

    @Test
    public void testGetSongs() {
        db.addSong("Jazz", "Always There");
        db.addSong("Jazz", "Take Five");
        db.addSong("Pop", "Shape of You");

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertEquals(2, jazzSongs.size());
        assertTrue(jazzSongs.contains("Always There"));
        assertTrue(jazzSongs.contains("Take Five"));

        Set<String> popSongs = db.getSongs("Pop");
        assertEquals(1, popSongs.size());
        assertTrue(popSongs.contains("Shape of You"));
    }
}
