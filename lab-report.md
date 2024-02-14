# Lab report 2

## Part 1

In this part of the lab report we will create a chat server that allows you to have a conversation of sorts. This will work by taking you in a username and a message. Once we have this we will record the relevant information and display it on the screen, after this all further responses will diplayed after. The method that does this is the handleRequest method that takes in the url which contains the username and the message. We find this by striping the url. You can see bellow that our message is what comes after s= and our user is what comes after &user=.

```
http://localhost:4011/add-message?s=How are you&user=yash
```

If we were to run the example above we would get the following result.

![Image](https://i.imgur.com/NAX8c8C.png)

The method that makes this work is as mentioned earlier the handleRequest method. Ill include an image bellow to give you a better idea but overall the main thing is that it takes a url and extracts a username and message and then shows this and all following messages

![Image](https://i.imgur.com/UYePrV1.png)


As you can see above the important arguments are when we split the url into params. When we store the first half in shouldBeMessage and the secound half in shouldBeUser. We then add this information into the field chatHistory which will store all the prompts given. For our example we only care about shouldBeUser[1] which stores in this case yash and shouldBeMessage[1] which will store the message. Everytime that we run this the field chatHistory will grow to conatin each new message. However if we do not give it the add-message request we will print out return strings and not update chatHistory. 

If for some reasone you give a url that is not / or /add-messages you will get 404 Not Found which means that this is not a valid url. 





## Part 2


In this part we will use ssh keys to make connecting to remove servers quicker. One thing that I will not right now is that the lab report wants us to completly remove passwords when we are connecting from our authorized computer. However, for extra saftey I instead add a short pin similar to one that you might have on your phone. This just makes it that in the off chance that I leave my computer on no one is able to simple log onto my account by typing in the correct ssh command.

I will include several screen shots that will give you some information relevent to this task. Such as where I stored the public and private keys(the file path) and how it looks like when you ssh onto the server correctly.

![Image](https://i.imgur.com/Vmvhx9r.png)


In the image above you will see a screenshot that shows a lot of informatin. I'll break it down by section. First at the top you will see where I store my keys on my laptop. You can see that I use PWD if you rememver from our previous lab report this returns that path to the current directory. Next you will see that I type "ssh maurbina@ieng6.ucsd.edu" this is the ssh command that connects to my account for cse 15L. You can see that it asks me for my passphrase for security it does not show it but all I will say is that it is a short pin that I saved that is not my AD password. You can choose to not leave one, however for security I made one that makes it so that it is still quicker to log on however I do not lose all security.




## Part 3

This lab report introduced us to a lot of interesting and useful tools. I think that that the thing that I will use the most is the ssh and generating keys to use. This will make connecting to remote servers a lot easier and makes it so that we do not lose all secuity becuase we use public and private keys. We also learned how to make a chat server that will take a url and extra informatino from it and store it. Alghough what we did was very simple I know that this is something that can be used for a lot of applications. 
