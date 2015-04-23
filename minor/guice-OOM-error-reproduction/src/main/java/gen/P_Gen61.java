
  package gen;
  public class P_Gen61 {
  		@com.google.inject.Inject
  		public P_Gen61(P_Gen62 p_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  