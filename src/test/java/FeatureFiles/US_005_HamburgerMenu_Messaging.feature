Feature: New message feature
#  1.Öğrenci, New Message linkine tıkladığında açılır pencere şeklinde bir metin editörüne erişebilmelidir.
#  2.Öğrenci, mesaj göndereceği kişileri seçebileceği bir ikonu (Receivers) görmeli ve tıklayabilmelidir.
#  3.Öğrenci, Add Receiver(s) ikonuna tıkladığında, alıcıları seçebilmelidir.
#  4.Öğrenci, mesajı için bir konu girmelidir.
#  5.Öğrenci, metin editörüne yazabilmelidir.
#  6.Öğrenci, metin editörüne text yapıştırabilmeli, resim veya tablo oluşturabilmelidir.
#  7.Öğrenci, metin editörü sayfasındayken, mesajına dosya ekleyebilmelidir (Attach Files).
#  8.Öğrenci, mesaj gönder (Send) butonuna tıkladığında, “Success” mesajı almalıdır.
#  9.Öğrenci, Hamburger Menu > Messaging > Outbox linkine tıkladığında gönderilen mesaj öğelerini liste halinde görebilmelidir.
  Background:
    Given The user navigates to website

  Scenario: New message functionality
    When Clicks the hamburger button
    And Hover over messaging feature
    And Clicks the new message feature
    And Verifies that text editor is visible
    Then Verifies that receiver ikon is visible

    And Clicks the receiver ikon and verifies that selectable of receivers
    And Writes in subject box and editor box

    And Pastes a text, picture and table and verifies

    And Attaches a file and verifies

    And Clicks the send button
    Then Verifies the success message

    And Clicks the outbox button for verify
    Then Verifies that visibility of the sent messages

