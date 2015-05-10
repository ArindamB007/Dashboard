(ns staples-dashboard.start-app
(use staples-dashboard.handler
     ring.server.standalone
     ring.middleware.file-info
     ring.middleware.file))

(defn init
  "This function is called before the server starts"
  []
  (println "Staples Dashboard is starting"))

(defn destroy
  "This function is called before the server shuts down"
  []
  (println "Staples Dashboard is shutting down"))

(defonce server (atom nil))

(defn get-handler []
  (-> #'app
      ;(wrap-file "../resources")
      ;(wrap-file-info)
      ))

(defn start-server
  "Function allows to start the server in development mode"
  [& [port]]
  (let [port (if port (Integer/parseInt port) 8080)]
    (reset! server
            (serve (get-handler)
                   {:port port
                    :init init
                    :auto-reload? true
                    :auto-refresh? true
                    :destroy destroy
                    :join true}))
    (println (str "Staples Dashboard may be view at URL:: http://localhost"))))

(defn stop-server []
  (.stop @server)
  (reset! server nil))

(start-server)
