
  package gen;
  public class J_Gen85 {
  		@com.google.inject.Inject
  		public J_Gen85(J_Gen86 j_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  