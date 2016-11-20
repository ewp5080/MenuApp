//add controller to MenuApp
angular.module("menuApp").controller("MenuFeedController", function($scope){
    $scope.weeks = getWeeks();
});

function getWeeks(){
    return [
        {
            date: "2/28",
            menu:[{
                day: "Monday", 
                meal: {
                    name: "Pizza",
                    img: "/src/main/webapp/res/pizza.jpg"
                }
            },{
                day: "Tuesday", 
                meal: {
                    name: "Tacos",
                    img: "/src/main/webapp/res/taco.png"
                }
            },{
                day: "Wednesday", 
                meal: {
                    name: "Spaghetti",
                    img: "/src/main/webapp/res/spaghetti.jpg"
                }
            },{
                day: "Thursday", 
                meal: {
                    name: "Sandwich",
                    img: "/src/main/webapp/res/sandwich.jpg"
                }
            },{
                day: "Friday", 
                meal: {
                    name: "Chicken Tenders",
                    img: "/src/main/webapp/res/chicken-tenders.jpg"
                }
            }]
        },{
            date: "5/02",
            menu:[{
                day: "Monday", 
                meal: {
                    name: "Pizza",
                    img: "/src/main/webapp/res/pizza.jpg"
                }
            },{
                day: "Tuesday", 
                meal: {
                    name: "Tacos",
                    img: "/src/main/webapp/res/taco.png"
                }
            },{
                day: "Wednesday", 
                meal: {
                    name: "Spaghetti",
                    img: "/src/main/webapp/res/spaghetti.jpg"
                }
            },{
                day: "Thursday", 
                meal: {
                    name: "Sandwich",
                    img: "/src/main/webapp/res/sandwich.jpg"
                }
            },{
                day: "Friday", 
                meal: {
                    name: "Chicken Tenders",
                    img: "/src/main/webapp/res/chicken-tenders.jpg"
                }
            }]
        }  
    ];
}