(defproject hello

  (require '[leiningen.pallet-fuz :refer :all])

  :provider {:aws-ec2 {:node-spec {:image {:os-family :ubuntu
                                           :os-version-matches "12.04"}
                                   :hardware {:hardware-id "t1.micro"}
                                   :network {:inbound-ports [22 80 3000]}
                                   :location {:location-id "us-east-1"}}}}

  :groups [(group-spec "fuzgroup"
                       :extends  {:pub-key-path "/Users/jonpither/.ssh/depl_rsa.pub"
                                  :pri-key-path "/Users/jonpither/.ssh/depl_rsa"
                                  :git-url "git@github.com:jonpither/hello.git"

                                  :service-name "bob"
                                  :group-name "bobbuilder"
                                  :port 3000})])
