
  package gen;
  public class L_Gen138 {
  		@com.google.inject.Inject
  		public L_Gen138(L_Gen139 l_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  