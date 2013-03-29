(defproject hello "0.1.0-SNAPSHOT"
  :description "Sample project using pallet and pallet-fuz crate"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :repositories {"sonatype" "http://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"}

  :dependencies [[org.clojure/clojure "1.5.0"]
                 [ring "1.1.8"]]

  :plugins [[lein-ring "0.8.3"]
            [lein-pallet-fuz "0.1.2"]]

  :pallet-fuz {:pub-key-path "/Users/jonpither/.ssh/depl_rsa.pub"
               :pri-key-path "/Users/jonpither/.ssh/depl_rsa"
               :git-url "git@github.com:jonpither/hello.git"

               :checkout-dir "fuzzage"
               :node-spec {:image {:os-family :ubuntu
                                   :os-version-matches "12.04"}
                           :hardware {:hardware-id "t1.micro"}
                           :network {:inbound-ports [22 3000]}
                           :location {:location-id "us-east-1"}}}

  :ring {:handler hello.core/handler})
