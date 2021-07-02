Feature:
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check amount of products in search list
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    Then User checks that amount of products in search results list are '<amountOfResults>'

    Examples:
      | homePage                | keyword | amountOfResults         |
      | https://www.amazon.com/ | rtx     | 1-16 of 472 results for |

  Scenario Outline: Check site main functions
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks cart visibility
    And User hover over the language button
    And User checks that language switcher is '<defaultLanguage>'
    And User checks register button visibility
    And User checks sign in button visibility
    And User hover over Sign In button
    When User clicks 'Sign In' button
    And User checks email  field visibility on sign in page
    And User returns to the '<homePage>' page
    And User hover over the language button
    And User checks visibility of language button pop up
    And User clicks language button
    Then User checks that current url contains 'en' language

    Examples:
      | homePage                | defaultLanguage |
      | https://www.amazon.com/ | English - EN    |

  Scenario Outline: Check add product to cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User opens product page
    And User clicks 'Add to Cart' button on product
    And User checks 'Cart' button visibility
    And User checks 'Proceed to checkout' button visibility
    And User clicks 'Proceed to checkout' button
    And User clicks 'Continue' button

    Examples:
      | homePage                | keyword |
      | https://www.amazon.com/ | rtx     |


  Scenario Outline: check delivery
    Given User opens '<homePage>' page
    And User checks 'Deliver to' button visibility
    When User clicks on 'Deliver to' button
    And User checks 'Choose your location' pop up visibility
    And User checks 'Name of Country' field visibility
    And User hover over 'Name of Country' field
    And User clicks on 'Name of Country' field
    And User checks 'Country list' pop up visibility
    And User clicks on 'Selected Country' button
    Then User checks that selected country in country field is '<selectedCountry>'
    And User clicks 'Done' button

    Examples:
      | homePage                | selectedCountry |
      | https://www.amazon.com/ | Ukraine         |
      | https://www.amazon.com/ | England         |


