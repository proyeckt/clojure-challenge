;Problem 3
(ns testing
  (:require [invoice-item :as ii]))
(use 'clojure.test)


(deftest test_1
  (def inv-item {:invoice-item/id          "ii1"
                 :invoice-item/sku         "SKU 1"
                 :taxable/taxes            [{:tax/id       "t1"
                                             :tax/category :iva
                                             :tax/rate     19}]
                 :retentionable/retentions [{:retentions/id       "r1"
                                             :retentions/category :ret_fuente
                                             :retentions/rate     1}]})
  (println inv-item)

  (is (= true (ii/subtotal inv-item))))

(deftest test_2
  (def inv-item {:invoice-item/id          "ii1"
                 :invoice-item/sku         "SKU 1"
                 :taxable/taxes            [{:tax/id       "t1"
                                             :tax/category :iva
                                             :tax/rate     19}]
                 :retentionable/retentions [{:retentions/id       "r1"
                                             :retentions/category :ret_fuente
                                             :retentions/rate     1}]})
  (println inv-item)

  (is (= false (ii/subtotal inv-item))))

(deftest test_3
  (def inv-item {:invoice-item/id          "ii1"
                 :invoice-item/sku         "SKU 1"
                 :taxable/taxes            [{:tax/id       "t1"
                                             :tax/category :iva
                                             :tax/rate     19}]
                 :retentionable/retentions [{:retentions/id       "r1"
                                             :retentions/category :ret_fuente
                                             :retentions/rate     1}]})
  (println inv-item)

  (is (= nil (ii/subtotal inv-item))))

(deftest test_4
  (def inv-item {:invoice-item/id          "ii1"
                 :invoice-item/sku         "SKU 1"
                 :taxable/taxes            [{:tax/id       "t1"
                                             :tax/category :iva
                                             :tax/rate     19}]
                 :retentionable/retentions [{:retentions/id       "r1"
                                             :retentions/category :ret_fuente
                                             :retentions/rate     1}]})
  (println inv-item)

  (is (= true (ii/subtotal inv-item))))

(deftest first_test
  (def inv-item {:invoice-item/id          "ii1"
                 :invoice-item/sku         "SKU 1"
                 :taxable/taxes            [{:tax/id       "t1"
                                             :tax/category :iva
                                             :tax/rate     19}]
                 :retentionable/retentions [{:retentions/id       "r1"
                                             :retentions/category :ret_fuente
                                             :retentions/rate     1}]})
  (println inv-item)

  (is (= true (ii/subtotal inv-item))))

(deftest test_5
  (def inv-item {:invoice-item/id          "ii1"
                 :invoice-item/sku         "SKU 1"
                 :taxable/taxes            [{:tax/id       "t1"
                                             :tax/category :iva
                                             :tax/rate     19}]
                 :retentionable/retentions [{:retentions/id       "r1"
                                             :retentions/category :ret_fuente
                                             :retentions/rate     1}]})
  (println inv-item)

  (is (= false (ii/subtotal inv-item))))

(run-all-tests #"testing")