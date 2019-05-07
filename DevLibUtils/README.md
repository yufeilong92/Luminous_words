
## 使用

> ##### 只需要在 Application 中调用 `DevUtils.init()` 进行初始化就行

## 目录结构

```
- dev.utils         | 根目录
   - app            | app相关工具类
      - anim        | 动画工具类
      - assist      | 辅助类
         - manager  | 管理器 如: ActivityManager
      - cache       | 缓存工具类
      - camera1     | 摄像头相关 android.hardware.Camera
      - image       | 图片相关处理
      - info        | App信息, PackageInfo 等
      - logger      | 日志库 DevLogger
      - player      | 多媒体(视频、音频)播放封装
      - share       | SharedPreferences 封装
      - toast       | Toast
         - toaster  | Toaster 处理无通知权限
      - wifi        | wifi、热点工具类
   - common         | java工具类, 不依赖android api
      - assist      | 各种快捷辅助类
         - search   | 搜索相关(文件搜索等)
      - cipher      | 编/解码工具类
      - encrypt     | 加密工具类
      - random      | 随机概率算法工具类
      - thread      | 线程相关
      - validator   | 数据校验工具类
```


## 事项

- 内部存在两个日志工具类(工具类内部调用)， 对外使用 [DevLogger](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/utils_readme/logger/DevLogger.md)

```java
// 整个工具类内部日志信息, 都通过以下两个工具类输出打印, 并且通过 DevUtils.openLog() 控制开关

// dev.utils.app - App 打印日志工具类
LogPrintUtils
// dev.utils.common - Java Common 日志打印工具类
JCLogUtils
```

- 需要开启日志, 单独调用
```java
// 打开 lib 内部日志 - 线上环境, 不调用方法就行
DevUtils.openLog();
// 标示 debug 模式
DevUtils.openDebug();
```

- 工具类部分模块配置与使用 - [Use and Config](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/utils_readme/USE_CONFIG.md)

- 部分api更新不及时或有遗漏等，`具体以对应的工具类为准`

