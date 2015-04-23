
  package gen;
  public class P_Gen73 {
  		@com.google.inject.Inject
  		public P_Gen73(P_Gen74 p_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  