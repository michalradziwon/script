
  package gen;
  public class L_Gen139 {
  		@com.google.inject.Inject
  		public L_Gen139(L_Gen140 l_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  