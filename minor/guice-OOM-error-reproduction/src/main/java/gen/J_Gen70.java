
  package gen;
  public class J_Gen70 {
  		@com.google.inject.Inject
  		public J_Gen70(J_Gen71 j_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  