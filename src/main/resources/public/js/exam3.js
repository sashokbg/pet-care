var app3 = angular.module('app3', []);

app3.controller('gListCtrl', function($scope){
  $scope.groceries = [
    {item: "Tomatoes", purchased: false},
    {item: "Potatoes", purchased: true},
    {item: "Courgettes", purchased: false},
    {item: "Milk", purchased: true},
    {item: "Eggs", purchased: false}
  ];
  
  $scope.getList = function(){
    return $scope.showList ? "unorderGroceries.html" : "orderGroceries.html";
  };
});
