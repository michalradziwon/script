
  package gen;
  public class L_Gen42 {
  		@com.google.inject.Inject
  		public L_Gen42(L_Gen43 l_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  