
  package gen;
  public class P_Gen135 {
  		@com.google.inject.Inject
  		public P_Gen135(P_Gen136 p_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  