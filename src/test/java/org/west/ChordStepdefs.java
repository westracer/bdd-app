package org.west;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import model.Chord;
import model.ChordRoot;
import model.ChordType;

import static org.junit.Assert.*;

public class ChordStepdefs {
    private Chord chord1, chord2;

    @Given("Created two chords with same fields")
    public void createdTwoChordsWithSameFields() {
        chord1 = new Chord(ChordRoot.A, ChordType.five);
        chord2 = new Chord(ChordRoot.A, ChordType.five);
    }

    @Given("Created two chords with different fields")
    public void createdTwoChordsWithDifferentFields() {
        chord1 = new Chord(ChordRoot.A, ChordType.five);
        chord2 = new Chord(ChordRoot.Ds, ChordType.seven);
    }

    @Given("Two generated chords")
    public void twoGeneratedChords() {
        chord1 = Chord.generate();

        for (int i = 0; i < 5; i++) {
            chord2 = Chord.generate();
            if (chord1.root != chord2.root || chord1.type != chord2.type)
                break;
        }
    }

    @Then("Chords should be equal")
    public void chordsShouldBeEqual() {
        assertEquals("Объекты не совпадают", chord1, chord2);
    }

    @Then("Chords should be not equal")
    public void chordsShouldBeNotEqual() {
        assertNotEquals("Объекты совпадают", chord1, chord2);
    }

    @Then("String representations should be {string} and {string}")
    public void stringRepresentationsShouldBeAAndD(String arg0, String arg1) {
        assertEquals("Названия аккордов не совпадают", arg0, chord1.toString());
        assertEquals("Названия аккордов не совпадают", arg1, chord2.toString());
    }
}