- [JavaDoc - API](https://javadoc.jitpack.io/com/github/afkT/DevUtils/1.6.2/javadoc/)

## API


- dev.utils                                        | 根目录
   - [app](#devutilsapp)                           | app相关工具类
      - [anim](#devutilsappanim)                   | 动画工具类
      - [assist](#devutilsappassist)               | 辅助类
         - [manager](#devutilsappassistmanager)    | 管理器 如: ActivityManager
      - [cache](#devutilsappcache)                 | 缓存工具类
      - [camera1](#devutilsappcamera1)             | 摄像头相关 android.hardware.Camera
      - [image](#devutilsappimage)                 | 图片相关处理
      - [info](#devutilsappinfo)                   | App信息, PackageInfo 等
      - [logger](#devutilsapplogger)               | 日志库 DevLogger
      - [player](#devutilsappplayer)               | 多媒体(视频、音频)播放封装
      - [share](#devutilsappshare)                 | SharedPreferences 封装
      - [toast](#devutilsapptoast)                 | Toast
         - [toaster](#devutilsapptoasttoaster)     | Toaster 处理无通知权限
      - [wifi](#devutilsappwifi)                   | wifi、热点工具类
   - [common](#devutilscommon)                     | java工具类, 不依赖android api
      - [assist](#devutilscommonassist)            | 各种快捷辅助类
         - [search](#devutilscommonassistsearch)   | 搜索相关(文件搜索等)
      - [cipher](#devutilscommoncipher)            | 编/解码工具类
      - [encrypt](#devutilscommonencrypt)          | 加密工具类
      - [random](#devutilscommonrandom)            | 随机概率算法工具类
      - [thread](#devutilscommonthread)            | 线程相关
      - [validator](#devutilscommonvalidator)      | 数据校验工具类




## <span id="devutilsapp">**`dev.utils.app`**</span>


* **无障碍功能工具类 ->** [AccessibilityUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/AccessibilityUtils.java)

| 方法 | 注释 |
| :- | :- |
| getService | 获取 AccessibilityService 对象 |
| setService | 设置 AccessibilityService 对象 |
| checkAccessibility | 检查是否开启无障碍功能 |
| isAccessibilitySettingsOn | 判断是否开启无障碍功能 |
| printAccessibilityEvent | 打印 AccessibilityEvent 信息日志 |
| findAccessibilityNodeInfosByText | 查找符合条件的节点 |
| findAccessibilityNodeInfosByViewId | 查找符合条件的节点 |
| performClick | 点击指定的节点 |
| performLongClick | 长按指定的节点 |
| preformActionBack | 触发返回键 |
| preformActionHome | 触发Home键 |
| preformActionPowerDialog | 启动长按电源按钮 Dialog |
| preformActionLockScreen | 锁定屏幕 -> 非锁屏 |
| preformActionTakeScreenshot | 截图 |
| preformActionNotifications | 打开通知栏 |
| preformActionRecents | 最近打开应用列表 |
| preformActionQuickSettings | 打开设置 |
| preformActionSplitScreen | 分屏 |
| preformAction | 模拟对应 Action 操作 |
| performGlobalAction | 模拟全局对应 Action 操作 |


* **Acitivty 工具类 ->** [ActivityUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ActivityUtils.java)

| 方法 | 注释 |
| :- | :- |
| getActivityByView | 返回 View context 所属的 Activity |
| isActivityExists | 判断是否存在指定的Activity |
| startHomeActivity | 回到桌面 (同点击Home键效果) |
| getLauncherActivity | 获取 Launcher activity |
| getActivityIcon | 返回 Activity 对应的图标 |
| getActivityLogo | 返回 Activity 对应的Logo |
| getActivityToLauncher | 获取对应包名应用启动 Activity |
| getLauncherCategoryHomeToResolveInfo | 获取系统桌面信息 |
| getLauncherCategoryHomeToPackageName | 获取系统桌面信息 - packageName |
| getLauncherCategoryHomeToActivityName | 获取系统桌面信息 - activityName |
| getLauncherCategoryHomeToPackageAndName | 获取系统桌面信息 - package/activityName |


* **ADB shell 工具类 ->** [ADBUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ADBUtils.java)

| 方法 | 注释 |
| :- | :- |
| isDeviceRooted | 判断设备是否 root |
| requestRoot | 请求 Root 权限 |
| isGrantedRoot | 判断 App 是否授权 Root 权限 |
| getAppList | 获取 App 列表(包名) |
| getInstallAppList | 获取 App 安装列表(包名) |
| getUserAppList | 获取用户安装的应用列表(包名) |
| getSystemAppList | 获取系统应用列表(包名) |
| getEnableAppList | 获取启用的应用列表(包名) |
| getDisableAppList | 获取禁用的应用列表(包名) |
| getAppListToFilter | 获取包名包含字符串 xxx 的应用列表 |
| isInstalledApp | 判断是否安装应用 |
| getAppInstallPath | 查看应用安装路径 |
| clearAppDataCache | 清除应用数据与缓存 - 相当于在设置里的应用信息界面点击了「清除缓存」和「清除数据」 |
| getAppMessage | 查看应用详细信息 |
| getVersionCode | 获取 App versionCode |
| getVersionName | 获取 App versionName |
| installApp | 安装应用 |
| installAppSilent | 静默安装 App |
| uninstallApp | 卸载 App |
| uninstallAppSilent | 静默卸载 App |
| getActivityToLauncher | 获取对应包名应用启动 Activity |
| getWindowCurrent | 获取当前显示的 Window |
| getWindowCurrent2 | 获取当前显示的 Window |
| getWindowCurrentToPackage | 获取对应包名 显示的 Window |
| getActivityCurrent | 获取当前显示的 Activity |
| getActivitys | 获取 activity 栈 |
| getActivitysToPackage | 获取对应包名的 Activity 栈 |
| getActivitysToPackageLists | 获取对应包名的 Activity 栈 (处理成 List), 最新的 Activity 越靠后 |
| isActivityTopRepeat | 判断 Activity 栈顶 是否重复 |
| getActivityTopRepeatCount | 获取 Activity 栈顶 重复总数 |
| getServices | 查看正在运行的 Services |
| startSelfApp | 启动自身应用 |
| startActivity | 跳转页面 Activity |
| startService | 启动服务 |
| stopService | 停止服务 |
| sendBroadcastToAll | 发送广播(向所有组件发送) |
| sendBroadcast | 发送广播 |
| kill | 销毁进程 |
| sendTrimMemory | 收紧内存 |
| tap | 点击某个区域 |
| swipeClick | 按压某个区域(点击) |
| swipe | 滑动到某个区域 |
| text | 输入文本 - 不支持中文 |
| keyevent | 触发某些按键 |
| screencap | 屏幕截图 |
| screenrecord | 录制屏幕 (以 mp4 格式保存到 /sdcard) |
| wifiConf | 查看连接过的 WiFi 密码 |
| wifiSwitch | 开启/关闭 WiFi |
| setSystemTime | 设置系统时间 |
| setSystemTime2 | 设置系统时间 |
| shutdown | 关机 (需要 root 权限) |
| reboot | 重启设备 (需要 root 权限) |
| rebootToRecovery | 重启引导到 recovery (需要 root 权限) |
| rebootToBootloader | 重启引导到 bootloader (需要 root 权限) |
| sendEventSlide | 发送事件滑动 |
| getSDKVersion | 获取 SDK 版本 |
| getAndroidVersion | 获取 Android 系统版本 |
| getModel | 获取设备型号 如 RedmiNote4X |
| getBrand | 获取品牌 |
| getDeviceName | 获取设备名 |
| getCpuAbiList | 获取 CPU 支持的 abi 列表 |
| getAppHeapsize | 每个应用程序的内存上限 |
| getBattery | 获取电池状况 |
| getDensity | 获取屏幕密度 |
| getScreenSize | 获取屏幕分辨率 |
| getDisplays | 获取显示屏参数 |
| getAndroidId | 获取 Android id |
| getIMEI | 获取 IMEI 码 |
| getIPAddress | 获取 ip 地址 |
| getMac | 获取 Mac 地址 |
| getCPU | 获取 CPU 信息 |
| getMeminfo | 获取内存信息 |
| setScreenSize | 设置屏幕大小 |
| resetScreen | 恢复原分辨率命令 |
| setDensity | 设置屏幕密度 |
| resetDensity | 恢复原屏幕密度 |
| setOverscan | 显示区域 (设置留白边距) |
| resetOverscan | 恢复原显示区域 |
| getScreenBrightnessMode | 获取亮度是否为自动获取(自动调节亮度) |
| setScreenBrightnessMode | 设置亮度是否为自动获取(自动调节亮度) |
| getScreenBrightness | 获取当前亮度值 |
| setScreenBrightness | 更改亮度值（亮度值在0—255之间） |
| getScreenOffTimeout | 获取自动锁屏休眠时间 (单位毫秒) |
| setScreenOffTimeout | 设置自动锁屏休眠时间 (单位毫秒) |
| getGlobalAutoTime | 获取日期时间选项中通过网络获取时间的状态， |
| setGlobalAutoTime | 修改日期时间选项中通过网络获取时间的状态, 设置是否开启 |
| disableADB | 关闭 USB 调试模式 |
| putHiddenApi | 允许访问非 SDK API |
| deleteHiddenApi | 禁止访问非 SDK API |
| openAccessibility | 开启无障碍辅助功能 |
| closeAccessibility | 关闭无障碍辅助功能 |


* **AlarmManager (全局定时器/闹钟)指定时长或以周期形式执行某项操作 ->** [AlarmUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/AlarmUtils.java)

| 方法 | 注释 |
| :- | :- |
| startAlarmIntent | 开启定时器 |
| stopAlarmIntent | 关闭定时器 |
| startAlarmService | 开启轮询服务 |
| stopAlarmService | 停止轮询服务 |
| startAlarmBroadcast | 开启轮询广播 |
| stopAlarmBroadcast | 停止轮询广播 |
| startAlarmActivity | 开启轮询 Activity |
| stopAlarmActivity | 停止轮询 Activity |


* **分析记录工具类 ->** [AnalysisRecordUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/AnalysisRecordUtils.java)

| 方法 | 注释 |
| :- | :- |
| init | 初始化操作 |
| record | 日志记录 |
| isHandler | 是否处理日志记录 |
| setHandler | 设置是否处理日志记录 |
| isAppendSpace | 是否追加空格 |
| setAppendSpace | 设置是否追加空格 |
| getLogFolderName | 获取文件日志名 |
| setLogFolderName | 设置日志文件夹名 |
| getLogStoragePath | 获取日志存储路径 |
| setLogStoragePath | 设置日志存储路径 |
| getStoragePath | 获取存储路径 |
| getFileName | 获取日志文件名 |
| getFileFunction | 获取日志文件记录的功能 |
| getFileIntervalTime | 获取日志文件记录间隔时间 |
| getFolderName | 获取日志文件夹名 |
| obtain | 获取记录分析文件信息 |
| getLogPath | 获取日志地址 |
| getIntervalTimeFolder | 获取时间间隔 - 文件夹 |


* **App通用工具类 ->** [AppCommonUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/AppCommonUtils.java)

| 方法 | 注释 |
| :- | :- |
| getUUID | 获取设备唯一id |
| getRandomUUID | 获取随机数 唯一id |
| getFormatRes | 获取 R.string 资源的格式化字符串 |
| isFroyo | 是否在2.2版本及以上 |
| isGingerbread | 是否在2.3版本及以上 |
| isGingerbreadMR1 | 是否在2.3.3版本及以上 |
| isHoneycomb | 是否在3.0版本及以上 |
| isHoneycombMR1 | 是否在3.1版本及以上 |
| isIceCreamSandwich | 是否在4.0版本及以上 |
| isIceCreamSandwichMR1 | 是否在4.0.3版本及以上 |
| isJellyBean | 是否在4.1版本及以上 |
| isJellyBeanMR1 | 是否在4.2版本及以上 |
| isJellyBeanMR2 | 是否在4.3版本及以上 |
| isKitkat | 是否在4.4.2版本及以上 |
| isLollipop | 是否在5.0.1版本及以上 |
| isM | 是否在6.0版本及以上 |
| isN | 是否在7.0版本及以上 |
| isN_MR1 | 是否在7.1.1版本及以上 |
| isO | 是否在8.0版本及以上 |
| isO_MR1 | 是否在8.1版本及以上 |
| isP | 是否在9.0版本及以上 |
| convertSDKVersion | 转换SDK版本 (convertSDKVersion(14) => Android 4.0.0-2) |


* **App (Android) 工具类 ->** [AppUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/AppUtils.java)

| 方法 | 注释 |
| :- | :- |
| getWindowManager | 获取 WindowManager |
| getView | 获取 View |
| getResources | 获取 Resources |
| getString | 获取 String |
| getColor | 获取 Color |
| getDrawable | 获取 Drawable |
| getDimension | 获取 Dimen 资源 |
| getTheme | 获取 Resources.Theme |
| getAssets | 获取 AssetManager |
| getColorStateList | 获取 ColorStateList |
| getSystemService | 获取 SystemService |
| getPackageManager | 获取 PackageManager |
| getConfiguration | 获取 Configuration |
| getDisplayMetrics | 获取 DisplayMetrics |
| getContentResolver | 获取 ContentResolver |
| getAppIcon | 获取 App 的图标 |
| getAppPackageName | 获取 App 包名 |
| getAppName | 获取 App 名 |
| getAppVersionName | 获取 App 版本名 - 对外显示 |
| getAppVersionCode | 获取 App 版本号 - 内部判断 |
| installApp | 安装 App(支持 8.0)的意图 |
| installAppSilent | 静默安装 App |
| uninstallApp | 卸载 App |
| uninstallAppSilent | 静默卸载 App |
| isAppInstalled | 判断是否安装了应用 |
| isInstalledApp | 判断是否安装指定包名的 App |
| isAppRoot | 判断是否存在 root 权限 |
| isAppDebug | 判断是否 App 是否debug模式 |
| isAppSystem | 判断 App 是否系统app |
| isAppForeground | 判断 App 是否在前台 |
| launchApp | 打开 App |
| launchAppDetailsSettings | 跳转到 专门的 App 设置详情页面 |
| launchAppDetails | 跳转到 专门的 App 应用商城详情页面 |
| getAppPath | 获取 App 路径 /data/data/包名/.apk |
| getAppSignature | 获取 App 签名 |
| getAppSignatureSHA1 | 获取 App sha1值 |
| getAppSignatureSHA256 | 获取应用签名的的 SHA256 值 |
| getAppSignatureMD5 | 获取应用签名 MD5 值 |
| openPDFFile | 启动本地应用打开 PDF |
| openWordFile | 启动本地应用打开 Word |
| openOfficeByWPS | 调用 WPS 打开 office 文档 |


* **状态栏相关工具类 ->** [BarUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/BarUtils.java)

| 方法 | 注释 |
| :- | :- |
| getStatusBarHeight | 获取状态栏高度 |
| setStatusBarVisibility | 设置状态栏是否显示 |
| isStatusBarVisible | 判断状态栏是否显示 |
| setStatusBarLightMode | 设置状态是否高亮模式 |
| addMarginTopEqualStatusBarHeight | 添加状态栏同等高度到View的顶部 |
| subtractMarginTopEqualStatusBarHeight | 添加状态栏同等高度到View的顶部 |
| setStatusBarColor | 设置状态栏颜色 |
| setStatusBarAlpha | 设置状态栏透明度 |
| setStatusBarCustom | 设置自定义状态栏 |
| setStatusBarColor4Drawer | 设置状态栏的颜色 |
| setStatusBarAlpha4Drawer | 设置状态栏透明度 |
| getActionBarHeight | 返回 ActionBase 高度 |
| setNotificationBarVisibility | 设置通知栏是否显示 |
| getNavBarHeight | 获取 NavigationView 高度 |
| setNavBarVisibility | 设置导航栏是否可见(图标显示) |
| isNavBarVisible | 判断导航栏是否可见 |
| setNavBarColor | 设置导航栏颜色 |
| getNavBarColor | 设置导航栏颜色 |
| isSupportNavBar | 判断是否支持导航栏 |


* **亮度相关工具类 ->** [BrightnessUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/BrightnessUtils.java)

| 方法 | 注释 |
| :- | :- |
| isAutoBrightnessEnabled | 判断是否开启自动调节亮度 |
| setAutoBrightnessEnabled | 设置是否开启自动调节亮度 |
| getBrightness | 获取屏幕亮度 |
| setBrightness | 设置屏幕亮度 |
| setWindowBrightness | 设置窗口亮度 |
| getWindowBrightness | 获取窗口亮度 |


* **本应用数据清除管理器 ->** [CleanUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/CleanUtils.java)

| 方法 | 注释 |
| :- | :- |
| cleanInternalCache | 清除内部缓存 - path /data/data/package/cache |
| cleanInternalFiles | 清除内部文件 - path /data/data/package/files |
| cleanInternalDbs | 清除内部数据库 - path /data/data/package/databases |
| cleanInternalDbByName | 根据名称清除数据库 - path /data/data/package/databases/dbName |
| cleanInternalSp | 清除内部 SP - path /data/data/package/shared_prefs |
| cleanExternalCache | 清除外部缓存 - path /storage/emulated/0/android/data/package/cache |
| cleanCustomDir | 清除自定义路径下的文件，使用需小心，请不要误删。而且只支持目录下的文件删除 |
| cleanApplicationData | 清除本应用所有的数据 |
| getFolderSize | 获取文件夹大小 |
| getCacheSize | 获取缓存文件大小 |
| getFormatSize | 格式化单位 |


* **点击工具类 ->** [ClickUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ClickUtils.java)

| 方法 | 注释 |
| :- | :- |
| isFastDoubleClick | 判断两次点击的间隔 小于默认间隔时间(1秒), 则认为是多次无效点击 |
| initConfig | 初始化配置信息 |
| putConfig | 添加配置信息 |
| removeConfig | 移除配置信息 |
| removeRecord | 移除点击记录 |
| clearRecord | 清空点击记录(全部) |
| addTouchArea | 增加控件的触摸范围，最大范围只能是父布局所包含的的区域 |


* **剪贴板相关工具类 ->** [ClipboardUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ClipboardUtils.java)

| 方法 | 注释 |
| :- | :- |
| copyText | 复制文本到剪贴板 |
| getText | 获取剪贴板的文本 |
| copyUri | 复制uri到剪贴板 |
| getUri | 获取剪贴板的uri |
| copyIntent | 复制意图到剪贴板 |
| getIntent | 获取剪贴板的意图 |


* **ContentResolver 工具类 ->** [ContentResolverUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ContentResolverUtils.java)

| 方法 | 注释 |
| :- | :- |
| notifyMediaStore | 通知刷新本地资源 |
| insertImageIntoMediaStore | 添加图片到系统相册(包含原图、相册图, 会存在两张) - 想要一张, 直接调用 notifyMediaStore() |
| insertVideoIntoMediaStore | 添加视频到系统相册 |
| insertIntoMediaStore | 保存到系统相册 |


* **获取CPU信息工具类 ->** [CPUUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/CPUUtils.java)

| 方法 | 注释 |
| :- | :- |
| getProcessorsCount | 获取处理器的Java虚拟机的数量 |
| getSysCPUSerialNum | 获取手机CPU序列号 |
| getCpuInfo | 获取CPU 信息 |
| getCpuModel | 获取CPU 型号 |
| getMaxCpuFreq | 获取 CPU 最大频率(单位KHZ) |
| getMinCpuFreq | 获取 CPU 最小频率(单位KHZ) |
| getCurCpuFreq | 实时获取 CPU 当前频率(单位KHZ) |
| getCoresNumbers | 获取 CPU 几核 |
| getCpuName | 获取CPU名字 |
| getCMDOutputString | 获取 CMD 指令回调数据 |


* **数据库工具类 (导入导出等) ->** [DBUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/DBUtils.java)

| 方法 | 注释 |
| :- | :- |
| startExportDatabase | 导出数据库 |
| startImportDatabase | 导入数据库 |
| getDBPath | 获取数据库路径 |


* **设备相关工具类 ->** [DeviceUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/DeviceUtils.java)

| 方法 | 注释 |
| :- | :- |
| getDeviceInfo | 获取设备信息 |
| handlerDeviceInfo | 处理设备信息 |
| getSDKVersionName | 获取设备系统版本号 |
| getSDKVersion | 获取当前SDK 版本号 |
| getAndroidId | 获取Android id |
| isDeviceRooted | 判断设备是否 root |
| isAdbEnabled | 返回是否启用了 ADB |
| getABIs | 获取支持的指令集 如: [arm64-v8a, armeabi-v7a, armeabi] |
| getMacAddress | 获取设备 MAC 地址 |
| getManufacturer | 获取设备厂商 如 Xiaomi |
| getModel | 获取设备型号 如 RedmiNote4X |
| shutdown | 关机 (需要 root 权限) |
| reboot | 重启设备 (需要 root 权限) |
| rebootToRecovery | 重启引导到 recovery (需要 root 权限) |
| rebootToBootloader | 重启引导到 bootloader (需要 root 权限) |
| getBaseband_Ver | 获取 基带版本 BASEBAND-VER |
| getLinuxCore_Ver | 获取 内核版本 CORE-VER |


* **Dialog 操作相关工具类 ->** [DialogUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/DialogUtils.java)

| 方法 | 注释 |
| :- | :- |
| showDialog | 显示 Dialog |
| closeDialog | 关闭 Dialog |
| closeDialogs | 关闭多个 Dialog |
| closePopupWindow | 关闭 PopupWindow |
| closePopupWindows | 关闭多个 PopupWindow |
| createAlertDialog | 创建提示 Dialog (原生样式) |
| createProgressDialog | 创建加载中 Dialog (原生样式) |
| autoCloseDialog | 自动关闭dialog |
| autoClosePopupWindow | 自动关闭 PopupWindow |
| createSingleChoiceListDialog | 创建单选列表样式 Dialog |
| createSingleChoiceDialog | 创建单选样式 Dialog |
| createMultiChoiceDialog | 创建多选样式 Dialog |
| createViewDialog | 创建自定义 View 样式 Dialog |


* **EditText 工具类 ->** [EditTextUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/EditTextUtils.java)

| 方法 | 注释 |
| :- | :- |
| setCursorVisible | 设置是否显示光标 |
| setMaxLengthAnText | 设置长度限制，并且设置内容 |
| setMaxLength | 设置长度限制 |
| getSelectionStart | 获取光标位置 |
| getText | 获取输入的内容 |
| getTextLength | 获取输入的内容长度 |
| setText | 设置内容 |
| insert | 追加内容 - 当前光标位置追加 |
| setSelectTop | 设置光标在第一位 |
| setSelectBottom | 设置光标在最后一位 |
| setSelect | 设置光标位置 |
| setKeyListener | 设置输入限制 |
| getNumberAndEnglishKeyListener | 限制只能输入字母和数字，默认弹出英文输入法 |
| getNumberKeyListener | 限制只能输入数字，默认弹出数字列表 |
| getMarkId | 获取标记id |
| isOperate | 判断是否操作中 |
| setOperate | 设置是否操作中 |
| getOperateState | 获取操作状态 |
| setOperateState | 设置操作状态 |
| beforeTextChanged | 在文本变化前调用 |
| onTextChanged | 在文本变化后调用 |
| afterTextChanged | 在文本变化后调用 |


* **编码工具类 ->** [EncodeUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/EncodeUtils.java)

| 方法 | 注释 |
| :- | :- |
| urlEncode | url 编码 - UTF-8 |
| urlDecode | url 解码 - UTF-8 |
| base64Encode | base64 编码 => 去除\n 替换 + 和 - 号 |
| base64EncodeToString | base64 编码 |
| base64Decode | base64 解码 |
| base64DecodeToString | base64 解码 |
| htmlEncode | html 编码 |
| htmlDecode | html 解码 |


* **错误信息处理工具类 ->** [ErrorUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ErrorUtils.java)

| 方法 | 注释 |
| :- | :- |
| getErrorMsg | 获取错误信息 |
| getThrowableMsg | 将异常栈信息转为字符串 |
| getThrowableNewLinesMsg | 获取错误信息(有换行) |


* **文件记录工具类 ->** [FileRecordUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/FileRecordUtils.java)

| 方法 | 注释 |
| :- | :- |
| init | 初始化调用方法 |
| saveErrorLog | 保存 App 错误日志 |
| saveLog | 保存 App 日志 |
| handlerVariable | 处理可变参数 |


* **手电筒工具类 ->** [FlashlightUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/FlashlightUtils.java)

| 方法 | 注释 |
| :- | :- |
| getInstance | 获取 FlashlightUtils 实例 ,单例模式 |
| register | 注册摄像头 |
| unregister | 注销摄像头 |
| setFlashlightOn | 打开闪光灯 |
| setFlashlightOff | 关闭闪光灯 |
| isFlashlightOn | 是否打开闪光灯 |
| isFlashlightEnable | 是否支持手机闪光灯 |


* **Handler 工具类, 默认开启一个 Handler，方便在各个地方随时执行主线程任务 ->** [HandlerUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/HandlerUtils.java)

| 方法 | 注释 |
| :- | :- |
| getMainHandler | 获取主线程 Handler |
| postRunnable | 在主线程 Handler 中执行任务 |
| removeRunnable | 在主线程 Handler 中清除任务 |


* **Html 工具类 ->** [HtmlUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/HtmlUtils.java)

| 方法 | 注释 |
| :- | :- |
| setHtmlText | 设置内容, 最终做处理 |
| addHtmlColor | 为给定的字符串添加HTML颜色标记 |
| addHtmlBold | 为给定的字符串添加HTML加粗标记 |
| addHtmlColorAndBlod | 为给定的字符串添加HTML颜色标记,以及加粗 |
| addHtmlUnderline | 为给定的字符串添加HTML下划线 |
| addHtmlIncline | 为给定的字符串添加HTML 字体倾斜 |
| keywordMadeRed | 将给定的字符串中所有给定的关键字标色 |
| keywordReplaceAll | 将给定的字符串中所有给定的关键字进行替换内容 |


* **Intent(意图) 相关工具类 ->** [IntentUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/IntentUtils.java)

| 方法 | 注释 |
| :- | :- |
| isIntentAvailable | 判断 Intent 是否可用 |
| getInstallAppIntent | 获取安装 App(支持 8.0)的意图 |
| getUninstallAppIntent | 获取卸载 App 的意图 |
| getLaunchAppIntent | 获取打开 App 的意图 |
| getLaunchAppDetailsSettingsIntent | 获取 App 具体设置的意图 |
| getLaunchAppDetailIntent | 获取 到应用商店app详情界面的意图 |
| getShareTextIntent | 获取分享文本的意图 |
| getShareImageIntent | 获取分享图片的意图 |
| getComponentIntent | 获取其他应用组件的意图 |
| getShutdownIntent | 获取关机的意图 |
| getDialIntent | 获取跳至拨号界面意图 |
| getCallIntent | 获取拨打电话意图 |
| getSendSmsIntent | 获取发送短信界面的意图 |
| getCaptureIntent | 获取拍照的意图 |
| startSysSetting | 跳转到系统设置页面 |
| openWirelessSettings | 打开网络设置界面 - 3.0以下打开设置界面 |


* **Android 原生 JSONObject 工具类 ->** [JSONObjectUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/JSONObjectUtils.java)

| 方法 | 注释 |
| :- | :- |
| toJson | 转换为 JSON 格式字符串 |
| fromJson | Object 转换 JSON 对象 |
| wrap | 包装转换 Object - {@link JSONObject#wrap(Object)} |
| stringJSONEscape | 字符串 JSON 转义处理 |


* **软键盘相关辅助类 ->** [KeyBoardUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/KeyBoardUtils.java)

| 方法 | 注释 |
| :- | :- |
| setDelayMillis | 设置延迟时间 |
| openKeyboard | 打开软键盘 |
| closeKeyboard | 关闭软键盘 |
| closeKeyBoardSpecial | 关闭软键盘 - 特殊处理 |
| toggleKeyboard | 自动切换键盘状态，如果键盘显示了则隐藏，隐藏着显示 |
| judgeView | 某个View里面的子View的View判断 |
| isSoftInputVisible | 判断软键盘是否可见 |
| registerSoftInputChangedListener | 注册软键盘改变监听器 |
| registerSoftInputChangedListener2 | 注册软键盘改变监听器 |
| fixSoftInputLeaks | 修复软键盘内存泄漏 在 Activity.onDestroy() 中使用 |


* **锁屏工具类 - 锁屏管理， 锁屏、禁用锁屏，判断是否锁屏 ->** [KeyguardUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/KeyguardUtils.java)

| 方法 | 注释 |
| :- | :- |
| getInstance | 获取 KeyguardUtils 实例 ,单例模式 |
| isKeyguardLocked | 是否锁屏 - android 4.1以上支持 |
| isKeyguardSecure | 是否有锁屏密码 - android 4.1以上支持 |
| inKeyguardRestrictedInputMode | 是否锁屏 - android 4.1 之前 |
| getKeyguardManager | 获取 KeyguardManager |
| setKeyguardManager | 设置 KeyguardManager |
| disableKeyguard | 屏蔽系统的屏保 |
| reenableKeyguard | 使能显示锁屏界面，如果你之前调用了disableKeyguard()方法取消锁屏界面，那么会马上显示锁屏界面。 |
| release | 释放资源 |
| newKeyguardLock | 生成一个新的 KeyguardLock, 并且设置 Tag |
| getKeyguardLock | 获取 KeyguardManager.KeyguardLock |
| setKeyguardLock | 设置 KeyguardManager.KeyguardLock |


* **语言工具类 ->** [LanguageUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/LanguageUtils.java)

| 方法 | 注释 |
| :- | :- |
| getSystemLanguage | 获取系统语言 |
| getSystemPreferredLanguage | 获取系统首选语言 |
| applyLanguage | 修改系统语言 (App 多语言,单独改变 App 语言) |
| getSupportLanguages | 获取支持的语言 |
| putSupportLanguage | 添加支持的语言 |
| removeSupportLanguage | 移除支持的语言 |
| isSupportLanguage | 是否支持此语言 |
| getSupportLanguage | 获取支持语言 |


* **事件工具类 ->** [ListenerUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ListenerUtils.java)

| 方法 | 注释 |
| :- | :- |
| getTouchListener | 获取 View 设置的 OnTouchListener |
| getListenerInfo | 获取 View ListenerInfo 对象(内部类) |
| getListenerInfoListener | 获取 View ListenerInfo 对象内部事件对象 |
| setOnClicks | 设置点击事件 |


* **定位相关工具类 ->** [LocationUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/LocationUtils.java)

| 方法 | 注释 |
| :- | :- |
| getLocation | 获取位置, 需要先判断是否开启了定位 |
| isGpsEnabled | 判断Gps是否可用 |
| isLocationEnabled | 判断定位是否可用 |
| openGpsSettings | 打开Gps设置界面 |
| register | 注册 - 使用完记得调用{@link #unregister()} |
| unregister | 注销监听 |
| getAddress | 根据经纬度获取地理位置 |
| getCountryName | 根据经纬度获取所在国家 |
| getLocality | 根据经纬度获取所在地 |
| getStreet | 根据经纬度获取所在街道 |
| isBetterLocation | 是否更好的位置 |
| isSameProvider | 是否相同的提供者 |
| getLastKnownLocation | 获取最后一次保留的坐标 |
| onLocationChanged | 当坐标改变时触发此函数，如果Provider传进相同的坐标，它就不会被触发 |
| onStatusChanged | provider的在可用、暂时不可用和无服务三个状态直接切换时触发此函数 |


* **Android Manifest工具类 ->** [ManifestUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ManifestUtils.java)

| 方法 | 注释 |
| :- | :- |
| getMetaData | 获取 Application Meta Data |
| getMetaDataInActivity | 获取 Activity Meta Data |
| getMetaDataInService | 获取 Service Meta Data |
| getMetaDataInReceiver | 获取 Receiver Meta Data |
| getMetaDataInProvider | 获取 ContentProvider Meta Data |
| getAppVersion | 获取 App 版本信息 |
| getAppVersionCode | 获取 App 版本号 |
| getAppVersionName | 获取 App 版本信息 |


* **获取内存信息 ->** [MemoryUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/MemoryUtils.java)

| 方法 | 注释 |
| :- | :- |
| printMemoryInfo | 返回内存信息 |
| getMemoryInfo | 获取内存信息 |
| printMemoryInfo2 | 返回内存信息 |
| getAvailMemory | 获取可用内存信息 |
| getTotalMemory | 获取总内存大小 |
| getMemoryAvailable | 获取可用内存大小 |
| getMemInfoIype | 通过不同 type 获取对应的内存信息 |


* **网络管理工具类 ->** [NetWorkUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/NetWorkUtils.java)

| 方法 | 注释 |
| :- | :- |
| getMobileDataEnabled | 获取移动网络打开状态(默认属于未打开) |
| setMobileDataEnabled | 设置移动网络开关(无判断是否已开启移动网络) - 实际无效果, 非系统应用无权限 |
| isConnect | 判断是否连接了网络 |
| getConnectType | 获取连接的网络类型 |
| isConnWifi | 判断是否连接Wifi(连接上、连接中) |
| isConnMobileData | 判断是否连接移动网络(连接上、连接中) |
| isAvailable | 判断网络是否可用 |
| isAvailableByPing | 使用 ping ip 方式判断网络是否可用 |
| is4G | 判断是否4G网络 |
| getWifiEnabled | 判断wifi是否打开 |
| isWifiAvailable | 判断wifi数据是否可用 |
| getNetworkOperatorName | 获取网络运营商名称 - 中国移动、如中国联通、中国电信 |
| getNetworkType | 获取当前网络类型 |
| getNetworkClass | 获取移动网络连接类型 |
| getBroadcastIpAddress | 获取广播 ip 地址 |
| getDomainAddress | 获取域名ip地址 |
| getIPAddress | 获取IP地址 |
| getIpAddressByWifi | 根据 WiFi 获取网络 IP 地址 |
| getGatewayByWifi | 根据 WiFi 获取网关 IP 地址 |
| getNetMaskByWifi | 根据 WiFi 获取子网掩码 IP 地址 |
| getServerAddressByWifi | 根据 WiFi 获取服务端 IP 地址 |


* **通知栏管理类 ->** [NotificationUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/NotificationUtils.java)

| 方法 | 注释 |
| :- | :- |
| getNotificationManager | 获取通知栏管理类 |
| cancelAll | 移除通知 - 移除所有通知(只是针对当前Context下的Notification) |
| cancel | 移除通知 - 移除标记为id的通知 (只是针对当前Context下的所有Notification) |
| notify | 进行通知 |
| createPendingIntent | 获取跳转id |
| createNotification | 创建通知栏对象 |
| obtain | 获取 Led 配置参数 |
| isEmpty | 判断是否为 null |


* **工具类: OS 系统相关 ->** [OSUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/OSUtils.java)

| 方法 | 注释 |
| :- | :- |
| getRomType | 获取 ROM 类型 |
| getBaseVersion | 获取 Rom 版本, 如 MIUI 9 获取的是 9 |
| getVersion | 获取 Rom 具体版本号, 如 MIUI 9 8.4.26 获取的是 8.4.26 |


* **路径相关工具类 ->** [PathUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/PathUtils.java)

| 方法 | 注释 |
| :- | :- |
| getRootPath | 获取 Android 系统根目录 - path /system |
| getDataPath | 获取 data 目录 - path /data |
| getDownloadCachePath | 获取下载缓存目录 - path data/cache |
| getInternalAppDataPath | 获取内存应用数据路径 - path /data/data/package |
| getInternalAppCodeCacheDir | 获取内存应用代码缓存路径 - path /data/data/package/code_cache |
| getInternalAppDbsPath | 获取内存应用数据库路径 - path /data/data/package/databases. |
| getInternalAppDbPath | 获取内存应用数据库路径 - path /data/data/package/databases/name. |
| getInternalAppFilesPath | 获取内存应用文件路径 - path/data/data/package/files. |
| getInternalAppSpPath | 获取内存应用 SP 路径 - path/data/data/package/shared_prefs. |
| getInternalAppNoBackupFilesPath | 获取内存应用未备份文件路径 - path/data/data/package/no_backup. |
| getExternalStoragePath | 获取外存路径 - path/storage/emulated/0. |
| getExternalMusicPath | 获取外存音乐路径 - path/storage/emulated/0/Music. |
| getExternalPodcastsPath | 获取外存播客路径 - path/storage/emulated/0/Podcasts. |
| getExternalRingtonesPath | 获取外存铃声路径 - path/storage/emulated/0/Ringtones. |
| getExternalAlarmsPath | 获取外存闹铃路径 - path/storage/emulated/0/Alarms. |
| getExternalNotificationsPath | 获取外存通知路径 - path/storage/emulated/0/Notifications. |
| getExternalPicturesPath | 获取外存图片路径 - path/storage/emulated/0/Pictures. |
| getExternalMoviesPath | 获取外存影片路径 - path/storage/emulated/0/Movies. |
| getExternalDownloadsPath | 获取外存下载路径 - path/storage/emulated/0/Download. |
| getExternalDcimPath | 获取外存数码相机图片路径 - path/storage/emulated/0/DCIM. |
| getExternalDocumentsPath | 获取外存文档路径 - path/storage/emulated/0/Documents. |
| getExternalAppDataPath | 获取外存应用数据路径 - path/storage/emulated/0/Android/data/package. |
| getExternalAppCachePath | 获取外存应用缓存路径 - path/storage/emulated/0/Android/data/package/cache. |
| getExternalAppFilesPath | 获取外存应用文件路径 - path/storage/emulated/0/Android/data/package/files. |
| getExternalAppMusicPath | 获取外存应用音乐路径 - path/storage/emulated/0/Android/data/package/files/Music. |
| getExternalAppPodcastsPath | 获取外存应用播客路径 - path/storage/emulated/0/Android/data/package/files/Podcasts. |
| getExternalAppRingtonesPath | 获取外存应用铃声路径 - path/storage/emulated/0/Android/data/package/files/Ringtones. |
| getExternalAppAlarmsPath | 获取外存应用闹铃路径 - path/storage/emulated/0/Android/data/package/files/Alarms. |
| getExternalAppNotificationsPath | 获取外存应用通知路径 - path/storage/emulated/0/Android/data/package/files/Notifications. |
| getExternalAppPicturesPath | 获取外存应用图片路径 - path/storage/emulated/0/Android/data/package/files/Pictures. |
| getExternalAppMoviesPath | 获取外存应用影片路径 - path/storage/emulated/0/Android/data/package/files/Movies. |
| getExternalAppDownloadPath | 获取外存应用下载路径 - path/storage/emulated/0/Android/data/package/files/Download. |
| getExternalAppDcimPath | 获取外存应用数码相机图片路径 - path/storage/emulated/0/Android/data/package/files/DCIM. |
| getExternalAppDocumentsPath | 获取外存应用文档路径 - path/storage/emulated/0/Android/data/package/files/Documents. |
| getExternalAppObbPath | 获取外存应用 OBB 路径 - path/storage/emulated/0/Android/obb/package. |


* **权限请求工具类 ->** [PermissionUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/PermissionUtils.java)

| 方法 | 注释 |
| :- | :- |
| isGranted | 判断是否授予了权限 |
| shouldShowRequestPermissionRationale | 是否拒绝了权限 - 拒绝过一次, 再次申请时, 弹出选择不再提醒并拒绝才会触发 true |
| permission | 申请权限初始化 |
| callBack | 设置回调方法 |
| request | 请求权限 |
| onRequestPermissionsResult | 请求权限回调 - 需要在 onRequestPermissionsResult 回调里面调用 |
| onGranted | 授权通过权限 |
| onDenied | 授权未通过权限 |


* **手机相关工具类 ->** [PhoneUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/PhoneUtils.java)

| 方法 | 注释 |
| :- | :- |
| isSimReady | 判断是否装载sim卡 |
| getUserCountry | 获取Sim卡所属地区，非国内地区暂不支持播放 |
| judgeArea | 判断地区，是否属于国内 |
| isPhone | 判断设备是否是手机 |
| getMEID | 获取 MEID 移动设备识别码 |
| getIMEI | 获取 IMEI 码 |
| getIMSI | 获取 IMSI 码 |
| getIMSIIDName | 获取IMSI处理过后的简称 |
| getPhoneType | 获取移动终端类型 |
| isSimCardReady | 判断 sim 卡是否准备好 |
| getSimOperatorName | 获取 Sim 卡运营商名称 => 中国移动、如中国联通、中国电信 |
| getSimOperatorByMnc | 获取 Sim 卡运营商名称 => 中国移动、如中国联通、中国电信 |
| getDeviceId | 获取设备id |
| getSerialNumber | 返回设备序列化 |
| getAndroidId | 获取Android id |
| getUUID | 获取设备唯一id |
| getPhoneStatus | 获取手机状态信息 |
| dial | 跳至拨号界面 |
| call | 拨打电话 |
| sendSms | 跳至发送短信界面 |
| sendSmsSilent | 发送短信 |
| getAllContactInfo | 获取手机联系人 |
| getAllContactInfo2 | 获取手机联系人 |
| getContactNum | 打开手机联系人界面点击联系人后便获取该号码 |
| getAllSMS | 获取手机短信并保存到 xml 中 |
| getMtkTeleInfo | 获取 MTK 神机的双卡 IMSI、IMSI 信息 |
| getMtkTeleInfo2 | 获取 MTK 神机的双卡 IMSI、IMSI 信息 |
| getQualcommTeleInfo | 获取 高通 神机的双卡 IMSI、IMSI 信息 |
| getSpreadtrumTeleInfo | 获取 展讯 神机的双卡 IMSI、IMSI 信息 |


* **轮询工具类 ->** [PollingUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/PollingUtils.java)

| 方法 | 注释 |
| :- | :- |
| startPolling | 开启轮询 |
| stopPolling | 停止轮询 |
| startPollingService | 开启轮询服务 |
| stopPollingService | 停止轮询服务 |


* **电源管理工具类 ->** [PowerManagerUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/PowerManagerUtils.java)

| 方法 | 注释 |
| :- | :- |
| getInstance | 获取 PowerManagerUtils 实例 ,单例模式 |
| isScreenOn | 屏幕是否打开(亮屏) |
| turnScreenOn | 唤醒屏幕/点亮亮屏 |
| turnScreenOff | 释放屏幕锁, 允许休眠时间自动黑屏 |
| getWakeLock | 获取 PowerManager.WakeLock |
| setWakeLock | 设置 PowerManager.WakeLock |
| getPowerManager | 获取 PowerManager |
| setPowerManager | 设置 PowerManager |
| setBright | 设置屏幕常亮 |
| setWakeLockToBright | 设置WakeLock 常亮 |


* **进程相关工具类 ->** [ProcessUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ProcessUtils.java)

| 方法 | 注释 |
| :- | :- |
| kill | 销毁自身进程 |
| isCurProcess | 判断是否当前进程 |
| getCurProcessName | 获取当前进程的名字 |
| getProcessName | 获取进程号对应的进程名 |
| getPid | 根据包名获取进程id |
| getRunningAppProcessInfo | 根据 pid 获取进程信息 |
| getForegroundProcessName | 获取前台线程包名 |
| getAllBackgroundProcesses | 获取后台服务进程 |
| killAllBackgroundProcesses | 杀死所有的后台服务进程 |
| killBackgroundProcesses | 杀死后台服务进程 |


* **资源文件工具类 ->** [ResourceUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ResourceUtils.java)

| 方法 | 注释 |
| :- | :- |
| getView | 获取 View |
| getResources | 获取 Resources |
| getTheme | 获取 Resources.Theme |
| getAssets | 获取 AssetManager |
| getColorStateList | 获取 ColorStateList |
| getString | 获取字符串 |
| getColor | 获取 Color |
| getDrawable | 获取 Drawable |
| getDimension | 获取 Dimen 资源 |
| getResourceId | 根据资源名获取资源id |
| getLayoutId | 获取 layout 布局文件 id |
| getStringId | 获取 string id |
| getDrawableId | 获取 drawable id |
| getDrawableId2 | 获取 drawable id |
| getMipmapId | 获取 mipmap id |
| getStyleId | 获取 style id |
| getStyleableId | 获取 styleable id |
| getAnimId | 获取 anim id |
| getId | 获取 id |
| getColorId | 获取 color id |
| readBytesFromAssets | 获取 Assets 资源文件数据 |
| readStringFromAssets | 读取字符串 来自 Assets文件 |
| readBytesFromRaw | 从res/raw 中获取内容。 |
| readStringFromRaw | 读取字符串 来自Raw 文件 |
| geFileToListFromAssets | 获取 Assets 资源文件数据(返回List<String> 一行的全部内容属于一个索引) |
| geFileToListFromRaw | 从res/raw 中获取内容。(返回List<String>一行的全部内容属于一个索引) |
| saveAssetsFormFile | 从Assets 资源中获取内容并保存到本地 |
| saveRawFormFile | 从res/raw 中获取内容并保存到本地 |


* **屏幕相关工具类 ->** [ScreenUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ScreenUtils.java)

| 方法 | 注释 |
| :- | :- |
| getDisplayMetrics | 获取 DisplayMetrics |
| getScreenWidth | 获取屏幕的宽度(单位 px) |
| getScreenHeight | 获取屏幕的高度(单位 px) |
| getScreenWidthHeightToPoint | 通过 Context 获取屏幕宽度高度 |
| getScreenWidthHeight | 通过 Context 获取屏幕宽度高度 |
| getScreenSize | 获取屏幕分辨率 |
| getScreenSizeOfDevice | 获取屏幕英寸 例5.5英寸 |
| getDensity | 通过 Context 获取屏幕密度 |
| getDensityDpi | 通过 Context 获取屏幕密度Dpi |
| getScaledDensity | 通过 Context 获取屏幕缩放密度 |
| getXDpi | 获取 X轴 dpi |
| getYDpi | 获取 Y轴 dpi |
| getWidthDpi | 获取 宽度比例 dpi 基准 |
| getHeightDpi | 获取 高度比例 dpi 基准 |
| getScreenInfo | 获取屏幕信息 |
| setFullScreen | 设置屏幕为全屏 |
| setLandscape | 设置屏幕为横屏 |
| setPortrait | 设置屏幕为竖屏 |
| isLandscape | 判断是否横屏 |
| isPortrait | 判断是否竖屏 |
| getScreenRotation | 获取屏幕旋转角度 |
| isScreenLock | 判断是否锁屏 |
| isTablet | 判断是否是平板 |
| getStatusHeight | 获取状态栏的高度(无关 android:theme 获取状态栏高度) |
| getStatusBarHeight | 获取应用区域 TitleBar 高度 (顶部灰色TitleBar高度，没有设置 android:theme 的 NoTitleBar 时会显示) |
| setSleepDuration | 设置进入休眠时长 |
| getSleepDuration | 获取进入休眠时长 |
| snapShotWithStatusBar | 获取当前屏幕截图，包含状态栏 (顶部灰色TitleBar高度，没有设置 android:theme 的 NoTitleBar 时会显示) |
| snapShotWithoutStatusBar | 获取当前屏幕截图，不包含状态栏 (如果 android:theme 全屏了，则截图无状态栏) |
| getNavigationBarHeight | 获取底部导航栏高度 |
| checkDeviceHasNavigationBar | 检测是否具有底部导航栏 |


* **SD卡相关辅助类 ->** [SDCardUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/SDCardUtils.java)

| 方法 | 注释 |
| :- | :- |
| isSDCardEnable | 判断SDCard是否正常挂载 |
| getSDCardFile | 获取SD卡路径(File对象) |
| getSDCardPath | 获取SD卡路径(无添加  -> / -> File.separator) |
| isSDCardEnablePath | 判断 SD 卡是否可用 |
| getSDCardPaths | 获取 SD 卡路径 |
| getAllBlockSize | 返回对应路径的空间总大小 |
| getAvailableBlocks | 返回对应路径的空闲空间(byte 字节大小) |
| getAlreadyBlock | 返回对应路径,已使用的空间大小 |
| getBlockSizeInfos | 返回对应路径的空间大小信息 |
| getSDTotalSize | 获取 SD 卡总大小 |
| getSDAvailableSize | 获取 SD 卡剩余容量，即可用大小 |
| getRomTotalSize | 获取机身内存总大小 |
| getRomAvailableSize | 获取机身可用内存 |
| getDiskCacheDir | 获取缓存地址 |
| getCacheFile | 获取缓存资源地址 |
| getCachePath | 获取缓存资源地址 |


* **服务相关工具类 ->** [ServiceUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ServiceUtils.java)

| 方法 | 注释 |
| :- | :- |
| isServiceRunning | 判断服务是否运行 |
| getAllRunningService | 获取所有运行的服务 |
| startService | 启动服务 |
| stopService | 停止服务 |
| bindService | 绑定服务 |
| unbindService | 解绑服务 |


* **Shape 工具类 ->** [ShapeUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ShapeUtils.java)

| 方法 | 注释 |
| :- | :- |
| getDrawable | 获取 GradientDrawable |
| setDrawable | 设置 Drawable 背景 |
| newBuilder | 创建新的 Shape Builder 对象 |
| newBuilderToLeft | 创建新的 Shape Builder 对象 |
| newBuilderToRight | 创建新的 Shape Builder 对象 |
| newBuilderToGradient | 创建渐变的 Shape Builder 对象 |
| build | 获取 Shape 工具类 |
| setRadius | 设置圆角 |
| setRadiusLeft | 设置圆角 |
| setRadiusRight | 设置圆角 |
| setCornerRadii | 内部处理方法 |
| setColor | 设置背景色(填充铺满) |
| setStroke | 设置边框颜色 |
| setSize | 设置大小 |


* **Shell 相关工具类 ->** [ShellUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ShellUtils.java)

| 方法 | 注释 |
| :- | :- |
| execCmd | 是否是在 root 下执行命令 |
| isSuccess | 判断是否执行成功 |
| isSuccess2 | 判断是否执行成功(判断 errorMsg) |
| isSuccess3 | 判断是否执行成功(判断 successMsg) |
| isSuccess4 | 判断是否执行成功(判断 successMsg) , 并且 successMsg 是否包含某个字符串 |


* **创建删除快捷图标工具类 ->** [ShortCutUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ShortCutUtils.java)

| 方法 | 注释 |
| :- | :- |
| hasShortcut | 检测是否存在桌面快捷方式 |
| addShortcut | 为程序创建桌面快捷方式 |
| delShortcut | 删除程序的快捷方式 |


* **签名工具类(获取 App 签名信息) ->** [SignaturesUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/SignaturesUtils.java)

| 方法 | 注释 |
| :- | :- |
| toHexString | 进行转换 |
| signatureMD5 | 返回 MD5 |
| signatureSHA1 | 返回 SHA1 加密字符串 |
| signatureSHA256 | 返回 SHA256 加密字符串 |
| isDebuggable | 判断签名是debug签名还是release签名 |
| getX509Certificate | 获取 App 证书对象 |
| printSignatureName | 打印签名信息 |
| getSignaturesFromApk | 从 Apk 中读取签名 |
| getCertificateFromApk | 从 Apk 中读取签名 |


* **dp，px，sp转换、View获取宽高等 ->** [SizeUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/SizeUtils.java)

| 方法 | 注释 |
| :- | :- |
| dipConvertPx | 根据手机的分辨率从 dp 的单位 转成为 px(像素) |
| dipConvertPxf | 根据手机的分辨率从 dp 的单位 转成为 px(像素) - float |
| pxConvertDip | 根据手机的分辨率从 px(像素) 的单位 转成为 dp |
| pxConvertDipf | 根据手机的分辨率从 px(像素) 的单位 转成为 dp - float |
| pxConvertSp | 根据手机的分辨率从 px(像素) 的单位 转成为 sp |
| pxConvertSpf | 根据手机的分辨率从 px(像素) 的单位 转成为 sp - float |
| spConvertPx | 根据手机的分辨率从 sp 的单位 转成为 px |
| spConvertPxf | 根据手机的分辨率从 sp 的单位 转成为 px - float |
| dipConvertPx2 | 根据手机的分辨率从 dp 的单位 转成为 px(像素) 第二种 |
| dipConvertPx2f | 根据手机的分辨率从 dp 的单位 转成为 px(像素) 第二种 - float |
| spConvertPx2 | 根据手机的分辨率从 sp 的单位 转成为 px 第二种 |
| spConvertPx2f | 根据手机的分辨率从 sp 的单位 转成为 px 第二种 - float |
| applyDimension | 各种单位转换 - 该方法存在于 TypedValue |
| forceGetViewSize | 在 onCreate 中获取视图的尺寸 - 需回调 onGetSizeListener 接口，在 onGetSize 中获取 view 宽高 |
| measureView | 测量视图尺寸 |
| getMeasuredWidth | 获取测量视图宽度 |
| getMeasuredHeight | 获取测量视图高度 |
| onGetSize | 获取到 View 尺寸 通知 |


* **Snackbar 工具类 ->** [SnackbarUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/SnackbarUtils.java)

| 方法 | 注释 |
| :- | :- |
| with | 获取 SnackbarUtils 对象 |
| getStyle | 获取样式 |
| setStyle | 设置样式 |
| getSnackbar | 获取 Snackbar |
| getSnackbarView | 获取 Snackbar View |
| getTextView | 获取 Snackbar TextView(snackbar_text) |
| getActionButton | 获取 Snackbar Action Button(snackbar_action) |
| addView | 向 Snackbar 布局中添加View (Google不建议,复杂的布局应该使用DialogFragment进行展示) |
| setCallback | 设置 Snackbar 展示完成 及 隐藏完成 的监听 |
| setAction | 设置 Action 按钮文字内容 及 点击监听 |
| dismiss | 关闭 Snackbar |
| showShort | 显示 Short Snackbar |
| showLong | 显示 Long Snackbar |
| showIndefinite | 显示 Indefinite Snackbar (无限时, 一直显示) |
| setSnackbarStyle | 设置 Snackbar 样式配置 |
| getShadowMargin | 获取阴影边距 |
| setShadowMargin | 设置阴影边距 |
| isAutoCalc | 判断是否自动计算边距 (如: 显示在 View 下面, 但是下方距离不够, 自动设置为在 View 上方显示) |
| setAutoCalc | 设置是否自动计算边距 (如: 显示在 View 下面, 但是下方距离不够, 自动设置为在 View 上方显示) |
| above | 设置 Snackbar 显示在指定 View 的上方 |
| bellow | 设置 Snackbar 显示在指定 View 的下方 |


* **颜色状态列表 工具类 ->** [StateListUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/StateListUtils.java)

| 方法 | 注释 |
| :- | :- |
| getColorStateList | 通过 Context 获取 ColorStateList |
| createColorStateList | 创建 颜色状态列表 => createColorStateList("#ffffffff", "#ff44e6ff") |
| newSelector | 创建 Drawable选择切换 list => view.setBackground(Drawable) |


* **TextView 工具类 ->** [TextViewUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/TextViewUtils.java)

| 方法 | 注释 |
| :- | :- |
| getTextView | 获取TextView |
| getText | 获取文本 |
| setBold | 设置是否加粗 |
| setTextColor | 设置字体颜色 |
| setTypeface | 设置字体 |
| clearFlags | 清空 flags |
| setUnderlineText | 设置下划线 |
| setStrikeThruText | 设置中划线 |
| setText | 设置内容 |
| setTexts | 设置多个 TextView 内容 |
| setHtmlText | 设置 Html 内容 |
| setHtmlTexts | 设置 多个 TextView Html 内容 |
| getTextHeight | 获取字体高度 |
| getTextTopOffsetHeight | 获取字体顶部偏移高度 |
| getTextWidth | 计算字体宽度 |
| getCenterRectY | 获取画布中间居中位置 |
| reckonTextSize | 通过需要的高度, 计算字体大小 |
| calcTextWidth | 计算第几位超过宽度 |


* **Uri 工具类 ->** [UriUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/UriUtils.java)

| 方法 | 注释 |
| :- | :- |
| getUriForFileToName | 返回处理后的Uri, 单独传递名字, 自动添加包名 ${applicationId} |
| getUriForFile | Return a content URI for a given file. |
| getFilePathByUri | 通过 Uri 获取 文件路径 |


* **震动相关工具类 ->** [VibrationUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/VibrationUtils.java)

| 方法 | 注释 |
| :- | :- |
| vibrate | 震动 |
| cancel | 取消震动 |


* **View 操作相关工具类 ->** [ViewUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/ViewUtils.java)

| 方法 | 注释 |
| :- | :- |
| getContext | 获取 Context |
| getView | 获取 View |
| isEmpty | 判断View 是否为null |
| isVisibility | 判断View 是否显示 |
| isVisibilitys | 判断 View 是否都显示显示 |
| isVisibilityIN | 判断View 是否隐藏占位 |
| isVisibilityGone | 判断View 是否隐藏 |
| getVisibility | 获取显示的状态 (View.VISIBLE : View.GONE) |
| getVisibilityIN | 获取显示的状态 (View.VISIBLE : View.INVISIBLE) |
| setVisibility | 设置View显示状态 |
| setVisibilitys | 设置View 显示的状态 |
| toggleVisibilitys | 切换 View 显示的状态 |
| reverseVisibilitys | 反转 View 显示的状态 |
| toogleView | 切换View状态 |
| setViewImageRes | 设置View 图片资源 |
| findViewById | 初始化View |
| removeSelfFromParent | 把自身从父View中移除 |
| isTouchInView | 判断触点是否落在该View上 |
| requestLayoutParent | View 改变请求 |
| measureView | 测量 View |
| getViewWidth | 获取view的宽度 |
| getViewHeight | 获取view的高度 |
| getActivity | 获取 View 的 Context (Activity) |
| calcListViewItemHeight | 计算ListView Item 高度 |
| calcGridViewItemHeight | 计算GridView Item 高度 |
| getItemHeighet | 获取单独一个Item 高度 |


## <span id="devutilsappanim">**`dev.utils.app.anim`**</span>


* **动画工具类 ->** [AnimationUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/anim/AnimationUtils.java)

| 方法 | 注释 |
| :- | :- |
| getRotateAnimation | 获取一个旋转动画 |
| getRotateAnimationByCenter | 获取一个根据视图自身中心点旋转的动画 |
| getAlphaAnimation | 获取一个透明度渐变动画 |
| getHiddenAlphaAnimation | 获取一个由完全显示变为不可见的透明度渐变动画 |
| getShowAlphaAnimation | 获取一个由不可见变为完全显示的透明度渐变动画 |
| getLessenScaleAnimation | 获取一个缩小动画 |
| getAmplificationAnimation | 获取一个放大动画 |
| translate | 视图移动 |
| shake | 视图摇晃 |


* **视图动画工具箱 (AnimationUtils 基础上封装) ，提供简单的控制视图的动画的工具方法 ->** [ViewAnimationUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/anim/ViewAnimationUtils.java)

| 方法 | 注释 |
| :- | :- |
| invisibleViewByAlpha | 将给定视图渐渐隐去 (view.setVisibility(View.INVISIBLE)) |
| goneViewByAlpha | 将给定视图渐渐隐去最后从界面中移除(view.setVisibility(View.GONE)) |
| visibleViewByAlpha | 将给定视图渐渐显示出来(view.setVisibility(View.VISIBLE)) |
| translate | 视图移动 |
| shake | 视图摇晃 |


## <span id="devutilsappassist">**`dev.utils.app.assist`**</span>


* **异步执行 ->** [AsyncExecutor.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/assist/AsyncExecutor.java)

| 方法 | 注释 |
| :- | :- |
| shutdownNow | 立即关闭线程池任务 |
| execute | 将任务投入线程池执行 |
| doInBackground | 后台运行 |
| onPostExecute | 将子线程结果传递到UI线程 |
| onCanceled | 取消任务 |
| abort | 中止任务 |


* **播放“bee”的声音, 并且震动 辅助类 ->** [BeepVibrateAssist.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/assist/BeepVibrateAssist.java)

| 方法 | 注释 |
| :- | :- |
| isPlayBeep | 判断是否允许播放声音 |
| isVibrate | 获取是否允许震动 |
| setVibrate | 设置是否允许震动 |
| setMediaPlayer | 设置播放资源对象 |
| playBeepSoundAndVibrate | 进行播放声音, 并且震动 |
| close | 关闭震动、提示声, 并释放资源 |
| buildMediaPlayer | 创建 MediaPlayer 对象 |


* **Activity 无操作定时辅助类 ->** [InactivityTimerAssist.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/assist/InactivityTimerAssist.java)

| 方法 | 注释 |
| :- | :- |
| start | 开始计时任务 |
| onPause | 暂停检测 |
| onResume | 回到 Activity/xx 处理 |
| onDestroy | 页面销毁处理 |


* **屏幕传感器(监听是否横竖屏) ->** [ScreenSensorAssist.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/assist/ScreenSensorAssist.java)

| 方法 | 注释 |
| :- | :- |
| start | 开始监听 |
| stop | 停止监听 |
| isPortrait | 是否竖屏 |
| isAllowChange | 是否允许切屏 |


## <span id="devutilsappassistmanager">**`dev.utils.app.assist.manager`**</span>


* **应用程序 Activity 管理类; 用于 Activity 管理和应用程序 ->** [ActivityManager.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/assist/manager/ActivityManager.java)

| 方法 | 注释 |
| :- | :- |
| getInstance | 获取 ActivityManager 实例 ,单例模式 |
| getActivity | 通过 Context 获取 Activity |
| isFinishing | 判断 Activity 是否关闭 |
| isFinishingCtx | 判断 Activity 是否关闭 |
| getActivityStacks | 获取 Activity 栈 |
| addActivity | 保存 Activity |
| removeActivity | 移除 Activity |
| currentActivity | 获取最后一个(当前)Activity |
| finishActivity | 结束最后一个(当前)Activity |
| existActivitys | 检测是否包含指定的 Activity |
| finishAllActivityToIgnore | 结束全部Activity 除忽略的 Activity 外 |
| finishAllActivity | 结束所有Activity |
| appExit | 退出应用程序 |
| restartApplication | 重启 App |


* **定时器工具类 ->** [TimerManager.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/assist/manager/TimerManager.java)

| 方法 | 注释 |
| :- | :- |
| gc | 回收资源 |
| timerSize | 获取全部任务总数 |
| getTimer | 获取属于对应字符串标记的定时器任务(优先获取符合的) |
| closeAll | 关闭全部任务 |
| closeNotRunTask | 关闭所有未运行的任务 |
| closeInfiniteTask | 关闭所有无限循环的任务 |
| closeMark | 关闭所有符合对应的字符串标记的定时器任务 |
| createTimer | 创建定时器 => 立即执行,无限循环,通知默认what |
| getMarkId | 获取标记id |
| getMarkStr | 获取标记字符串 |
| setMarkId | 设置标记id |
| setMarkStr | 设置标记字符串 |
| startTimer | 运行定时器 |
| closeTimer | 关闭定时器 |
| isRunTimer | 判断是否运行中 |
| getTriggerNumber | 获取已经触发的次数 |
| getTriggerLimit | 获取允许触发的上限次数 |
| isTriggerEnd | 是否触发结束(到达最大次数) |
| isInfinite | 是否无限循环 |
| setHandler | 设置通知的Handler |
| setNotifyWhat | 设置通知的What |
| setNotifyObject | 设置通知的Obj |
| setTime | 设置时间 |
| setTriggerLimit | 设置触发次数上限 |


## <span id="devutilsappcache">**`dev.utils.app.cache`**</span>


* **缓存工具类 ->** [DevCache.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/cache/DevCache.java)

| 方法 | 注释 |
| :- | :- |
| getCacheDir | 获取缓存地址 |
| get | 默认缓存地址 |
| put | 保存 String 数据到缓存中 |
| getAsString | 读取 String 数据 |
| getAsJSONObject | 读取 JSONObject 数据 |
| getAsJSONArray | 读取 JSONArray 数据 |
| getAsBinary | 获取 byte[] 数据 |
| getAsObject | 读取 Serializable 数据 |
| getAsBitmap | 读取 bitmap 数据 |
| getAsDrawable | 读取 Drawable 数据 |
| file | 获取缓存文件 |
| remove | 移除某个key |
| clear | 清除所有数据 |


## <span id="devutilsappcamera1">**`dev.utils.app.camera1`**</span>


* **自动获取焦点 辅助类 ->** [AutoFocusAssist.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/camera1/AutoFocusAssist.java)

| 方法 | 注释 |
| :- | :- |
| setFocusModes | 设置对焦模式 |
| isAutoFocus | 是否允许自动对焦 |
| setAutoFocus | 设置是否开启自动对焦 |
| onAutoFocus | 对焦回调 {@link Camera.AutoFocusCallback} 重写方法 |
| start | 开始对焦 |
| stop | 停止对焦 |


* **摄像头辅助类 ->** [CameraAssist.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/camera1/CameraAssist.java)

| 方法 | 注释 |
| :- | :- |
| openDriver | 打开摄像头程序 |
| closeDriver | 关闭相机驱动程 |
| startPreview | 开始将Camera画面预览到手机上 |
| stopPreview | 停止 Camera 画面预览 |
| getCameraResolution | 获取相机分辨率 |
| getPreviewSize | 获取预览大小 |
| getCameraSizeAssist | 获取 Camera.Size 计算辅助类 |
| getCamera | 获取摄像头 |
| setCamera | 设置摄像头 |
| setPreviewNotify | 设置预览回调 |
| setAutoFocus | 设置是否开启自动对焦 |
| isPreviewing | 是否预览中 |
| setAutoInterval | 设置自动对焦时间间隔 |
| setFlashlightOn | 打开闪光灯 |
| setFlashlightOff | 关闭闪光灯 |
| isFlashlightOn | 是否打开闪光灯 |
| isFlashlightEnable | 是否支持手机闪光灯 |
| stopPreviewNotify | 停止预览通知 |
| startPreviewNotify | 开始预览通知 |


* **摄像头 预览、输出大小 辅助类 ->** [CameraSizeAssist.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/camera1/CameraSizeAssist.java)

| 方法 | 注释 |
| :- | :- |
| getCamera | 获取摄像头 |
| setPreviewSize | 设置预览大小 |
| getPreviewSize | 根据手机支持的预览分辨率计算，设置预览尺寸 |
| setPictureSize | 设置拍照图片大小 |
| getPictureSize | 根据手机支持的拍照分辨率计算 |
| getVideoSize | 根据手机支持的视频录制分辨率计算 |


* **摄像头相关工具类 ->** [CameraUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/camera1/CameraUtils.java)

| 方法 | 注释 |
| :- | :- |
| isSupportReverse | 判断是否支持反转摄像头(是否存在前置摄像头) |
| checkCameraFacing | 检查是否有摄像头 |
| isFrontCamera | 判断是否使用前置摄像头 |
| isBackCamera | 判断是否使用后置摄像头 |
| isUseCameraFacing | 判断使用的视像头 |
| freeCameraResource | 释放摄像头资源 |
| initCamera | 初始化摄像头 |
| open | 打开摄像头 |


## <span id="devutilsappimage">**`dev.utils.app.image`**</span>


* **图片裁剪工具类 ->** [BitmapCropUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/BitmapCropUtils.java)

| 方法 | 注释 |
| :- | :- |
| cropBitmap | 裁剪图片(默认比例16:9) |


* **Bitmap工具类主要包括获取Bitmap和对Bitmap的操作 ->** [BitmapExtendUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/BitmapExtendUtils.java)

| 方法 | 注释 |
| :- | :- |
| calculateInSampleSize | 图片压缩处理(使用Options的方法) |
| getBitmapFromResource | 获取一个指定大小的bitmap |
| getBitmapFromFile | 获取一个指定大小的bitmap |
| getBitmapFromByteArray | 获取一个指定大小的bitmap |
| getBytesFromStream | Stream 转换成 byte[] |
| getBitmapFromStream | 获取一个指定大小的bitmap |
| combineImages | 合并Bitmap |
| combineImagesToSameSize | 合并Bitmap |
| zoom | 放大缩小图片 |
| getRoundedCornerBitmap | 获取圆角图片的方法 |
| createReflectionBitmap | 获取带倒影的图片方法 |
| compressImage | 压缩图片大小 |
| convertGreyImg | 将彩色图转换为灰度图 |
| getRoundBitmap | 转换图片成圆形 |
| createThumbnailBitmap | 创建图片缩略图 |
| createWatermarkBitmap | 生成水印图片 水印在右下角 |
| codec | 重新编码Bitmap |
| compress | 图片压缩方法(使用compress的方法) |
| scale | 图片的缩放方法 |
| rotate | 旋转图片 |
| reverseByHorizontal | 水平翻转处理 |
| reverseByVertical | 垂直翻转处理 |
| adjustTone | 更改图片色系，变亮或变暗 |
| convertToBlackWhite | 将彩色图转换为黑白图 |
| getImageDegree | 读取图片属性 图片被旋转的角度 |
| saturation | 饱和度处理 |
| lum | 亮度处理 |
| hue | 色相处理 |
| lumAndHueAndSaturation | 亮度、色相、饱和度处理 |
| nostalgic | 怀旧效果处理 |
| soften | 柔化效果处理 |
| sunshine | 光照效果处理 |
| film | 底片效果处理 |
| sharpen | 锐化效果处理 |
| emboss | 浮雕效果处理 |
| yuvLandscapeToPortrait | 将YUV格式的图片的源数据从横屏模式转为竖屏模式，注: 将源图片的宽高互换一下就是新图片的宽高 |
| safeDecodeStream | 比较安全的 解码(decodeStream) 方法 |


* **Bitmap工具类 ->** [BitmapUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/BitmapUtils.java)

| 方法 | 注释 |
| :- | :- |
| intToDrawable | 将10进制颜色（Int）转换为Drawable对象 |
| stringToDrawable | 将16进制颜色（String）转化为Drawable对象 |
| tintIcon | 图片着色 |
| tint9PatchDrawableFrame | .9 图片着色 |
| setBackground | 设置背景 |
| getDrawable | 获取 Drawable |
| getBitmapFromResources | 通过Resources获取Bitmap |
| getDrawableFromResources | 通过Resources获取Drawable |
| getSDCardBitmapStream | 获取本地SDCard 图片 |
| getSDCardBitmapFile | 获取本地SDCard 图片 |
| getBitmap | 获取Bitmap |
| bitmapToByte | Bitmay 转换成byte数组 |
| drawableToByte | Drawable 转换成 byte数组 |
| drawableToByte2 | Drawable 转换成 byte数组 |
| byteToBitmap | byte 数组转换为Bitmap |
| byteToDrawable | byte数组转换成Drawable |
| bitmapToDrawable | Bitmap 转换成 Drawable |
| drawableToBitmap | Drawable 转换成 Bitmap |
| drawableToBitmap2 | Drawable 转换 Bitmap |
| drawableToBitmap3 | Drawable 转换 Bitmap |
| saveBitmapToSDCardJPEG | 保存图片到SD卡 - JPEG |
| saveBitmapToSDCardPNG | 保存图片到SD卡 - PNG |
| saveBitmapToSDCard | 保存图片到SD卡 - PNG |
| getBitmapFromDrawable | 将Drawable转化为Bitmap |
| bitmapToViewBackGround | 通过View, 获取背景转换Bitmap |
| getBitmapFromView | 通过View, 获取Bitmap -> 绘制整个View |
| getBitmapFromView2 | 把一个View的对象转换成bitmap |
| reckonVideoWidthHeight | 计算视频宽高大小，视频比例xxx*xxx按屏幕比例放大或者缩小 |
| caculateInSampleSize | 根据需求的宽和高以及图片实际的宽和高计算SampleSize |
| getImageViewSize | 根据ImageView获适当的压缩的宽和高 |
| getImageWidthHeight | 获取图片宽度高度(不加载解析图片) |


* **毛玻璃效果 ->** [FastBlurUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/FastBlurUtils.java)

| 方法 | 注释 |
| :- | :- |
| blur | 对图片进行毛玻璃化 |


* **图片Buf转换 - 转换BMP图片 ->** [ImageBmpUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/ImageBmpUtils.java)

| 方法 | 注释 |
| :- | :- |
| saveBmpImg | 保存Bmp图片 |


* **图片处理器 ->** [ImageProcessor.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/ImageProcessor.java)

| 方法 | 注释 |
| :- | :- |
| scale | 缩放处理 |
| scaleByWidth | 缩放处理 |
| scaleByHeight | 缩放处理 |
| reverseByHorizontal | 水平翻转处理 |
| reverseByVertical | 垂直翻转处理 |
| drawableToBitmap | 将给定资源ID的Drawable转换成Bitmap |
| roundCorner | 圆角处理 |
| reflection | 倒影处理 |
| rotate | 旋转处理 |
| saturation | 饱和度处理 |
| lum | 亮度处理 |
| hue | 色相处理 |
| lumAndHueAndSaturation | 亮度、色相、饱和度处理 |
| nostalgic | 怀旧效果处理 |
| blur | 模糊效果处理 |
| soften | 柔化效果处理 |
| sunshine | 光照效果处理 |
| film | 底片效果处理 |
| sharpen | 锐化效果处理 |
| emboss | 浮雕效果处理 |


* **图片相关工具类 ->** [ImageUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/ImageUtils.java)

| 方法 | 注释 |
| :- | :- |
| getBitmap | 获取 bitmap |
| scale | 缩放图片 |
| clip | 裁剪图片 |
| skew | 倾斜图片 |
| rotate | 旋转图片 |
| getRotateDegree | 获取图片旋转角度 - 返回 -1 表示异常 |
| toRound | 转为圆形图片 |
| toRoundCorner | 转为圆角图片 |
| addCornerBorder | 添加圆角边框 |
| addCircleBorder | 添加圆形边框 |
| addReflection | 添加倒影 |
| addTextWatermark | 添加文字水印 |
| addImageWatermark | 添加图片水印 |
| toAlpha | 转为 alpha 位图 |
| toGray | 转为灰度图片 |
| fastBlur | 快速模糊 - 先缩小原图，对小图进行模糊，再放大回原先尺寸 |
| renderScriptBlur | renderScript 模糊图片 - API 大于 17 |
| stackBlur | stack 模糊图片 |
| save | 保存图片 |
| isImage | 根据文件名判断文件是否为图片 |
| getImageType | 获取图片类型 |
| compressByScale | 按缩放压缩 |
| compressByQuality | 按质量压缩 |
| compressBySampleSize | 按采样大小压缩 |


* **Android 自己的 RenderScript 实现图片模糊 ->** [RSBlurUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/image/RSBlurUtils.java)

| 方法 | 注释 |
| :- | :- |
| blur | RenderScript 实现图片模糊 |


## <span id="devutilsappinfo">**`dev.utils.app.info`**</span>


* **App 信息实体类 ->** [AppInfoBean.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/info/AppInfoBean.java)

| 方法 | 注释 |
| :- | :- |
| obtain | 获取 AppInfoBean |
| getAppPackName | 获取 App 包名 |
| getAppName | 获取 App 名 |
| getAppIcon | 获取 App 图标 |
| getAppType | 获取 App 类型 |
| getVersionCode | 获取 versionCode |
| getVersionName | 获取 versionName |
| getFirstInstallTime | 获取 App 首次安装时间 |
| getLastUpdateTime | 获取 App 最后更新时间 |
| getSourceDir | 获取 Apk 地址 |
| getApkSize | 获取 Apk 大小 |
| isSystemApp | 是否系统程序 |
| isSystemUpdateApp | 是否系统程序被手动更新后，也成为第三方应用程序 |


* **App 信息获取工具类 ->** [AppInfoUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/info/AppInfoUtils.java)

| 方法 | 注释 |
| :- | :- |
| getPackageInfoToFile | 通过 Apk 路径 初始化 PackageInfo |
| getPackageInfoToPath | 通过 Apk 路径 初始化 PackageInfo |
| getPackageInfo | 获取当前应用 PackageInfo |
| getAppInfoBeanToFile | 通过 Apk 路径 获取 AppInfoBean |
| getAppInfoBeanToPath | 通过 Apk 路径 获取 AppInfoBean |
| getAppInfoBean | 获取当前应用 AppInfoBean |
| getApkInfoItem | 获取 Apk 详细信息 |
| getAppInfoItem | 获取 App 详细信息 |
| getAppLists | 获取全部 App 列表 |
| getApkPermission | 获取 Apk 注册的权限 |
| printApkPermission | 打印 Apk 注册的权限 |


## <span id="devutilsapplogger">**`dev.utils.app.logger`**</span>


* **日志操作类(对外公开直接调用) ->** [DevLogger.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/logger/DevLogger.java)

| 方法 | 注释 |
| :- | :- |
| other | 使用单次其他日志配置 |
| getLogConfig | 获取日志配置信息 |
| init | 初始化日志配置信息(可以不调用,使用了 App 默认配置) |
| d | 打印 Log.DEBUG |
| e | 打印 Log.ERROR |
| w | 打印 Log.WARN |
| i | 打印 Log.INFO |
| v | 打印 Log.VERBOSE |
| wtf | 打印 Log.ASSERT |
| json | 格式化Json格式数据,并打印 |
| xml | 格式化XML格式数据,并打印 |
| dTag | 打印 Log.DEBUG |
| eTag | 打印 Log.ERROR |
| wTag | 打印 Log.WARN |
| iTag | 打印 Log.INFO |
| vTag | 打印 Log.VERBOSE |
| wtfTag | 打印 Log.ASSERT |
| jsonTag | 格式化Json格式数据,并打印 |
| xmlTag | 格式化XML格式数据,并打印 |


* **日志操作工具类 ->** [DevLoggerUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/logger/DevLoggerUtils.java)

| 方法 | 注释 |
| :- | :- |
| init | 初始化调用方法(获取版本号) |
| getReleaseLogConfig | 获取发布 Log 配置(打印线程信息,显示方法总数3,从0开始,不进行排序, 默认属于ERROR级别日志) |
| getDebugLogConfig | 获取调试 Log 配置(打印线程信息,显示方法总数3,从0开始,不进行排序, 默认属于ERROR级别日志) |
| getSortLogConfig | 获取 Log 配置(打印线程信息,显示方法总数3,从0开始,并且美化日志信息, 默认属于DEBUG级别日志) |
| getLogConfig | 获取 Log 配置 |
| saveErrorLog | 保存 App 错误日志 |
| saveLog | 保存 App 日志 |
| saveLogHeadBottom | 保存 App 日志 - 包含头部、底部信息 |


## <span id="devutilsappplayer">**`dev.utils.app.player`**</span>


* **MediaPlayer 统一管理类 ->** [DevMediaManager.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/player/DevMediaManager.java)

| 方法 | 注释 |
| :- | :- |
| getInstance | 获取 DevMediaManager 实例 ,单例模式 |
| setAudioStreamType | 设置流类型 |
| playPrepareRaw | 播放 Raw 资源 |
| playPrepareAssets | 播放 Assets 资源 |
| playPrepare | 预加载播放 - (file-path or http/rtsp URL) http资源, 本地资源 |
| isPlaying | 是否播放中(判断null) |
| pause | 暂停操作(判断null) |
| stop | 停止操作(判断null) - 销毁MediaPlayer |
| isIgnoreWhat | 是否忽略错误类型 |
| onError | 播放出错回调 |
| onVideoSizeChanged | 视频大小改变回调 |
| onPrepared | 使用 mMediaPlayer.prepareAsync(); 异步播放准备成功回调 |
| onCompletion | 视频播放结束回调 |
| onBufferingUpdate | MediaPlayer 缓冲更新回调 |
| onSeekComplete | 滑动加载完成回调 |
| setMeidaListener | 设置MediaPlayer回调 |
| isNullMediaPlayer | 判断 MediaPlayer 是否为null |
| isNotNullMediaPlayer | 判断 MediaPlayer 是否不为null |
| getMediaPlayer | 获取 MediaPlayer 对象 |
| setMediaPlayer | 设置 MediaPlayer 对象 |
| setTAG | 设置Tag打印 |
| getVolume | 获取播放音量 |
| setVolume | 设置播放音量 |
| getPlayRawId | 获取播放的资源id |
| getPlayUri | 获取当前播放的地址 |
| getVideoWidth | 获取视频宽度 |
| getVideoHeight | 获取视频高度 |
| getCurrentPosition | 获取当前播放时间 |
| getDuration | 获取资源总时间 |
| getPlayPercent | 获取播放进度百分比 |
| isLooping | 是否循环播放 - 默认不循环 |
| setMediaConfig | 设置播放配置 uri等 |


* **视频播放控制器 ->** [DevVideoPlayerControl.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/player/DevVideoPlayerControl.java)

| 方法 | 注释 |
| :- | :- |
| surfaceChanged | surface 改变通知 |
| surfaceCreated | surface 创建 |
| surfaceDestroyed | surface 销毁 |
| onPrepared | 准备完成回调 |
| onCompletion | 播放完成/结束 |
| onBufferingUpdate | 缓存进度 |
| onSeekComplete | 滑动进度加载成功 |
| onError | 异常回调 |
| onVideoSizeChanged | 视频大小改变通知 |
| setMediaListener | 设置播放监听事件 |
| pausePlayer | 暂停播放 |
| stopPlayer | 停止播放 |
| startPlayer | 开始播放 |
| getSurfaceview | 获取显示的SurfaceView |
| isPlaying | 是否播放中 |
| isAutoPlay | 判断是否自动播放 |
| setAutoPlay | 设置自动播放 |
| getPlayUri | 获取当前播放的地址 |
| getVideoWidth | 获取视频宽度 |
| getVideoHeight | 获取视频高度 |
| getCurrentPosition | 获取当前播放时间 |
| getDuration | 获取资源总时间 |
| getPlayPercent | 获取播放进度百分比 |


## <span id="devutilsappshare">**`dev.utils.app.share`**</span>


* **SPUtils 工具类 - 直接单独使用 ->** [SharedUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/share/SharedUtils.java)

| 方法 | 注释 |
| :- | :- |
| init | 初始化操作 |
| put | 保存一个数据 |
| putAll | 保存一个 Map 集合(只能是 Integer, Long, Boolean, Float, String, Set) |
| get | 根据 key 取出一个数据 |
| getAll | 取出全部数据 |
| remove | 移除一个数据 |
| removeAll | 移除一个集合的数据 |
| contains | 是否存在 key |
| clear | 清除全部数据 |
| getInt | 获取 int 类型的数据 |
| getFloat | 获取 float 类型的数据 |
| getLong | 获取 long 类型的数据 |
| getBoolean | 获取 boolean 类型的数据 |
| getString | 获取 String 类型的数据 |
| getSet | 获取 Set 类型的数据 |


## <span id="devutilsapptoast">**`dev.utils.app.toast`**</span>


* **自定义View着色美化 Toast 工具类 ->** [ToastTintUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/toast/ToastTintUtils.java)

| 方法 | 注释 |
| :- | :- |
| reset | 重置默认参数 |
| setToastFilter | 设置 Toast 过滤器 |
| setIsHandler | 设置是否使用 Handler 显示 Toast |
| setNullText | 设置 Text 为 null 的文本 |
| setUseConfig | 判断是否使用配置 |
| setGravity | 设置 Toast 显示在屏幕上的位置。 |
| setMargin | 设置边距 |
| getDefaultStyle | 获取默认样式 |
| getNormalStyle | 获取 Normal 样式 |
| getInfoStyle | 获取 Info 样式 |
| getWarningStyle | 获取 Warning 样式 |
| getErrorStyle | 获取 Error 样式 |
| getSuccessStyle | 获取 Success 样式 |
| setNormalStyle | 设置 Normal 样式 |
| setInfoStyle | 设置 Info 样式 |
| setWarningStyle | 设置 Warning 样式 |
| setErrorStyle | 设置 Error 样式 |
| setSuccessStyle | 设置 Success 样式 |
| getInfoDrawable | 获取 Info 样式 icon |
| getWarningDrawable | 获取 Warning 样式 icon |
| getErrorDrawable | 获取 Error 样式 icon |
| getSuccessDrawable | 获取 Success 样式 icon |
| normal | normal 样式 Toast |
| info | info 样式 Toast |
| warning | warning 样式 Toast |
| error | error 样式 Toast |
| success | success 样式 Toast |
| custom | custom Toast |


* **Simple Toast 工具类(简单的 Toast 工具类, 支持子线程弹出 Toast) ->** [ToastUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/toast/ToastUtils.java)

| 方法 | 注释 |
| :- | :- |
| reset | 重置默认参数 |
| setToastFilter | 设置 Toast 过滤器 |
| setIsHandler | 设置是否使用 Handler 显示 Toast |
| setNullText | 设置 Text 为 null 的文本 |
| setUseConfig | 判断是否使用配置 |
| setGravity | 设置 Toast 显示在屏幕上的位置。 |
| setMargin | 设置边距 |
| showShort | 显示 LENGTH_SHORT Toast |
| showLong | 显示 LENGTH_LONG Toast |
| showToast | 显示 Toast |
| showShortNew | 显示 new LENGTH_SHORT Toast |
| showLongNew | 显示 new LENGTH_LONG Toast |
| showToastNew | 显示新的 Toast |
| newToastText | 获取一个新的 Text Toast |
| showToastView | 显示 View Toast 方法 |
| newToastView | 获取一个新的 View Toast |


## <span id="devutilsapptoasttoaster">**`dev.utils.app.toast.toaster`**</span>


* **Toast 工具类 (支持子线程弹出 Toast, 处理无通知权限) ->** [DevToast.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/toast/toaster/DevToast.java)

| 方法 | 注释 |
| :- | :- |
| reset | 重置默认参数 |
| setIsHandler | 设置是否使用 Handler 显示 Toast |
| setNullText | 设置 Text 为 null 的文本 |
| setTextLength | 设置 Toast 文案长度转换 显示时间 |
| init | Application 初始化调用 (必须调用 -> 内部已经调用) |
| style | 使用单次 Toast 样式配置 |
| defaultStyle | 使用默认 Toast 样式 |
| getToastStyle | 获取 Toast 样式配置 |
| initStyle | 初始化 Toast 样式配置(非单次,一直持续) |
| initToastFilter | 初始化 Toast 过滤器 |
| setView | 设置 Toast 显示的View |
| show | 显示 Toast |
| cancel | 取消当前显示的 Toast |


## <span id="devutilsappwifi">**`dev.utils.app.wifi`**</span>


* **Wifi 热点工具类 ->** [WifiHotUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/wifi/WifiHotUtils.java)

| 方法 | 注释 |
| :- | :- |
| createWifiConfigToAp | 创建Wifi配置信息(无其他操作，单独返回WifiConfig) => Wifi热点 (就支持 无密码/WPA2 PSK) |
| stratWifiAp | 开启Wifi热点 |
| closeWifiAp | 关闭Wifi热点 |
| getWifiApState | 获取Wifi热点状态 |
| getWifiApConfiguration | 获取Wifi热点配置信息 |
| setWifiApConfiguration | 设置Wifi热点配置信息 |
| isOpenWifiAp | 判断是否打开Wifi热点 |
| closeWifiApCheck | 关闭Wifi热点(判断当前状态) |
| isConnectHot | 是否有连接热点 |
| getHotspotServiceIp | 获取热点主机ip地址 |
| getHotspotAllotIp | 获取连接上的子网关热点IP(一个) |
| getHotspotSplitIpMask | 获取热点拼接后的ip网关掩码 |
| getApWifiSSID | 获取Wifi 热点名 |
| getApWifiPwd | 获取Wifi 热点密码 |
| setOnWifiAPListener | 设置 Wifi 热点监听 |
| onStarted | 开启热点触发 |
| onStopped | 关闭热点回调 |
| onFailed | 失败回调 |


* **wifi工具类 ->** [WifiUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/app/wifi/WifiUtils.java)

| 方法 | 注释 |
| :- | :- |
| getWifiManager | 获取wifi管理对象 |
| isOpenWifi | 判断是否打开wifi |
| openWifi | 打开WIFI |
| closeWifi | 关闭WIFI |
| toggleWifiEnabled | 自动切换wifi开关状态 |
| getWifiState | 获取当前WIFI连接状态 |
| startScan | 开始扫描wifi |
| getConfiguration | 获取已配置的网络 |
| getWifiList | 获取网络列表 |
| getWifiInfo | 获取WifiInfo对象 |
| getMacAddress | 获取MAC地址 |
| getBSSID | 获取接入点的BSSID |
| getIPAddress | 获取IP地址 |
| getNetworkId | 获取连接的ID |
| getSSID | 获取SSID |
| formatSSID | 判断是否存在\"ssid\"，存在则裁剪返回 |
| getPassword | 获取密码(经过处理) |
| isHexWepKey | 判断是否 wep 加密 |
| isHex | 判断是否 十六进制 |
| getWifiType | 获取加密类型(int常量) - 判断String |
| getWifiTypeInt | 获取加密类型(int常量) - 判断int(String) |
| getWifiTypeStr | 获取加密类型(String) |
| isConnNull | 判断是否连接为null - unknown ssid |
| isConnectAphot | 判断是否连接上Wifi(非连接中) |
| getSecurity | 获取Wifi配置,加密类型 |
| isExsitsPwd | 获知Wifi配置，是否属于密码加密类型 |
| isExsits | 查看以前是否也配置过这个网络 |
| delWifiConfig | 删除指定的 Wifi(SSID) 配置信息 |
| quickConnWifi | 快速连接Wifi(不使用静态ip方式) |
| createWifiConfig | 创建Wifi配置信息(无其他操作，单独返回WifiConfig) |
| removeWifiConfig | 移除某个Wifi配置信息 |
| disconnectWifi | 断开指定ID的网络 |


## <span id="devutilscommon">**`dev.utils.common`**</span>


* **Array 数组工具类 ->** [ArrayUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ArrayUtils.java)

| 方法 | 注释 |
| :- | :- |
| isEmpty | 判断数组是否为 null |
| isNotEmpty | 判断数组是否不为 null |
| length | 获取数组长度 |
| isLength | 判断数组长度是否等于期望长度 |
| get | 获取数组对应索引数据 |
| getFirst | 获取数组第一条数据 |
| getLast | 获取数组最后一条数据 |
| getPosition | 根据指定值获取 value 所在位置 + 偏移量的索引 |
| getNotNull | 根据指定 value 获取 value 所在位置 + 偏移量的值, 不允许值为null |
| getPositionNotNull | 根据指定 value 获取索引, 不允许值为null |
| intsToIntegers | int 数组转换 Integer 数组 |
| bytesToBytes | byte 数组转换 Byte 数组 |
| charsToCharacters | char 数组转换 Character 数组 |
| shortsToShorts | short 数组转换 Short 数组 |
| longsToLongs | long 数组转换 Long 数组 |
| floatsToFloats | float 数组转换 Float 数组 |
| doublesToDoubles | double 数组转换 Double 数组 |
| booleansToBooleans | boolean 数组转换 Boolean 数组 |
| integersToInts | Integer 数组转换 int 数组 |
| charactersToChars | Character 数组转换 char 数组 |
| asList | 转换数组为集合 |
| equals | 判断两个值是否一样 |


* **资金运算工具类 ->** [BigDecimalUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/BigDecimalUtils.java)

| 方法 | 注释 |
| :- | :- |
| add | 提供精确的加法运算 |
| substract | 提供精确的减法运算 |
| multiply | 提供精确的乘法运算 |
| divide | 提供(相对)精确的除法运算,当发生除不尽的情况时, |
| round | 提供精确的小数位四舍五入处理 |
| remainder | 取余数 |
| compare | 比较大小 |
| formatMoney | 金额分割，四舍五入金额 |
| adjustDouble | 获取自己想要的数据格式 |


* **类工具 ->** [ClassUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ClassUtils.java)

| 方法 | 注释 |
| :- | :- |
| isBaseDataType | 判断类是否是基础数据类型 - 目前支持11种 |
| newInstance | 根据类获取对象: 不再必须一个无参构造 |
| getDefaultPrimiticeValue | 判断 Class 是否为原始类型 (boolean、char、byte、short、int、long、float、double) |
| isCollection | 判断是否集合类型 |
| isArray | 是否数组类型 |
| getGenericSuperclass | 获取父类泛型类型 |
| getGenericInterfaces | 获取接口泛型类型 |


* **克隆工具类 ->** [CloneUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/CloneUtils.java)

| 方法 | 注释 |
| :- | :- |
| deepClone | 进行克隆 |
| serializableToBytes | 通过序列化实体类, 获取对应的byte数组数据 |
| bytesToObject | 通过 byte 数据, 生成 Object 对象 |


* **关闭(IO流)工具类 ->** [CloseUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/CloseUtils.java)

| 方法 | 注释 |
| :- | :- |
| closeIO | 关闭 IO |
| closeIOQuietly | 安静关闭 IO |


* **集合工具类 (Collection - List、Set、Queue) 等 ->** [CollectionUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/CollectionUtils.java)

| 方法 | 注释 |
| :- | :- |
| isEmpty | 判断 Collection 是否为 null |
| isNotEmpty | 判断 Collection 是否不为 null |
| length | 获取 Collection 长度 |
| isLength | 获取长度 to Collection 是否等于期望长度 |
| greaterThan | 判断 Collection 长度是否大于指定长度 |
| greaterThanOrEqual | 判断 Collection 长度是否大于等于指定长度 |
| lessThan | 判断 Collection 长度是否小于指定长度 |
| lessThanOrEqual | 判断 Collection 长度是否小于等于指定长度 |
| get | 获取数据 |
| getFirst | 获取第一条数据 |
| getLast | 获取最后一条数据 |
| getPosition | 根据指定 value 获取 value 所在位置 + 偏移量的索引 |
| getPositionNotNull | 根据指定 value 获取索引, 不允许值为null |
| getNext | 根据指定 value 获取 value 所在位置的下一个值 |
| getNextNotNull | 根据指定 value 获取 value 所在位置的下一个值, 不允许值为null |
| getPrevious | 根据指定 value 获取 value 所在位置的上一个值 |
| getPreviousNotNull | 根据指定 value 获取 value 所在位置的上一个值, 不允许值为null |
| add | 添加一条数据 |
| addNotNull | 添加一条数据 - value 不允许为null |
| addAll | 添加集合数据 |
| addAllNotNull | 添加集合数据 - values 内的值不允许为null |
| remove | 移除一条数据 |
| removeAll | 移除集合数据 |
| clear | 清空集合中符合指定 value 的全部数据 |
| clearNotBelong | 保留集合中符合指定 value 的全部数据 |
| clearAll | 清空集合全部数据 |
| isEqualCollection | 判断两个集合是否相同 |
| isEqualCollections | 判断多个集合是否相同 |
| union | 两个集合并集处理 |
| unions | 多个集合并集处理 |
| intersection | 两个集合交集处理 |
| disjunction | 两个集合交集的补集处理 |
| subtract | 两个集合差集（扣除）处理 |
| equals | 判断两个值是否一样 |
| toArray | 转换数组 to 集合数据类型数组 |
| toArrayToObject | 转换数组 to Object |
| reverse | 集合翻转处理 |


* **颜色工具类(包括常用的色值) ->** [ColorUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ColorUtils.java)

| 方法 | 注释 |
| :- | :- |
| toHexAlpha | 获取十六进制透明度字符串 |
| alpha | 返回一个颜色中的透明度值(返回10进制) |
| alphaPercent | 返回一个颜色中的透明度百分比值 |
| red | 返回一个颜色中红色的色值(返回10进制) |
| redPercent | 返回一个颜色中红色的百分比值 |
| green | 返回一个颜色中绿色的色值(返回10进制) |
| greenPercent | 返回一个颜色中绿色的百分比值 |
| blue | 返回一个颜色中蓝色的色值(返回10进制) |
| bluePercent | 返回一个颜色中蓝色的百分比值 |
| rgb | 根据对应的 red、green、blue 生成一个颜色值 |
| argb | 根据对应的 alpha, red、green、blue 生成一个颜色值 (含透明度) |
| isRGB | 判断颜色 RGB 是否有效 |
| isARGB | 判断颜色 ARGB 是否有效 |
| setAlpha | 设置透明度 |
| setRed | 改变颜色值中的红色色值 |
| setGreen | 改变颜色值中的绿色色值 |
| setBlue | 改变颜色值中的蓝色色值 |
| parseColor | 解析颜色字符串, 返回对应的颜色值 |
| intToRgbString | 颜色值 转换 RGB颜色 字符串 |
| intToArgbString | 颜色值 转换 ARGB颜色 字符串 |
| getRandomColor | 获取随机颜色值 |
| judgeColorString | 判断是否为ARGB格式的十六进制颜色，例如: FF990587 |
| setDark | 颜色加深(单独修改 RGB值, 不变动透明度) |
| setLight | 颜色变浅, 变亮(单独修改 RGB值, 不变动透明度) |
| setAlphaDark | 设置透明度加深 |
| setAlphaLight | 设置透明度变浅 |


* **转换工具类(Byte、Hex等) ->** [ConvertUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ConvertUtils.java)

| 方法 | 注释 |
| :- | :- |
| toString | char[] 转 String |
| toInt | 字符串 转 int |
| toBoolean | 字符串 转 boolean |
| toFloat | 字符串 转 float |
| toDouble | 字符串 转 double |
| toLong | 字符串 转 long |
| toShort | 基本类型对象 转 short |
| toChar | 基本类型对象 转 char |
| toByte | 基本类型对象 转 byte |
| toCharInt | char 转换 unicode 编码 |
| toChars | 字符串 获取 char[] |
| toBytes | 字符串 获取 byte[] |
| parseInt | 字符串转换对应的进制 |
| parseLong | 字符串转换对应的进制 |
| bytesBitwiseAND | 按位求补 byte[] 位移编/解码 （共用同一个方法） |
| subBytes | 从 byte[] 上截取一段 |
| joinBytes | 拼接 byte[] 数据 |
| bytesToObject | byte[] 转为 Object |
| objectToBytes | Object 转为 byte[] |
| bytesToChars | byte[] 转换 char[], 并且进行补码 |
| charsToBytes | char[] 转换 byte[] |
| intsToDoubles | int[] 转换 double[] |
| intsToLongs | int[] 转换 long[] |
| intsToFloats | int[] 转换 float[] |
| intsToStrings | int[] 转换 string[] |
| stringsToInts | string[] 转换 int[] |
| stringsToDoubles | string[] 转换 double[] |
| stringsToLongs | string[] 转换 long[] |
| stringsToFloats | string[] 转换 float[] |
| doublesToInts | double[] 转换 int[] |
| longsToInts | long[] 转换 int[] |
| floatsToInts | float[] 转换 int[] |
| toBinaryString | 将 字节转换 为 二进制字符串 |
| decodeBinary | 二进制字符串 转换 byte[] 解码 |
| decodeHex | 将十六进制字节数组解码 |
| hexToInt | 十六进制 char 转换 int |
| toHexString | int 转换十六进制 |
| toHexChars | 将 string 转换为 十六进制 char[] |


* **坐标相关工具类 - GPS 纠偏 ->** [CoordinateUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/CoordinateUtils.java)

| 方法 | 注释 |
| :- | :- |
| bd09ToGcj02 | BD09 坐标转 GCJ02 坐标 |
| gcj02ToBd09 | GCJ02 坐标转 BD09 坐标 |
| gcj02ToWGS84 | GCJ02 坐标转 WGS84 坐标 |
| wgs84ToGcj02 | WGS84 坐标转 GCJ02 坐标 |
| bd09ToWGS84 | BD09 坐标转 WGS84 坐标 |
| wgs84ToBd09 | WGS84 坐标转 BD09 坐标 |
| outOfChina | 判断是否中国境外 |


* **日期工具类 ->** [DateUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/DateUtils.java)

| 方法 | 注释 |
| :- | :- |
| getDateNow | 获取当前日期的字符串 - yyyy-MM-dd HH:mm:ss |
| formatTime | 将时间戳转换日期字符串 |
| formatDate | 将 Date 转换日期字符串 |
| parseDate | 将时间戳转换成 Date |
| parseLong | 解析时间字符串转换为long毫秒 - 默认表示time 属于 yyyy-MM-dd HH:mm:ss 格式 |
| parseToString | 转换时间为指定字符串 |
| getTimeDiffMinute | 获取时间差 - 分钟 |
| getTimeDiffHour | 获取时间差 - 小时 |
| getTimeDiffDay | 获取时间差 - 天 |
| getTimeDiff | 获取时间差 - (传入时间 - 当前时间) |
| getYear | 获取年 |
| getMonth | 获取月 (0 - 11) + 1 |
| getDay | 获取日 |
| getWeek | 获取日期是星期几 |
| get24Hour | 获取时 - 24 |
| get12Hour | 获取时 - 12 |
| getMinute | 获取分 |
| getSecond | 获取秒 |
| convertTime | 转换时间处理, 小于10, 则自动补充 0x |
| isLeapYear | 判断是否闰年 |
| getMonthDayNumberAll | 根据年份、月份，获取对应的天数 (完整天数, 无判断是否属于未来日期) |
| getYearMonthNumber | 根据年份，获取对应的月份 |
| getMonthDayNumber | 根据年份、月份，获取对应的天数 |
| getArrayToHH | 生成 HH 按时间排序数组 |
| getListToHH | 生成 HH 按时间排序集合 |
| getArrayToMM | 生成 MM 按时间排序数组 |
| getListToMM | 生成 MM 按时间排序集合 |
| getArrayToHHMM | 生成 HH:mm 按间隔时间排序数组 |
| getListToHHMM | 生成 HH:mm 按间隔时间排序集合 |
| getListToHHMMPosition | 获取 HH:mm 按间隔时间排序的集合中, 指定时间所在索引 |
| secToTimeRetain | 传入时间，获取时间(00:00:00 格式) - 不处理大于一天 |
| convertTimeArys | 传入时间,时间参数(小时、分钟、秒) |
| millisToFitTimeSpan | 转换时间 |
| millisToTimeArys | 转换时间为数组 |
| isInTimeHHmm | 判断时间是否在[startTime, endTime]区间，注意时间格式要一致 |
| isInTimeHHmmss | 判断时间是否在 [startTime, endTime] 区间，注意时间格式要一致 |
| isInTime | 判断时间是否在 [startTime, endTime] 区间，注意时间格式要一致 |
| isInDate | 判断时间是否在 [startTime, endTime] 区间，注意时间格式要一致 |
| getEndTimeDiffHHmm | 获取指定时间距离该时间第二天的指定时段的时间 (判断凌晨情况) |
| getEndTimeDiff | 获取指定时间距离该时间第二天的指定时段的时间差 (判断凌晨情况) |


* **开发常用方法工具类 ->** [DevCommonUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/DevCommonUtils.java)

| 方法 | 注释 |
| :- | :- |
| timeRecord | 耗时时间记录 |
| getOperateTime | 获取操作时间 |
| sleepOperate | 堵塞操作 |
| isHttpRes | 判断是否网络资源 |
| whileMD5 | 循环 MD5 加密处理 |
| randomUUID | 获取随机唯一数 |
| randomUUIDToHashCode | 获取随机唯一数 HashCode |
| getRandomUUID | 获取随机规则生成 UUID |
| getRandomUUIDToString | 获取随机规则生成 UUID 字符串 |
| converHideMobile | 转换手机号 |
| converSymbolHide | 转换符号处理 |
| subEllipsize | 裁剪超出的内容, 并且追加符号(如 ...) |
| subSymbolHide | 裁剪符号处理 |
| substring | 裁剪字符串 |
| toReplaceSEWith | 替换(删除 - 替换成"") 字符串中符合 特定标记字符的 startsWith - endsWith |
| toReplaceStartsWith | 替换开头字符串 |
| toReplaceEndsWith | 替换结尾字符串 |
| toClearSEWiths | (这个方法功能主要把字符符合标记的 头部和尾部都替换成 "") |
| toClearStartsWith | 清空属于特定字符串开头的字段 |
| toClearEndsWith | 清空属于特定字符串结尾的字段 |
| replaceStr | 替换字符串 |
| replaceStrToNull | 替换字符串 |
| replaceStrs | 替换字符串 |
| isEmpty | 判断数组是否为 null |
| isNotEmpty | 判断数组是否不为 null |
| length | 获取数组长度 |
| isLength | 判断数组长度是否等于期望长度 |
| equals | 判断两个值是否一样 |
| isEquals | 判断多个字符串是否相等, 只有全相等才返回 true - 对比大小写 |
| isOrEquals | 判断多个字符串,只要有一个符合条件,则通过 |
| isContains | 判断一堆值中，是否存在符合该条件的(包含) |
| isStartsWith | 判断内容, 是否属于特定字符串开头 - 对比大小写 |
| isEndsWith | 判断内容, 是否属于特定字符串结尾 - 对比大小写 |
| isSpace | 判断字符串是否为 null 或全为空白字符 |
| toClearSpace | 清空字符串全部空格 |
| toClearSpaceTrim | 清空字符串前后所有空格 |
| appendSpace | 追加空格 |
| appendTab | 追加 Tab |
| appendLine | 追加 换行 |
| toCheckValue | 检查字符串 |
| toCheckValues | 检查字符串 - 多个值 |
| toCheckValuesSpace | 检查字符串 - 多个值(删除前后空格对比判断) |
| getFormatString | 获取格式化后的字符串 |
| getFormatString2 | 获取格式化后的字符串 |
| getAutoFormatString | 获取自动数量格式化后的字符串(可变参数) |
| getAutoFormatString2 | 获取自动数量格式化后的字符串(可变参数) |


* **域工具 ->** [FieldUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/FieldUtils.java)

| 方法 | 注释 |
| :- | :- |
| isSerializable | 判断是否序列化 |
| set | 设置域的值 |
| get | 获取域的值 |
| isLong | 是否 long/Long 类型 |
| isFloat | 是否 float/Float 类型 |
| isDouble | 是否 double/Double 类型 |
| isInteger | 是否 int/Integer 类型 |
| isString | 是否 String 类型 |
| getGenericType | 获取域的泛型类型，如果不带泛型返回 null |
| getComponentType | 获取数组的类型 |
| getAllDeclaredFields | 获取全部 Field，包括父类 |
| isInvalid | 是静态常量或者内部结构属性 |


* **文件IO流工具类 ->** [FileIOUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/FileIOUtils.java)

| 方法 | 注释 |
| :- | :- |
| setBufferSize | 设置缓冲区的大小, 默认大小等于 8192 字节 |
| writeFileFromIS | 通过输入流写入文件 |
| writeFileFromBytesByStream | 通过字节流写入文件 |
| writeFileFromBytesByChannel | 通过 FileChannel 把字节流写入文件 |
| writeFileFromBytesByMap | 通过 MappedByteBuffer 把字节流写入文件 |
| writeFileFromString | 通过字符串写入文件 |
| readFileToList | 读取文件内容, 返回换行 List |
| readFileToString | 读取文件内容, 返回字符串 |
| readFileToBytesByStream | 读取文件内容, 返回 byte[] |
| readFileToBytesByChannel | 通过 FileChannel, 读取文件内容, 返回 byte[] |
| readFileToBytesByMap | 通过 MappedByteBuffer, 读取文件内容, 返回 byte[] |


* **文件操作工具类 ->** [FileUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/FileUtils.java)

| 方法 | 注释 |
| :- | :- |
| getFile | 获取文件 |
| getFileByPath | 获取文件 |
| getFileCreateFolder | 获取路径, 并且进行创建目录 |
| createFolder | 判断某个文件夹是否创建,未创建则创建(纯路径 - 无文件名) |
| createFolderByPath | 创建文件夹目录 - 可以传入文件名 |
| createFolderByPaths | 创建多个文件夹, 如果不存在则创建 |
| createOrExistsDir | 判断目录是否存在，不存在则判断是否创建成功 |
| createOrExistsFile | 判断文件是否存在，不存在则判断是否创建成功 |
| createFileByDeleteOldFile | 判断文件是否存在，存在则在创建之前删除 |
| getPath | 获取文件路径 |
| getAbsolutePath | 获取文件绝对路径 |
| getName | 获取文件名 |
| getFileSuffix | 获取文件后缀名(无.,单独后缀) |
| getFileNotSuffix | 获取文件名(无后缀) |
| getFileNotSuffixToPath | 获取文件名(无后缀) |
| getFileNameNoExtension | 获取路径中的不带拓展名的文件名 |
| getFileExtension | 获取路径中的文件拓展名 |
| isFileExists | 检查是否存在某个文件 |
| isFile | 判断是否文件 |
| isDirectory | 判断是否文件夹 |
| isHidden | 判断是否隐藏文件 |
| getFileLastModified | 获取文件最后修改的毫秒时间戳 |
| getFileCharsetSimple | 获取文件编码格式 |
| getFileLines | 获取文件行数 |
| getFileSize | 获取文件大小 |
| getDirSize | 获取目录大小 |
| getFileLength | 获取文件大小 |
| getDirLength | 获取目录全部文件大小 |
| getFileLengthNetwork | 获取文件大小 - 网络资源 |
| getFileName | 获取路径中的文件名 |
| getDirName | 获取路径中的最长目录地址 |
| rename | 重命名文件 - 同个目录下, 修改文件名 |
| formatFileSize | 传入文件路径, 返回对应的文件大小 |
| formatByteMemorySize | 字节数转合适内存大小 保留 3 位小数 (%.位数f) |
| getFileMD5ToString | 获取文件的 MD5 校验码 |
| getFileMD5 | 获取文件的 MD5 校验码 |
| getFileMD5ToString2 | 获取文件MD5值 - 小写 |
| deleteFile | 删除文件 |
| deleteFiles | 删除多个文件 |
| deleteFolder | 删除文件夹 |
| saveFile | 保存文件 |
| appendFile | 追加文件: 使用FileWriter |
| readFileBytes | 读取文件 |
| readFile | 读取文件 |
| copyFile | 复制单个文件 |
| copyFolder | 复制文件夹 |
| moveFile | 移动(剪切)文件 |
| moveFolder | 移动(剪切)文件夹 |
| copyDir | 复制目录 |
| moveDir | 移动目录 |
| deleteDir | 删除目录 |
| deleteAllInDir | 删除目录下所有东西 |
| deleteFilesInDir | 删除目录下所有文件 |
| deleteFilesInDirWithFilter | 删除目录下所有过滤的文件 |
| listFilesInDir | 获取目录下所有文件 - 不递归进子目录 |
| listFilesInDirWithFilter | 获取目录下所有过滤的文件 - 不递归进子目录 |
| onReplace | 是否覆盖/替换文件 |


* **Http 参数工具类 ->** [HttpParamsUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/HttpParamsUtils.java)

| 方法 | 注释 |
| :- | :- |
| splitParams | 拆分参数 |
| joinParams | 拼接请求参数 - value => String |
| joinParamsObj | 拼接请求参数 - value => Object |
| printMapParams | 拼接打印 Map 参数 |
| toConvertObjToMS | 进行转换对象处理(请求发送对象) |
| toConvertObjToMO | 进行转换对象处理(请求发送对象) |
| toUrlEncode | 进行 URL 编码,默认UTF-8 |


* **HttpURLConnection 网络工具类 ->** [HttpURLConnectionUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/HttpURLConnectionUtils.java)

| 方法 | 注释 |
| :- | :- |
| doGetAsyn | 异步的Get请求 |
| doPostAsyn | 异步的Post请求 |
| request | 发送请求 |
| getNetTime | 获取网络时间 - 默认使用百度链接 |
| onResponse | 请求响应回调 |
| onFail | 请求失败 |


* **Map 工具类 ->** [MapUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/MapUtils.java)

| 方法 | 注释 |
| :- | :- |
| isEmpty | 判断 Map 是否为 null |
| isNotEmpty | 判断 Map 是否不为 null |
| length | 获取 Map 长度 |
| isLength | 获取长度 to Map 是否等于期望长度 |
| greaterThan | 判断 Map 长度是否大于指定长度 |
| greaterThanOrEqual | 判断 Map 长度是否大于等于指定长度 |
| lessThan | 判断 Map 长度是否小于指定长度 |
| lessThanOrEqual | 判断 Map 长度是否小于等于指定长度 |
| get | 获取 Value |
| getKeyByValue | 通过 value 获取 Key |
| getKeysByValue | 通过 value 获取 Key 集合 (返回等于 value 的 key 集合) |
| getKeys | 通过 Map 获取 Key 集合 |
| getKeysToArrays | 通过 Map 获取 Key 数组 |
| getValues | 通过 Map 获取 Value 集合 |
| getValuesToArrays | 通过 Map 获取 Value 数组 |
| getFirst | 获取第一条数据 |
| getLast | 获取最后一条数据 |
| getNext | 根据指定 key 获取 key 所在位置的下一条数据 |
| getPrevious | 根据指定 key 获取 key 所在位置的上一条数据 |
| put | 添加一条数据 |
| putNotNull | 添加一条数据, 不允许 key 为 null |
| putAll | 添加多条数据 |
| putAllNotNull | 添加多条数据, 不允许 key 为 null |
| remove | 移除一条数据 |
| removeToKeys | 移除多条数据 |
| removeToValue | 移除等于 value 的所有数据 |
| removeToValues | 移除等于 value 的所有数据 (Collection<Value>) |
| equals | 判断两个值是否一样 |
| toggle | 切换保存状态 |
| isNullToValue | 判断指定 key 的 value 是否为 null |
| containsKey | 判断 Map 是否存储了 key |
| containsValue | 判断 Map 是否存储了 value |


* **数字(计算)工具类 ->** [NumberUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/NumberUtils.java)

| 方法 | 注释 |
| :- | :- |
| percent | 计算百分比值 (最大 100%) |
| percent2 | 计算百分比值 (可超出 100%) |
| clamp | 返回的 value 介于 max、min之间，若 value 小于min，返回min，若大于max，返回max |
| isNumber | 检验数字 |
| isNumberDecimal | 检验数字或包含小数点 |


* **对象相关工具类 ->** [ObjectUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ObjectUtils.java)

| 方法 | 注释 |
| :- | :- |
| isEmpty | 判断对象是否为空 |
| isNotEmpty | 判断对象是否非空 |
| equals | 判断两个值是否一样 |
| requireNonNull | 检查对象是否为 null, 为 null 则抛出异常, 不为 null 则返回该对象 |
| getOrDefault | 获取非空或默认对象 |
| hashCode | 获取对象哈希值 |
| getObjectTag | 获取一个对象的独一无二的标记 |
| converObj | 获取转换对象 |


* **随机生成工具类 ->** [RandomUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/RandomUtils.java)

| 方法 | 注释 |
| :- | :- |
| nextBoolean | 获取伪随机 boolean 值 |
| nextBytes | 获取伪随机 byte[] |
| nextDouble | 获取伪随机 double 值 |
| nextGaussian | 获取伪随机高斯分布值 |
| nextFloat | 获取伪随机 float 值 |
| nextInt | 获取伪随机 int 值 |
| nextLong | 获取伪随机 long 值 |
| getRandomNumbers | 获取数字自定义长度的随机数 |
| getRandomLowerCaseLetters | 获取小写字母自定义长度的随机数 |
| getRandomCapitalLetters | 获取大写字母自定义长度的随机数 |
| getRandomLetters | 获取大小写字母自定义长度的随机数 |
| getRandomNumbersAndLetters | 获取数字、大小写字母自定义长度的随机数 |
| getRandom | 获取自定义数据自定义长度的随机数 |
| shuffle | 洗牌算法(第一种)，随机置换指定的数组使用的默认源的随机性(随机数据源小于三个, 则无效) |
| shuffle2 | 洗牌算法(第二种)，随机置换指定的数组使用的默认源的随机性 |
| nextIntRange | 获取指定范围 Int 值 |
| nextLongRange | 获取指定范围 long 值 |
| nextDoubleRange | 获取指定范围 double 值 |
| ints | 获取随机 int 数组 |
| longs | 获取随机 long 数组 |
| doubles | 获取随机 double 数组 |


* **反射相关工具类 ->** [Reflect2Utils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/Reflect2Utils.java)

| 方法 | 注释 |
| :- | :- |
| getProperty | 获取某个对象的公共属性 |
| getStaticProperty | 获取某类的静态公共属性 |
| invokeMethod | 执行某对象方法 |
| invokeStaticMethod | 执行某类的静态方法 |
| newInstance | 新建实例 |
| isInstance | 是不是某个类的实例 |
| getByArray | 获取数组中的某个元素 |
| getDeclaredField | 通过反射获取全部字段 |
| getDeclaredFieldParentObj | 获取父类中的变量对象 |
| getDeclaredFieldParent | 循环向上转型, 获取对象的 DeclaredField |
| setFieldMethod | 设置反射的方法 |
| setFieldValue | 设置反射的字段 |


* **反射相关工具类 ->** [ReflectUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ReflectUtils.java)

| 方法 | 注释 |
| :- | :- |
| reflect | 设置要反射的类 |
| newInstance | 实例化反射对象 |
| field | 设置反射的字段 |
| getObject | 获取 Object 对象 |
| setEnumVal | 设置枚举值 |
| getDeclaredField | 通过反射获取全部字段 |
| getDeclaredFieldBase | 循环向上转型, 获取对象的 DeclaredField |
| method | 设置反射的方法 |
| proxy | 根据类, 代理创建并返回对象 |
| type | 获取类型 |
| get | 获取反射想要获取的 |
| hashCode | 获取 HashCode |
| equals | 判断反射的两个对象是否一样 |
| toString | 获取反射获取的对象 |


* **计算比例方法 ->** [ScaleUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ScaleUtils.java)

| 方法 | 注释 |
| :- | :- |
| calcScaleToWidth | 计算缩放比例 - 根据宽度比例转换高度 |
| calcScaleToHeight | 计算缩放比例 - 根据高度比例转换宽度 |
| calcWidthHeightToScale | 通过宽度,高度,根据对应的比例 -> 转换成对应的比例宽度高度 - 智能转换 |
| calcWidthToScale | 以宽度为基准 -> 转换对应比例的高度 |
| calcHeightToScale | 以高度为基准 -> 转换对应比例的宽度 |


* **单例工具类 ->** [SingletonUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/SingletonUtils.java)

| 方法 | 注释 |
| :- | :- |
| newInstance | 实现实例抽象方法 |
| getInstance | 获取实例方法 |


* **流操作工具类 ->** [StreamUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/StreamUtils.java)

| 方法 | 注释 |
| :- | :- |
| inputToOutputStream | 输入流转输出流 |
| outputToInputStream | 输出流转输入流 |
| inputStreamToBytes | 输入流转 byte[] |
| bytesToInputStream | byte[] 转输出流 |
| outputStreamToBytes | 输出流转 byte[] |
| bytesToOutputStream | byte[] 转 输出流 |
| inputStreamToString | 输入流转 string |
| stringToInputStream | String 转换输入流 |
| outputStreamToString | 输出流转 string |
| stringToOutputStream | string 转 输出流 |


* **字符串工具类 ->** [StringUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/StringUtils.java)

| 方法 | 注释 |
| :- | :- |
| isEmpty | 判断字符串是否为 null |
| isNotEmpty | 判断字符串是否不为 null |
| length | 获取字符串长度 |
| isLength | 获取字符串长度 是否等于期望长度 |
| equals | 判断两个值是否一样 |
| isEquals | 判断多个字符串是否相等, 只有全相等才返回 true - 对比大小写 |
| isOrEquals | 判断多个字符串,只要有一个符合条件,则通过 |
| isContains | 判断一堆值中，是否存在符合该条件的(包含) |
| isStartsWith | 判断内容, 是否属于特定字符串开头 - 对比大小写 |
| isEndsWith | 判断内容, 是否属于特定字符串结尾 - 对比大小写 |
| isSpace | 判断字符串是否为 null 或全为空白字符 |
| toClearSpace | 清空字符串全部空格 |
| toClearSpaceTrim | 清空字符串前后所有空格 |
| appendSpace | 追加空格 |
| appendTab | 追加 Tab |
| appendLine | 追加 换行 |
| toCheckValue | 检查字符串 |
| toCheckValues | 检查字符串 - 多个值 |
| toCheckValuesSpace | 检查字符串 - 多个值(删除前后空格对比判断) |
| getFormatString | 获取格式化后的字符串 |
| getFormatString2 | 获取格式化后的字符串 |
| getAutoFormatString | 获取自动数量格式化后的字符串(可变参数) |
| getAutoFormatString2 | 获取自动数量格式化后的字符串(可变参数) |
| toGBKEncode | 字符串进行 GBK 编码 |
| toGBK2312Encode | 字符串进行 GBK2312 编码 |
| toUTF8Encode | 字符串进行 UTF-8 编码 |
| toStrEncode | 进行字符串编码 |
| toUrlEncode | 进行 URL 编码,默认UTF-8 |
| toASCII | 将字符串转移为 ASCII 码 |
| toUnicode | 将字符串转移为 Unicode 码 |
| toUnicodeString | 将字符数组转移为 Unicode 码 |
| toDBC | 转化为半角字符 |
| toSBC | 转化为全角字符 如: a => ａ A => Ａ |
| checkChineseToString | 检测字符串是否全是中文 |
| isChinese | 判定输入汉字 |
| upperFirstLetter | 首字母大写 |
| lowerFirstLetter | 首字母小写 |
| reverse | 反转字符串 |
| concat | 字符串连接，将参数列表拼接为一个字符串 |
| concatSpiltWith | 字符串连接，将参数列表拼接为一个字符串 |
| underScoreCaseToCamelCase | 下划线命名转为驼峰命名 |
| camelCaseToUnderScoreCase | 驼峰命名法转为下划线命名 |
| sqliteEscape | 字符串数据库字符转义 |


* **压缩相关工具类 ->** [ZipUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/ZipUtils.java)

| 方法 | 注释 |
| :- | :- |
| zipFiles | 批量压缩文件 |
| zipFile | 压缩文件 |
| unzipFile | 解压文件 |
| unzipFileByKeyword | 解压带有关键字的文件 |
| getFilesPath | 获取压缩文件中的文件路径链表 |
| getComments | 获取压缩文件中的注释链表 |


## <span id="devutilscommonassist">**`dev.utils.common.assist`**</span>


* **均值计算器 - 用以统计平均数 ->** [Averager.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/assist/Averager.java)

| 方法 | 注释 |
| :- | :- |
| add | 添加一个数字 |
| clear | 清除全部 |
| size | 获取参与均值计算的数字个数 |
| getAverage | 获取平均数 |
| print | 输出参与均值计算的数字 |


* **时间均值计算器, 只能用于单线程计时。 ->** [TimeAverager.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/assist/TimeAverager.java)

| 方法 | 注释 |
| :- | :- |
| start | 开始计时(毫秒) |
| end | 结束计时(毫秒) |
| endAndRestart | 结束计时, 并重新启动新的计时 |
| average | 求全部计时均值 |
| print | 输出全部时间值 |
| clear | 清除计时数据 |


* **时间计时器 ->** [TimeCounter.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/assist/TimeCounter.java)

| 方法 | 注释 |
| :- | :- |
| start | 开始计时(毫秒) |
| durationRestart | 获取持续的时间并重新启动(毫秒) |
| duration | 获取持续的时间(毫秒) |
| getStartTime | 获取开始时间(毫秒) |


* **堵塞时间处理 ->** [TimeKeeper.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/assist/TimeKeeper.java)

| 方法 | 注释 |
| :- | :- |
| waitForEndAsyn | 设置等待一段时间后, 通知方法 (异步) |
| waitForEnd | 设置等待一段时间后, 通知方法 (同步) |
| onEnd | 结束触发通知方法 |


## <span id="devutilscommonassistsearch">**`dev.utils.common.assist.search`**</span>


* **文件广度优先搜索算法 (多线程 + 队列，搜索某个目录下的全部文件) ->** [FileBreadthFirstSearchUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/assist/search/FileBreadthFirstSearchUtils.java)

| 方法 | 注释 |
| :- | :- |
| setSearchHandler | 设置搜索处理接口 |
| getQueueSameTimeNumber | 获取任务队列同时进行数量 |
| setQueueSameTimeNumber | 任务队列同时进行数量 |
| isRunning | 是否搜索中 |
| stop | 停止搜索 |
| isStop | 是否停止搜索 |
| getStartTime | 获取开始搜索时间(毫秒) |
| getEndTime | 获取结束搜索时间(毫秒) |
| getDelayTime | 获取延迟校验时间(毫秒) |
| setDelayTime | 设置延迟校验时间(毫秒) |
| query | 搜索目录 |
| isHandlerFile | 判断是否处理该文件 |
| isAddToList | 是否添加到集合 |
| OnEndListener | 搜索结束监听 |


* **文件深度优先搜索算法 (递归搜索某个目录下的全部文件) ->** [FileDepthFirstSearchUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/assist/search/FileDepthFirstSearchUtils.java)

| 方法 | 注释 |
| :- | :- |
| setSearchHandler | 设置搜索处理接口 |
| isRunning | 是否搜索中 |
| stop | 停止搜索 |
| isStop | 是否停止搜索 |
| getStartTime | 获取开始搜索时间(毫秒) |
| getEndTime | 获取结束搜索时间(毫秒) |
| query | 搜索目录 |
| isHandlerFile | 判断是否处理该文件 |
| isAddToList | 是否添加到集合 |
| OnEndListener | 搜索结束监听 |


## <span id="devutilscommoncipher">**`dev.utils.common.cipher`**</span>


* **Base64 工具类 ->** [Base64.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/cipher/Base64.java)

| 方法 | 注释 |
| :- | :- |
| decode | Decode the Base64-encoded data in input and return the data in |
| encodeToString | Base64-encode the given data and return a newly allocated |
| encode | Base64-encode the given data and return a newly allocated |


* **Baes64 编/解码 并进行 加/解密 ->** [Base64Cipher.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/cipher/Base64Cipher.java)

| 方法 | 注释 |
| :- | :- |
| decrypt | 解码 |
| encrypt | 编码 |


* **加密工具类 ->** [CipherUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/cipher/CipherUtils.java)

| 方法 | 注释 |
| :- | :- |
| encrypt | 加密方法 |
| decrypt | 解密方法 |


* **解密/解码 接口 ->** [Decrypt.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/cipher/Decrypt.java)

| 方法 | 注释 |
| :- | :- |
| decrypt | 解密/解码 方法 |


* **加密/编码 接口 ->** [Encrypt.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/cipher/Encrypt.java)

| 方法 | 注释 |
| :- | :- |
| encrypt | 加密/编码 方法 |


## <span id="devutilscommonencrypt">**`dev.utils.common.encrypt`**</span>


* **AES 对称加密 ->** [AESUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/AESUtils.java)

| 方法 | 注释 |
| :- | :- |
| initKey | 生成密钥 |
| encrypt | AES 加密 |
| decrypt | AES 解密 |


* **CRC 工具类 ->** [CRCUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/CRCUtils.java)

| 方法 | 注释 |
| :- | :- |
| getCRC32 | 获取 CRC32 值 |
| getCRC32ToHexString | 获取 CRC32 值 |
| getFileCRC32 | 获取文件 CRC32 值 |


* **DES 对称加密 ->** [DESUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/DESUtils.java)

| 方法 | 注释 |
| :- | :- |
| getDESKey | 获取可逆算法 DES 的密钥 |
| encrypt | DES 加密 |
| decrypt | DES 解密 |


* **加/解密 通用工具类 ->** [EncryptUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/EncryptUtils.java)

| 方法 | 注释 |
| :- | :- |
| encryptMD2 | MD2 加密 |
| encryptMD2ToHexString | MD2 加密 |
| encryptMD5 | MD5 加密 |
| encryptMD5ToHexString | MD5 加密 |
| encryptMD5File | MD5 加密文件 |
| encryptMD5FileToHexString | MD5 加密文件 |
| encryptSHA1 | SHA1 加密 |
| encryptSHA1ToHexString | SHA1 加密 |
| encryptSHA224 | SHA224 加密 |
| encryptSHA224ToHexString | SHA224 加密 |
| encryptSHA256 | SHA256 加密 |
| encryptSHA256ToHexString | SHA256 加密 |
| encryptSHA384 | SHA384 加密 |
| encryptSHA384ToHexString | SHA384 加密 |
| encryptSHA512 | SHA512 加密 |
| encryptSHA512ToHexString | SHA512 加密 |
| encryptHmacMD5 | HmacMD5 加密 |
| encryptHmacMD5ToHexString | HmacMD5 加密 |
| encryptHmacSHA1 | HmacSHA1 加密 |
| encryptHmacSHA1ToHexString | HmacSHA1 加密 |
| encryptHmacSHA224 | HmacSHA224 加密 |
| encryptHmacSHA224ToHexString | HmacSHA224 加密 |
| encryptHmacSHA256 | HmacSHA256 加密 |
| encryptHmacSHA256ToHexString | HmacSHA256 加密 |
| encryptHmacSHA384 | HmacSHA384 加密 |
| encryptHmacSHA384ToHexString | HmacSHA384 加密 |
| encryptHmacSHA512 | HmacSHA512 加密 |
| encryptHmacSHA512ToHexString | HmacSHA512 加密 |
| encryptDES | DES 加密 |
| encryptDESToBase64 | DES 加密 |
| encryptDESToHexString | DES 加密 |
| decryptDES | DES 解密 |
| decryptDESToBase64 | DES 解密 |
| decryptDESToHexString | DES 解密 |
| encrypt3DES | 3DES 加密 |
| encrypt3DESToBase64 | 3DES 加密 |
| encrypt3DESToHexString | 3DES 加密 |
| decrypt3DES | 3DES 解密 |
| decrypt3DESToBase64 | 3DES 解密 |
| decrypt3DESToHexString | 3DES 解密 |
| encryptAES | AES 加密 |
| encryptAESToBase64 | AES 加密 |
| encryptAESToHexString | AES 加密 |
| decryptAES | AES 解密 |
| decryptAESToBase64 | AES 解密 |
| decryptAESToHexString | AES 解密 |
| encryptRSA | RSA 加密 |
| encryptRSAToBase64 | RSA 加密 |
| encryptRSAToHexString | RSA 加密 |
| decryptRSA | RSA 解密 |
| decryptRSAToBase64 | RSA 解密 |
| decryptRSAToHexString | RSA 解密 |


* **字符串 编/解码 工具类 ->** [EscapeUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/EscapeUtils.java)

| 方法 | 注释 |
| :- | :- |
| escape | 编码 |
| unescape | 解码 - 本方法不论参数 str 是否经过 escape() 编码，均能获取正确的“解码”结果 |


* **MD5加密 不可逆(Message Digest，消息摘要算法) ->** [MD5Utils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/MD5Utils.java)

| 方法 | 注释 |
| :- | :- |
| md5 | 加密内容 - 32 位 MD5 - 小写 |
| md5Upper | 加密内容 - 32 位 MD5 - 大写 |
| toHexString | 将 byte[] 转换 十六进制字符串 |
| getFileMD5 | 获取文件 MD5 值 - 小写 |


* **SHA 加密工具类 ->** [SHAUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/SHAUtils.java)

| 方法 | 注释 |
| :- | :- |
| sha1 | 加密内容 SHA1 |
| sha224 | 加密内容 SHA224 |
| sha256 | 加密内容 SHA256 |
| sha384 | 加密内容 SHA384 |
| sha512 | 加密内容 SHA512 |
| getFileSHA1 | 获取文件 SHA1 值 |
| getFileSHA256 | 获取文件 SHA256 值 |
| shaHex | 加密内容 SHA 模板 |
| getFileSHA | 获取文件 SHA 值 |


* **3DES 对称加密 ->** [TripleDESUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/TripleDESUtils.java)

| 方法 | 注释 |
| :- | :- |
| initKey | 生成密钥 |
| encrypt | 3DES 加密 |
| decrypt | 3DES 解密 |


* **异或 加密工具类 ->** [XorUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/encrypt/XorUtils.java)

| 方法 | 注释 |
| :- | :- |
| encryptAsFix | 加密 (固定 key 方式) - 这种方式 加/解密 方法共用 |
| encrypt | 加密 (非固定 key 方式) |
| decrypt | 解密 (非固定 key 方式) |


## <span id="devutilscommonrandom">**`dev.utils.common.random`**</span>


* **随机概率采样算法 ->** [AliasMethod.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/random/AliasMethod.java)

| 方法 | 注释 |
| :- | :- |
| next | 获取随机索引(对应几率索引) |


## <span id="devutilscommonthread">**`dev.utils.common.thread`**</span>


* **线程池管理类 ->** [DevThreadManager.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/thread/DevThreadManager.java)

| 方法 | 注释 |
| :- | :- |
| getInstance | 获取 DevThreadManager 实例 |
| initConfig | 初始化配置信息 |
| putConfig | 添加配置信息 |
| removeConfig | 移除配置信息 |


* **线程池 - 构建类 ->** [DevThreadPool.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/thread/DevThreadPool.java)

| 方法 | 注释 |
| :- | :- |
| getThreads | 获取线程数 |
| getCalcThreads | 获取线程数 |
| execute | 加入到线程池任务队列 |
| shutdown | shutdown 会等待所有提交的任务执行完成，不管是正在执行还是保存在任务队列中的已提交任务 |
| shutdownNow | shutdownNow 会尝试中断正在执行的任务(其主要是中断一些指定方法如sleep方法)，并且停止执行等待队列中提交的任务。 |
| isShutdown | 判断线程池是否已关闭 - isShutDown 当调用 shutdown() 方法后返回为 true |
| isTerminated | 若关闭后所有任务都已完成,则返回true |
| awaitTermination | 请求关闭、发生超时或者当前线程中断 |
| submit | 提交一个Callable任务用于执行 |
| invokeAll | 执行给定的任务 |
| invokeAny | 执行给定的任务 |
| schedule | 延迟执行Runnable命令 |
| scheduleWithFixedRate | 延迟并循环执行命令 |
| scheduleWithFixedDelay | 延迟并以固定休息时间循环执行命令 |


## <span id="devutilscommonvalidator">**`dev.utils.common.validator`**</span>


* **银行卡管理 ->** [BankCheckUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/validator/BankCheckUtils.java)

| 方法 | 注释 |
| :- | :- |
| checkBankCard | 校验银行卡卡号 是否合法 |
| getBankCardCheckCode | 从不含校验位的银行卡卡号采用 Luhm 校验算法获取校验位 |
| getNameOfBank | 通过银行卡 的前六位确定 判断银行开户行及卡种 |


* **居民身份证工具类 ->** [IDCardUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/validator/IDCardUtils.java)

| 方法 | 注释 |
| :- | :- |
| validateIdCard15 | 身份证校验规则, 验证15位身份编码是否合法 |
| validateIdCard18 | 身份证校验规则, 验证18位身份编码是否合法 |
| convert15CardTo18 | 将 15 位身份证号码转换为 18 位 |
| validateTWCard | 验证台湾身份证号码 |
| validateHKCard | 验证香港身份证号码 |
| validateIdCard10 | 判断 10 位数的身份证号, 是否合法 |
| validateCard | 验证身份证是否合法 |
| getAgeByIdCard | 根据身份编号获取年龄 |
| getBirthByIdCard | 根据身份编号获取生日 |
| getBirthdayByIdCard | 根据身份编号获取生日 |
| getYearByIdCard | 根据身份编号获取生日 - 年份 |
| getMonthByIdCard | 根据身份编号获取生日 - 月份 |
| getDateByIdCard | 根据身份编号获取生日 - 天数 |
| getGenderByIdCard | 根据身份编号获取性别 |
| getProvinceByIdCard | 根据身份编号获取户籍省份 |
| getPowerSum | 将身份证的每位和对应位的加权因子相乘之后，再获取和值 |
| isEmpty | 判断是否为 null |


* **校验工具类 ->** [ValidatorUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/validator/ValidatorUtils.java)

| 方法 | 注释 |
| :- | :- |
| isEmpty | 判断是否为 null |
| match | 通用匹配函数 |
| isNumber | 检验数字 |
| isNumberDecimal | 检验数字或包含小数点 |
| isLetter | 判断字符串是不是全是字母 |
| isContainNumber | 判断字符串是不是包含数字 |
| isNumberLetter | 判断字符串是不是只含字母和数字 |
| isSpec | 检验特殊符号 |
| isWx | 检验微信号 |
| isRealName | 检验真实姓名 |
| isNickName | 校验昵称 |
| isUserName | 校验用户名 |
| isPassword | 校验密码 |
| isEmail | 校验邮箱 |
| isUrl | 校验URL |
| isIPAddress | 校验IP地址 |
| isChinese | 校验汉字(无符号,纯汉字) |
| isChineseAll | 判断字符串是不是全是中文 |
| isContainChinese | 判断字符串中包含中文、包括中文字符标点等 |


* **检验联系(手机号,座机)工具类 ->** [ValiToPhoneUtils.java](https://github.com/afkT/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/common/validator/ValiToPhoneUtils.java)

| 方法 | 注释 |
| :- | :- |
| isPhoneCheck | 中国手机号格式验证,在输入可以调用该方法,点击发送验证码,使用 isPhone |
| isPhone | 是否中国手机号 |
| isPhoneToChinaTelecom | 是否中国电信手机号码 |
| isPhoneToChinaUnicom | 是否中国联通手机号码 |
| isPhoneToChinaMobile | 是否中国移动手机号码 |
| isPhoneToHkMobile | 判断是否香港手机号 |
| isPhoneCallNum | 验证电话号码的格式 |