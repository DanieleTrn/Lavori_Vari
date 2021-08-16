namespace Server.Mobiles
{
    [CorpseName("a magic sphinx corpse")]
    public class MountableSphinx : BaseMount
    {
        [Constructable]
        public MountableSphinx()
            : this("a magic sphinx")
        {
        }

        [Constructable]
        public MountableSphinx(string name)
            : base(name, 0x314, 0x314, AIType.AI_Melee, FightMode.Aggressor, 10, 1, 0.2, 0.4)
        {
            int random = Utility.Random(4);
            /*Body = m_IDs[random * 2];
            ItemID = m_IDs[random * 2 + 1];*/
            BaseSoundID = 0xA8;

            SetStr(22, 98);
            SetDex(56, 75);
            SetInt(6, 10);

            SetHits(800, 1600);
            SetMana(0);

            SetDamage(90, 100);

            SetDamageType(ResistanceType.Physical, 100);

            SetResistance(ResistanceType.Physical, 15, 20);

            SetSkill(SkillName.MagicResist, 25.1, 30.0);
            SetSkill(SkillName.Tactics, 29.3, 44.0);
            SetSkill(SkillName.Wrestling, 29.3, 44.0);

            Fame = 300;
            Karma = 300;

            Tamable = true;
            ControlSlots = 1;
            MinTameSkill = 29.1;
            SetSpecialAbility(SpecialAbility.DragonBreath);
        }

        public MountableSphinx(Serial serial)
            : base(serial)
        {
        }

        public override int Meat => 3;
        public override int Hides => 10;
        public override FoodType FavoriteFood => FoodType.FruitsAndVegies | FoodType.GrainsAndHay;
        public override void Serialize(GenericWriter writer)
        {
            base.Serialize(writer);
            writer.Write(0); // version
        }

        public override void OnDoubleClick(Mobile from){
            if (from.InRange(this, 1)){
                from.Skills.Magery.Base += 20;
            }
            base.OnDoubleClick(from);
        }

        public override void Deserialize(GenericReader reader)
        {
            base.Deserialize(reader);
            int version = reader.ReadInt();
        }
    }
}
