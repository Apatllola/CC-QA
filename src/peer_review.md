Feature: Ssearching I want to be able to search the website So that I can find the information I am looking for

Scenario Outline: Search Given https://www.clearchannelinternational.com/ When I go the the header And I click on the icon on the right which will let me search And I enter test And I click the search button on the right of the search field And the search executes

My review comments:

Feature: Ssearching // This information should be more clear as this will be displayed on cucumber reports and reference to all stackholders. if I have to correct it I would make it as

Feature: ClearChannelInternational-Search As a website user of clear channel international I could able to find information of my choice whenever I search for it.

"Scenario Outline: Search"//  key word for this is should be "Scenario" not "Scenario Outline"

If I have to correct about using of clauses and description,then it is:

Scenario: Verify that user is able to search any keyword in clearchannel website.

If I have to make hardcoded values in BDD to variable, I would make below change.


ScenarioOutline:Verify that user is able to search any keyword in clearchanngel website

// I prefer writing BDD as a Business behaviour rather than test case steps. Above BDD has potential to get corrected as mentioned below.

Given I access clearchannelinternational url
When I search for in the website
Then I should see search results

Examples: |websiteURL |searchKeyWord| |https://www.clearchannelinternational.com/ | test |