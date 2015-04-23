
  package gen;
  public class P_Gen87 {
  		@com.google.inject.Inject
  		public P_Gen87(P_Gen88 p_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  