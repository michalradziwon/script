
  package gen;
  public class J_Gen154 {
  		@com.google.inject.Inject
  		public J_Gen154(J_Gen155 j_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  