
  package gen;
  public class J_Gen25 {
  		@com.google.inject.Inject
  		public J_Gen25(J_Gen26 j_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  