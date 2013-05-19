<!doctype html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->

<!-- Consider adding a manifest.appcache: h5bp.com/d/Offline -->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<head>
	<meta charset="utf-8">

	<link rel="dns-prefetch" href="http://fonts.googleapis.com" />
	<link rel="dns-prefetch" href="http://themes.googleusercontent.com" />

	<link rel="dns-prefetch" href="http://ajax.googleapis.com" />
	<link rel="dns-prefetch" href="http://cdnjs.cloudflare.com" />
	<link rel="dns-prefetch" href="http://agorbatchev.typepad.com" />

	<!-- Use the .htaccess and remove these lines to avoid edge case issues.
	   More info: h5bp.com/b/378 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title>Dynamic Tables - Mango: Slick and Responsive Admin Template</title>
	<meta name="description" content="Mango is a slick and responsive Admin Template build with modern techniques like HTML5 and CSS3 to be used for backend solutions of any size.">
	<meta name="author" content="Simon Stamm & Markus Siemens">

	<!-- Mobile viewport optimized: h5bp.com/viewport -->
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<!-- iPhone: Don't render numbers as call links -->
	<meta name="format-detection" content="telephone=no">

	<link rel="shortcut icon" href="../../resources/favicon.ico" />
	<!-- Place favicon.ico and apple-touch-icon.png in the root directory: mathiasbynens.be/notes/touch-icons -->
	<!-- More ideas for your <head> here: h5bp.com/d/head-Tips -->







	<!-- The Styles -->
	<!-- ---------- -->

	<!-- Layout Styles -->
	<link rel="stylesheet" href="../../resources/css/style.css">
	<link rel="stylesheet" href="../../resources/css/grid.css">
	<link rel="stylesheet" href="../../resources/css/layout.css">

	<!-- Icon Styles -->
	<link rel="stylesheet" href="../../resources/css/icons.css">
	<link rel="stylesheet" href="../../resources/css/fonts/font-awesome.css">
	<!--[if IE 8]><link rel="stylesheet" href="../../resources/css/fonts/font-awesome-ie7.css"><![endif]-->

	<!-- External Styles -->
	<link rel="stylesheet" href="../../resources/css/external/jquery-ui-1.8.21.custom.css">
	<link rel="stylesheet" href="../../resources/css/external/jquery.chosen.css">
	<link rel="stylesheet" href="../../resources/css/external/jquery.cleditor.css">
	<link rel="stylesheet" href="../../resources/css/external/jquery.colorpicker.css">
	<link rel="stylesheet" href="../../resources/css/external/jquery.elfinder.css">
	<link rel="stylesheet" href="../../resources/css/external/jquery.fancybox.css">
	<link rel="stylesheet" href="../../resources/css/external/jquery.jgrowl.css">
	<link rel="stylesheet" href="../../resources/css/external/jquery.plupload.queue.css">
	<link rel="stylesheet" href="../../resources/css/external/syntaxhighlighter/shCore.css" />
	<link rel="stylesheet" href="../../resources/css/external/syntaxhighlighter/shThemeDefault.css" />

	<!-- Elements -->
	<link rel="stylesheet" href="../../resources/css/elements.css">
	<link rel="stylesheet" href="../../resources/css/forms.css">

	<link rel="stylesheet" href="../../resources/css/ui.jqgrid.css">

	<!-- OPTIONAL: Print Stylesheet for Invoice -->
	<link rel="stylesheet" href="../../resources/css/print-invoice.css">

	<!-- Typographics -->
	<link rel="stylesheet" href="../../resources/css/typographics.css">

	<!-- Responsive Design -->
	<link rel="stylesheet" href="../../resources/css/media-queries.css">

	<!-- Bad IE Styles -->
	<link rel="stylesheet" href="../../resources/css/ie-fixes.css">







	<!-- The Scripts -->
	<!-- ----------- -->


	<!-- JavaScript at the top (will be cached by browser) -->

	<!-- Load Webfont loader -->
	<script type="text/javascript">
		window.WebFontConfig = {
			google: { families: [ 'PT Sans:400,700' ] },
			active: function(){ $(window).trigger('fontsloaded') }
		};
	</script>
	<script defer async src="https://ajax.googleapis.com/ajax/libs/webfont/1.0.28/webfont.js"></script>

	<!-- Essential polyfills -->
	<script src="../../resources/js/mylibs/polyfills/modernizr-2.6.1.min.js"></script>
	<script src="../../resources/js/mylibs/polyfills/respond.js"></script>
	<script src="../../resources/js/mylibs/polyfills/matchmedia.js"></script>
	<!--[if lt IE 9]><script src="../../resources/js/mylibs/polyfills/selectivizr.js"></script><![endif]-->
	<!--[if lt IE 10]><script src="../../resources/js/mylibs/polyfills/excanvas.js"></script><![endif]-->
	<!--[if lt IE 10]><script src="../../resources/js/mylibs/polyfills/classlist.js"></script><![endif]-->



	<!-- Grab frameworks from CDNs -->
		<!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if offline -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js"></script>
	<script>window.jQuery || document.write('<script src="../../resources/js/libs/jquery-1.7.2.js"><\/script>')</script>

		<!-- Do the same with jQuery UI -->
	<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.21/jquery-ui.js"></script>
	<script>window.jQuery.ui || document.write('<script src="../../resources/js/libs/jquery-ui-1.8.21.js"><\/script>')</script>

		<!-- Do the same with Lo-Dash.js -->
	<!--[if gt IE 8]><!-->
	<script src="http://cdnjs.cloudflare.com/ajax/libs/lodash.js/0.4.2/lodash.js"></script>
	<script>window._ || document.write('<script src="../../resources/js/libs/lo-dash.js"><\/script>')</script>
	<!--<![endif]-->
	<!-- IE8 doesn't like lodash -->
	<!--[if lt IE 9]><script src="http://documentcloud.github.com/underscore/underscore.js"></script><![endif]-->
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.templates/beta1/jquery.tmpl.min.js"></script>
	<script src="http://ajax.aspnetcdn.com/ajax/jquery.templates/beta1/jquery.tmpl.js"></script>



	<!-- scripts concatenated and minified via build script -->

	<!-- General Scripts -->
	<script src="../../resources/js/mylibs/jquery.hashchange.js"></script>
	<script src="../../resources/js/mylibs/jquery.idle-timer.js"></script>
	<script src="../../resources/js/mylibs/jquery.plusplus.js"></script>
	<script src="../../resources/js/mylibs/jquery.jgrowl.js"></script>
	<script src="../../resources/js/mylibs/jquery.scrollTo.js"></script>
	<script src="../../resources/js/mylibs/jquery.ui.touch-punch.js"></script>
	<script src="../../resources/js/mylibs/jquery.ui.multiaccordion.js"></script>
	<script src="../../resources/js/mylibs/number-functions.js"></script>

	<script src="../../resources/js/jquery.jqGrid.min.js"></script>

	<!-- Forms -->
	<script src="../../resources/js/mylibs/forms/jquery.autosize.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.checkbox.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.chosen.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.cleditor.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.colorpicker.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.ellipsis.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.fileinput.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.fullcalendar.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.maskedinput.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.mousewheel.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.placeholder.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.pwdmeter.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.ui.datetimepicker.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.ui.spinner.js"></script>
	<script src="../../resources/js/mylibs/forms/jquery.validate.js"></script>
	<script src="../../resources/js/mylibs/forms/uploader/plupload.js"></script>
	<script src="../../resources/js/mylibs/forms/uploader/plupload.html5.js"></script>
	<script src="../../resources/js/mylibs/forms/uploader/plupload.html4.js"></script>
	<script src="../../resources/js/mylibs/forms/uploader/plupload.flash.js"></script>
	<script src="../../resources/js/mylibs/forms/uploader/jquery.plupload.queue/jquery.plupload.queue.js"></script>

	<!-- Charts -->
	<script src="../../resources/js/mylibs/charts/jquery.flot.js"></script>
	<script src="../../resources/js/mylibs/charts/jquery.flot.orderBars.js"></script>
	<script src="../../resources/js/mylibs/charts/jquery.flot.pie.js"></script>
	<script src="../../resources/js/mylibs/charts/jquery.flot.resize.js"></script>

	<!-- Explorer -->
	<script src="../../resources/js/mylibs/explorer/jquery.elfinder.js"></script>

	<!-- Fullstats -->
	<script src="../../resources/js/mylibs/fullstats/jquery.css-transform.js"></script>
	<script src="../../resources/js/mylibs/fullstats/jquery.animate-css-rotate-scale.js"></script>
	<script src="../../resources/js/mylibs/fullstats/jquery.sparkline.js"></script>

	<!-- Syntax Highlighter -->
	<script src="../../resources/js/mylibs/syntaxhighlighter/shCore.js"></script>
	<script src="../../resources/js/mylibs/syntaxhighlighter/shAutoloader.js"></script>

	<!-- Dynamic Tables -->
	<script src="../../resources/js/mylibs/dynamic-tables/jquery.dataTables.js"></script>
	<script src="../../resources/js/mylibs/dynamic-tables/jquery.dataTables.tableTools.zeroClipboard.js"></script>
	<script src="../../resources/js/mylibs/dynamic-tables/jquery.dataTables.tableTools.js"></script>

	<!-- Gallery -->
	<script src="../../resources/js/mylibs/gallery/jquery.fancybox.js"></script>

	<!-- Tooltips -->
	<script src="../../resources/js/mylibs/tooltips/jquery.tipsy.js"></script>

	<!-- Do not touch! -->
	<script src="../../resources/js/mango.js"></script>
	<script src="../../resources/js/plugins.js"></script>
	<script src="../../resources/js/script.js"></script>

	<!-- Your custom JS goes here -->
	<script src="../../resources/js/app.js"></script>

	<!-- end scripts -->

