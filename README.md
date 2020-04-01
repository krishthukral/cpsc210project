#  Procrastination Stomper

## Java Project - Krish Thukral

CITATION: TELLER APP HELPED ME IMPLEMENT CONSOLE UI
CITATION: LIST DEMO HELPED ME CREATE GUI
https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/
javase/tutorial/uiswing/examples/components/ListDemoProject/src/components/ListDemo.java

What will the application do?  
The application is a TODO list so users are able 
to schedule out their tasks and can see them laid
out in front of them in a visually pleasing way.

Who will use it?
People with chronic procrastination or want to 
schedule out their time better or organize their life.

Why is this project of interest to you?
This project is of interest to me because I am one of 
those people.

## User Stories

As a user, I want to be able to add a task to my to-do list
As a user, I want to be able to view the list of tasks on my to-do list
As a user, I want to be able to Login and see my name displayed on the todo list
As a user, I want to be able to delete a task from my to-do-list
As a user, I want to be able to save my to-do list to file
As a user, I want to be able to optionally load my to-do list from file when the program starts

As a user, I want to be able to see the number of incomplete and number of completed tasks 
on my to-do list
As a user, I want to be able to mark a task as complete on my to-do list

As a user, I want to be able to see the weather on start of application
As a user, I want to see a pie chart updated with how many tasks left to complete
As a user, I want to see date and time on start of application
As a user, I want to see data analytics to see how often I am able to complete the 
tasks assigned to myself on a daily basis.
As a user, I want to be able to use a timer within the application so it can help visually
keep me on track- Pomodoro technique
As a user, I want to be notified if I do not complete the task in the allotted time.

## Instructions for Grader
Cannot add duplicate items
To run application right click Guiv3 and click run application
The save button only saves the most recent tasks added
The next time loads only loads the previously added tasks
You can generate the first required event by pressing the add button to add a task to a list of tasks
You can generate the second required event by pressing the remove button to remove a task from a task list
You can clear the list by pressing the clear button
You can trigger the audio component by pressing the add button and produce a coin sound
You can trigger another sound by pressing the remove button
You can save all newly added items to the save file
When the user loads the file 


## Task 2 Phase 4
ROBUST:
Added exception to the deletetask method so it handles the case if the user removes something when it is already
empty in the todoList in the model package. I made two tests that pass called testException and testNoException.
