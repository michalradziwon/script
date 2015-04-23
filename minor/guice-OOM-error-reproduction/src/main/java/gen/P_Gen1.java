
  package gen;
  public class P_Gen1 {
  		@com.google.inject.Inject
  		public P_Gen1(P_Gen2 p_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  