(ns leiningen.lein
  "A task for running leiningen tasks."
  (:require [leiningen.core.main :as main]
            [lein-lein.common :as c]))

(defn ^:no-project-needed ^:higher-order lein
  "A task for running leiningen tasks.

USAGE: lein lein test"
  [project & args]
  (when c/on
    (main/resolve-and-apply project args)))
