
  package gen;
  public class L_Gen141 {
  		@com.google.inject.Inject
  		public L_Gen141(L_Gen142 l_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  