(ns leiningen.hang
  "Hangs the Leiningen process.")

(defn ^:no-project-needed hang
  "Hangs the Leiningen process.

USAGE: lein hang"
  [_project]
  (deref (promise)))
