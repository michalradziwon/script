
  package gen;
  public class J_Gen66 {
  		@com.google.inject.Inject
  		public J_Gen66(J_Gen67 j_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  