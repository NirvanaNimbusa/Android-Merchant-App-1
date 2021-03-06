package com.bitcoin.merchant.app.currency;

import com.bitcoin.merchant.app.R;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CountryCurrency {
    public static final Comparator<? super CountryCurrency> BY_NAME = new Comparator<CountryCurrency>() {
        @Override
        public int compare(CountryCurrency o1, CountryCurrency o2) {
            return o1.countryName.compareTo(o2.countryName);
        }
    };
    private static final Map<String, Integer> countryToImage = new TreeMap<>();

    static {
        add("ad", R.drawable.iso_ad);
        add("ae", R.drawable.iso_ae);
        add("af", R.drawable.iso_af);
        add("ag", R.drawable.iso_ag);
        add("ai", R.drawable.iso_ai);
        add("al", R.drawable.iso_al);
        add("am", R.drawable.iso_am);
        add("an", R.drawable.iso_an);
        add("ao", R.drawable.iso_ao);
        add("aq", R.drawable.iso_aq);
        add("ar", R.drawable.iso_ar);
        add("as", R.drawable.iso_as);
        add("at", R.drawable.iso_at);
        add("au", R.drawable.iso_au);
        add("aw", R.drawable.iso_aw);
        add("ax", R.drawable.iso_ax);
        add("az", R.drawable.iso_az);
        add("ba", R.drawable.iso_ba);
        add("bb", R.drawable.iso_bb);
        add("bd", R.drawable.iso_bd);
        add("be", R.drawable.iso_be);
        add("bf", R.drawable.iso_bf);
        add("bg", R.drawable.iso_bg);
        add("bh", R.drawable.iso_bh);
        add("bi", R.drawable.iso_bi);
        add("bj", R.drawable.iso_bj);
        add("bl", R.drawable.iso_bl);
        add("bm", R.drawable.iso_bm);
        add("bn", R.drawable.iso_bn);
        add("bo", R.drawable.iso_bo);
        add("br", R.drawable.iso_br);
        add("bs", R.drawable.iso_bs);
        add("bt", R.drawable.iso_bt);
        add("bw", R.drawable.iso_bw);
        add("by", R.drawable.iso_by);
        add("bz", R.drawable.iso_bz);
        add("ca", R.drawable.iso_ca);
        add("cc", R.drawable.iso_cc);
        add("cd", R.drawable.iso_cd);
        add("cf", R.drawable.iso_cf);
        add("cg", R.drawable.iso_cg);
        add("ch", R.drawable.iso_ch);
        add("ci", R.drawable.iso_ci);
        add("ck", R.drawable.iso_ck);
        add("cl", R.drawable.iso_cl);
        add("cm", R.drawable.iso_cm);
        add("cn", R.drawable.iso_cn);
        add("co", R.drawable.iso_co);
        add("cr", R.drawable.iso_cr);
        add("ct", R.drawable.iso_ct);
        add("cu", R.drawable.iso_cu);
        add("cv", R.drawable.iso_cv);
        add("cw", R.drawable.iso_cw);
        add("cx", R.drawable.iso_cx);
        add("cy", R.drawable.iso_cy);
        add("cz", R.drawable.iso_cz);
        add("de", R.drawable.iso_de);
        add("dj", R.drawable.iso_dj);
        add("dk", R.drawable.iso_dk);
        add("dm", R.drawable.iso_dm);
        add("do", R.drawable.iso_do);
        add("dz", R.drawable.iso_dz);
        add("ec", R.drawable.iso_ec);
        add("ee", R.drawable.iso_ee);
        add("eg", R.drawable.iso_eg);
        add("eh", R.drawable.iso_eh);
        add("er", R.drawable.iso_er);
        add("es", R.drawable.iso_es);
        add("et", R.drawable.iso_et);
        add("eu", R.drawable.iso_eu);
        add("fi", R.drawable.iso_fi);
        add("fj", R.drawable.iso_fj);
        add("fk", R.drawable.iso_fk);
        add("fm", R.drawable.iso_fm);
        add("fo", R.drawable.iso_fo);
        add("fr", R.drawable.iso_fr);
        add("ga", R.drawable.iso_ga);
        add("gb", R.drawable.iso_gb);
        add("gd", R.drawable.iso_gd);
        add("ge", R.drawable.iso_ge);
        add("gg", R.drawable.iso_gg);
        add("gh", R.drawable.iso_gh);
        add("gi", R.drawable.iso_gi);
        add("gl", R.drawable.iso_gl);
        add("gm", R.drawable.iso_gm);
        add("gn", R.drawable.iso_gn);
        add("gq", R.drawable.iso_gq);
        add("gr", R.drawable.iso_gr);
        add("gs", R.drawable.iso_gs);
        add("gt", R.drawable.iso_gt);
        add("gu", R.drawable.iso_gu);
        add("gw", R.drawable.iso_gw);
        add("gy", R.drawable.iso_gy);
        add("hk", R.drawable.iso_hk);
        add("hn", R.drawable.iso_hn);
        add("hr", R.drawable.iso_hr);
        add("ht", R.drawable.iso_ht);
        add("hu", R.drawable.iso_hu);
        add("ic", R.drawable.iso_ic);
        add("id", R.drawable.iso_id);
        add("ie", R.drawable.iso_ie);
        add("il", R.drawable.iso_il);
        add("im", R.drawable.iso_im);
        add("in", R.drawable.iso_in);
        add("iq", R.drawable.iso_iq);
        add("ir", R.drawable.iso_ir);
        add("is", R.drawable.iso_is);
        add("it", R.drawable.iso_it);
        add("je", R.drawable.iso_je);
        add("jm", R.drawable.iso_jm);
        add("jo", R.drawable.iso_jo);
        add("jp", R.drawable.iso_jp);
        add("ke", R.drawable.iso_ke);
        add("kg", R.drawable.iso_kg);
        add("kh", R.drawable.iso_kh);
        add("ki", R.drawable.iso_ki);
        add("km", R.drawable.iso_km);
        add("kn", R.drawable.iso_kn);
        add("kp", R.drawable.iso_kp);
        add("kr", R.drawable.iso_kr);
        add("kw", R.drawable.iso_kw);
        add("ky", R.drawable.iso_ky);
        add("kz", R.drawable.iso_kz);
        add("la", R.drawable.iso_la);
        add("lb", R.drawable.iso_lb);
        add("lc", R.drawable.iso_lc);
        add("li", R.drawable.iso_li);
        add("lk", R.drawable.iso_lk);
        add("lr", R.drawable.iso_lr);
        add("ls", R.drawable.iso_ls);
        add("lt", R.drawable.iso_lt);
        add("lu", R.drawable.iso_lu);
        add("lv", R.drawable.iso_lv);
        add("ly", R.drawable.iso_ly);
        add("ma", R.drawable.iso_ma);
        add("mc", R.drawable.iso_mc);
        add("md", R.drawable.iso_md);
        add("me", R.drawable.iso_me);
        add("mf", R.drawable.iso_mf);
        add("mg", R.drawable.iso_mg);
        add("mh", R.drawable.iso_mh);
        add("mk", R.drawable.iso_mk);
        add("ml", R.drawable.iso_ml);
        add("mm", R.drawable.iso_mm);
        add("mn", R.drawable.iso_mn);
        add("mo", R.drawable.iso_mo);
        add("mp", R.drawable.iso_mp);
        add("mq", R.drawable.iso_mq);
        add("mr", R.drawable.iso_mr);
        add("ms", R.drawable.iso_ms);
        add("mt", R.drawable.iso_mt);
        add("mu", R.drawable.iso_mu);
        add("mv", R.drawable.iso_mv);
        add("mw", R.drawable.iso_mw);
        add("mx", R.drawable.iso_mx);
        add("my", R.drawable.iso_my);
        add("mz", R.drawable.iso_mz);
        add("na", R.drawable.iso_na);
        add("nc", R.drawable.iso_nc);
        add("ne", R.drawable.iso_ne);
        add("nf", R.drawable.iso_nf);
        add("ng", R.drawable.iso_ng);
        add("ni", R.drawable.iso_ni);
        add("nl", R.drawable.iso_nl);
        add("no", R.drawable.iso_no);
        add("np", R.drawable.iso_np);
        add("nr", R.drawable.iso_nr);
        add("nu", R.drawable.iso_nu);
        add("nz", R.drawable.iso_nz);
        add("om", R.drawable.iso_om);
        add("pa", R.drawable.iso_pa);
        add("pe", R.drawable.iso_pe);
        add("pf", R.drawable.iso_pf);
        add("pg", R.drawable.iso_pg);
        add("ph", R.drawable.iso_ph);
        add("pk", R.drawable.iso_pk);
        add("pl", R.drawable.iso_pl);
        add("pn", R.drawable.iso_pn);
        add("pr", R.drawable.iso_pr);
        add("ps", R.drawable.iso_ps);
        add("pt", R.drawable.iso_pt);
        add("pw", R.drawable.iso_pw);
        add("py", R.drawable.iso_py);
        add("qa", R.drawable.iso_qa);
        add("re", R.drawable.iso_re);
        add("ro", R.drawable.iso_ro);
        add("rs", R.drawable.iso_rs);
        add("ru", R.drawable.iso_ru);
        add("rw", R.drawable.iso_rw);
        add("sa", R.drawable.iso_sa);
        add("sb", R.drawable.iso_sb);
        add("sc", R.drawable.iso_sc);
        add("sd", R.drawable.iso_sd);
        add("se", R.drawable.iso_se);
        add("sg", R.drawable.iso_sg);
        add("sh", R.drawable.iso_sh);
        add("si", R.drawable.iso_si);
        add("sk", R.drawable.iso_sk);
        add("sl", R.drawable.iso_sl);
        add("sm", R.drawable.iso_sm);
        add("sn", R.drawable.iso_sn);
        add("so", R.drawable.iso_so);
        add("sr", R.drawable.iso_sr);
        add("ss", R.drawable.iso_ss);
        add("st", R.drawable.iso_st);
        add("sv", R.drawable.iso_sv);
        add("sx", R.drawable.iso_sx);
        add("sy", R.drawable.iso_sy);
        add("sz", R.drawable.iso_sz);
        add("tc", R.drawable.iso_tc);
        add("td", R.drawable.iso_td);
        add("tf", R.drawable.iso_tf);
        add("tg", R.drawable.iso_tg);
        add("th", R.drawable.iso_th);
        add("tj", R.drawable.iso_tj);
        add("tk", R.drawable.iso_tk);
        add("tl", R.drawable.iso_tl);
        add("tm", R.drawable.iso_tm);
        add("tn", R.drawable.iso_tn);
        add("to", R.drawable.iso_to);
        add("tr", R.drawable.iso_tr);
        add("tt", R.drawable.iso_tt);
        add("tv", R.drawable.iso_tv);
        add("tw", R.drawable.iso_tw);
        add("tz", R.drawable.iso_tz);
        add("ua", R.drawable.iso_ua);
        add("ug", R.drawable.iso_ug);
        add("us", R.drawable.iso_us);
        add("uy", R.drawable.iso_uy);
        add("uz", R.drawable.iso_uz);
        add("va", R.drawable.iso_va);
        add("vc", R.drawable.iso_vc);
        add("ve", R.drawable.iso_ve);
        add("vg", R.drawable.iso_vg);
        add("vi", R.drawable.iso_vi);
        add("vn", R.drawable.iso_vn);
        add("vu", R.drawable.iso_vu);
        add("wf", R.drawable.iso_wf);
        add("ws", R.drawable.iso_ws);
        add("ye", R.drawable.iso_ye);
        add("yt", R.drawable.iso_yt);
        add("za", R.drawable.iso_za);
        add("zm", R.drawable.iso_zm);
        add("zw", R.drawable.iso_zw);
    }

    public final String countryName;
    public final CountryLocales countryLocales;
    public final CurrencyRate currencyRate;
    public final int image;
    private final String description;

    public CountryCurrency(CountryLocales countryLocales, String countryName, CurrencyRate cr) {
        this.countryName = countryName;
        this.countryLocales = countryLocales;
        this.currencyRate = cr;
        this.image = countryToImage.get(countryLocales.country);
        this.description = countryName + "\n" + cr.toString();
    }

    private static void add(String country, int resource) {
        countryToImage.put(country.toUpperCase(), resource);
    }

    public static boolean isSupported(String country) {
        return countryToImage.containsKey(country);
    }

    @Override
    public String toString() {
        return description;
    }
}
