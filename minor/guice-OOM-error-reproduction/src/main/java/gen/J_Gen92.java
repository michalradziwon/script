
  package gen;
  public class J_Gen92 {
  		@com.google.inject.Inject
  		public J_Gen92(J_Gen93 j_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  