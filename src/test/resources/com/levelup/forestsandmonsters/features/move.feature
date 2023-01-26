Feature: Move in a direction
![Gamer](images/LevelUp_Character_CatNoir.JPG)


I want to move my character. If they attempt to
move past a boundary, the move results in no change in position.

Scenario Outline:: Move in a direction
    Given the character starts at position with XCoordinates <startingPositionX>
    And starts at YCoordinates <startingPositionY>
    And the player chooses to move in <direction>
    When the character moves
    Then the character is now at position with XCoordinates <endingPositionX>
    And YCoordinates <endingPositionY>

    Examples:
        | startingPositionX | startingPositionY | direction | endingPositionX | endingPositionY |
        | 5                 | 5                 | N         | 5               | 4               |  
        | 5                 | 5                 | S         | 5               | 6               | 


