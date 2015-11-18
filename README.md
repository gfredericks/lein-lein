# lein-lein

A collection of Leiningen plugins for doing all sorts of useful
things.

## Obtention

Add `[lein-lein "0.1.0"]` to the `:plugins` vector of your
`:user` profile or `project.clj`.

## `lein lein`

A leiningen task for running other leiningen tasks:

```
$ lein lein version
Leiningen 2.4.2 on Java 1.7.0-release OpenJDK Client VM

$ lein lein lein lein lein lein lein with-profile -user repl
user=>
```

## `lein don't`

A higher order task for not performing other tasks in succession:

```
$ lein don\'t test, compile :all, deploy private repo
# doesn't do anything
```

## `lein echo`

A task that prints its arguments, separated by spaces.

```
$ lein echo hello world
hello world
```

## `lein exit`

A task that causes leiningen to exit.

```
$ lein do echo one, echo two, exit, echo three
one
two
```

## `lein hang`

A task that causes the leiningen process to hang.

```
$ lein hang
# ...
```

## `lein sleep`

A task that sleeps for a specified number of milliseconds.

```
$ lein sleep 5000
```

## License

Copyright © 2015 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
