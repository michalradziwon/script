
  package gen;
  public class P_Gen164 {
  		@com.google.inject.Inject
  		public P_Gen164(P_Gen165 p_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  