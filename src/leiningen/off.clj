(ns leiningen.off
  "A task that disables any other lein-lein task."
  (:require [leiningen.core.main :as main]
            [lein-lein.common :as c]))

(defn ^:no-project-needed off
  "A task that disables any future lein-lein task.

USAGE: lein do off, echo nope"
  [project]
  (alter-var-root #'c/on (constantly false)))

