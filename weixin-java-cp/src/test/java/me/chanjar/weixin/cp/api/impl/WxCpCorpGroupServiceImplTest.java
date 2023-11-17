package me.chanjar.weixin.cp.api.impl;

import com.google.inject.Inject;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.cp.api.ApiTestModule;
import me.chanjar.weixin.cp.api.WxCpService;
import me.chanjar.weixin.cp.bean.corpgroup.WxCpCorpGroupCorp;
import me.chanjar.weixin.cp.bean.corpgroup.WxCpCorpGroupCorpListAppShareInfoResp;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertNotNull;

/**
 * @author libo
 */
@Guice(modules = ApiTestModule.class)
public class WxCpCorpGroupServiceImplTest {
  @Inject
  private WxCpService wxService;

  @Test
  public void testListAppShareInfo() throws WxErrorException {
    Integer agentId = wxService.getWxCpConfigStorage().getAgentId();
    Integer businessType = 0;
    String corpId = null;
    Integer limit = null;
    String cursor = null;
    WxCpCorpGroupCorpListAppShareInfoResp resp = wxService.getCorpGroupService().listAppShareInfo(agentId, businessType, corpId, limit, cursor);
    assertNotNull(resp);
  }
}
