#!/bin/bash
## clean some output
rm -rf ./out/*
#Call the Java Virtual Machine with the main method of the following class:
## Write Hello World to the command line
# java -cp ./build/classes org.prospecthillacademy.wizards.hourofcode.helloworld.HelloWorld
## Write HelloWorld to the file stdout.txt (nothing on the command line since the output is redirected to a file
#java -cp ./build/classes org.prospecthillacademy.wizards.hourofcode.helloworld.HelloWorld > out/stdout.txt
## Write Hello Kitty ("Kitty" input from a file) to the command line
#java -cp ./build/classes org.prospecthillacademy.wizards.hourofcode.helloworld.HelloStdIn < in/input.txt
## Write Hello Kitty to the output.txt file, also sending errors to error.txt
#java -cp ./build/classes org.prospecthillacademy.wizards.hourofcode.helloworld.HelloStdIn < in/input.txt > out/HelloStdInOutput.txt 2>out/error.txt
## Same as above, with an international characters, weird result
#java -cp ./build/classes org.prospecthillacademy.wizards.hourofcode.helloworld.HelloStdIn < in/input.txt > out/HelloStdInOutput.txt 2>out/error.txt
## Same as above, with an international characters, with international support
#java -cp ./build/classes org.prospecthillacademy.wizards.hourofcode.helloworld.HelloStdInGlobal < in/mandarinInput.txt > out/HelloStdInGlobalOutput.txt 2>out/error.txt
#Run GrayScale, as the hour of code wrote it
java -cp ./build/classes org.prospecthillacademy.wizards.hourofcode.grayscale.GrayScale > out/GrayScale.txt 2>out/error.txt
