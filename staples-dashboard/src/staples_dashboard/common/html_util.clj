(ns staples-dashboard.common.html-util)

(defn create-faded-modal-alert
  "This function creates a modal dialog using the supplied parameters"
  [title modal-msg]
  [:div {:class "modal fade" :id "modalAlert" :role "dialog" :tabindex "-1" :aria-hidden "false"
         :aria-labelledby "title-modal"}
   [:div {:class "modal-dialog modal-sm"}
    [:div {:class "modal-content"}
     [:div {:class "modal-header"}
      [:button {:type "button"  :class "close" :data-dismiss "modal" :aria-label "close"}
       [:span {:aria-hidden "true"} "&times;"]]
      [:h4 {:class "modal-title" :id "title-modal"} title]]
     [:div {:class "modal-body"} modal-msg]
     [:div {:class "modal-footer"}
      [:button {:type "button" :class "btn btn-primary btn-sm" :data-dismiss "modal"}"Close"]]]]])

(defn create-progress-bar
  "This function creates a progressbar in a table data"
  [elementId]
  [:div {:style "padding:10px"} "<br>"
   [:div.progress {:id elementId :style "height:12px"}
    [:div.progress-bar.progress-bar-success.progress-bar-striped.active
     {:role "progressbar" :aria-valuenow "25" :aria-valuemin "0" :aria-valuemax="100" :style "width: 60%;height:12px"}
     [:span {:class "sr-only"} "45% Complete"]]]])
