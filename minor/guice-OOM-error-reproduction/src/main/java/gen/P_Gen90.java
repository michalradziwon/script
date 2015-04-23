
  package gen;
  public class P_Gen90 {
  		@com.google.inject.Inject
  		public P_Gen90(P_Gen91 p_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  