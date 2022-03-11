$(function (){
    var mySwiper = new Swiper ('.swiper', {
        direction: 'horizontal', // 垂直切换选项
        loop: true, // 循环模式选项
        speed: 1000, //图片切换速度
        grabCursor : true,
        autoplay: {     //是否开启自动循环
            delay: 3000,    //图片循环间隔时间
            disableOnInteraction :false,//鼠标点击是否切换
            pauseOnMouseEnter: false, //鼠标放入是否切换
        },

        // 如果需要分页器
        // pagination: {
        //     el: '.swiper-pagination',
        // },

        // 如果需要前进后退按钮
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },

        // 如果需要滚动条
        scrollbar: {
            el: '.swiper-scrollbar',
        },
    })
})