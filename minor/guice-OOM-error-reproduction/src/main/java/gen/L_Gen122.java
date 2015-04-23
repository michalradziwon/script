
  package gen;
  public class L_Gen122 {
  		@com.google.inject.Inject
  		public L_Gen122(L_Gen123 l_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  