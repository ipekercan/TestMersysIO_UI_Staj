Feature: Outbox feature
#  1. Öğrenci, Hamburger Menu > Messaging > Outbox linkine tıkladığında giden mesajlar listesine erişebilmelidir.
#  2. Öğrenci Outbox sayfasında çöp kutusu ikonunu (Move to Trash) görebilmeli ve ona tıklayabilmelidir.
#  3. Öğrenci, bir mesajı silmek için çöp kutusu ikonuna tıkladığında, açılır pencere şeklinde onay (Confirm) mesajını görmelidir.
#  4. Öğrenci, silme işlemini onayladığında mesajın başarılı bir şekilde silindiğine dair “Success” mesajı almalıdır.
  Background:
    Given The user navigates to website

  Scenario: Outbox functionality
    When Clicks on hamburger button,messaging button and outbox in order
    Then Verifies that visibility of delete ikon

    And Clicks the delete ikon
    Then Verifies that visibility of confirm message and button

    And Clicks the confirm button
    Then Verifies that success message

