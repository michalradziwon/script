
  package gen;
  public class P_Gen104 {
  		@com.google.inject.Inject
  		public P_Gen104(P_Gen105 p_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  