;; Groq adapter for Metabot streaming integration

(ns metabase.metabot.groq
  (:require [metabase.metabot.core :as core]
            [clojure.core.async :as async]
            [clojure.tools.logging :as log]))

(defn start-stream [config]
  (let [stream (async/chan)]
    (core/start-stream stream config)
    (log/info "Started Groq stream with config:" config)
    stream))

(defn process-message [message]
  ;; Process incoming messages for Groq
  (log/debug "Processing message:" message)
  ;; Add specific logic for Groq message processing
  )

(defn stop-stream [stream]
  (when stream
    (async/close! stream)
    (log/info "Stopped Groq stream.")))