
  package gen;
  public class J_Gen87 {
  		@com.google.inject.Inject
  		public J_Gen87(J_Gen88 j_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  