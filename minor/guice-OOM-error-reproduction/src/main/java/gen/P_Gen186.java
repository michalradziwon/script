
  package gen;
  public class P_Gen186 {
  		@com.google.inject.Inject
  		public P_Gen186(P_Gen187 p_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  