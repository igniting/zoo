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
