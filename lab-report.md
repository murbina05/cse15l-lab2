#Lab report 2


##Part 1

In this part of the lab report we will create a chat server that allows you to have a conversation of sorts. This will work by taking you in a username and a message. 
Once we have this we will record the relevant information and display it on the screen, after this all further responses will diplayed after. The method that does this 
is the handleRequest method that takes in the url which contains the username and the message. We find this by striping the url. You can see bellow that our message is
what comes after s= and our user is what comes after &user=. 
```
http://localhost:4011/add-message?s=How are you&user=yash
```

If we were to run the example above we would get the following result. 
