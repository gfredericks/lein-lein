(ns leiningen.on
  "A task that enables any future lein-lein task."
  (:require [leiningen.core.main :as main]
            [lein-lein.common :as c]))

(defn ^:no-project-needed  on
  "A task that enables any future lein-lein task.

Useful in conjunction with `off`.

USAGE: lein do off, echo nope, on, echo yep"
  [project]
  (alter-var-root #'c/on (constantly true)))

