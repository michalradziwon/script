
  package gen;
  public class J_Gen149 {
  		@com.google.inject.Inject
  		public J_Gen149(J_Gen150 j_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  