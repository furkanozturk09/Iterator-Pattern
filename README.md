# Iterator-Pattern   JAVA
Software Design and Architecture / Iterator Pattern


You are expected to implement a program that builds computers in a manufacturing
line. This will be an extension to the labwork of the previous week. This time you are going to have
two computer production lines; one for office computers and one for gaming computers. However,
office computer production line only able to produce 5 computers at a time and it cannot be changed.
However, gaming computer line takes the number of orders in the beginning and fills the line with
gaming computers so it is using an ArrayList to store them. Both have their getComputers methods
where office computer line returns an array and gaming computer line returns an ArrayList. The
problem starts at the Computer build line, because it takes both office and gaming product lines and
calls their build functions and, since both returns different type of collections it will be elaborate to
make an implementation for both.


3 Measure of success
You are expected to:
∗ Create iterator classes for both product lines; office and gaming computers
∗ Modify OfficeComputerLine and GamingComputerLine classes so they can return a Iterator
object for their content.
∗ Create a ComputerBuildLine that takes both type of product line objects
∗ ComputerBuildLine is going to have a function called buildComputer that takes an iterator and
builds it and it should be called by another function called runLine which takes no parameters.

