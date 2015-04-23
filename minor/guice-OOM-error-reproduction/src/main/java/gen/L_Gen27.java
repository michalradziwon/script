
  package gen;
  public class L_Gen27 {
  		@com.google.inject.Inject
  		public L_Gen27(L_Gen28 l_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  