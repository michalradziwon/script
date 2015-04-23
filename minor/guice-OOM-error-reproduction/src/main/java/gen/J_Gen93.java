
  package gen;
  public class J_Gen93 {
  		@com.google.inject.Inject
  		public J_Gen93(J_Gen94 j_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  