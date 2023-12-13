Feature: Trash box feature
#  1.Öğrenci, Hamburger Menu > Messaging > Trash linkine tıkladığında silinen mesajlar listesine erişebilmelidir.
#  2. Öğrenci Çöp Kutusu (Trash) sayfasında çöp kutusu ikonunu (Delete) görebilmeli ve ona tıklayabilmelidir.
#  3.Öğrenci, Çöp Kutusu (Trash) sayfasında silineni geri alma ikonunu (Restore) görebilmeli ve ona tıklayabilmelidir.
#  4.Öğrenci, silinen bir mesajı geri almak için restore ikonuna tıkladığında, mesajın başarılı bir şekilde geri alındığına dair “Success” mesajı almalıdır.
#  5.Öğrenci, bir mesajı kalıcı olarak silmek için çöp kutusu ikonuna tıkladığında, açılır pencere şeklinde onay (Confirm) mesajını görmelidir.
#  6.Öğrenci, kalıcı silme işlemini onayladığında mesajın başarılı bir şekilde tamamen silindiğine dair “Success” mesajı almalıdır.
  Background:
    Given The user navigates to website

  Scenario: Functionality of restore ikon
    When Clicks the hamburger button
    And Hover over messaging feature
    And Clicks the trash feature
    Then Verifies that visibility of deleted messages

    And Clicks the restore ikon
    Then Verifies that success message

    When Clicks the hamburger button
    And Hover over messaging feature
    And Clicks the trash feature
    And Clicks the delete ikon in trashbox
    Then Verifies that visibility of confirm message and button in trashbox

    And Clicks the delete button
    Then Verifies that success message in trash