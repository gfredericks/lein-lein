# lein-lein

A Leiningen plugin for running Leiningen tasks.

## Usage

Add `[lein-lein "0.1.0"]` to the `:plugins` vector of your
`:user` profile or `project.clj`.

Then use `lein lein` to run leiningen tasks, for example

```
$ lein lein version
Leiningen 2.4.2 on Java 1.7.0-release OpenJDK Client VM

$ lein lein lein lein lein lein lein with-profile -user repl
nREPL server started on port 40076 on host 127.0.0.1 - nrepl://127.0.0.1:40076
REPL-y 0.3.1
Clojure 1.6.0
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=>
```

## License

Copyright © 2014 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
