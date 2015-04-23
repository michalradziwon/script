
  package gen;
  public class J_Gen1 {
  		@com.google.inject.Inject
  		public J_Gen1(J_Gen2 j_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  