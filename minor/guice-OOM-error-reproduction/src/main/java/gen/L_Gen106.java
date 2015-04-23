
  package gen;
  public class L_Gen106 {
  		@com.google.inject.Inject
  		public L_Gen106(L_Gen107 l_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  