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
        | startingPositionX | startingPositionY | direction   | endingPositionX | endingPositionY |
        | 5                 | 5                 |NORTH        | 5               | 4               |  
        | 5                 | 5                 |SOUTH        | 5               | 6               | 
        | 1                 | 1                 |NORTH        | 1               | 1               |
        | 1                 | 1                 |SOUTH        | 1               | 2               |  
        | 1                 | 1                 |WEST         | 1               | 1               | 
        | 1                 | 1                 |EAST         | 2               | 1               |
        | 10                | 1                 |NORTH        | 10              | 1               |
        | 10                | 1                 |SOUTH        | 10              | 2               |  
        | 10                | 1                 |WEST         | 9               | 1               | 
        | 10                | 1                 |EAST         | 10              | 1               |
        | 5                 | 5                 |WEST         | 4               | 5               |  
        | 5                 | 5                 |EAST         | 6               | 5               |
        | 10                | 10                |NORTH        | 10              | 9               |
        | 10                | 10                |SOUTH        | 10              | 10              |  
        | 10                | 10                |WEST         | 9               | 10              | 
        | 10                | 10                |EAST         | 10              | 10              |
        | 1                 | 10                |NORTH        | 1               | 9               |
        | 1                 | 10                |SOUTH        | 1               | 10              |  
        | 1                 | 10                |WEST         | 1               | 10              | 
        | 1                 | 10                |EAST         | 2               | 10              |