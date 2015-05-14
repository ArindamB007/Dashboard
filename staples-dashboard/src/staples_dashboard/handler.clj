(ns staples-dashboard.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            ;user file includes
            [staples-dashboard.views.main-template :refer [base-html5-template create-test]]))

(defroutes app-routes
  (GET "/" [] (base-html5-template "Staples Dashboard"))
  (GET "/Test" [] (create-test "Test Page"))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
