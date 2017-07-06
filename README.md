Homework 2
==========

### Due Friday, September 1, 2017 - 5:00PM

In this homework, you will practice using the following:

- Iteration
- File I/O

For this homework, you will complete three classes that provide some helpful utilities for manipulating and searching strings and files.

### `StringManipulations`
 
For this class, you will complete six methods that use iteration to perform some helpful manipulations of `String` objects.  
 
### `WCTool`

This class provides a subset of the functionality you find in the Unix [wc](https://en.wikipedia.org/wiki/Wc_(Unix)) command, including counting the lines of a file and words in a file.

### `GrepTool`

This class provides a subset of the functionality you find in the Unix [grep](https://www.cyberciti.biz/faq/howto-use-grep-command-in-linux-unix/) command. You will identify all of the lines on which a given set of characters appears.

The Javadoc for each method describes how the method must be implemented. Carefully read the documentation and implement a solution that adheres to the specifications.

:warning: It is very important that you implement the code as specified. Just because you are passing test cases does not mean you will earn full (or even partial) credit. We will run *additional* tests to verify that your code works on other input. If you have not followed the specification correctly it is very possible that you will not pass the additional test cases and will not be awarded full credit.

### Getting Started

As a reminder, here are a few tips to get you started with the programming assignments. You'll need to follow all of these steps for every programming assignment.

1. Make sure you have set up your [development environment](https://github.com/CS514-F17/notes/blob/master/Admin/devenvironment.md). You'll need to decide how you want to access github -- using command line tools, Eclipse, to the Github Desktop tool.
2. Set up your repository (link below under #1 of Submission Requirements) and clone a copy to your local machine.
3. Complete all of the methods specified in the three required classes. You should also create a `Driver` to run some of your own tests. 
4. Do **not** modify the test cases provided to you.
5. Make sure you are passing all test cases.
6. Make sure the latest version of your work is on github before the deadline.
  - If you are using git from the command line make sure you `git add` then `git commit` and finally `git push origin master`. *Do not forget the last step!*
  - If you are using git through Eclipse make sure to `Add to Index` then `Commit and Push`. *Make sure you choose the `Commit and Push` option.*
7. Verify that your final solution is what you see on github.
8. Review these [tips and tricks](https://github.com/CS514-F17/notes/blob/master/Admin/tips.md).

### Submission Requirements

1. Use the following link to create your private github repository for this assignment. The repository will be seeded with the skeleton code, test cases, and input files. [Homework 2](https://classroom.github.com/assignment-invitations/2a81c6538e9c241e5a7035b12aa12eaa)
2. For full credit, make sure to follow all [Style Guidelines](https://github.com/CS514-F17/notes/blob/master/Admin/style.md). Points will be deducted for each violation.

### Grading Rubric

| Points | Criterion | Description |
| ------ | -------- | -------- |  
| 4 | StringManipulations.countChars | Passes all test cases provided and all additional test cases. |
| 4 | StringManipulations.reverse | Passes all test cases provided and all additional test cases. |
| 4 | StringManipulations.longestWord | Passes all test cases provided and all additional test cases. |
| 4 | StringManipulations.shiftLeft | Passes all test cases provided and all additional test cases. |
| 4 | StringManipulations.repeater | Passes all test cases provided and all additional test cases. |
| 4 | StringManipulations.removeDuplicates | Passes all test cases provided and all additional test cases. |
| 4 | WCTool.getLines | Passes all test cases provided and all additional test cases. |
| 4 | WCTool.getWords | Passes all test cases provided and all additional test cases. |
| 4 | GrepTool.find | Passes all test cases provided and all additional test cases. |
| 4 | GrepTool.find - save to file | Passes all test cases provided and all additional test cases. |
| 5 | Design  | Code is well designed and follows all specifications. |
| 5 | Style | Code follows all style guidelines. |

Partial credit may be awarded for partial functionality and/or partially correct design or style elements.

### Academic Dishonesty

Any work you submit is expected to be your own original work. If you use any web resources in developing your code you are required to cite those resources. The only exception to this rule is code that is posted on the class website. The URL of the resource you used in a comment in your code is fine. If I google even a single line of uncited code and find it on the internet you may get a 0 on the assignment or an F in the class. You may also get a 0 on the assignment or an F in the class if your solution is at all similar to that of any other student.
