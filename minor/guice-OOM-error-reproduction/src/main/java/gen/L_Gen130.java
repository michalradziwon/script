
  package gen;
  public class L_Gen130 {
  		@com.google.inject.Inject
  		public L_Gen130(L_Gen131 l_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  