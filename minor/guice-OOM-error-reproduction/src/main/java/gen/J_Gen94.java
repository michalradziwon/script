
  package gen;
  public class J_Gen94 {
  		@com.google.inject.Inject
  		public J_Gen94(J_Gen95 j_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  