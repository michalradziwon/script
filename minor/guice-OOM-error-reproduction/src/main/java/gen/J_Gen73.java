
  package gen;
  public class J_Gen73 {
  		@com.google.inject.Inject
  		public J_Gen73(J_Gen74 j_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  