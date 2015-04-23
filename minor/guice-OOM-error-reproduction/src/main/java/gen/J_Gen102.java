
  package gen;
  public class J_Gen102 {
  		@com.google.inject.Inject
  		public J_Gen102(J_Gen103 j_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  