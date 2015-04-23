
  package gen;
  public class P_Gen97 {
  		@com.google.inject.Inject
  		public P_Gen97(P_Gen98 p_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  