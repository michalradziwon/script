
  package gen;
  public class L_Gen177 {
  		@com.google.inject.Inject
  		public L_Gen177(L_Gen178 l_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  