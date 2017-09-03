Feature: Add place
  In order to manage places at the OSM
  As Users with IT Department and Super Admin role
  I want to be able to add new places

  Scenario: I can add places at the OSM via MainMenu
    Given As Users with IT Department and Super Admin role
    When I select a <Location> via MainMenu
    And I put information about <Place>
    Then added <Place> with status <Status> should appear on a <ViewOfficeMap>

  Scenario: I can add places at the OSM via Breadcrumbs
    Given As Users with IT Department and Super Admin role
    When I select a <Location> via Breadcrumbs
    And I put information about <Place>
    Then added <Place> with status <Status> should appear on a <ViewOfficeMap>