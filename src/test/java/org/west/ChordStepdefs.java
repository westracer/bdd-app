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

    @Then("Chords should be equal")
    public void chordsShouldBeEqual() {
        assertEquals("Объекты не совпадают", chord1, chord2);
    }

    @Then("Chords should be not equal")
    public void chordsShouldBeNotEqual() {
        assertNotEquals("Объекты совпадают", chord1, chord2);
    }
}
