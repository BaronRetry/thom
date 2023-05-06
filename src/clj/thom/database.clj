(ns thom.database
  (require [clojure.java.jdbc :as jdbc]))

(def db-info {:dbtype "postgresql" :port 5432 :user "thom" :dbname "thom" :password "thom"})

(def pg-result (jdbc/query db-info ["SELECT * FROM user_account"]))

(defn get-note-by-id
  [id]
  (let [note-body (jdbc/query db-info [(str "SELECT * FROM note WHERE id = " id)])]
    note-body)
    )