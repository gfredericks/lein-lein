(ns leiningen.throw
  "Throws an exception with an optional message"
  (:require [clojure.string :as string]))

(defn ^:no-project-needed throw
  "Throws an exception with an optional message.

USAGE: lein throw
       lein throw oops something bad happened"
  ([project]
   (throw (Exception. "The throw task threw an exception")))
  ([project & msg-args]
   (throw (Exception. (str "The throw task threw an exception: "
                           (string/join " " msg-args))))))
