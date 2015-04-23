
  package gen;
  public class P_Gen189 {
  		@com.google.inject.Inject
  		public P_Gen189(P_Gen190 p_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  