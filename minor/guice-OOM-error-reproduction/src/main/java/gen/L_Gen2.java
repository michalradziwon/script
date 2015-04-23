
  package gen;
  public class L_Gen2 {
  		@com.google.inject.Inject
  		public L_Gen2(L_Gen3 l_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  