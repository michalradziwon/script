
  package gen;
  public class P_Gen38 {
  		@com.google.inject.Inject
  		public P_Gen38(P_Gen39 p_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  