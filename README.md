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

## `lein throw`

A task that throws an exception.

```
$ lein throw oops something bad happened
java.lang.Exception: The throw task threw an exception: oops something bad happened
 at leiningen.throw$throw.doInvoke (throw.clj:13)
    clojure.lang.RestFn.invoke (RestFn.java:486)
    clojure.lang.Var.invoke (Var.java:401)
    clojure.lang.AFn.applyToHelper (AFn.java:171)
    clojure.lang.Var.applyTo (Var.java:700)
    clojure.core$apply.invoke (core.clj:632)
    leiningen.core.main$partial_task$fn__6030.doInvoke (main.clj:261)
    clojure.lang.RestFn.applyTo (RestFn.java:139)
    clojure.lang.AFunction$1.doInvoke (AFunction.java:29)
    clojure.lang.RestFn.applyTo (RestFn.java:137)
    clojure.core$apply.invoke (core.clj:632)
    leiningen.core.main$apply_task.invoke (main.clj:311)
    leiningen.core.main$resolve_and_apply.invoke (main.clj:317)
    leiningen.core.main$_main$fn__6096.invoke (main.clj:390)
    leiningen.core.main$_main.doInvoke (main.clj:383)
    clojure.lang.RestFn.invoke (RestFn.java:482)
    clojure.lang.Var.invoke (Var.java:401)
    clojure.lang.AFn.applyToHelper (AFn.java:171)
    clojure.lang.Var.applyTo (Var.java:700)
    clojure.core$apply.invoke (core.clj:630)
    clojure.main$main_opt.invoke (main.clj:316)
    clojure.main$main.doInvoke (main.clj:421)
    clojure.lang.RestFn.invoke (RestFn.java:551)
    clojure.lang.Var.invoke (Var.java:419)
    clojure.lang.AFn.applyToHelper (AFn.java:186)
    clojure.lang.Var.applyTo (Var.java:700)
    clojure.main.main (main.java:37)
```

## License

Copyright © 2015 Gary Fredericks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
