(ns leiningen.exit
  "Exits the Leiningen JVM."
  (:require [lein-lein.common :as c]))

(defn ^:no-project-needed exit
  "Exits the Leiningen JVM.

USAGE: lein exit"
  [_project]
  (when c/on
    (System/exit 0)))
