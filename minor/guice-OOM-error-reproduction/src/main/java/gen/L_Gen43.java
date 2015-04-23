
  package gen;
  public class L_Gen43 {
  		@com.google.inject.Inject
  		public L_Gen43(L_Gen44 l_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  