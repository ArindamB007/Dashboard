(ns staples-dashboard.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            ;[compojure.handler :as handler]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            ;user file includes
            [staples-dashboard.views.main-template :refer [base-html5-template create-test]]
            [staples-dashboard.common.html-util :as html-utils]))
 (use 'ring.middleware.session 'ring.util.request)
(defroutes app-routes
  (GET "/" [] (fn [request](base-html5-template "Staples Dashboard" request)))
  (GET "/events" [](fn [request](html-utils/json-event-response (((request :cookies) "ring-session") :value)(request :session))))
  (GET "/Test" [] (create-test "Test Page"))
  (route/not-found "Not Found"))

(def app
  (->(wrap-defaults app-routes site-defaults)wrap-session))