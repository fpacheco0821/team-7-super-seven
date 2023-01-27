Feature: Start the Super 7 Level Up Game
![Gamer](images/LevelUp_Character_CatNoir.JPG)

I want to get my character's Start position

Scenario Outline:: Get Character Start Position
    Given the character agrees to start the game with default XCoordinates <defaultPositionX>
    And with default YCoordinates <defaultPositionY>
    When the game starts
    Then the character is now at start position with XCoordinates <startPositionX> 
    And with start YCoordinates <startPositionY>
    Examples:
        | defaultPositionX | defaultPositionY | startPositionX | startPositionY |
        | 0                | 0                | 5              | 5              |
        | 6                | 6                | 5              | 5              |