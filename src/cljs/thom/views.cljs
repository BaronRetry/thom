(ns thom.views
  (:require [re-frame.core :as re-frame]))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div "Hello? from " @name])))

(defn test-submit []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:form {:method "POST" :action "/make-note"}
      [:input {:type "text" :name "note"}]
      [:input {:type "submit" :value "Submit"}]])))