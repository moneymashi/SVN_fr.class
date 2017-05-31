var readyFlag = false;

function allocHorse() {
    generate = function(length) {
        var arr = [];
        var n;
        for (var i = 0; i < length; i++) {
            do
                n = Math.floor(Math.random() * 5 + 1);
            while (arr.indexOf(n) !== -1)
            arr[i] = n;
        }
        return arr;
    }
    var pool = generate(5);
    pool.splice(pool.indexOf(player[0].hnum), 1);
    for (var idx = 1; idx < player.length; idx++) {
        player[idx].hnum = pool[idx - 1];
    }
    $.each(player, function(index, item) {
        console.log(item.id + ": " + item.hnum)
    })
}



$(document).ready(function() {
    loadLevel();
    $("#start-menu").on("click", function() {
        if (!$("#betBtn").prop('checked')) {
            $(this).effect("highlight", 1000);
            $(this).attr("disabled","disabled");
            $("#betBtn").bootstrapToggle('disable');
            start();
        } else
            alert("Not ready.");
    })
    $(".horseExplain").each(function(index, item) {
        $(this).on("mousedown", function() {
            if (!readyFlag) {
                $(this).effect("highlight", "slow", window.setTimeout(function() {}, 1000))
                $(".horseSelect").accordion({
                    active: false,
                    collapsible: true
                });
                player[0].hnum = (index + 1);
                $("#selectedHorse").text(player[0].hnum);
            }
        })
    })

    //No Drag!!!
    $(document).on("dragstart", function(e) {
        return false;
    });

    //No Select!!
    $(document).on("selectstart", function(e) {
        return false;
    });

    $(function() {
        $('#betBtn').change(function() {
            if (!$(this).prop('checked')) {
                if (betting()) {
                    readyFlag = true;
                    $("#slider").slider("disable");
                } else {
                    $('#betBtn').bootstrapToggle('on');
                }
            } else {
                $("#slider").slider("enable");
                readyFlag = false;
            }
        })
    })

});

function start() {
    $("#menus").hide("fade", 1500, init);
    allocHorse();
}

function callResult() {
    calRank();
    $("#gameResult").hide("fade", 1000);
    $("#finalResult").show("fade", 2000);
    var players={
    		playersInfo:player
    };
    $.ajax({
        type: "post",
        url : "./raceResult.jsp?ver=2",
        data: {
        	result:JSON.stringify(players)
        },
        success: whenSuccess,
        error: whenError
 	});
   
function whenSuccess(resdata){
	 $("#finalResult").html(resdata);
	 console.log(resdata);
    }
function whenError(){
	alert("error");
}

    
    /*$("#game")
        .hide(
            "fade",
            2000,
            function() {
                $("body").css("background-image",
                    "url('img/jackpot_bg.jpg')");

                $("#finalResult").html(
                    "<img src=\"img/prize.png\"><span>" +
                    player[0].id +
                    " Win!!! Congratulations!!" +
                    "</span>");
                $("#finalResult")
                    .append(
                        "<table class=\"table table-condesed\"id=\"playerStatus\" align=\"center\"><tbody></tbody></table>");
                $("#finalResult").show("fade", {
                    direction: "down"
                }, 1000);
                var idx = 0;
                window.setTimeout(function() {}, 2000);
                var showList = window.setInterval(function() {
                    if (idx > 4) {
                        $("#playerStatus > tbody:last").append("<br><button type=\"button\" " +
                        		"class=\"col-md-4 col-md-offset-8 col-sm-offset-8 col-sm-5 btn btn-primary btn-lg\" " +
                        		"id=\"restartBtn\" " +
                        		"onclick=\"window.location.reload()\">" +
                        		"占쎈뼄占쎈뻻占쎈릭疫뀐옙" +
                        		"</button>");
                        clearInterval(showList);
                    } else {
                        $("#playerStatus > tbody:last")
                            .append(
                                "<tr><td>" +
                                ((idx < 3) ? "<img src=\"img/" +
                                    idx +
                                    ".png\" class=\"medal\">&nbsp;&nbsp;" :
                                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;") +
                                player[idx].id +
                                "</td><td>" +
                                player[idx].curMoney +
                                "</td></tr>");
                        $("#playerStatus").show("fade", 1000);
                        idx++;
                    }
                }, 1200);
            });*/

}

function betting() {
	  console.log("rest money: " + player[0].curMoney);
      console.log("Betting money: " + player[0].playerBetMoney);
      console.log("horse number: " + player[0].hnum);
    if ( player[0].curMoney >= player[0].playerBetMoney) {
        if (Number(player[0].hnum)) {
           /* console.log("rest money: " + player[0].curMoney);
            console.log("Betting money: " + player[0].playerBetMoney);
            console.log("horse number: " + player[0].hnum);
*/
            return true;
        } else
            alert("You must select a horse.");
    } else {
        alert("Not enough money!");
    }
    return false;

}

function calRank() {
    player.sort(function(a, b) {
        if (a.curMoney > b.curMoney)
            return -1;
        else if (a.curMoney< b.curMoney)
            return 1;
        else
            return 0;
    })
}

function giveBackMoney(winner) {
    console.log("Player select : " + player[0].hnum);
    console.log("winner : " + winner);
    $.each(player, function(index, item) {
        if (item.hnum == winner) {
            item.curMoney = (item.playerBetMoney) *
                horses[item.hnum - 1].win_ratio + item.curMoney;
        } else {
            item.curMoney-= item.playerBetMoney;
        }
    })
    console.log(player);
    /*
     * console.log("Betting Money : "+player[0].playerBetMoney);
     * console.log("Total Money : "+player[0].myMoney);
     */
}