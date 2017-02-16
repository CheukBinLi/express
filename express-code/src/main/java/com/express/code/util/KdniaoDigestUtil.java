package com.express.code.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;

import com.express.code.expressimpl.kdniao.KdniaoImpl;
import com.express.common.model.ExpressOrderModel;

/**
 *
 * 快递鸟物流轨迹即时查询接口
 *
 * @技术QQ群: 456320272
 * @see: http://www.kdniao.com/YundanChaxunAPI.aspx
 * @copyright: 深圳市快金数据技术服务有限公司
 *
 *             DEMO中的电商ID与私钥仅限测试使用，正式环境请单独注册账号 单日超过500单查询量，建议接入我方物流轨迹订阅推送接口
 * 
 *             ID和Key请到官网申请：http://www.kdniao.com/ServiceApply.aspx
 */

public class KdniaoDigestUtil {

	// DEMO
	public static void main(String[] args) {
		// 电商ID
		String EBusinessID = "请到快递鸟官网Ø申请http://www.kdniao.com/ServiceApply.aspx";
		// 电商加密私钥，快递鸟提供，注意保管，不要泄漏
		String AppKey = "请到快递鸟官网申请http://www.kdniao.com/ServiceApply.aspx";
		// 请求url
		String ReqURL = "http://api.kdniao.cc/Ebusiness/EbusinessOrderHandle.aspx";

		try {
			ExpressOrderModel eom = new ExpressOrderModel();
			// OrderCode String 订单编号 O
			// ShipperCode String 快递公司编码 R
			// LogisticCode String 物流单号 R
			eom.setShipperCode("ZT").setEBusinessID("AAAAAAAAAA123123132");
			String result = new KdniaoImpl().kdniaoRequest(AppKey, ReqURL, EBusinessID, "1002", eom);
			System.out.print(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static final KdniaoDigestUtil newInstance = new KdniaoDigestUtil();

	public static final KdniaoDigestUtil newInstance() {
		return newInstance;
	}

	private KdniaoDigestUtil() {
	}

	/**
	 * MD5加密
	 * 
	 * @param str
	 *            内容
	 * @param charset
	 *            编码方式
	 * @throws Exception
	 */
	private String MD5(String str, String charset) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str.getBytes(charset));
		byte[] result = md.digest();
		StringBuffer sb = new StringBuffer(32);
		for (int i = 0; i < result.length; i++) {
			int val = result[i] & 0xff;
			if (val <= 0xf) {
				sb.append("0");
			}
			sb.append(Integer.toHexString(val));
		}
		return sb.toString().toLowerCase();
	}

	/**
	 * base64编码
	 * 
	 * @param str
	 *            内容
	 * @param charset
	 *            编码方式
	 * @throws UnsupportedEncodingException
	 */
	private String base64(String str, String charset) throws UnsupportedEncodingException {
		String encoded = base64Encode(str.getBytes(charset));
		return encoded;
	}

	public String urlEncoder(String str, String charset) throws UnsupportedEncodingException {
		String result = URLEncoder.encode(str, charset);
		return result;
	}

	/**
	 * 电商Sign签名生成
	 * 
	 * @param content
	 *            内容
	 * @param keyValue
	 *            Appkey
	 * @param charset
	 *            编码方式
	 * @throws UnsupportedEncodingException
	 *             ,Exception
	 * @return DataSign签名
	 */
	public String encrypt(String content, String keyValue, String charset) throws UnsupportedEncodingException, Exception {
		if (keyValue != null) {
			return base64(MD5(content + keyValue, charset), charset);
		}
		return base64(MD5(content, charset), charset);
	}

	private final char[] base64EncodeChars = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	public final String base64Encode(byte[] data) {
		StringBuffer sb = new StringBuffer();
		int len = data.length;
		int i = 0;
		int b1, b2, b3;
		while (i < len) {
			b1 = data[i++] & 0xff;
			if (i == len) {
				sb.append(base64EncodeChars[b1 >>> 2]);
				sb.append(base64EncodeChars[(b1 & 0x3) << 4]);
				sb.append("==");
				break;
			}
			b2 = data[i++] & 0xff;
			if (i == len) {
				sb.append(base64EncodeChars[b1 >>> 2]);
				sb.append(base64EncodeChars[((b1 & 0x03) << 4) | ((b2 & 0xf0) >>> 4)]);
				sb.append(base64EncodeChars[(b2 & 0x0f) << 2]);
				sb.append("=");
				break;
			}
			b3 = data[i++] & 0xff;
			sb.append(base64EncodeChars[b1 >>> 2]);
			sb.append(base64EncodeChars[((b1 & 0x03) << 4) | ((b2 & 0xf0) >>> 4)]);
			sb.append(base64EncodeChars[((b2 & 0x0f) << 2) | ((b3 & 0xc0) >>> 6)]);
			sb.append(base64EncodeChars[b3 & 0x3f]);
		}
		return sb.toString();
	}
}
