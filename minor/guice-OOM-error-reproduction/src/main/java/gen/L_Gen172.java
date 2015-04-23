
  package gen;
  public class L_Gen172 {
  		@com.google.inject.Inject
  		public L_Gen172(L_Gen173 l_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  