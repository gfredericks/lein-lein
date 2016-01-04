(ns leiningen.sleep
  "Sleeps for a given number of milliseconds."
  (:require [lein-lein.common :as c]))

(defn ^:no-project-needed sleep
  "Sleeps for a given number of milliseconds.

USAGE: lein sleep 5000"
  [project millis]
  (when c/on
    (let [millis (Long/parseLong millis)]
      (Thread/sleep millis))))
