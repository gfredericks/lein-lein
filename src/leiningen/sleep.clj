(ns leiningen.sleep
  "Sleeps for a given number of milliseconds.")

(defn ^:no-project-needed sleep
  "Sleeps for a given number of milliseconds.

USAGE: lein sleep 5000"
  [project millis]
  (let [millis (Long/parseLong millis)]
    (Thread/sleep millis)))
