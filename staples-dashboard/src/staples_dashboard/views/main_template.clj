(ns staples-dashboard.views.main-template
  (:require [hiccup.page :refer [html5 include-css include-js ]]
            [staples-dashboard.common.html-util :refer [create-faded-modal-alert]]))

(defn base-html5-template [title]
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:name "viewport" :content "width=device-width, intial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"}]
     [:title title]
     (include-css "/bootstrap/dist/css/bootstrap.css")
     (include-css "/bootstrap/dist/css/bootstrap-theme.css")
     ;(include-js "/angular/angular.min.js")
     ]
    [:body
     [:header
      [:h1 "My Header Section"]]
     [:nav "Navigation Section"]
     [:section "Section Part"
      [:button {:class "btn btn-primary btn-sm" :data-toggle "modal" :data-target "#myModal"} "Show Modal"]
      [:div {:class "modal fade" :id "myModal" :role "dialog" :tabindex "-1" :aria-hidden "false"
             :aria-labelledby "title-modal"}
       [:div {:class "modal-dialog modal-sm"}
       [:div {:class "modal-content"}
        [:div {:class "modal-header"}
         [:button {:type "button"  :class "close" :data-dismiss "modal" :aria-label "close"}
          [:span {:aria-hidden "true"} "&times;"]]
         [:h4 {:class "modal-title" :id "title-modal"} "Warning"]]
        [:div {:class "modal-body"}" Hello! I'm just learning Clojure ::)"]
        [:div {:class "modal-footer"}
         [:button {:type "button" :class "btn btn-primary btn-sm" :data-dismiss "modal"}"Close"]]]]]]
     [:button {:class "btn btn-primary btn-sm" :data-toggle "modal" :data-target "#modalAlert"} "Show Modal"]
     [:footer "Footer Section" (create-faded-modal-alert "Info" "This is a Text Message you may read")]
     (include-js "/jquery/dist/jquery.js")
     (include-js "/bootstrap/dist/js/bootstrap.js")]))

(defn create-test []
   "Hello Test")