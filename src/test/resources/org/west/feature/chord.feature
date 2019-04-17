Feature: Chord generating
  Scenario: Comparing two same chords
    Given Created two chords with same fields
    Then Chords should be equal

  Scenario: Comparing two different chords
    Given Created two chords with different fields
    Then Chords should be not equal