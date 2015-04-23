
  package gen;
  public class L_Gen187 {
  		@com.google.inject.Inject
  		public L_Gen187(L_Gen188 l_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  