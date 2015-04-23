
  package gen;
  public class L_Gen120 {
  		@com.google.inject.Inject
  		public L_Gen120(L_Gen121 l_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  