
  package gen;
  public class J_Gen63 {
  		@com.google.inject.Inject
  		public J_Gen63(J_Gen64 j_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  