(ns staples-dashboard.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            ;user file includes
            [staples-dashboard.views.main-template :refer [create-html5-template create-test]]))

(defroutes app-routes
  (GET "/" [] (create-html5-template))
  (GET "/Test" [] (create-test))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
