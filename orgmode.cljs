(ns lt.orgmode
  (:require [lt.object :as object]
            [lt.objs.command :as cmd])
  (:require-macros [lt.macros :refer [behavior defui]]))


(cmd/command
 {:command :editor.org.prepend-asterisk
  :desc "Prepend an asterisk to the current line"
  :exec (fn []
          (when-let [ed (lt.objs.editor.pool/last-active)]
            (object/raise ed :editor.jump-to-definition-at-cursor!)))})
