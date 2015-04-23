
  package gen;
  public class P_Gen146 {
  		@com.google.inject.Inject
  		public P_Gen146(P_Gen147 p_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  