(ns leiningen.lein
  "A task for running leiningen tasks."
  (:require [leiningen.core.main :as main]))

(defn ^:no-project-needed ^:higher-order lein
  "A task for running leiningen tasks.

USAGE: lein lein test"
  [project & args]
  (main/resolve-and-apply project args))
