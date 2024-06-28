
var projectName = '植物健康系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '植物疾病案例',
	url: './pages/zhiwujibinganli/list.html'
}, 

{
	name: '植物健康论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '植物健康资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootx2t46/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"普通员工","menuJump":"列表","tableName":"putongyuangong"}],"menu":"普通员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"技术人员","menuJump":"列表","tableName":"jishurenyuan"}],"menu":"技术人员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"植物疾病案例","menuJump":"列表","tableName":"zhiwujibinganli"}],"menu":"植物疾病案例管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"植物种类","menuJump":"列表","tableName":"zhiwuzhonglei"}],"menu":"植物种类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"普通植物检查登记","menuJump":"列表","tableName":"putongzhiwujianchadengji"}],"menu":"普通植物检查登记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"珍贵植物检查登记","menuJump":"列表","tableName":"zhenguizhiwujianchadengji"}],"menu":"珍贵植物检查登记管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看普通植物状况","查看珍贵植物状况"],"menu":"植物技术方案","menuJump":"列表","tableName":"zhiwujishufangan"}],"menu":"植物技术方案管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看救治方案"],"menu":"植物救治用料登记","menuJump":"列表","tableName":"zhiwujiuzhiyongliaodengji"}],"menu":"植物救治用料登记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"植物救治材料","menuJump":"列表","tableName":"zhiwujiuzhicailiao"}],"menu":"植物救治材料管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"材料类目","menuJump":"列表","tableName":"cailiaoleimu"}],"menu":"材料类目管理"},{"child":[{"buttons":["查看","修改"],"menu":"植物健康论坛","tableName":"forum"}],"menu":"植物健康论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"植物健康资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"咨询专家","tableName":"chat"},{"buttons":["新增","查看"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"植物疾病案例列表","menuJump":"列表","tableName":"zhiwujibinganli"}],"menu":"植物疾病案例模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"植物疾病案例","menuJump":"列表","tableName":"zhiwujibinganli"}],"menu":"植物疾病案例管理"},{"child":[{"buttons":["查看"],"menu":"植物种类","menuJump":"列表","tableName":"zhiwuzhonglei"}],"menu":"植物种类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"普通植物检查登记","menuJump":"列表","tableName":"putongzhiwujianchadengji"}],"menu":"普通植物检查登记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"珍贵植物检查登记","menuJump":"列表","tableName":"zhenguizhiwujianchadengji"}],"menu":"珍贵植物检查登记管理"},{"child":[{"buttons":["查看","查看普通植物状况","查看珍贵植物状况"],"menu":"植物技术方案","menuJump":"列表","tableName":"zhiwujishufangan"}],"menu":"植物技术方案管理"},{"child":[{"buttons":["查看","修改","删除","查看救治方案","新增"],"menu":"植物救治用料登记","menuJump":"列表","tableName":"zhiwujiuzhiyongliaodengji"}],"menu":"植物救治用料登记管理"},{"child":[{"buttons":["新增","查看","修改","删除","登记用料"],"menu":"植物救治材料","menuJump":"列表","tableName":"zhiwujiuzhicailiao"}],"menu":"植物救治材料管理"},{"child":[{"buttons":["查看"],"menu":"材料类目","menuJump":"列表","tableName":"cailiaoleimu"}],"menu":"材料类目管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"植物疾病案例列表","menuJump":"列表","tableName":"zhiwujibinganli"}],"menu":"植物疾病案例模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"普通员工","tableName":"putongyuangong"},{"backMenu":[{"child":[{"buttons":["查看","审核"],"menu":"植物疾病案例","menuJump":"列表","tableName":"zhiwujibinganli"}],"menu":"植物疾病案例管理"},{"child":[{"buttons":["查看"],"menu":"植物种类","menuJump":"列表","tableName":"zhiwuzhonglei"}],"menu":"植物种类管理"},{"child":[{"buttons":["查看","救治"],"menu":"普通植物检查登记","menuJump":"列表","tableName":"putongzhiwujianchadengji"}],"menu":"普通植物检查登记管理"},{"child":[{"buttons":["查看","救治"],"menu":"珍贵植物检查登记","menuJump":"列表","tableName":"zhenguizhiwujianchadengji"}],"menu":"珍贵植物检查登记管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"植物技术方案","menuJump":"列表","tableName":"zhiwujishufangan"}],"menu":"植物技术方案管理"},{"child":[{"buttons":["查看","查看救治方案"],"menu":"植物救治用料登记","menuJump":"列表","tableName":"zhiwujiuzhiyongliaodengji"}],"menu":"植物救治用料登记管理"},{"child":[{"buttons":["查看"],"menu":"植物救治材料","menuJump":"列表","tableName":"zhiwujiuzhicailiao"}],"menu":"植物救治材料管理"},{"child":[{"buttons":["查看"],"menu":"材料类目","menuJump":"列表","tableName":"cailiaoleimu"}],"menu":"材料类目管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"植物疾病案例列表","menuJump":"列表","tableName":"zhiwujibinganli"}],"menu":"植物疾病案例模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"技术人员","tableName":"jishurenyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
