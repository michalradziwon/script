
  package gen;
  public class L_Gen28 {
  		@com.google.inject.Inject
  		public L_Gen28(L_Gen29 l_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  