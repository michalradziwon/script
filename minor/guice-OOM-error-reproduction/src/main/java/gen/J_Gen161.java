
  package gen;
  public class J_Gen161 {
  		@com.google.inject.Inject
  		public J_Gen161(J_Gen162 j_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  