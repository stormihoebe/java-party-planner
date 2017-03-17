# _Party Planner_

#### A simple command line application for a party planning service, 3/17/17

### By Stormi Hoebelheinrich

## Description

#### This command line application asks users about their upcoming party, prints details to screen, and quotes a price for the party described.

### Specifications

| Behavior |   Input   |   Output   |
|----------|:---------:|:----------:|
| Returns 0 for a party with no guests, and no other details | 0 guests| 0 |
| Returns a price of 3 * the number of guests | 2 guests| price = 6 |
| Returns additional price for food options (no food, 2x number of guests for light snacks, 3x number of guests for hors d'oeuvres, 4x number of guests for pizza, 15x number of guests for 5 course meal)| 2 guests, light snacks | price = 2x3 + 2x2 = 10|
| Returns additional price for drink options (no drinks, 1x number of guests for coffee and tea, 5x number of guests for beer, 10x number of guests for open bar)| 2 guests, light snacks, open bar | price = 2x3 + 2x2 + 2x10 = 30|
| Returns additional price for entertainment options ( no entertainment, DJ +100, Clowns +30, Magician +60, keynote speaker +200)|  2 guests, light snacks, open bar, Magician (i.e. a really expensive date without enough food)  |  price = 2x3 + 2x2 + 2x10 +60 = 90 |
| returns discount for coupon code (SUPERDEAL20 20%off, DJDISCOUNT30 $30off with DJ, MAGICALMAYHEM free Magician)| 2 guests, light snacks, open bar, Magician, MAGICALMAYHEM |
| price = 2x3 + 2x2 + 2x10 + 60 - 60 = 30 |
| no discount added if you do not have appropriate option selected| 2 guests, light snacks, open bar, Magician, DJDISCOUNT30 |
| price = 2x3 + 2x2 + 2x10 + 60 = 90 |


###This is the initial release (1.0):
https://github.com/stormihoebe/java-party-planner


## Setup/Installation Requirements
Open the terminal and preform the following:
* clone repository
* open console


## Known Bugs



## Support and contact details

Contact Stormi at Epicodus

#Built with the following tools:

* Atom (https://atom.io/)
* GitHub (https://github.com/)
* Git (https://git-scm.com/)
* Java

#License

*This software is licensed under the MIT license.*

Copyright (c) 2017 Stormi Hoebelheinrich
