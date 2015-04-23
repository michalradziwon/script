
  package gen;
  public class L_Gen142 {
  		@com.google.inject.Inject
  		public L_Gen142(L_Gen143 l_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  