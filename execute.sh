#!/bin/bash

if [ -z "$1" ]; then
    echo "Indica programa"
    return 1
fi

programa="${1%.java}" 

javac "$programa.java"
if [ $? -eq 0 ]; then
    java "$programa" < /home/dev/programacio/casosDePrueba.txt
    rm *.class
else
    echo "Error en la compilación"
    return 1
fi
