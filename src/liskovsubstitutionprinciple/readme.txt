Objects of the super class should be replaceable with object of the base class without affecting correctness
of program

In Bird class we see
we have 2 types of bird one is sparrow which can fly other which can not fly
so penguin can not be replaced with bird everywhere as it will give error if fly

To fix this we can create an interface flyable
and All types of bird can extend bird and if they fly then can extend Flyable too
BirdImproved class depicts improvement
