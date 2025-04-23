#!/bin/bash

if [ -z "$1" ]; then
    echo "Indica programa"
    exit 1
fi

programa="${1%.cpp}"

g++ "$programa.cpp" -o "$programa"
if [ $? -eq 0 ]; then
    "./$programa" < /home/dev/programacio/casosDePrueba.txt
    rm "$programa"
else
    echo "Error en la compilación"
    exit 1
fi
