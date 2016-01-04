(ns leiningen.echo
  "Prints arguments, separated by spaces."
  (:require [lein-lein.common :as c]))

(defn ^:no-project-needed echo
  "Prints arguments, separated by spaces.

USAGE: lein echo hello world"
  [project & args]
  (when c/on
    (apply println args)))
