
  package gen;
  public class J_Gen186 {
  		@com.google.inject.Inject
  		public J_Gen186(J_Gen187 j_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  