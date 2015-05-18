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
     {:ng-class "data.pgStatus ? 'progress-bar-success': 'progress-bar-danger'"
      :role "progressbar" :aria-valuenow "{{data.pgValue}}" :aria-valuemin "0" :aria-valuemax= "100" :style "width: {{data.pgValue}}%;height:12px"}
     [:span {:class "sr-only"} "{{data.pgValue}}% Complete"]]]])

(defn progress-bar-sample
  "This function creates  a progress bar sample"
  []
  [:div {:ng-app "progressBar" :ng-controller "progressBarCtrl as pbCtrl" :style "padding:20px"}
   ;[:div.col-lg-12 {:style "height:100px"}]
   [:table.table-bordered {:align "center" :width "75%"}
    [:thead
     [:tr
      [:th.text-center "Progress Value"]
      [:th.text-center "Color Toggle"]
      [:th.text-center "Progress Bar"]]]
    [:tbody
     [:tr {:ng-repeat "data in pgStates"}
      [:td.text-center [:input.form-control {:type "text" :ng-model "data.uploadState"
                                             :style "width:120px;display:table-cell"}]]
      [:td.text-center [:button.btn-sm {:ng-click "data.pgStatus=!data.pgStatus"}"Toggle Bar"]]
      [:td {:style "vertical-align:middle"}
       (create-progress-bar "pb1")]]]]])