#!/bin/sh
## Builds the project, on the cheap, no Ant or Maven
## Clean out the old classes
rm -rf ./build/classes/*
## Make a list of java files to compile
find . -name "*.java" > ./build/sources.txt
#Point the java compiler at the sources and tell it to output class files in the classes directory
javac -d ./build/classes @build/sources.txt
