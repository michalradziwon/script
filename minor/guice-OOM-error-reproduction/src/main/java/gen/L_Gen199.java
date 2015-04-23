
  package gen;
  public class L_Gen199 {
  		@com.google.inject.Inject
  		public L_Gen199(L_Gen200 l_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  