
  package gen;
  public class J_Gen118 {
  		@com.google.inject.Inject
  		public J_Gen118(J_Gen119 j_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  