
  package gen;
  public class L_Gen65 {
  		@com.google.inject.Inject
  		public L_Gen65(L_Gen66 l_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  