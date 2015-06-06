(ns lt.orgmode
 (:require [lt.object :as object]
            [lt.objs.editor :as editor :refer [set-line line ->cursor]]
            [lt.objs.command :as cmd]))


(cmd/command
 {:command :editor.org.prepend-asterisk
  :desc "Prepend an asterisk to the current line"
  :exec (fn []
          (when-let [ed (lt.objs.editor.pool/last-active)]
            (let [line-no (-> ed (->cursor "start") :line)
                  current-text (line ed line-no)]
              (set-line ed line-no (str "*" current-text)))))})

;(cmd/exec! :editor.org.prepend-asterisk)