</head>

<body>

	<!----------------------->
	<!-- Some dialogs etc. -->

	<!-- The loading box -->
	<div id="loading-overlay"></div>
	<div id="loading">
		<span>Loading...</span>
	</div>
	<!-- End of loading box -->

	<!-- The lock screen -->
	<div id="lock-screen" title="Screen Locked">

		<a href="login.html" class="header right button grey flat">Logout</a>

		<p>Due to the inactivity of this session, your account was temporarily locked.</p>
		<p>To unlock your account, simply slide the button and enter your password.</p>

		<div class="actions">
			<div id="slide_to_unlock">
				<img src="../../resources/img/elements/slide-unlock/lock-slider.png" alt="slide me">
				<span>slide to unlock</span>
			</div>
			<form action="#" method="GET">
				<input type="password" name="pwd" id="pwd" placeholder="Enter your password here..." autocorrect="off" autocapitalize="off"> <input type="submit" name=send value="Unlock" disabled> <input type="reset" value="X">
			</form>
		</div><!-- End of .actions -->

	</div><!-- End of lock screen -->

	<!-- The settings dialog -->
	<div id="settings" class="settings-content" data-width=450>

		<ul class="tabs center-elements">
			<li><a href="#settings-1"><img src="../../resources/img/icons/packs/fugue/24x24/user-business.png" alt="" /><span>Account Settings</span></a></li>
			<li><a href="#settings-2"><img src="../../resources/img/icons/packs/fugue/24x24/balloon.png" alt="" /><span>Notifications</span></a></li>
			<li><a href="#settings-3"><img src="../../resources/img/icons/packs/fugue/24x24/credit-card.png" alt="" /><span>Invoicing</span></a></li>
		</ul>

		<div class="change_password">
			<form action="#" method="GET" class="validate" id="settings_password">
				<p>
					<label for="settings-password">New Password:</label> <input type="password" id="settings-password" class="required strongpw small password meter" />
				</p>
			</form>
			<div class="actions">
				<div class="right">
					<input form="settings_password" type="reset" value="Cancel" class="grey" />
					<input form="settings_password" type="submit" value="OK" />
				</div>
			</div>
		</div><!-- End of .change_password -->

		<div class="content">

			<div id="settings-1">
				<form action="#" method="GET">
					<p>
						<label for="settings-name">Name:</label> <input type="text" id="settings-name" class="medium" />
					</p>
					<p>
						<label for="settings-descr">Descripton:</label> <input type="text" id="settings-descr" class="medium" />
					</p>
					<p class="divider"></p>
					<p>
						<label for="settings-pw">Password: </label> <input class="grey change_password_button" type="button" id="settings-pw" value="Change Password..." data-lang-changed="Password changed" />
					</p>
				</form>
			</div><!-- End of #settings-1 -->

			<div id="settings-2">
				Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.
				<form action="#" method="GET">
					<div class="spacer"></div>
					<p class="divider"></p>
					<div class="spacer"></div>
					<p>
						<label for="settings-email">Email Address:</label> <input type="text" id="settings-email" class="medium" />
					</p>
					<p>
						<label for="settings-interval">Interval: </label>
						<select name="settings-interval" id="settings-interval" data-placeholder="Choose an Interval">
							<option value=""></option>
							<option value="Never">Never</option>
							<option value="Daily">Daily</option>
							<option value="Weekly">Weekly</option>
							<option value="Monthly">Monthly</option>
							<option value="Yearly">Yearly</option>
						</select>
					</p>
				</form>
			</div><!-- End of #settings-2 -->

			<div id="settings-3">
				<form action="#" method="GET">
					<p>
						<label for="settings-card-number">Card number:</label> <input type="text" id="settings-card-number" class="medium" />
					</p>
					<p>
						<label for="settings-cvv">CVV:</label> <input type="text" id="settings-cvv" class="medium" />
					</p>
					<p>
						<label for="settings-expiration">Expiration: </label>
						<select sname="settings-expiration" id="settings-expiration" data-placeholder="Choose an Expiration">
							<option value=""></option>
							<option value="2012">2012</option>
							<option value="2013">2013</option>
							<option value="2014">2014</option>
							<option value="2015">2015</option>
						</select>
					</p>
				</form>
			</div><!-- End of #settings-3 -->

		</div><!-- End of .content -->

		<div class="actions">
			<div class="left">
				<button class="grey cancel">Cancel</button>
			</div>
			<div class="right">
				<button class="save">Save</button>
				<button class="hide saving" disabled >Saving...</button>
			</div>
		</div><!-- End of .actions -->

	</div><!-- End of settings dialog -->

	<!-- Add Client Example Dialog -->
	<div style="display: none;" id="dialog_add_client" title="Добавление нового проекта">
		<form name="add_project" id="add_project" action="" class="full validate">
			<div class="row">
				<label for="d2_projectname">
					<strong>Название проекта</strong>
				</label>
				<div>
					<input class="required" type=text name=title id=d2_projectname />
				</div>
			</div>
            <div class="row">
                <label for="d2_url">
                    <strong>URL сайта</strong>
                </label>
                <div>
                    <input class="required" type=text name=url id=d2_url />
                </div>
            </div>
            <%--<div class="row">
                <label for="d2_yml_url">
                    <strong>URL прайс листа (YML)</strong>
                </label>
                <div>
                    <input class="required" type=text name=ymlUrl id=d2_yml_url />
                </div>
            </div>--%>
            <div class="row">
                <label for="d2_yandexlogin">
                    <strong>Яндекс логин</strong>
                </label>
                <div>
                    <input class="required" type=text name=yandexLogin id=d2_yandexlogin />
                </div>
            </div>
            <div class="row">
                <label for="d2_descr">
                    <strong>Описание проекта</strong>
                </label>
                <div>
                    <div>
                        <textarea class="nogrow" rows=5 name=description id="d2_descr"></textarea>
                    </div>
                    <%--<input class="optional" type=textarea name=d2_descr id=d2_descr />--%>
                </div>
            </div>
            <div class="row">
                <label for="d2_defaultproject">
                    <strong>Проект по умолчанию</strong>
                </label>
                <div>
                    <div>
                        <input type=checkbox name=defaultProject id=d2_defaultproject class="ignore" />
                    </div>
                </div>
            </div>
		</form>
		<div class="actions">
			<div class="left">
				<button class="grey cancel">Отмена</button>
			</div>
			<div class="right">
                <button class="submit">Сохранить</button>
			</div>
		</div>
	</div><!-- End if #dialog_add_client -->

	<script>
        function onSuccess(data, status) {
            var redirect_url = data.redirect_url;
            window.location.replace(redirect_url);
        }

        function onError(data, status) {
            data = $.trim(data);
            alert("Ошибка при сохранении проекта" + data);
        }

	$$.ready(function() {
		$( "#dialog_add_client" ).dialog({
			autoOpen: false,
			modal: true,
			width: 400,
			open: function(){ $(this).parent().css('overflow', 'visible'); $$.utils.forms.resize() }
		}).find('button.submit').click(function(){
			var $el = $(this).parents('.ui-dialog-content');
			if ($el.validate().form()) {
                var form = $el.find('form');
                var formData = form.serialize();
                form[0].reset();
                //$.post('/addproject', formData);
                form.attr("disabled", "disabled");
                $.ajax({
                    type: "POST",
                    url: "/addproject",
                    dataType: 'json',
                    cache: false,
                    data: formData,
                    success: onSuccess,
                    error: onError,
                    async: false
                });
                form.removeAttr("disabled");
				$el.dialog('close');
			}
		}).end().find('button.cancel').click(function(){
			var $el = $(this).parents('.ui-dialog-content');
			$el.find('form')[0].reset();
			$el.dialog('close');;
		});

		$( ".open-add-client-dialog" ).click(function() {
			$( "#dialog_add_client" ).dialog( "open" );
			return false;
		});
	});
	</script>
	<!--  End of Add Client Example Dialog -->

	<!-- Message Dialog -->
	<div style="display: none;" id="dialog_message" title="Conversation: John Doe">
		<div class="spacer"></div>
		<div class="messages full chat">

			<div class="msg reply">
				<img src="../../resources/img/icons/packs/iconsweets2/25x25/user-2.png"/>
				<div class="content">
					<h3><a href="pages_profile.html">John Doe</a> <span>says:</span><small>3 hours ago</small></h3>
					<p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore
					et dolore magna aliquyam erat, sed diam voluptua.</p>
				</div>
			</div>

			<div class="msg">
				<img src="../../resources/img/icons/packs/iconsweets2/25x25/user-2.png"/>
				<div class="content">
					<h3><a href="pages_profile.html">Peter Doe</a> <span>says:</span><small>5 hours ago</small></h3>
					<p>At vero eos et accusam et justo duo dolores et ea rebum.
					Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
				</div>
			</div>

		</div><!-- End of .messages -->

		<div class="actions">
			<div class="left">
				<input style="width: 330px;" type="text" name=d3_message id=d3_message placeholder="Type your message..."/>
			</div>
			<div class="right">
				<button>Send</button>
				<button class="grey">Cancel</button>
			</div>
		</div><!-- End of .actions -->

	</div><!-- End of #dialog_message -->

	<script>
	$$.ready(function() {
		$( "#dialog_message" ).dialog({
			autoOpen: false,
			width: 500,
			modal: true
		}).find('button').click(function(){
			$(this).parents('.ui-dialog-content').dialog('close');
		});

		$( ".open-message-dialog" ).click(function() {
			$( "#dialog_message" ).dialog( "open" );
			return false;
		});
	});
	</script>
	<!-- End of Message Dialog -->

	<!--------------------------------->
	<!-- Now, the page itself begins -->
	<!--------------------------------->

	<!-- The toolbar at the top -->
	<section id="toolbar">
		<div class="container_12">

			<!-- Left side -->
			<div class="left">
				<ul class="breadcrumb">

					<li><a href="/projects">Система</a></li>
					<li><a href="javascript:void(0);">Проект</a></li>

				</ul>
			</div>
			<!-- End of .left -->

			<!-- Right side -->
			<div class="right">
				<ul>
                    <li class="red"><a href="/j_spring_security_logout">Выход</a></li>

				</ul>
			</div><!-- End of .right -->

			<!-- Phone only items -->
			<div class="phone">

				<!-- User Link -->
				<li><a href="pages_profile.html"><span class="icon icon-user"></span></a></li>
				<!-- Navigation -->
				<li><a class="navigation" href="#"><span class="icon icon-list"></span></a></li>

			</div><!-- End of phone items -->

		</div><!-- End of .container_12 -->
	</section><!-- End of #toolbar -->

	<!-- The header containing the logo -->
	<header class="container_12">

		<!-- Your logos -->
		<a href="/projects"><img src="../../resources/img/logo.png" alt="Mango" width="191" height="60"></a>
		<a class="phone-title" href="dashboard.html"><img src="../../resources/img/logo-mobile.png" alt="Mango" height="22" width="70" /></a>

		<div class="buttons">
			<a href="/projects">
				<span class="icon icon-list-alt"></span>
				Проекты
			</a>
		</div><!-- End of .buttons -->
	</header><!-- End of header -->

	<!-- The container of the sidebar and content box -->
	<div role="main" id="main" class="container_12 clearfix">

		<!-- The blue toolbar stripe -->
		<section class="toolbar">
			<div class="user">
				<div class="avatar">
					<img src="../../resources/img/layout/content/toolbar/user/avatar.png">
					<span>3</span>
				</div>
				<span>Administrator</span>
				<ul>
					<li><a href="javascript:$$.settings();">Settings</a></li>
					<li><a href="pages_profile.html">Profile</a></li>
					<li class="line"></li>
					<li><a href="login.html">Logout</a></li>
				</ul>
			</div>
			<ul class="shortcuts">

				<li>
					<a href="javascript:void(0);"><span class="icon i24_application-blue"></span></a>
					<!-- Possible sizes: small/medium/large -->
					<div class="small">
						<h3> Информация</h3>

						<!-- Button bar -->
						<button class="button flat left grey" onclick="$(this).parent().fadeToggle($$.config.fxSpeed).parent().removeClass('active')">Закрыть</button>

						<div class="content">
							<p>Информация о проекте.</p>
						</div>
					</div><!-- End of popup -->
				</li>

			</ul><!-- End of .shortcuts -->

			<input type="search" data-source="extras/search.php" placeholder="Поиск..." autocomplete="off" class="tooltip" title="e.g. Peach" data-gravity=s>
		</section><!-- End of .toolbar-->

		<!-- The sidebar -->
		<aside>
			<div class="top">

				<!-- Navigation -->
				<nav><ul class="collapsible accordion">

					<li><a href="javascript:redirect('/project/stats?projectId=' + getProjectId());"><img src="../../resources/img/icons/packs/fugue/16x16/dashboard.png" alt="" height=16 width=16>Статистика</a></li>
                    <li><a href="javascript:redirect('/project/settings?projectId=' + getProjectId());"><img src="../../resources/img/icons/packs/fugue/16x16/application-form.png" alt="" height=16 width=16>Настройки</a></li>
                    <li><a class="open" href="javascript:redirect('/project/goods?projectId=' + getProjectId());"><img src="../../resources/img/icons/packs/fugue/16x16/table.png" alt="" height=16 width=16>Товары</a></li>

				</ul></nav><!-- End of nav -->
			</div><!-- End of .top -->

			<%--<div class="bottom sticky">
				<div class="divider"></div>
				<div class="progress">
					<div class="bar" data-title="Расходы" data-value="20000" data-max="20000" data-format="$0,0"></div>
				</div>
				<div class="divider"></div>
				<div class="buttons">
					<a href="javascript:void(0);" class="button grey open-add-client-dialog">Добавить проект</a>
				</div>
			</div>--%><!-- End of .bottom -->

		</aside><!-- End of sidebar -->


        <%--projects table javascript--%>
        <script>
            $('#projects tbody tr').live('dblclick', function () {
                var sTitle;
                var nTds = $('td', this);
                var projectId = $(nTds[0]).text();
                window.location = '/project?projectId=' + projectId;
            } );

            function loadProjects(){
               var oTable = $('#projects').dataTable({
                    "sDom": 't',
                    "sAjaxSource": '/loadprojects',
                    "bServerSide": true,
                    "sAjaxDataProp": "projects",
                    "aoColumns": [
                        {"mDataProp": "id"},
                        {"mDataProp": "title"},
                        {"mDataProp": "url"},
                        {"mDataProp": "defaultProject"}
                    ]
                });
            }
        </script>
		<!-- Here goes the content. -->
		<section id="content" class="container_12 clearfix" data-sort=true>

		</section><!-- End of #content -->

	</div><!-- End of #main -->

	<!-- The footer -->
	<footer class="container_12">
		<ul class="grid_6">
			<li><a href="#">About</a></li>
			<li><a href="#">Jobs</a></li>
			<li><a href="#">@StammTec.de</a></li>
		</ul>
		
		<span class="grid_6">
			Copyright &copy; 2012 YourCompany
		</span>
	</footer><!-- End of footer -->

	<!-- Spawn $$.loaded -->
	<script>
		$$.loaded();
	</script>

	<!-- Prompt IE 6 users to install Chrome Frame. Remove this if you want to support IE 6.
	   chromium.org/developers/how-tos/chrome-frame-getting-started -->
	<!--[if lt IE 7 ]>
	<script defer src="http://ajax.googleapis.com/ajax/libs/chrome-frame/1.0.3/CFInstall.min.js"></script>
	<script defer>window.attachEvent('onload',function(){CFInstall.check({mode:'overlay'})})</script>
	<![endif]-->

    <script>
        function redirect(url)
        {
            window.location = url;
        }

        function getProjectId()
        {
            var hash = [];
            var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
            hash = hashes[0].split('=');
            return hash[1];
        }
        //call after page loaded
        //window.onload=loadProjects;
        //$(document).ready(loadProjects());
    </script>
</body>
</html>