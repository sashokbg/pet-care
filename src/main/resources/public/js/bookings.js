var bookings = angular.module("bookings",[]);

bookings.controller('listBookings', function($scope, $http){
    $http.get('/api/bookings').success(function(data) {
        $scope.bookings = data;
    })
});