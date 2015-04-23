
  package gen;
  public class J_Gen135 {
  		@com.google.inject.Inject
  		public J_Gen135(J_Gen136 j_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  