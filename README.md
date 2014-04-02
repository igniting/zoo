Zoo Management System
=====================

**Class Heirarchy:**

```

                           Zoo
                            |
                         (Has a)
                            |
          -------------------------------------
          |                 |                 |
        Animal           Employee          Visitor
          |                 |                 |
          |     ------------------------      |
          |     |           |          |      |
          |   Keeper      Guide      Clerk    |
          |                                   |
  ------------------                   ---------------
  |                |                   |             |
LandAnimal     WaterAnimal          Public         Media

```

Animal (as well as LandAnimal and WaterAnimal), Employee and Visitor are abstract classes.

Main.java consists of a sample usage of this zoo structure.
To compile and run do:
`make run`
