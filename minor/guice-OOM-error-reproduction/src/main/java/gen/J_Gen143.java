
  package gen;
  public class J_Gen143 {
  		@com.google.inject.Inject
  		public J_Gen143(J_Gen144 j_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  