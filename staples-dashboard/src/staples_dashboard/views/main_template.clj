(ns staples-dashboard.views.main-template
  (:require [hiccup.page :refer [html5 include-css include-js ]]
            [staples-dashboard.common.html-util :refer [create-faded-modal-alert create-progress-bar]]))

(defn base-html5-template [title]
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
     [:meta {:name "viewport" :content "width=device-width, intial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"}]
     [:title title]
     (include-css "/bootstrap/dist/css/bootstrap.css")
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css")
     (include-css "/bootstrap/dist/css/bootstrap-theme.css")
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css")
     ;(include-js "/angular/angular.min.js")
     ]
    [:body
     (create-faded-modal-alert "Info" "This is a Text Message you may read <br>")
     [:div {:top-margin "100px"} "<br>"]
     [:div
      [:table.table-bordered {:align "center" :width "75%" }
       [:thead
        [:tr
        [:th.text-center "Progress Value"]
        [:th.text-center "Progress State"]
        [:th.text-center "Progress State"]
        [:th.text-center "Progress Bar"]]]
       [:tbody
        [:tr
         [:td.text-center "Value goes here"]
         [:td.text-center "Value goes here"]
         [:td.text-center "Value goes here"]
         [:td.text-center
          (create-progress-bar "pb1")]]]]]

     ;(include-js "/jquery/dist/jquery.js")
     (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js")
     (include-js "/bootstrap/dist/js/bootstrap.js")
     ;(include-js "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js")
     (include-js "appjs/app.js")
     ]))


(defn create-test [title]
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
     [:meta {:name "viewport" :content "width=device-width, intial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"}]
     [:title title]
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.css")
     (include-css "/bootstrap/dist/css/bootstrap.css")
     ;(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.css")
     (include-css "/bootstrap/dist/css/bootstrap-theme.css")

     ;(include-js "/angular/angular.min.js")
     ]
    [:body
     [:button {:class "btn btn-primary btn-sm" :data-toggle "modal" :data-target "#modalAlert"} "Show Modal"]
     (create-faded-modal-alert "Info" "This is a Text Message you may read")
     ;(include-js "/jquery/dist/jquery.js")
     (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js")
     ;(include-js "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.js")
     (include-js "/bootstrap/dist/js/bootstrap.js")
     ]))
