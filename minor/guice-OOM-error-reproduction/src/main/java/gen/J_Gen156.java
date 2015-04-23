
  package gen;
  public class J_Gen156 {
  		@com.google.inject.Inject
  		public J_Gen156(J_Gen157 j_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  