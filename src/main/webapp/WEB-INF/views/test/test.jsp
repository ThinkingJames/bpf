
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TEST</title>
</head>
<body>
    <h1>测试Controller</h1>
    <div class="chknumber">
        <label>验证码:
            <input name="kaptcha" type="text" id="kaptcha" maxlength="4" class="chknumber_input" />
        </label>
        <br />
        <img src="/kaptcha/getKaptchaImage" id="kaptchaImage"  style="margin-bottom: -3px"/>
        <a href="javascript:;" onclick="getCaptcha()">看不清?换一张</a>
    </div>
    <script src="../../../static/js/jQuery/jquery.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            $('#kaptchaImage').click(function () {//生成验证码
                $(this).hide().attr('src', '/captcha/getKaptchaImage?' + Math.floor(Math.random()*100) ).fadeIn();
                event.cancelBubble=true;
            });
        });

        window.onbeforeunload = function(){
            //关闭窗口时自动退出
            if(event.clientX>360&&event.clientY<0||event.altKey){
                alert(parent.document.location);
            }
        };

        function getCaptcha() {
            $('#kaptchaImage').hide().attr('src', '/captcha/getKaptchaImage?' + Math.floor(Math.random()*100) ).fadeIn();
            event.cancelBubble=true;
        }
    </script>
</body>
</html>
