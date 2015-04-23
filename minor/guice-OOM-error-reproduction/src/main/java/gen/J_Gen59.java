
  package gen;
  public class J_Gen59 {
  		@com.google.inject.Inject
  		public J_Gen59(J_Gen60 j_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  