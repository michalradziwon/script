
  package gen;
  public class P_Gen149 {
  		@com.google.inject.Inject
  		public P_Gen149(P_Gen150 p_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  