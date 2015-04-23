
  package gen;
  public class O_Gen43 {
  		@com.google.inject.Inject
  		public O_Gen43(O_Gen44 o_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  