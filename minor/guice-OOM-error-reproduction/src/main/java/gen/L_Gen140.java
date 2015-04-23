
  package gen;
  public class L_Gen140 {
  		@com.google.inject.Inject
  		public L_Gen140(L_Gen141 l_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  