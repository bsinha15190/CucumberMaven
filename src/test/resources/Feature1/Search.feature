Feature: Verifying Adactin Hotel details

  Scenario Outline: Verifying Adactin Hotel search with two adult and two child room with valid credentials
    Given User is search Adactin Hotal login page
    When User should enter "<username>" and "<password>"
    And User have to click login button
    When user should Search Hotel "<location>","<hotelname>","<roomtype>","<numberofroom>","<adultroom>","<childroom>"
    And user select clicks on search button
    When User lands on select hotel page ,Click the select radio button
    And User click on continue button
    When User is on bokking details page,User enters"<firstname>","<lastname>""<address>","<creditCardNo>","<creditCardType>","<expirydate>","<expiryyear>","<cvvnumber>"
    And User clicks on book now button
    Then Booking confirmation page should be displayed

    Examples: 
      | username | password | location  | hotelname     | roomtype | numberofroom | adultroom | childroom | firstname | lastname | address | creditCardNo      | creditCardType   | expirydate | expiryyear | cvvnumber |
      | NeetalPK | 12345678 | Sydeny    | HotelSunsine  | Deluxe   | Four         | Two       | Two       | Babita    | Sinha    | Sydeny  | 23456789234567892 | American Express | October    |       2022 |       234 |
      | NeetalPK | 12345678 | London    | Hotel Cornice | Deluxe   | Four         | Two       | Two       | Babita    | Sinha    | Sydeny  | 23456789234567892 | American Express | October    |       2022 |       234 |
      | NeetalPK | 12345678 | Melbourne | Hotel Cornice | Deluxe   | Four         | One       | Two       | Babita    | Sinha    | Sydeny  | 23456789234567892 | American Express | October    |       2022 |       234 |
      | NeetalPK | 12345678 | New York  | Hotel Hervey  | Deluxe   | Four         | Two       | Two       | Babita    | Sinha    | Sydeny  | 23456789234567892 | American Express | October    |       2022 |       234 |
      | NeetalPK | 12345678 | Peris     | Hotel Creek   | Deluxe   | Four         | Two       | Two       | Babita    | Sinha    | Sydeny  | 23456789234567892 | American Express | October    |       2022 |       234 |
