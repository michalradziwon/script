
  package gen;
  public class P_Gen192 {
  		@com.google.inject.Inject
  		public P_Gen192(P_Gen193 p_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  