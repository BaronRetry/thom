(ns thom.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [thom.core-test]
   [thom.common-test]))

(enable-console-print!)

(doo-tests 'thom.core-test
           'thom.common-test)
