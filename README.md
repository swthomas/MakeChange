# MakeChange

main - 
  - asks for the total and the amount tendered 
  - calls the checkChange method passing the change variable
  
checkChange -
  - checks if the change is the exact amount or too little
  - if neither is calls makeChange method passing the change variable
  
makeChange -
  - initializes and defines the different variables
  - sets each variable to (change/currency) casted into an int
  - redefines change after subtracting previous variable
  - prints out results using an if statement
