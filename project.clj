(defproject org.clojars.oliyh/lein-test-out "0.3.2"
  :url "https://github.com/oliyh/lein-test-out"
  :description "lein-test-out is a leiningen plugin that runs all your tests and outputs to a file in junit XML or TAP format."
  :eval-in-leiningen true
  :dependencies [[org.clojure/tools.namespace "0.2.3"]]
  :deploy-repositories [["clojars" {:sign-releases false}]])
