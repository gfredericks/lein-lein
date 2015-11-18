(ns leiningen.echo
  "Prints arguments, separated by spaces.")

(defn ^:no-project-needed echo
  "Prints arguments, separated by spaces.

USAGE: lein echo hello world"
  [project & args]
  (apply println args))
