<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/common/common_mobile.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>产品介绍</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" />
    <%--<meta name="viewport" content="width=device-width,user-scalable=no,initial-scale=1,minimum-scale=1,maximum-scale=1" />--%>
    <%--<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui" />--%>
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <link href="${path}/mlsd/css/mobile/swiper.min.css" rel="stylesheet">
    <script>
        (function() {
            var html = document.documentElement;
            var hWidth = html.getBoundingClientRect().width;
            html.style.fontSize = hWidth / 15 + "px";
        })()
    </script>
    <style>
        .swiper-wrapper{width:600px;}
       .scroll .swiper-container{ height:450px;}

    </style>
</head>
<body id="page">
<header class="header"></header>

<section class="product">
    <div class="p-title"><img src="${picPath}${mlsdMobileProductPresentation.newProductsTitleImgUrl}" alt=""></div>
    <div class="scroll">
        <div class="swiper-container" id="banner">
            <div class="swiper-wrapper">
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.newProductsImgUrl1}" alt="轮播图">
                </div>
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.newProductsImgUrl2}" alt="轮播图">
                </div>
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.newProductsImgUrl3}" alt="轮播图">
                </div>
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.newProductsImgUrl4}" alt="轮播图">
                </div>

            </div>
        </div>
        <div class="swiper-pagination banner_page"></div>
    </div>

    <div class="p-title p-title2"><img src="${picPath}${mlsdMobileProductPresentation.signatureCuisineimgTitleImgUrl}" alt=""></div>
    <div class="scroll">
        <div class="swiper-container" id="banner1">
            <div class="swiper-wrapper">
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.signatureCuisineimgUrl1}" alt="轮播图">
                </div>
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.signatureCuisineimgUrl2}" alt="轮播图">
                </div>
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.signatureCuisineimgUrl3}" alt="轮播图">
                </div>
                <div class="swiper-slide">
                    <img src="${picPath}${mlsdMobileProductPresentation.signatureCuisineimgUrl4}" alt="轮播图">
                </div>

            </div>
        </div>
        <div class="swiper-pagination banner_page1"></div>
    </div>

</section>
<img src="${picPath}${mlsdMobileProductPresentation.productListImgUrl}" alt="" class="pc">
<footer class="footer">	</footer>
<script src="${path}/mlsd/js/jquery-1.10.1.min.js"></script>
<script src="${path}/mlsd/js/swiper.min.js"></script>
<script type="text/javascript">
    $(function() {
        var mySwiper = new Swiper("#banner", {
            loop: true,
            loopedSlides: 4,
            slidesPerView: 'auto',
            autoplay: true,
            centeredSlides: true,
            initialSlide: 2,
            watchSlidesProgress: true,
            pagination: {
                el: '.banner_page',
                clickable: true,
            },
            on: {
                progress: function(progress) {
                    for (i = 0; i < this.slides.length; i++) {
                        var slide = this.slides.eq(i);
                        var slideProgress = this.slides[i].progress;
                        if (Math.abs(slideProgress) > 1) {
                            var modify = (Math.abs(slideProgress) - 1) * 0.4 + 1;
                        }
                        translate = slideProgress * modify * 318 + 'px';
                        scale = 1 - Math.abs(slideProgress) / 5;
                        zIndex = 999 - Math.abs(Math.round(10 * slideProgress));
                        slide.transform('translateX(' + translate + ') scale(' + scale + ')');
                        slide.css('zIndex', zIndex);
                        slide.css('opacity', 1);
                        if (Math.abs(slideProgress) > 3) {
                            slide.css('opacity', 0);
                        }
                    }
                },
                setTransition: function(transition) {
                    for (var i = 0; i < this.slides.length; i++) {
                        var slide = this.slides.eq(i)
                        slide.transition(transition);
                    }

                }
            }
        })
    })
</script>
<script type="text/javascript">
    $(function() {
        var mySwiper = new Swiper("#banner1", {
            loop: true,
            loopedSlides: 4,
            slidesPerView: 'auto',
            autoplay: true,
            centeredSlides: true,
            initialSlide: 2,
            watchSlidesProgress: true,
            pagination: {
                el: '.banner_page1',
                clickable: true,
            },
            on: {
                progress: function(progress) {
                    for (i = 0; i < this.slides.length; i++) {
                        var slide = this.slides.eq(i);
                        var slideProgress = this.slides[i].progress;
                        if (Math.abs(slideProgress) > 1) {
                            var modify = (Math.abs(slideProgress) - 1) * 0.4 + 1;
                        }
                        translate = slideProgress * modify * 318 + 'px';
                        scale = 1 - Math.abs(slideProgress) / 5;
                        zIndex = 999 - Math.abs(Math.round(10 * slideProgress));
                        slide.transform('translateX(' + translate + ') scale(' + scale + ')');
                        slide.css('zIndex', zIndex);
                        slide.css('opacity', 1);
                        if (Math.abs(slideProgress) > 3) {
                            slide.css('opacity', 0);
                        }
                    }
                },
                setTransition: function(transition) {
                    for (var i = 0; i < this.slides.length; i++) {
                        var slide = this.slides.eq(i)
                        slide.transition(transition);
                    }

                }
            }
        })
    })
</script>
<script>
    $(document).ready(function() {
        $(".header").load("${path}/mobile/goHeader.do");
        $(".footer").load("${path}/mobile/goFooter.do");
    });
</script>
</body>
</html>
