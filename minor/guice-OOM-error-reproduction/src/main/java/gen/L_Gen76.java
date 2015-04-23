
  package gen;
  public class L_Gen76 {
  		@com.google.inject.Inject
  		public L_Gen76(L_Gen77 l_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  