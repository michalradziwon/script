
  package gen;
  public class L_Gen78 {
  		@com.google.inject.Inject
  		public L_Gen78(L_Gen79 l_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  