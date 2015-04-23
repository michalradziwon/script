
  package gen;
  public class P_Gen60 {
  		@com.google.inject.Inject
  		public P_Gen60(P_Gen61 p_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  