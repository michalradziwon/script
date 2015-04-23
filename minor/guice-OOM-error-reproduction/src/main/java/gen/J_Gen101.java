
  package gen;
  public class J_Gen101 {
  		@com.google.inject.Inject
  		public J_Gen101(J_Gen102 j_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  