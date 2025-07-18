package co.jp.nakamichi.controller;

import org.springframework.stereotype.Controller;//@Controller
import org.springframework.ui.Model;//Model model
import org.springframework.web.bind.annotation.GetMapping;//@GetMapping
import org.springframework.web.bind.annotation.RequestMapping;//@RequestMapping

import co.jp.nakamichi.service.ContractService;

@Controller
@RequestMapping("contract")
public class ContractController {

    private final ContractService service;

    public ContractController(ContractService service){
        this.service = service;
    }

    /** 一覧画面を表示 */
    @GetMapping("/list")
    public String getList(Model model) {
        //全件検索結果をModelに登録(この値が表に表示される）
        model.addAttribute("contractlist", service.getContractList());
        //contract/list.htmlに画面遷移
        return "contract/list";
    }
}
