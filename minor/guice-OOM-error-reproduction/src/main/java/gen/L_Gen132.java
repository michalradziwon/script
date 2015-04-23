
  package gen;
  public class L_Gen132 {
  		@com.google.inject.Inject
  		public L_Gen132(L_Gen133 l_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  