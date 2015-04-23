
  package gen;
  public class L_Gen198 {
  		@com.google.inject.Inject
  		public L_Gen198(L_Gen199 l_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  