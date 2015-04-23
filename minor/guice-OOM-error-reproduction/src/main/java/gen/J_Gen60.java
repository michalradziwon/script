
  package gen;
  public class J_Gen60 {
  		@com.google.inject.Inject
  		public J_Gen60(J_Gen61 j_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  