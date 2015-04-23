
  package gen;
  public class J_Gen38 {
  		@com.google.inject.Inject
  		public J_Gen38(J_Gen39 j_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  