(ns leiningen.don't
  "Higher order task to not perform other tasks in succession.")

(defn ^:no-project-needed ^:higher-order don't
  "Higher order task to not perform other tasks in succession.

Each comma-separated group should be a task name followed by optional arguments.

USAGE: lein don\\'t test, compile :all, deploy private-repo"
  [project & args])
