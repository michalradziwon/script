
  package gen;
  public class P_Gen191 {
  		@com.google.inject.Inject
  		public P_Gen191(P_Gen192 p_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  