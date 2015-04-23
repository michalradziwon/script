
  package gen;
  public class P_Gen2 {
  		@com.google.inject.Inject
  		public P_Gen2(P_Gen3 p_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  