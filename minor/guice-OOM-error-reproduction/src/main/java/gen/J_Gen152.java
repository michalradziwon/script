
  package gen;
  public class J_Gen152 {
  		@com.google.inject.Inject
  		public J_Gen152(J_Gen153 j_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  