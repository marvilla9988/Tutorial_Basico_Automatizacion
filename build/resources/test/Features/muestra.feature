
Feature: Ejemplos The Free Range Tester

 // Scenario: comprar y pagar orden
  //  Given I am a client
  //  And I select an item from the page
  // When I click on the BUY button
   // Then the purchase order appears

  @Test
    Scenario: Navigate to google and Search a Keyword
      Given I am on the Google search page
      When I enter a word in the search field
      And click on the search button
      Then I see results realted to the word entered


