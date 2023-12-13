Feature: Messaging features

#  1.Öğrenci, anasayfadaki Hamburger Menu’de Messaging linkine hover over yaptığında yeni mesaj yaz (New Message),
#  gelen (Inbox), giden (Outbox) ve çöp kutuları (Trash) linklerini görebilmeli ve tıklayabilmelidir.
  Background:
    Given The user navigates to website

  Scenario: Messaging functionality
    When Clicks the hamburger button
    And Hover over messaging feature
    And Verifies that new message,inbox,outbox and trash are visible

    And Clicks the new message feature
    Then Verifies that current url contains word of new

    When Clicks the hamburger button
    And Hover over messaging feature
    And Clicks the inbox feature
    Then Verifies that current url contains word of inbox

    When Clicks the hamburger button
    And Hover over messaging feature
    And Clicks the outbox feature
    Then Verifies that current url contains word of outbox

    When Clicks the hamburger button
    And Hover over messaging feature
    And Clicks the trash feature
    Then Verifies that current url contains word of trash
