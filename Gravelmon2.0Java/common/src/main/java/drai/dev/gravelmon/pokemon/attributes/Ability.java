package drai.dev.gravelmon.pokemon.attributes;

import java.util.*;

public enum Ability {
    ADAPTABILITY("adaptability", true),
    AERILATE("aerilate", true),
    AFTERMATH("aftermath", true),
    AIR_LOCK("airlock", true),
    ANALYTIC("analytic", true),
    ANGER_POINT("angerpoint", true),
    ANGER_SHELL("angershell", true),
    ANTICIPATION("anticipation", true),
    ARENA_TRAP("arenatrap", true),
    ARMOR_TAIL("armortail", true),
    AROMA_VEIL("aromaveil", true),
    AS_ONE("asone", true),
    AURA_BREAK("aurabreak", true),
    BAD_DREAMS("baddreams", true),
    BALL_FETCH("ballfetch", true),
    BATTERY("battery", true),
    BATTLE_ARMOR("battlearmor", true),
    BATTLE_BOND("battlebond", true),
    BEADS_OF_RUIN("beadsofruin", true),
    BEAST_BOOST("beastboost", true),
    BERSERK("berserk", true),
    BIG_PECKS("bigpecks", true),
    BLAZE("blaze", true),
    BULLETPROOF("bulletproof", true),
    CHEEK_POUCH("cheekpouch", true),
    CHILLING_NEIGH("chillingneigh", true),
    CHLOROPHYLL("chlorophyll", true),
    CLEAR_BODY("clearbody", true),
    CLOUD_NINE("cloudnine", true),
    COLOR_CHANGE("colorchange", true),
    COMATOSE("comatose", true),
    COMMANDER("commander", true),
    COMPETITIVE("competitive", true),
    COMPOUND_EYES("compoundeyes", true),
    CONTRARY("contrary", true),
    CORROSION("corrosion", true),
    COSTAR("costar", true),
    COTTON_DOWN("cottondown", true),
    CUD_CHEW("cudchew", true),
    CURIOUS_MEDICINE("curiousmedicine", true),
    CURSED_BODY("cursedbody", true),
    CUTE_CHARM("cutecharm", true),
    DAMP("damp", true),
    DANCER("dancer", true),
    DARK_AURA("darkaura", true),
    DAUNTLESS_SHIELD("dauntlessshield", true),
    DAZZLING("dazzling", true),
    DEFEATIST("defeatist", true),
    DEFIANT("defiant", true),
    DELTA_STREAM("deltastream", true),
    DESOLATE_LAND("desolateland", true),
    DISGUISE("disguise", true),
    DOWNLOAD("download", true),
    DRAGONS_MAW("dragonsmaw", true),
    DRIZZLE("drizzle", true),
    DROUGHT("drought", true),
    DRY_SKIN("dryskin", true),
    EARLY_BIRD("earlybird", true),
    EARTH_EATER("eartheater", true),
    EFFECT_SPORE("effectspore", true),
    ELECTRIC_SURGE("electricsurge", true),
    ELECTROMORPHOSIS("electromorphosis", true),
    EMERGENCY_EXIT("emergencyexit", true),
    FAIRY_AURA("fairyaura", true),
    FILTER("filter", true),
    FLAME_BODY("flamebody", true),
    FLARE_BOOST("flareboost", true),
    FLASH_FIRE("flashfire", true),
    FLOWER_GIFT("flowergift", true),
    FLOWER_VEIL("flowerveil", true),
    FLUFFY("fluffy", true),
    FORECAST("forecast", true),
    FOREWARN("forewarn", true),
    FRIEND_GUARD("friendguard", true),
    FRISK("frisk", true),
    FULL_METAL_BODY("fullmetalbody", true),
    FUR_COAT("furcoat", true),
    GALE_WINGS("galewings", true),
    GALVANIZE("galvanize", true),
    GLUTTONY("gluttony", true),
    GOOD_AS_GOLD("goodasgold", true),
    GOOEY("gooey", true),
    GORILLA_TACTICS("gorillatactics", true),
    GRASS_PELT("grasspelt", true),
    GRASSY_SURGE("grassysurge", true),
    GRIM_NEIGH("grimneigh", true),
    GUARD_DOG("guarddog", true),
    GULP_MISSILE("gulpmissile", true),
    GUTS("guts", true),
    HADRON_ENGINE("hadronengine", true),
    HARVEST("harvest", true),
    HEALER("healer", true),
    HEATPROOF("heatproof", true),
    HEAVY_METAL("heavymetal", true),
    HONEY_GATHER("honeygather", true),
    HUGE_POWER("hugepower", true),
    HUNGER_SWITCH("hungerswitch", true),
    HUSTLE("hustle", true),
    HYDRATION("hydration", true),
    HYPER_CUTTER("hypercutter", true),
    ICE_BODY("icebody", true),
    ICE_FACE("iceface", true),
    ICE_SCALES("icescales", true),
    ILLUMINATE("illuminate", true),
    ILLUSION("illusion", true),
    IMMUNITY("immunity", true),
    IMPOSTER("imposter", true),
    INFILTRATOR("infiltrator", true),
    INNARDS_OUT("innardsout", true),
    INNER_FOCUS("innerfocus", true),
    INSOMNIA("insomnia", true),
    INTIMIDATE("intimidate", true),
    INTREPID_SWORD("intrepidsword", true),
    IRON_BARBS("ironbarbs", true),
    IRON_FIST("ironfist", true),
    JUSTIFIED("justified", true),
    KEEN_EYE("keeneye", true),
    KLUTZ("klutz", true),
    LEAF_GUARD("leafguard", true),
    LEVITATE("levitate", true),
    LIBERO("libero", true),
    LIGHT_METAL("lightmetal", true),
    LIGHTNING_ROD("lightningrod", true),
    LIMBER("limber", true),
    LINGERING_AROMA("lingeringaroma", true),
    LIQUID_OOZE("liquidooze", true),
    LIQUID_VOICE("liquidvoice", true),
    LONG_REACH("longreach", true),
    MAGIC_BOUNCE("magicbounce", true),
    MAGIC_GUARD("magicguard", true),
    MAGICIAN("magician", true),
    MAGMA_ARMOR("magmaarmor", true),
    MAGNET_PULL("magnetpull", true),
    MARVEL_SCALE("marvelscale", true),
    MEGA_LAUNCHER("megalauncher", true),
    MERCILESS("merciless", true),
    MIMICRY("mimicry", true),
    MINUS("minus", true),
    MIRROR_ARMOR("mirrorarmor", true),
    MISTY_SURGE("mistysurge", true),
    MOLD_BREAKER("moldbreaker", true),
    MOODY("moody", true),
    MOTOR_DRIVE("motordrive", true),
    MOXIE("moxie", true),
    MULTISCALE("multiscale", true),
    MULTITYPE("multitype", true),
    MUMMY("mummy", true),
    MYCELIUM_MIGHT("myceliummight", true),
    NATURAL_CURE("naturalcure", true),
    NEUROFORCE("neuroforce", true),
    NEUTRALIZING_GAS("neutralizinggas", true),
    NO_GUARD("noguard", true),
    NORMALIZE("normalize", true),
    OBLIVIOUS("oblivious", true),
    OPPORTUNIST("opportunist", true),
    ORICHALCUM_PULSE("orichalcumpulse", true),
    OVERCOAT("overcoat", true),
    OVERGROW("overgrow", true),
    OWN_TEMPO("owntempo", true),
    PARENTAL_BOND("parentalbond", true),
    PASTEL_VEIL("pastelveil", true),
    PERISH_BODY("perishbody", true),
    PICKPOCKET("pickpocket", true),
    PICKUP("pickup", true),
    PIXILATE("pixilate", true),
    PLUS("plus", true),
    POISON_HEAL("poisonheal", true),
    POISON_POINT("poisonpoint", true),
    POISON_TOUCH("poisontouch", true),
    POWER_CONSTRUCT("powerconstruct", true),
    POWER_OF_ALCHEMY("powerofalchemy", true),
    POWER_SPOT("powerspot", true),
    PRANKSTER("prankster", true),
    PRESSURE("pressure", true),
    PRIMORDIAL_SEA("primordialsea", true),
    PRISM_ARMOR("prismarmor", true),
    PROPELLER_TAIL("propellertail", true),
    PROTEAN("protean", true),
    PROTOSYNTHESIS("protosynthesis", true),
    PSYCHIC_SURGE("psychicsurge", true),
    PUNK_ROCK("punkrock", true),
    PURE_POWER("purepower", true),
    PURIFYING_SALT("purifyingsalt", true),
    QUARK_DRIVE("quarkdrive", true),
    QUEENLY_MAJESTY("queenlymajesty", true),
    QUICK_DRAW("quickdraw", true),
    QUICK_FEET("quickfeet", true),
    RAIN_DISH("raindish", true),
    RATTLED("rattled", true),
    RECEIVER("receiver", true),
    RECKLESS("reckless", true),
    REFRIGERATE("refrigerate", true),
    REGENERATOR("regenerator", true),
    RIPEN("ripen", true),
    RIVALRY("rivalry", true),
    RKS_SYSTEM("rkssystem", true),
    ROCK_HEAD("rockhead", true),
    ROCKY_PAYLOAD("rockypayload", true),
    ROUGH_SKIN("roughskin", true),
    RUN_AWAY("runaway", true),
    SAND_FORCE("sandforce", true),
    SAND_RUSH("sandrush", true),
    SAND_SPIT("sandspit", true),
    SAND_STREAM("sandstream", true),
    SAND_VEIL("sandveil", true),
    SAP_SIPPER("sapsipper", true),
    SCHOOLING("schooling", true),
    SCRAPPY("scrappy", true),
    SCREEN_CLEANER("screencleaner", true),
    SEED_SOWER("seedsower", true),
    SERENE_GRACE("serenegrace", true),
    SHADOW_SHIELD("shadowshield", true),
    SHADOW_TAG("shadowtag", true),
    SHARPNESS("sharpness", true),
    SHED_SKIN("shedskin", true),
    SHEER_FORCE("sheerforce", true),
    SHELL_ARMOR("shellarmor", true),
    SHIELD_DUST("shielddust", true),
    SHIELDS_DOWN("shieldsdown", true),
    SIMPLE("simple", true),
    SKILL_LINK("skilllink", true),
    SLOW_START("slowstart", true),
    SLUSH_RUSH("slushrush", true),
    SNIPER("sniper", true),
    SNOW_CLOAK("snowcloak", true),
    SNOW_WARNING("snowwarning", true),
    SOLAR_POWER("solarpower", true),
    SOLID_ROCK("solidrock", true),
    SOUL_HEART("soulheart", true),
    SOUNDPROOF("soundproof", true),
    SPEED_BOOST("speedboost", true),
    STAKEOUT("stakeout", true),
    STALL("stall", true),
    STALWART("stalwart", true),
    STAMINA("stamina", true),
    STANCE_CHANGE("stancechange", true),
    STATIC("static", true),
    STEADFAST("steadfast", true),
    STEAM_ENGINE("steamengine", true),
    STEELWORKER("steelworker", true),
    STEELY_SPIRIT("steelyspirit", true),
    STENCH("stench", true),
    STICKY_HOLD("stickyhold", true),
    STORM_DRAIN("stormdrain", true),
    STRONG_JAW("strongjaw", true),
    STURDY("sturdy", true),
    SUCTION_CUPS("suctioncups", true),
    SUPER_LUCK("superluck", true),
    SUPREME_OVERLORD("supremeoverlord", true),
    SURGE_SURFER("surgesurfer", true),
    SWARM("swarm", true),
    SWEET_VEIL("sweetveil", true),
    SWIFT_SWIM("swiftswim", true),
    SWORD_OF_RUIN("swordofruin", true),
    SYMBIOSIS("symbiosis", true),
    SYNCHRONIZE("synchronize", true),
    TABLETS_OF_RUIN("tabletsofruin", true),
    TANGLED_FEET("tangledfeet", true),
    TANGLING_HAIR("tanglinghair", true),
    TECHNICIAN("technician", true),
    TELEPATHY("telepathy", true),
    TERAVOLT("teravolt", true),
    THERMAL_EXCHANGE("thermalexchange", true),
    THICK_FAT("thickfat", true),
    TINTED_LENS("tintedlens", true),
    TORRENT("torrent", true),
    TOUGH_CLAWS("toughclaws", true),
    TOXIC_BOOST("toxicboost", true),
    TOXIC_DEBRIS("toxicdebris", true),
    TRACE("trace", true),
    TRANSISTOR("transistor", true),
    TRIAGE("triage", true),
    TRUANT("truant", true),
    TURBOBLAZE("turboblaze", true),
    UNAWARE("unaware", true),
    UNBURDEN("unburden", true),
    UNNERVE("unnerve", true),
    UNSEEN_FIST("unseenfist", true),
    VESSEL_OF_RUIN("vesselofruin", true),
    VICTORY_STAR("victorystar", true),
    VITAL_SPIRIT("vitalspirit", true),
    VOLT_ABSORB("voltabsorb", true),
    WANDERING_SPIRIT("wanderingspirit", true),
    WATER_ABSORB("waterabsorb", true),
    WATER_BUBBLE("waterbubble", true),
    WATER_COMPACTION("watercompaction", true),
    WATER_VEIL("waterveil", true),
    WEAK_ARMOR("weakarmor", true),
    WELL_BAKED_BODY("wellbakedbody", true),
    WHITE_SMOKE("whitesmoke", true),
    WIMP_OUT("wimpout", true),
    WIND_POWER("windpower", true),
    WIND_RIDER("windrider", true),
    WONDER_GUARD("wonderguard", true),
    WONDER_SKIN("wonderskin", true),
    ZEN_MODE("zenmode", true),
    ZERO_TO_HERO("zerotohero", true),
    ICE_SLICK("iceslick", true),
    BRAVE_HEART("braveheart", true),
    PERMAFROST("permafrost", true),
    CONTENT("content", true),
    FORAGE("forage", false),
    MOOCH("mooch", false),
    ALLURE("allure", true),
    PSYCH_OUT("psychout", true),
    ADRENALINE("adrenaline", true),
    MALICE("malice", false),
    FEEDBACK("feedback", true),
    SUN_BATHE("sunbathe", true),
    DISCRETION("discretion", false),
    FULL_FORCE("fullforce", false),
    EVENTIDE("eventide", false),
    CONUNDRUM("conundrum", true),
    ECCENTRIC("eccentric", true),
    POLLUTION("pollution", true),
    PERFORATE("perforate", true),
    ORBITAL_TIDE("orbitaltide", true),
    SCAVENGER("scavenger", true),
    FEISTY("feisty", true),
    TEAM_PLAYER("teamplayer", false),
    SIPHON("siphon", true),
    CONDITIONING("conditioning", true),
    SPECTRUM("spectrum", false),
    IRON_JAW("ironjaw", true),
    STUBBORN("stubborn", true),
    OVERSHADOW("overshadow", false),
    PURE_FOCUS("purefocus", false),
    PSYCHO_CALL("psychocall", true),
    HUBRIS("hubris", true),
    SPIRIT_CALL("spiritcall", true),
    NOCTEM("noctem", true),
    SHADOW_CALL("shadowcall", true),
    SPEED_SWAP("speedswap", true),
    SHADOW_DANCE("shadowdance", true),
    SHADOW_SYNERGY("shadowsynergy", true),
    WIND_FORCE("windforce", true),
    CHLOROFURY("chlorofury", false),
    ICE_CLEATS("icecleats", true),
    AMPLIFIER("amplifier", true),
    VAMPIRIC("vampiric", true),
    IRRELEPHANT("irrelephant", true),
    PRISM_GUARD("prismguard", true),
    SPECTRAL_JAWS("spectraljaws", true),
    VENOMOUS("venomous", false),
    HELIOPHOBIA("heliophobia", true),
    CASTLE_MOAT("castlemoat", true),
    EVENT_HORIZON("eventhorizon", true),
    REGURGITATION("regurgitation", false),
    WINTER_JOY("winterjoy", false),
    SUPERCELL("supercell", false),
    ATHENIAN("athenian", true),
    ABSOLUTION("absolution", true),
    BLAZE_BOOST("blazeboost", false),
    INTOXICATE("intoxicate", true),
    PHOTOTROPH("phototroph", true),
    FOUNDRY("foundry", true),
    ALCHEMIC_POWER("alchemicpower", true),
    BAD_COMPANY("badcompany", true),
    BLAZING_SOUL("blazingsoul", true),
    BLUBBER_DEFENSE("blubberdefense", true),
    CASH_SPLASH("cashsplash", true),
    FELINE_PROWESS("felineprowess", true),
    ORAORAORAORA("oraoraoraora", true),
    SELF_SUFFICIENT("selfsufficient", true),
    STRIKER("striker", true),
    VALIANT_SHIELD("valiantshield", true),
    CREAM_SHIELD("creamshield", false),
    CLOUD_BURST("cloudburst", false),
    DREAD_SPACE("dreadspace", false),
    JUNGLE_SPIRIT("junglespirit", true),
    MAJESTIC_AURA("majesticaura", true),
    VOICE_TUNING("voicetuning", true),
    DRAGON_ARMOR("dragonarmor", true),
    PIGGY_BANK("piggybank", false),
    SYNTHESIZER("synthesizer", false),
    RAPTOR("raptor", false),
    DIRTY_POOL("dirtypool", false),
    EQUALIZE("equalize", false),
    SCALATE("scalate", false),
    HOLY_GUARD("holyguard", false),
    MYSTIC_WIND("mysticwind", false),
    NULL_POINT("nullpoint", false),
    SKY_SCOURGE("skyscourge", true),
    GLACIALIZE("glacialize", true),
    INSATIABLE("insatiable", true),
    LASER_FOCUS("laserfocus", true),
    LEVIN_SKIN("levinskin", true),
    LITHE("lithe", true),
    LUCKY_STAR("luckystar", true),
    NEFARIOUS("nefarious", true),
    BLOODTHIRST("bloodthirst", false),
    BOUNCY("bouncy", false),
    FLAME_EATER("flameeater", false),
    SANDMAN("sandman", false),
    SCARECROW("scarecrow", false),
    ACCELERATION("acceleration", false),
    ATOMIZATE("atomizate", false),
    CHERNOBYL("chernobyl", false),
    DEEP_FREEZE("deepfreeze", false),
    DISENCHANT("disenchant", false),
    LAZY("lazy", false),
    LEAD_SKIN("leadskin", false),
    PETRIFY("petrify", false),
    SHARP_CORAL("sharpcoral", false),
    SOUND_BOOST("soundboost", false),
    STORMBRINGER("stormbringer", false),
    ELUSIVE("elusive", true),
    COMPOSED("composed", true),
    TACTICIAN("tactician", true),
    TENACIOUS("tenacious", true),
    LEVISH_SKIN("levishskin", false),
    CRYSTAL_CASE("crystalcase", true),
    CHARGED_WOOL("chargedwool", true),
    BARBED_NEST("barbednest", true),
    AMBUSH("ambush", true),
    AIR_CONTROL("aircontrol", true),
    RESOLUTE("resolute", false),
    FRUITRITION("fruitrition", true),
    FOUL_SHROUD("foulshroud", true),
    AMALGAM("amalgam", true),
    EMPATHY("empathy", true),
    SIEGE_DRIVE("siegedrive", true),
    POWER_FIST("powerfist", true),
    REGALIA("regalia", true),
    MOMENTUM("momentum", false),
    FLYTRAP("flytrap", false),
    CONDENSATION("condensation", false),
    CARBON_CAPTURE("carboncapture", false),
    WARP_MIST("warpmist", false),
    MASTER_INSTINCT("masterinstinct", false),
    ARCANUM("arcanum", false),
    VEGETATE("vegetate", false),
    POWER_WITHIN("powerwithin", false),
    ROOT_CONTROL("rootcontrol", false),
    SURVEILLANCE("surveillance", false),
    EVERGREEN("evergreen", false),
    CHAKRA("chakra", false),
    INCANTATION("incantation", false),
    HAUNTING("haunting", false),
    SOUL_DRAIN("souldrain", false),
    BIRDLIKE("birdlike", false),
    BLAZE_IMPACT("blazeimpact", false),
    DARKENED_SCALES("darkenedscales", false),
    MALEVOLENCE("malevolence", false),
    MINDTUNING("mindtuning", false),
    REVIVAL_SHEDDING("revivalshedding", false),
    OSCILLATE("oscillate", false),
    SPRING_LOADED("springloaded", false),
    INFURIATE("infuriate", false),
    SERENE_VEIL("sereneveil", false),
    ELEMENTALIST("elementalist", false),
    CACOPHONY("cacophony", false),
    GEIGER_SENSE("geigersense", false),
    REBUILD("rebuild", false),
    BLOODLUST("bloodlust", false),
    BOMBARDIER("bombardier", false),
    DEFIBRILLATOR("defibrillator", false),
    MINDS_EYE("mindseye", false),
    SATELLITE("satellite", false),
    QUICK_CHARGE("quickcharge", false),
    POWER_THIEF("powerthief", false),
    CRYSTALLIZE("crystallize", false),
    DROUGHTPROOF("droughtproof", false),
    HYDROPHOBIC("hydrophobic", false),
    BUBBLE_HELM("bubblehelm", false),
    TO_BE("tobe", false),
    NOT_TO_BE("nottobe", false),
    FOIL("foil", false),
    TRUMPET_WEEVIL("trumpetweevil", false),
    NESTING("nesting", false),
    HAY_FEVER("hayfever", false),
    BLOOMSPRING("bloomspring", false),
    SWARMING("swarming", false),
    PEARL_DROP("pearldrop", false),
    DRUIDRY("druidry", false),
    GRAVITY_SLING("gravitysling", false),
    STAND_OFF("standup", false),
    WET_AND_DRY("wetanddry", false),
    ENERGIZER("energizer", false),
    GEIGER_AURA("geigeraura", false),
    FIELDWORKER("fieldworker", false),
    PETRICHOR("petrichor", false),
    NASTY_WEBBING("nastywebbing", false),
    FERROFLUX("ferroflux", false),
    POWER_ABOVE("powerabove", false),
    ANCIENT_BODY("ancientbody", false),
    ECHOLOCATION("echolocation", false),
    TWO_FACED("twofaced", false),
    SMOKE_AND_MIRRORS("smokeandmirrors", false),
    SEANCE("seance", false),
    ENJOIN("enjoin", false),
    SONGBIRD("songbird", false),
    FRIGID_BLAZE("frigidblaze", false),
    GLACIAL_ARMOR("glacialarmor", false),
    ABSOLUTE_ZERO("absolutezero", false),
    ARENA_BLOOM("arenabloom", false),
    ARENA_CURSE("arenacurse", false),
    HEAT_HAZE("heathaze", false),
    ICE_ARMOR("icearmor", false),
    NEUTRALIZE("neutralize", false),
    SOUL_PASSAGE("soulpassage", false),
    TRANSCENDENCE("transcendence", false),
    EXPIATION("expiation", false),
    ASTONISHMENT("astonishment", false),
    INFLAMABLE("inflamable", false),
    STEALTH_WINGED("stealthwinged", false),
    STRENGTHENING("strengthening", false),
    SIDE_EFFECT("sideeffect", false),
    FINISHER("finisher", false),
    PREDATOR("predator", false),
    SENSORY_BOOST("sensoryboost", false),
    VAMPIRISM("vampirism", false),
    SNOWPLOW("snowplow", false),
    SCAVENGE("scavenge", false),
    ADHESIVE("adhesive", false),
    DELICIOUS("delicious", false),
    SUGARCOAT("sugarcoat", false),
    ARCANEOVERLOAD("arcaneoverlad", false),
    SHARPSHOOTER("sharpshooter", false),
    NIGHTSTALKER("nightstalker", false),
    FIREPROOF("fireproof", false),
    SWIFTDODGE("swiftdodge", false),
    SOULABSORB("soulabsorb", false),
    SUNSCREEN("sunscreen", false),
    HAYHIDE("hayhide", false),
    GREENTHUMB("greenthumb", false),
    MOUNTAINEER("mountaineer", false),
    UNDERLING("underling", false),
    FEROCIOUS("ferocious", false),
    DARKHOLD("darkhold", false),
    NOCTURNAL("nocturnal", false),
    RUBBERBODY("rubberbody", false),
    JACKPOT("jackpot", false),
    ACIDCLOUD("acidcloud", false),
    PERPLEXING("perplexing", false),
    SECRETINSIGHT("secretinsight", false),
    DREAMER("dreamer", false),
    REFLEXSTRIKE("reflexstrike", false),
    RAZORFINS("razorfins", false),
    POWERLEECH("powerleech", false),
    GOLDRUSH("goldrush", false),
    REELIN("reelin", false),
    FIERYSPIRIT("fieryspirit", false),
    FRACTURE("fracture", false),
    PINWHEEL("pinwheel", false),
    SECONDWIND("secondwind", false),
    SUPERCHARGE("supercharge", false),
    INFESTEDDRIVE("infesteddrive", false),
    SWARMINGSURGE("swarmingsurge", false),
    TIGHTGRIP("tightgrip", false),
    CALCULATE("calculate", false),
    TOPPINGS("toppings", false),
    IGNITION("ignition", false),
    ROUGHHOUSER("roughhouser", false),
    BODYGUARD("bodyguard", false),
    POWERLIFTER("powerlifter", false),
    COMBATSKIN("combatskin", false),
    PYROTOXIN("pyrotoxin", false),
    JAWBREAKER("jawbreaker", false),
    CLAIRVOYANCE("clairvoyance", false),
    AIRBORNE("airborne", false),
    PERCEIVE("perceive", false),
    ILLWILL("illwill", false),
    BREAKQUARANTINE("breakquarantine", false),
    RELENTLESS("relentless", false),
    AVARICE("avarice", false),
    SHADYDEALINGS("shadydealings", false),
    PATHOGENIC("pathogenic", false),
    FILTHYSURGE("filthysurge", false),
    DUALSKIN("dualskin", false),
    CLONALCOPY("clonalcopy", false),
    INVIGORATE("invigorate", false),
    TRAMPLE("trample", false),
    TANTRUM("tantrum", false),
    TEARYEYED("tearyeyed", false),
    CONTROLLEDBURN("controlledburn", false),
    DRONINGNOISE("droningnoise", false),
    OUTBURST("outburst", false),
    OVERCHARGED("overcharged", false),
    OVERWHELMING("overwhelming", false),
    JUMPIN("jumpin", false),
    STEAMPOWER("steampower", false),
    HERBALIST("herbalist", false),
    STONECUTTER("stonecutter", false),
    SPIRITBOUND("spiritbound", false),
    EXPLOITATIVE("exploitative", false),
    TASTEBUDS("tastebuds", false),
    TIMETWIST("timetwist", false),
    TIDALSHIFT("tidalshift", false),
    MELTCOVER("meltcover", false),
    STORMSTREAM("stormstream", false),
    CONTAMINATE("contaminate", false),
    LUNARPHASE("lunarphase", false),
    PLOTTWIST("plottwist", false),
    BANANASPLIT("bananasplit", false),
    PRIDEFULSTANCE("pridefulstance", false),
    REALITYWARP("realitywrap", false),
    NUTRIENTRUNOFF("nutrientrunoff", false),
    FINALE("finale", false),
    COURAGEOUS("courageous", false),
    PARASITIC("parasitic", false),
    ROMANTIC("romantic", false),
    FALSEFLIER("falseflier", false),
    NURTURER("nurturer", false),
    FALSEFIRE("falsefire", false),
    TRAFFICJAM("trafficjam", false),
    TEMPER("temper", false),
    SNOOZE("snooze", false),
    OPENSEA("opensea", false),
    PECKINGORDER("peckingorder", false),
    LASTSTAND("laststand", false),
    WHITEVIRTUE("whitevirtue", false),
    CIRCUS_PROPS("circusprops", true),
    CLIMATE_CHANGE("climatechange", true),
    ENERGY_SHIELD("energyshield", true),
    HAIL_WARNING("hailwarning", true),
    HAZY_SURGE("hazysurge", true),
    MAGICIANS_HAT("magicianshat", true),
    PRISMATIC_HUE("prismatichue", true),
    VIBRANT_HUE("vibranthue", true),
    WIZARDS_TOME("wizardstome", true),
    BRUTALIZE("brutalize", true),
    BUSY_BEE("busybee", true),
    CONFIDENT("confident", true),
    HEADACHE("headache", true),
    NATURAL_TOXIN("naturaltoxin", true),
    ROSES_THORNS("rosesthorns", true),
    WIND_TURBINE("windturbine", true),
    SLEET("sleet", false),
    GLIMMER("glimmer", false),
    SUDDENSEED("suddenseed", false),
    BLACKVICE("blackvice", false),
    SUPERPOSITION("superposition", false),
    SANDBATH("sandbath", false),
    HEATRUSH("heatrush", false),
    DOUBLETAP("doubletap", false),
    OPENMAW("openmaw", false),
    THERMALPOWER("thermalpower", false),
    BLAST("blast", false),
    ENTERSPHERE("entersphere", false),
    ALLURINGGLOW("alluringglow", false),
    SIGNALBOOST("signalboost", false),
    ALLSEEING("allseeing", false),
    DESERTBODY("desertbody", false),
    BULLY("bully", false),
    ILLINTENT("illintent", false),
    STATICTOUCH("statictouch", false),
    LASTBASTION("lastbastion", false),
    ROARINGHORN("roaringhorn", false),
    UNSTABLE("unstable", false),
    REVERB("reverb", false),
    VINDICTIVE("vindictive", false),
    LIGHTGUARD("lightguard", false),
    LIQUIDCONDUCTION("liquidconduction", false),
    MADNESS("madness", false),
    LIFEBLOOD("lifeblood", false),
    VERMILINGUA("vermilingua", false),
    ROOTED("rooted", false),
    UNHOLY("unholy", false),
    REFLECTIVE("reflective", false),
    FREESTYLE("freestyle", false),
    TRICKSTER("trickster", false),
    WONDERHARP("wonderharp", false),
    WINDUP("windup", false),
    FERTILEGIFTS("fertilegifts", false),
    HUMIDIFY("humidify", false),
    SCORCHINGCOAT("scorchingcoat", false),
    LIGHTDRAIN("lightdrain", false),
    SUPERNOVA("supernova", false),
    ROUNDRECORD("roundrecord", false),
    RAINBOON("rainboon", false),
    SOOTHINGSHINE("soothingshine", false),
    FLUORESCENCE("fluorescence", false),
    BERRYPLUMAGE("berryplumage", false),
    MAGMATICHEAT("magmaticheat", false),
    PROXY("proxy", false),
    RAPIDSTREAM("rapidstream", false),
    HEAVYEYED("heavyeyed", false),
    IAISLASH("iaislash", false),
    SAVEDUPPOWER("saveduppower", false),
    DYNAMICPOWER("dynamicpower", false),
    CRYSTALSURGE("crystalsurge", false),
    SPICETANK("spicetank", false),
    ROCKYTRAP("rockytrap", false),
    SOUNDWAVES("soundwaves", false),
    MASTERTHIEF("masterthief", false),
    WEATHERBENEFIT("weatherbenefit", false),
    DEFENSEBOOST("defenseboost", false),
    ABYSSALARMOR("abyssalarmor", false),
    DEVIATE("deviate", false),
    PRISMATICPOWER("prismaticpower", false),
    EVAPORATION("evaporation", false),
    WARMHANDS("warmhands", false),
    ACCLIMATIZE("acclimatize", false), ROCKFALL("rockfall", false), UPDRAFT("updraft", false), DREAMTRAP("dreamtrap", false), DRAGONSMAW("dragonsmaw", true);


    private String name;
    private Boolean implemented;
    Ability(String name, Boolean implemented){
        this.name = name;
        this.implemented = implemented;
    }

    public Boolean isImplemented() {
        return implemented;
    }

    public String getName() {
        return name;
    }
}
