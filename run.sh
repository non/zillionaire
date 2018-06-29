#!/bin/sh

TARGET="target/scala-2.12/zillionaire-assembly-0.1.0-SNAPSHOT.jar"

if [ ! -f $TARGET ]; then
    echo "building assembly jar..."
    sbt assembly
fi

echo "zillionaire!"
echo "(press Ctrl-D or Ctrl-C to quit)"
java -jar "$TARGET"
