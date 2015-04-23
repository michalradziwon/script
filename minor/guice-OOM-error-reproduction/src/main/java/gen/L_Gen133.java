
  package gen;
  public class L_Gen133 {
  		@com.google.inject.Inject
  		public L_Gen133(L_Gen134 l_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  