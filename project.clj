(defproject hello "0.1.0-SNAPSHOT"

  ;; Add a service
  ;;  lein pallet add-service aws aws-ec2 {identity} {credentials}

  :description "Sample project using pallet and pallet-fuz crate"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :repositories {"sonatype" "http://oss.sonatype.org/content/repositories/releases"
                 "sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"}

  :dependencies [[org.clojure/clojure "1.5.0"]
                 [ring "1.1.8"]]

  :profiles {:dev {:plugins [[com.palletops/pallet-lein "0.6.0-beta.7"]]}
             :pallet {:dependencies
                      ;; The latest pallet
                      [ [com.palletops/pallet "0.8.0-beta.4"]
                        [org.cloudhoist/pallet-jclouds "1.5.2"]

                        [org.jclouds.provider/aws-ec2 "1.5.5"]
                        [org.jclouds.provider/aws-s3 "1.5.5"]

                        [org.jclouds.driver/jclouds-slf4j "1.5.5"]
                        [org.jclouds.driver/jclouds-jsch "1.5.5"]

                        [lein-pallet-fuz "0.1.2"]]}}

  :ring {:handler hello.core/handler}
  :plugins [[lein-ring "0.8.3"]])
