# lein-lein

A Leiningen plugin for running Leiningen tasks.

## Usage

Add `[lein-lein "0.1.0"]` to the `:plugins` vector of your
`:user` profile or `project.clj`.

Then use `lein lein` to run leiningen tasks, for example:

```
$ lein lein version
Leiningen 2.4.2 on Java 1.7.0-release OpenJDK Client VM

$ lein lein lein lein lein lein lein with-profile -user repl
user=>
```

## License

Copyright © 2014 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
