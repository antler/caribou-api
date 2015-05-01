(defproject caribou/caribou-api "0.14.2"
  :description "The api ring handler for caribou"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [caribou/caribou-frontend "0.14.0"]
                 [clj-http "0.5.6"
                  :exclusions [org.apache.httpcomponents/httpclient
                               org.apache.httpcomponents/httpcore]]]
  :profiles {:dev {:dependencies [[ring/ring-mock "0.2.0"]
                                  [ring/ring-defaults "0.1.4"]]}}
  :jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"]
  :ring {:handler caribou.api.core/handler
         :servlet-name "caribou-api"
         :init caribou.api.core/init
         :port 33443})
