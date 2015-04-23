
  package gen;
  public class J_Gen105 {
  		@com.google.inject.Inject
  		public J_Gen105(J_Gen106 j_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  