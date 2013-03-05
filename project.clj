(defproject hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.8"]]
  :ring {:handler hello.core/handler}
  :plugins [[lein-ring "0.8.3"]
            [lein-pallet-fuz "0.1.0-SNAPSHOT"]]
  :pallet-fuz {:pub-key-path "/Users/jonpither/.ssh/depl_rsa.pub"
               :pri-key-path "/Users/jonpither/.ssh/depl_rsa"
               :git-url "git@github.com:jonpither/hello.git"
               :user "fuzzer"
               :checkout-dir "fuzzage"
               :node-spec {:image {:os-family :ubuntu
                                   :os-version-matches "12.04"}
                           ;;   :hardware {:min-ram (* 1 1024)}
                           :hardware {:hardware-id "t1.micro"}
                           :network {:inbound-ports [22 3000]}
                           :location {:location-id "us-east-1"}}})
