(ns staples-dashboard.views.main-template
  (:require [hiccup.page :refer [html5 include-css include-js ]]
            [staples-dashboard.common.config :refer [cdn]]))

(defn base-html5-template [title]
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:name "viewport" :content "width=device-width, intial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"}]
     [:title title]
     (include-css "/bootstrap/dist/bootstrap.css")
     (include-css "/angular/angular.min.js")]
    [:body
     [:header
      [:h1 "My Header Section"]]
     [:nav "Navigation Section"]
     [:section "Section Part"]
     [:footer "Footer Section"]]))

(defn create-test []
   "Hello Test")