
  package gen;
  public class P_Gen72 {
  		@com.google.inject.Inject
  		public P_Gen72(P_Gen73 p_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  