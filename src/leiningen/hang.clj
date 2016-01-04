(ns leiningen.hang
  "Hangs the Leiningen process."
  (:require [lein-lein.common :as c]))

(defn ^:no-project-needed hang
  "Hangs the Leiningen process.

USAGE: lein hang"
  [_project]
  (when c/on
    (deref (promise))))
