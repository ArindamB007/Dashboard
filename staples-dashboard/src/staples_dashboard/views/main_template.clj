(ns staples-dashboard.views.main-template
  (:require [hiccup.page :refer [html5]]))

(defn create-html5-template []
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:name "viewport" :content "width=device-width, intial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"}]
     [:title "Sample Home Page Title"]]
    [:body
     [:header
      [:h1 "My Header Section"]]
     [:nav "Navigation Section"]
     [:section "Section Part"]
     [:footer "Footer Section"]]))

(defn create-test []
   "Hello Test")