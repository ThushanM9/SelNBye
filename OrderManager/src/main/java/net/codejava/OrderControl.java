package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderControl {
	
	 @Autowired
	private OrderService orderServices;
	 
	 @RequestMapping("/")
		public String viewHomePage(Model model) {
		 List<Order> listOrder = orderServices.listAll();
			model.addAttribute("listOrder", listOrder);
			
			return "index";
		}
	 @RequestMapping("/new")
		public String showNewOrderPage(Model model) {
			Order orders = new Order();
			model.addAttribute("orders", orders);
			
			return "new_Order";
		}
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveOrder(@ModelAttribute("orders") Order orders) {
		 orderServices.save(orders);
			
			return "redirect:/";
		}
		
		@RequestMapping("/edit/{id}")
		public ModelAndView showEditOrderPage(@PathVariable(name = "ordersId") int ordersId) {
			ModelAndView mav = new ModelAndView("edit_order");
			Order orders = orderServices.get(ordersId);
			mav.addObject("orders", orders);
			
			return mav;
		}
		
		@RequestMapping("/delete/{id}")
		public String deleteOrder(@PathVariable(name = "ordersId") int ordersId) {
			orderServices.delete(ordersId);
			return "redirect:/";		
		}
	 }


