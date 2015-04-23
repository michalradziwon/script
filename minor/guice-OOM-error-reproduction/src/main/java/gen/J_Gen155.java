
  package gen;
  public class J_Gen155 {
  		@com.google.inject.Inject
  		public J_Gen155(J_Gen156 j_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  