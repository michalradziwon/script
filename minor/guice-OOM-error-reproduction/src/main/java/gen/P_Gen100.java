
  package gen;
  public class P_Gen100 {
  		@com.google.inject.Inject
  		public P_Gen100(P_Gen101 p_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  