
  package gen;
  public class J_Gen159 {
  		@com.google.inject.Inject
  		public J_Gen159(J_Gen160 j_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  