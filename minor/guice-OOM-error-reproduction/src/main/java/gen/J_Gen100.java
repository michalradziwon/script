
  package gen;
  public class J_Gen100 {
  		@com.google.inject.Inject
  		public J_Gen100(J_Gen101 j_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  