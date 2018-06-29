## zillionaire

Speak numbers out loud given their decimel representation.

### quick start

```
$ ./run.sh
zillionaire!
(press Ctrl-D or Ctrl-C to quit)
please give me a number: 123
  saying 'one hundred twenty-three'
please give me a number: 99999999123
  saying 'ninety-nine billion nine hundred ninety-nine million nine hundred ninety-nine thousand one hundred twenty-three'
please give me a number: done
$
```

### description

Zillionaire uses the `say` command combined with the
[Zillion](https://github.com/non/zillion) Scala library.

Run Zillionaire with `./run.sh`.

The first time you run this will assemble Zillionaire's jar file by
launching SBT and running assembly. (If the jar already exists, this
step will be skipped.) The assembly output looks like this:

```
$ ./run.sh
building assembly jar...
[info] Loading settings from assembly.sbt ...
[info] Loading project definition from /Users/erik/w/zillionaire/project
[info] Loading settings from build.sbt ...
[info] Set current project to zillionaire (in build file:/Users/erik/w/zillionaire/)
[info] Updating ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/erik/w/zillionaire/target/scala-2.12/classes ...
[info] Done compiling.
[info] Strategy 'discard' was applied to a file (Run the task at debug level to see details)
[info] Packaging /Users/erik/w/zillionaire/target/scala-2.12/zillionaire-assembly-0.1.0-SNAPSHOT.jar ...
[info] Done packaging.
[success] Total time: 9 s, completed Jun 29, 2018 4:16:27 PM
zillionaire!
...
```

Numbers should be input formats accepted by `java.math.BigDecimal`,
which is used to parse the numbers. Zillion rounds input to a whole
number.

### requirements

Zillionaire requires Java 8 and SBT 1.x to build, and requires a
functioning `say` command.

On OSX, `brew install sbt` should work for installing SBT.
