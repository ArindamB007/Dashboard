$(window).load(function(){
    $('#modalAlert').modal('show');
});

var progressBar =angular.module('progressBar',[]);

progressBar.controller('progressBarCtrl',['$scope', function($scope) {
    $scope.pgStates =[
        {uploadState:"QUEUED", pgValue:0, pgStatus:true},
        {uploadState: "IN_PROCESS",pgValue:50, pgStatus:true},
        {uploadState: "PROCESSED",pgValue:100, pgStatus:true},
        {uploadState: "ERROR",pgValue:100, pgStatus:false}];
}]);
