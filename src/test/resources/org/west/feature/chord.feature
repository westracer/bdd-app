Feature: Chord generating

  Scenario: Comparing two same chords
    Given Created two chords with same fields: root 'A', type 'five'
    Then Chords should be equal

  Scenario: Comparing two different chords
    Given Created two chords with different fields: 'A''five' and 'Ds''seven'
    Then Chords should be not equal

  Scenario: Comparing two generated chords
    Given Two generated chords
    Then Chords should be not equal

  Scenario: Converting chord object to strings
    Given Created two chords with different fields: 'A''five' and 'Ds''seven'
    Then String representations should be 'A5' and 'D#7'