(ns staples-dashboard.common.config)

(def cdn
  (if (= (System/getenv "CDN_URL") nil) "resources/" (System/getenv "CDN_URL")))
