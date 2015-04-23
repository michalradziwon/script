
  package gen;
  public class L_Gen75 {
  		@com.google.inject.Inject
  		public L_Gen75(L_Gen76 l_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  