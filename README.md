# code-with-quarkus-vs

![img_3.png](img_3.png)

This project uses Quarkus, the Supersonic Subatomic Java Framework.  Lab created by vicky.stacey@lloydsbanking.com

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

How to use this Lab

The steps are designed to build up your knowledge from a simple implementation of an api end point and using the dev mode test.  
We are building this lab out to include objects and databases so please look out for these.

You will run the Quarkus code and use Bruno to test the api as well as experimenting with Test Driven Development (TDD).
If you are an experienced developer this should be easy to use but we also expect this to help beginners.

To get the most from this lab.  Follow the steps below and then experiment.  Find your preferred way of working.
1. For this lab you should use the config given (you can use ./mvnw once you have tried this ). Set up run configurations in dev mode which enables live coding
In your ide run configurations use: `compile quarkus:dev`
3. Once the application has run and you see the Quarkus banner, click into the Terminal and type r. 
  This will trigger Quarkus to run the tests after each save of the code.  If you look in the terminal you will see it says "Profile dev activated. Live Coding activated"
4. We have provided you the Bruno tests so open Bruno and open the test folder
You are set up with a simple Hello World type api and a double value function.  Run Bruno query "QuarkusHello"
5. Break a test: Change the text  `return "Hello Quarkus VS";` line 14 in GreetingResource file . You will see in the terminal window that the tests re-run When you click ctrl S (or equivalent to save)
You will see a message saying:
   Response body doesn't match expectation.
   Expected: is "Hello Quarkus VS"
   Actual: 'your_message'

5. Now the test has failed, you can see it in the Quarkus built in dashboard, Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.
   ![img.png](img.png)Navigate to this url and explore the menu on the left: Extensions, Configuration, Endpoints, Continous Testing, Dev Services, Read Me, Dependencies
6. Try changing another file to add some comments and save it e.g. //This is a comment
7. In Bruno run all of the tests
![img_1.png](img_1.png)
8. In the FunWithNumbersTest class, copy an existing test and rename the 
endpoint e.g. "@Path("/minusFish")"  "@Path("/soLong"), think about what value you want to return 
e.g. "and thanks for all the fish" Save and the tests should re-run and fail.
9. Now add some code to FunWithNumbers to return your value.
Try the Quarkus dashboard again to run the tests
![img_2.png](img_2.png)

Why Quarkus?
It is container first.  K8 Native.
It has many libraries.
It is open source.
Live reload.
