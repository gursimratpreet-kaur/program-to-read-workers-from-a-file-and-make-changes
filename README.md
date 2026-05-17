# program-to-read-workers-from-a-file-and-make-changes
The program reads existing worker data from file into ArrayList, then provides a menu with options to 
display workers, add anew worker, delete an existing worker, or exit the program.
Each worker has attributes such as ID, name, city, hours worked, and hourly rate. The program 
calculates and displays the pay for each worker based on hours and rate.

When adding a worker, the program ensures that the ID is unique and validates that hours and rate are
not negative. When deleting a worker, it checks whether the ID exists before removing it.

All updates made during the program execution are saved back into the file (worker.dat) when the 
program ends, ensuring data persistence.
