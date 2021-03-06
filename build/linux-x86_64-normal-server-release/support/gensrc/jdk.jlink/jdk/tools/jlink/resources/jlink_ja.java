package jdk.tools.jlink.resources;

import java.util.ListResourceBundle;

public final class jlink_ja extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.badpattern", "\u4E0D\u6B63\u30D1\u30BF\u30FC\u30F3{0}" },
            { "err.bom.generation", "bom\u30D5\u30A1\u30A4\u30EB\u306E\u751F\u6210\u306B\u5931\u6557\u3057\u307E\u3057\u305F: {0}" },
            { "err.config.defaults", "\u30D7\u30ED\u30D1\u30C6\u30A3{0}\u304C\u69CB\u6210\u306B\u3042\u308A\u307E\u305B\u3093" },
            { "err.config.defaults.value", "\u30C7\u30D5\u30A9\u30EB\u30C8\u30FB\u30D7\u30ED\u30D1\u30C6\u30A3\u306E\u5024\u304C\u9593\u9055\u3063\u3066\u3044\u307E\u3059: {0}" },
            { "err.dir.exists", "{0}\u306F\u3059\u3067\u306B\u5B58\u5728\u3057\u307E\u3059" },
            { "err.existing.image.invalid", "\u65E2\u5B58\u306E\u30A4\u30E1\u30FC\u30B8\u304C\u6709\u52B9\u3067\u306F\u3042\u308A\u307E\u305B\u3093" },
            { "err.existing.image.must.exist", "\u65E2\u5B58\u306E\u30A4\u30E1\u30FC\u30B8\u304C\u5B58\u5728\u3057\u306A\u3044\u304B\u3001\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3067\u306F\u3042\u308A\u307E\u305B\u3093" },
            { "err.file.error", "\u30D5\u30A1\u30A4\u30EB\u306B\u30A2\u30AF\u30BB\u30B9\u3067\u304D\u307E\u305B\u3093: {0}" },
            { "err.file.not.found", "\u30D5\u30A1\u30A4\u30EB\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093: {0}" },
            { "err.internal.error", "\u5185\u90E8\u30A8\u30E9\u30FC: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u5F15\u6570\u304C\u7121\u52B9\u3067\u3059: {0}" },
            { "err.missing.arg", "{0}\u306B\u5024\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093" },
            { "err.mods.must.be.specified", "{0}\u306B\u30E2\u30B8\u30E5\u30FC\u30EB\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093" },
            { "err.modulepath.must.be.specified", "--modulepath\u3092\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059" },
            { "err.option.after.class", "\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u30AF\u30E9\u30B9\u306E\u524D\u306B\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059: {0}" },
            { "err.option.unsupported", "{0}\u306F\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093: {1}" },
            { "err.output.must.be.specified", "--output\u3092\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059" },
            { "err.path.not.found", "\u30D1\u30B9\u304C\u898B\u3064\u304B\u308A\u307E\u305B\u3093: {0}" },
            { "err.path.not.valid", "\u7121\u52B9\u306A\u30D1\u30B9: {0}" },
            { "err.unknown.byte.order", "\u4E0D\u660E\u306A\u30D0\u30A4\u30C8\u9806{0}" },
            { "err.unknown.option", "\u4E0D\u660E\u306A\u30AA\u30D7\u30B7\u30E7\u30F3: {0}" },
            { "error.prefix", "\u30A8\u30E9\u30FC:" },
            { "main.command.files", "  @<filename>                       \u30D5\u30A1\u30A4\u30EB\u304B\u3089\u30AA\u30D7\u30B7\u30E7\u30F3\u3092\u8AAD\u307F\u53D6\u308A\u307E\u3059" },
            { "main.extended.help", "\u4F7F\u7528\u53EF\u80FD\u306A\u30D7\u30E9\u30B0\u30A4\u30F3\u306E\u30EA\u30B9\u30C8:" },
            { "main.extended.help.footer", "<pattern-list>\u3092\u5FC5\u8981\u3068\u3059\u308B\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u5834\u5408\u3001\u5024\u306F\u3001\u6B21\u306E\u5F62\u5F0F\u306E\u3044\u305A\u308C\u304B\u3092\u4F7F\u7528\u3059\u308B\u3001\u8981\u7D20\u306E\u30AB\u30F3\u30DE\u533A\u5207\u308A\u30EA\u30B9\u30C8\u306B\u306A\u308A\u307E\u3059:\n  <glob-pattern>\n  glob:<glob-pattern>\n  regex:<regex-pattern>\n  @<filename> filename\u306F\u3001\u4F7F\u7528\u3059\u308B\u30D1\u30BF\u30FC\u30F3\u3092\u542B\u3080\u30D5\u30A1\u30A4\u30EB(1\u884C\u3054\u3068\u306B1\u30D1\u30BF\u30FC\u30F3)\u306E\u540D\u524D\u3067\u3059\n\n" },
            { "main.msg.bug", "jlink\u3067\u4F8B\u5916\u304C\u767A\u751F\u3057\u307E\u3057\u305F\u3002\u30C7\u30FC\u30BF\u30D9\u30FC\u30B9\u3067\u91CD\u8907\u304C\u306A\u3044\u304B\u3092\u3054\u78BA\u8A8D\u306E\u3046\u3048\u3001Java Bug Database (http://bugreport.java.com/bugreport/)\u3067bug\u306E\u767B\u9332\u3092\u304A\u9858\u3044\u3044\u305F\u3057\u307E\u3059\u3002\u30EC\u30DD\u30FC\u30C8\u306B\u306F\u3001\u305D\u306E\u30D7\u30ED\u30B0\u30E9\u30E0\u3068\u6B21\u306E\u8A3A\u65AD\u5185\u5BB9\u3092\u542B\u3081\u3066\u304F\u3060\u3055\u3044\u3002\u3054\u5354\u529B\u3042\u308A\u304C\u3068\u3046\u3054\u3056\u3044\u307E\u3059\u3002" },
            { "main.opt.addmods", "  --addmods <mod>[,<mod>...]        \u89E3\u6C7A\u3059\u308B\u30EB\u30FC\u30C8\u30FB\u30E2\u30B8\u30E5\u30FC\u30EB" },
            { "main.opt.endian", "  --endian <little|big>             \u751F\u6210\u3055\u308C\u305Fjimage (default:native)\u306E\u30D0\u30A4\u30C8\u9806" },
            { "main.opt.help", "  --help                            \u3053\u306E\u30D8\u30EB\u30D7\u30FB\u30E1\u30C3\u30BB\u30FC\u30B8\u3092\u51FA\u529B\u3057\u307E\u3059" },
            { "main.opt.limitmods", "  --limitmods <mod>[,<mod>...]      \u76E3\u8996\u53EF\u80FD\u306A\u30E2\u30B8\u30E5\u30FC\u30EB\u306E\u30E6\u30CB\u30D0\u30FC\u30B9\u3092\u5236\u9650\u3057\u307E\u3059" },
            { "main.opt.modulepath", "  --modulepath <modulepath>         \u30E2\u30B8\u30E5\u30FC\u30EB\u30FB\u30D1\u30B9" },
            { "main.opt.output", "  --output <path>                   \u51FA\u529B\u30D1\u30B9\u306E\u5834\u6240" },
            { "main.opt.saveopts", "  --saveopts <filename>             \u6307\u5B9A\u306E\u30D5\u30A1\u30A4\u30EB\u306Bjlink\u30AA\u30D7\u30B7\u30E7\u30F3\u3092\u4FDD\u5B58\u3057\u307E\u3059" },
            { "main.opt.version", "  --version                         \u30D0\u30FC\u30B8\u30E7\u30F3\u60C5\u5831" },
            { "main.usage", "\u4F7F\u7528\u65B9\u6CD5: {0} <options> --modulepath <modulepath> --addmods <mods> --output <path>\n\u4F7F\u7528\u53EF\u80FD\u306A\u30AA\u30D7\u30B7\u30E7\u30F3\u306B\u306F\u6B21\u306E\u3082\u306E\u304C\u3042\u308A\u307E\u3059\u3002" },
            { "main.usage.summary", "\u4F7F\u7528\u65B9\u6CD5: {0} <options> --modulepath <modulepath> --addmods <mods> --output <path>\n\u4F7F\u7528\u53EF\u80FD\u306A\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u30EA\u30B9\u30C8\u306B\u3064\u3044\u3066\u306F\u3001--help\u3092\u4F7F\u7528\u3057\u307E\u3059" },
            { "warn.invalid.arg", "\u7121\u52B9\u306A\u30AF\u30E9\u30B9\u540D\u307E\u305F\u306F\u30D1\u30B9\u540D\u304C\u5B58\u5728\u3057\u307E\u305B\u3093: {0}" },
            { "warn.prefix", "\u8B66\u544A:" },
            { "warn.split.package", "\u30D1\u30C3\u30B1\u30FC\u30B8{0}\u306F{1} {2}\u3067\u5B9A\u7FA9\u3055\u308C\u3066\u3044\u307E\u3059" },
        };
    }
}
