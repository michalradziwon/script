
  package gen;
  public class P_Gen179 {
  		@com.google.inject.Inject
  		public P_Gen179(P_Gen180 p_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  