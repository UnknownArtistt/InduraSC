#!/bin/bash

# Path to the JAR, in this case is in the same directory. If you change the name of the JAR note that you have to change the name here too
JAR_NAME="indura-1.0-SNAPSHOT.jar"

# Verifies if the JAR exists
if [ -f "$JAR_NAME" ]; then
    # Ejecutes the JAR
    java -jar $JAR_NAME
else
    echo "Error: Error finding the file $JAR_NAME"
fi