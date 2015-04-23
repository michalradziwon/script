
  package gen;
  public class J_Gen61 {
  		@com.google.inject.Inject
  		public J_Gen61(J_Gen62 j_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  