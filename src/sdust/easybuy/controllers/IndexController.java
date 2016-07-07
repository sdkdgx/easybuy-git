package sdust.easybuy.controllers;

import java.util.List;

import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import sdust.easybuy.model.EasyBuyComment;
import sdust.easybuy.model.EasyBuyNews;
import sdust.easybuy.model.EasyBuyProduct;
import sdust.easybuy.model.EasyBuyProductCategory;
import sdust.easybuy.services.EasyBuyCommentService;
import sdust.easybuy.services.EasyBuyNewsService;
import sdust.easybuy.services.EasyBuyProductCategoryService;
import sdust.easybuy.services.EasyBuyProductService;

@Controller
@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/first")
	public String index(ModelMap model) {
		List<EasyBuyProduct> ebpDisc = new EasyBuyProductService()
				.getAllProducts();
		List<EasyBuyProduct> ebpHot = new EasyBuyProductService()
				.getAllProducts();
		List<EasyBuyNews> newses = new EasyBuyNewsService().getTopNewses();
		List<EasyBuyComment> comments = new EasyBuyCommentService()
				.getAllComments();
		List<EasyBuyProductCategory> ebpcs = new EasyBuyProductCategoryService()
				.getAllProductCategories();
		model.addAllAttributes(ebpDisc);
		model.addAllAttributes(ebpHot);
		model.addAllAttributes(newses);
		model.addAllAttributes(comments);
		model.addAllAttributes(ebpcs);
		return "index";
	}

	@RequestMapping("/enterLogin")
	public String enterLogin() {
		return "login";
	}

	@RequestMapping("/enterRegister")
	public String enterRegister() {
		return "register";
	}

}
