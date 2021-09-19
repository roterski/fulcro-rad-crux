(ns roterski.fulcro.rad.database-adapters.crux-options)

;; Attribute options

;; Other

(def nodes
  "If using the crux pathom-plugin, the resulting pathom-env will contain
    a map from schema->node at this key path"
  :roterski.fulcro.rad.database-adapters.crux/nodes)

(def databases
  "If using the crux pathom-plugin, the resulting pathom-env will contain
    a map from schema->database at this key path"
  :roterski.fulcro.rad.database-adapters.crux/databases)

(def transaction-functions
  "A way to a add custom transaction functions to each crux node.
   Should be a map where the key is a name of the function and the value (that needs to be a symbol) is a body of the function
   See https://opencrux.com/reference/21.02-1.15.0/transactions.html#transaction-functions
   ```
   {::example-fn '(fn [ctx [id {:keys [before after]}]]
                     (let [db (xtdb.api/db ctx)
                           entity (xtdb.api/entity db id)]
                       [[:xtdb.api/match id (some-> entity (merge before))]
                        [:xtdb.api/put (merge entity after)]]))}
   ```"
  :roterski.fulcro.rad.database-adapters.crux/transaction-functions)
