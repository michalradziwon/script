
  package gen;
  public class P_Gen21 {
  		@com.google.inject.Inject
  		public P_Gen21(P_Gen22 p_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  