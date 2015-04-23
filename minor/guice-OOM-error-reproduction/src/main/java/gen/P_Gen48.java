
  package gen;
  public class P_Gen48 {
  		@com.google.inject.Inject
  		public P_Gen48(P_Gen49 p_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  