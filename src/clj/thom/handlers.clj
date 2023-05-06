(ns thom.handlers
  (require [thom.database :as database]))

(defn note-by-id
  [request]
  (let [id (:id (:params request))
        note-text (database/get-note-by-id id)]
    (str "Finding note for " id " ... " (((vec note-text) 0) :body))))