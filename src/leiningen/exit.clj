(ns leiningen.exit
  "Exits the Leiningen JVM.")

(defn ^:no-project-needed exit
  "Exits the Leiningen JVM.

USAGE: lein exit"
  [_project]
  (System/exit 0))
